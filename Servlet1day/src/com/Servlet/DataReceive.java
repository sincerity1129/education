package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataReceive")
public class DataReceive extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name1");
		
		out.print("<html>");
		out.print("<body>");
		out.print("�ȳ� "+ name + "�� �ݰ����ϴ�.");
		out.print("</html>");
		out.print("</body>");
		
	}

}
