<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action = "result.jsp">
		num1 : <input type = "text" name = "num1"><br>
		num2 : <input type = "text" name = "num2"><br>

		<select name = "select">
			<option>+</option>
			<option>-</option>		
		</select>
		
		<input type = "submit" value = "계산">	
	</form>

</body>
</html>