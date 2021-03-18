package com.POJO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.FrontCommand;
import com.model.MessageDAO;
import com.model.MessageDTO;

public class MessageServiceCon implements FrontCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String receive = request.getParameter("receive");
		String send = request.getParameter("send");
		String content = request.getParameter("content");

		MessageDAO dao = new MessageDAO();
		MessageDTO dto = new MessageDTO(receive, send, content);

		int cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.print("�޽��� ���� ����!");
		} else {
			System.out.print("�޽��� ���� ����!");
		}
		response.sendRedirect("main.jsp#two");

	}

}
