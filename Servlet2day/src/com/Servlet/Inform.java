package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Inform")
public class Inform extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
				
		request.setCharacterEncoding("EUC-KR");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String check = request.getParameter("check");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birthday = request.getParameter("birthday");
		String[] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String story = request.getParameter("story");
		
		System.out.println(id);
		System.out.println(password);
		System.out.println(check);
		System.out.println(gender);
		System.out.println(blood);
		System.out.println(birthday);
		
		for(int i =0; i<hobby.length; i++) {
		System.out.println(hobby[i]);
		}
		
		System.out.println(color);
		System.out.println(story);
		
		out.println("<html>");
		out.println("<body>");
		out.println(id);
		out.println(password);
		out.println(check);
		out.println(gender);
		out.println(blood);
		out.println(birthday);
		
		for(int i =0; i<hobby.length; i++) {
		out.println(hobby[i]);
			}
		
		out.println(color);
		out.println(story);
		out.print("</body>");
		out.print("</html>");
		
	}

	
	
	
	
}
