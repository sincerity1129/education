<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	쿠키를 삭제하겠습니다.
	
	<%
		Cookie cookie = new Cookie("name", "");
		cookie.setMaxAge(0);
		
		response.addCookie(cookie);
	%>

</body>
</html>