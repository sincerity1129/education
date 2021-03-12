package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Multiply")
public class Multiply extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int multiply = Integer.parseInt(request.getParameter("multiply"));
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = 1px>");
		
		for(int i =1; i<=9; i++) {
			out.print("<tr>");
			out.print("<td>");
			out.print(multiply + "*" + i + "=" + multiply*i);
			out.print("</td>");
			out.print("</tr>");			
		}

		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
