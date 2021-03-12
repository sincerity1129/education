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
	<form action = "joinProgram.jsp" method = "post">
	
	<tr><td colspan = "2" align="center"><b>!!회원가입!!</b></td></tr>
	
	<tr>
	<td align="right"> ID : </td>
	<td align="left"><input type = "text" name = "join_id"></td>
	</tr>
	
	<tr>
	<td align="right">PW :</td> 
	<td align="left"><input type = "text" name = "join_pw"></td>
	</tr>
	
	<tr>
	<td align="right">NAME : </td>
	<td align="left"><input type = "text" name = "join_name"></td>
	</tr>
	
	<tr>
	<td colspan = "2" align="center"> <input type = "submit" value = "회원가입"></td>
	</tr>
	
	</form>
	</table>
</body>
</html>