package com.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MessageDAO;
import com.model.MessageDTO;

@WebServlet("/MessageServiceCon")
public class MessageServiceCon extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");		
		String receive = request.getParameter("receive");
		String send = request.getParameter("send");
		String content = request.getParameter("content");
		
		MessageDAO dao = new MessageDAO();
		MessageDTO dto = new MessageDTO(receive, send, content);
		
		int cnt = dao.insert(dto);
		
		if( cnt>0) {
			System.out.print("메시지 전송 성공!");
		}else {
			System.out.print("메시지 전송 실패!");
		}
		response.sendRedirect("main.jsp");
	}

}
