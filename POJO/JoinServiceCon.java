package com.POJO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.controller.FrontCommand;
import com.model.MemberDAO;
import com.model.MemberDTO;

public class JoinServiceCon implements FrontCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("EUC-KR");

		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");

		MemberDTO dto = new MemberDTO(email, pw, tel, addr);
		MemberDAO dao = new MemberDAO();

		int cnt = dao.join(dto);

		if (cnt > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("id", email);
			response.sendRedirect("join_success.jsp");

		} else {
			response.sendRedirect("main.jsp");
		}
	}

}
