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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("smart") && pw.equals("123")){
			
			response.sendRedirect("loginTrue.jsp");
		
		 }
		else{
			response.sendRedirect("loginFalse.jsp");
		}
		%>
		

</body>
</html>