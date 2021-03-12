package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex001")
public class Exam02 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String host = request.getRemoteHost();
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		if(host.equals("221.156.243.217")) {					
			out.print("<img src = ./ghost.jfif>");			
		}		
		else {				
		out.print("<img src = ./cutedog.jpg>");				
		}
		out.print("</body>");
		out.print("</html>");
	}

}
