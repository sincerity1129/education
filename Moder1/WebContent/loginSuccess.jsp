<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	�α��� ����!!!
	<p>
	<%
	String name = request.getParameter("name");
	out.print(name); %> �� ȯ���մϴ�.
	</p>
</body>
</html>