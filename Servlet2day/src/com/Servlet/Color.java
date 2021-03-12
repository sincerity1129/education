package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Color")
public class Color extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String color = request.getParameter("color");
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		System.out.println(color);
		
		out.print("<html>");
		out.print("<body bgcolor = " + color + ">");

		out.print("</body>");
		out.print("</html>");
		
	}

}
