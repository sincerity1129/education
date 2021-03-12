<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	쿠키 생성하는 페이지

	<%
	
	Cookie cookie = new Cookie("name", URLEncoder.encode("박언우", "EUC-KR"));
	response.addCookie(cookie);	
	
	%>

</body>
</html>