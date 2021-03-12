package com.Servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/User_info")
public class User_info extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String select = request.getParameter("select");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println(select);
		System.out.println(gender);
		
		for(int i=0; i<hobby.length; i++) {
		System.out.println(hobby[i]);
		}
	}

}
