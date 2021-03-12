package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex007")
public class Exam01 extends HttpServlet {
			
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String host = request.getRemoteHost();
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		System.out.println(host);
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("Hello print");
		out.print("<br>");
		out.print("한글 안나와!!!");
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
