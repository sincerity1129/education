<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	
	request.setCharacterEncoding("EUC-KR");
	
	String id = request.getParameter("join_id");
	String pw = request.getParameter("join_pw");
	String name = request.getParameter("join_name");	
	
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "hr";
	String db_pw = "hr";	
	conn = DriverManager.getConnection(db_url, db_id, db_pw);
	
	String sql = "insert into model1 values(?, ?, ?)";
	psmt = conn.prepareStatement(sql);
	psmt.setString(1, id);
	psmt.setString(2, pw);
	psmt.setString(3, name);
	
	cnt = psmt.executeUpdate();
	
	if(cnt>0){
		System.out.println("입력성공");
	}
	else{
		System.out.println("입력실패");
	}
	
	if(psmt != null) {
		psmt.close();
	}
	if(conn != null) {
		conn.close();
	}
	
	if(cnt>0){
		response.sendRedirect("main.jsp");
	}
	else{
		response.sendRedirect("join.jsp");
	}
	%>

</body>
</html>