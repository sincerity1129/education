package com.POJO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.FrontCommand;
import com.model.MessageDAO;

public class DelOneServiceCon implements FrontCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		MessageDAO dao = new MessageDAO();

		int cnt = dao.deleteSelect(num);

		if (cnt > 0) {
			System.out.print("삭제 성공!");
		} else {
			System.out.print("삭제 실패..");
		}
		response.sendRedirect("main.jsp#two");

	}

}
