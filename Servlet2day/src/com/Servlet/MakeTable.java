package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeTable")
public class MakeTable extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int room = Integer.parseInt(request.getParameter("room"));
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		System.out.println(room);
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = 1px>");
		out.print("<tr>");
		
		for(int i= 1; i<=room; i++) {			
		out.print("<td>");
		out.print(i);		
		out.print("<td>");
		}
		
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
