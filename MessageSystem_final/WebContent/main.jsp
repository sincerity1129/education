<%@page import="com.model.MessageDAO"%>
<%@page import="com.model.MessageDTO"%>
<%@page import="com.model.MemberDTO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Forty by HTML5 UP</title>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
<link rel="stylesheet" href="assets/css/main.css" />
<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>
<body>

	<%	
		MemberDTO info = (MemberDTO)session.getAttribute("info");
		MessageDAO dao = new MessageDAO();
		ArrayList<MessageDTO> mList = null;
		
		if(info != null) {
			mList = dao.select(info.getEmail());	
		}
		
	%>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header" class="alt"> <a href="index.html"
			class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a> <nav>
		<%if(info != null) {%> <%if(info.getEmail().equals("admin")) {%> <a
			href="select.jsp">ȸ����������</a> <%}%> <a href="update.jsp">������������</a> <a
			href="LogoutServiceCon">�α׾ƿ�</a> <%}else{ %> <a href="#menu">�α���</a> <%} %>
		<!-- �α��� �� Logout.jsp�� �̵��� �� �ִ�'�α׾ƿ�'��ũ�� '������������'��ũ�� ����Ͻÿ�. --> </nav> </header>

		<!-- Menu -->
		<nav id="menu">
		<ul class="links">
			<li><h5>�α���</h5></li>
			<form action="LoginServiceCon" method="post">
				<li><input type="text" placeholder="Email�� �Է��ϼ���" name=email></li>
				<li><input type="password" placeholder="PW�� �Է��ϼ���" name=pw></li>
				<li><input type="submit" value="LogIn" class="button fit"></li>
			</form>
		</ul>
		<ul class="actions vertical">
			<li><h5>ȸ������</h5></li>
			<form action="JoinServiceCon" method="post">
				<li><input type="text" placeholder="Email�� �Է��ϼ���" name="email"></li>
				<li><input type="password" placeholder="PW�� �Է��ϼ���" name="pw"></li>
				<li><input type="text" placeholder="��ȭ��ȣ�� �Է��ϼ���" name="tel"></li>
				<li><input type="text" placeholder="���ּҸ� �Է��ϼ���" name="addr"></li>
				<li><input type="submit" value="JoinUs" class="button fit"></li>
			</form>
		</ul>
		</nav>
		<!-- Banner -->
		<section id="banner" class="major">
		<div class="inner">
			<header class="major"> 
			<%if(info != null){%>
			<h1><%=info.getEmail()%>�� ȯ���մϴ�.</h1>
			<%}else{%>
			<h1>�α��� �� ���Ǿ��̵� ������ּ���</h1>
			<%} %> <!-- �α��� �� �α��� �� ������� ���Ǿ��̵�� �ٲٽÿ�.
									 ex)smart�� ȯ���մϴ� --> </header>
			<div class="content">
				<p>
					�Խ����� �̿��غ����� ^^<br>
				</p>
				<ul class="actions">
					<li><a href="boardMain.jsp" class="button next scrolly">�Խ���
							�ٷΰ���</a></li>
				</ul>
			</div>
		</div>
		</section>

		<!-- Main -->
		<div id="main">

			<!-- One -->
			<section id="one" class="tiles"> <article> <span
				class="image"> <img src="images/pic01.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">HTML</a>
			</h3>
			<p>Ȩ�������� ����� ���� ���</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic02.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">CSS</a>
			</h3>
			<p>HTML�� ���������ִ� ���</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic03.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">Servlet/JSP</a>
			</h3>
			<p>Java�� �⺻���� �� �� ���α׷��� ���/��ũ��Ʈ ���</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic04.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">JavaScript</a>
			</h3>
			<p>HTML�� �⺻���� ������ ������ �� �ִ� ���</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic05.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">MVC</a>
			</h3>
			<p>�� ������Ʈ �� ���� ���� ����ϴ� ����������</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic06.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">Web Project</a>
			</h3>
			<p>�������� ����������Ʈ�� �� ����� Ȱ���ϼ���!</p>
			</header> </article> </section>
			<!-- Two -->
			<section id="two">
			<div class="inner">
				<header class="major">
				<h2>������ �� �޼��� Ȯ���ϱ�</h2>
				</header>
				<p></p>
				<ul class="actions">
					<%if(info != null){%>
					<li><%=info.getEmail()%>���� �α�����</li>
					<%}else{%>
					<li>�α����� �ϼ���.</li>
					<%} %>

					<li><a href="delAllServiceCon" class="button next scrolly">��ü�����ϱ�</a></li>
				</ul>

				<table>
					<tr>
						<td>��ȣ</td>
						<td>���� ���</td>
						<td>����</td>
						<td>���� �ð�</td>
					</tr>
					<%if(mList != null) {%>
					<%for(int i=0; i<mList.size(); i++) {%>
					<tr>
						<td><%=i+1 %></td>
						<td><%=mList.get(i).getSend() %></td>
						<td><%=mList.get(i).getContent() %></td>
						<td><%=mList.get(i).getDate() %></td>
						<td><a href = "DelOneServiceCon">����</a></td>
					</tr>
					<%} }%>
				</table>

			</div>
			</section>

		</div>

		<!-- Contact -->
		<section id="contact">
		<div class="inner">
			<section>
			<form action="MessageServiceCon" method="post">
				<div class="field half first">
					<label for="name">Name</label> <input type="text" id="name"
						placeholder="�޴� ��� �̸�" name="receive" />
				</div>
				<div class="field half">
					<label for="email">Email</label> <input type="text" id="email"
						placeholder="���� ��� �̸���" name="send" />
				</div>

				<div class="field">
					<label for="message">Message</label>
					<textarea id="message" rows="6" name="content"></textarea>
				</div>
				<ul class="actions">
					<li><input type="submit" value="Send Message" class="special" /></li>
					<li><input type="reset" value="Clear" /></li>
				</ul>
			</form>
			</section>

			<section class="split"> <section>
			<div class="contact-method">
				<span class="icon alt fa-envelope"></span>
				<%if(info != null){%>
				<h3><%=info.getEmail()%>�� ȯ���մϴ�.
				</h3>
				<%}else{%>
				<a href="#">�α��� �� ����� �̸����� ���</a>
				<%} %>
				<!-- �α��� �� ������� �̸����� ����Ͻÿ� -->
			</div>
			</section> <section>
			<div class="contact-method">
				<span class="icon alt fa-phone"></span>
				<%if(info != null){%>
				<h3><%=info.getTel()%></h3>
				<%}else{%>
				<span>�α��� �� ����� ��ȭ��ȣ�� ���</span>
				<%} %>

				<!-- �α��� �� ������� ��ȭ��ȣ�� ����Ͻÿ� -->
			</div>
			</section> <section>
			<div class="contact-method">
				<span class="icon alt fa-home"></span>
				<%if(info != null){%>
				<h3><%=info.getAddr()%></h3>
				<%}else{%>
				<span>�α��� �� ����� ���ּҸ� ���</span>
				<%} %>

				<!-- �α��� �� ������� ���ּҸ� ����Ͻÿ� -->
			</div>
			</section> </section>
		</div>
		</section>

		<!-- Footer -->
		<footer id="footer">
		<div class="inner">
			<ul class="icons">
				<li><a href="#" class="icon alt fa-twitter"><span
						class="label">Twitter</span></a></li>
				<li><a href="#" class="icon alt fa-facebook"><span
						class="label">Facebook</span></a></li>
				<li><a href="#" class="icon alt fa-instagram"><span
						class="label">Instagram</span></a></li>
				<li><a href="#" class="icon alt fa-github"><span
						class="label">GitHub</span></a></li>
				<li><a href="#" class="icon alt fa-linkedin"><span
						class="label">LinkedIn</span></a></li>
			</ul>
			<ul class="copyright">
				<li>&copy; Untitled</li>
				<li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
			</ul>
		</div>
		</footer>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="assets/js/main.js"></script>

</body>
</html>
