package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Plus")
public class Plus extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		System.out.println(num1 + num2);
		
		out.print("<html>");
		out.print("<body>");
		out.print("두 수의 합 : " +(num1+num2));
		out.print("</body>");
		out.print("</html>");
		
	}

}
