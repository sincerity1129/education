package com.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MessageDAO;

@WebServlet("/DelOneServiceCon")
public class DelOneServiceCon extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		MessageDAO dao = new MessageDAO();
		
		int cnt = dao.deleteSelect(num);
		
		if(cnt>0) {
			System.out.print("���� ����!");
		}else {
			System.out.print("���� ����..");
		}
		response.sendRedirect("main.jsp");
	}

}
