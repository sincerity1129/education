package com.POJO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.controller.FrontCommand;
import com.model.MemberDTO;
import com.model.MessageDAO;

public class DelAllService implements FrontCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO info = (MemberDTO) session.getAttribute("info");

		String email = info.getEmail();
		
		MessageDAO dao = new MessageDAO();
		int cnt = dao.deleteAll(email);
		
		if (cnt > 0) {
			System.out.println("전체 삭제 성공!");
		} else {
			System.out.println("전체 삭제 실패..");
		}
		response.sendRedirect("main.jsp#two");
	}
	
}
