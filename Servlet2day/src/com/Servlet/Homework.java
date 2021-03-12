package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Homework")
public class Homework extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String color = request.getParameter("color");
		int dan1 = Integer.parseInt(request.getParameter("dan1"));
		int dan2 = Integer.parseInt(request.getParameter("dan2"));
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = 1px bgcolor =" + color + ">");
		
		for(int i =dan1; i<=dan2; i++) {
			out.print("<tr>");
		for(int j = 1; j<=9; j++) {	
			out.print("<td>");
			out.print( i + "*" + j + "=" + i*j);
			out.print("</td>");
		}
			out.print("</tr>");			
		}

		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
