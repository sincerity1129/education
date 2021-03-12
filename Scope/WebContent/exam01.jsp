<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>exam01.jsp입니다.</h1>
	
	<%
	
		pageContext.setAttribute("page", "pageScope");
		request.setAttribute("request", "requestScope");
		session.setAttribute("session", "sessionScope");
		application.setAttribute("application", "applicationScope");
		
		String pageValue = (String)pageContext.getAttribute("page");
		String requestValue = (String)request.getAttribute("request");
		String sessionValue = (String)session.getAttribute("session");
		String applicationValue = (String)application.getAttribute("application");
			
		RequestDispatcher rd = request.getRequestDispatcher("exam02.jsp");
		rd.forward(request, response);
	
	%>
	
	page 값 : <%=pageValue %><br>
	request 값 : <%=requestValue %><br>
	session 값 : <%=sessionValue %><br>
	application 값 : <%=applicationValue %><br>

</body>
</html>