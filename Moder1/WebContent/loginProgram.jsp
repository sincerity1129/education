<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sun.net.httpserver.Authenticator.Result"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%	
	String id = request.getParameter("login_id");
	String pw = request.getParameter("login_pw");
	
	String name = null;
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "hr";
	String db_pw = "hr";	
	conn = DriverManager.getConnection(db_url, db_id, db_pw);
	
	String sql = "select name from model1 where id = ? and pw = ?";
	psmt = conn.prepareStatement(sql);
	
	psmt.setString(1, id);
	psmt.setString(2, pw);
	rs = psmt.executeQuery();
	
	if(rs.next()) {
			name = rs.getString("NAME");
	}
	
	if(rs != null) {
		rs.close();
	}
	if(psmt != null) {
		psmt.close();
	}
	if(conn != null) {
		conn.close();
	}
	
	if (name != null) {
		response.sendRedirect("loginSuccess.jsp?name="+
									URLEncoder.encode(name,"EUC_KR"));
	}else {
		response.sendRedirect("loginFail.jsp");
	}
	%>

</body>
</html>