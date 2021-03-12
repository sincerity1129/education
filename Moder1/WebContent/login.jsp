<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border = "1px">
	<form action = "loginProgram.jsp" method = "post">
	
	<tr>
	<td colspan = "2" align="center"><b>!!로그인!!</b></td>
	</tr>
	
	<tr>
	<td align="right">ID :</td> 
	<td align="left"><input type = "text" name = "login_id"></td>
	</tr>
	
	<tr>
	<td align="right">PW :</td>
	<td align="left"><input type = "text" name = "login_pw"></td>
	</tr> 
	
	<tr>
	<td colspan = "2" align = "center"><input type = "submit"></td>
	</tr>
	
	</form>
	</table>
</body>
</html>