package com.POJO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.controller.FrontCommand;
import com.model.MemberDAO;
import com.model.MemberDTO;

public class UpdateServiceCon implements FrontCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO loginDto = (MemberDTO) session.getAttribute("info");

		request.setCharacterEncoding("EUC-KR");

		String email = loginDto.getEmail();
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");

		MemberDTO info = new MemberDTO(email, pw, tel, addr);
		MemberDAO dao = new MemberDAO();

		int cnt = dao.update(info);

		if (cnt > 0) {
			System.out.print("회원정보수정 성공!");
			session.setAttribute("info", info);
			response.sendRedirect("main.jsp");
		} else {
			System.out.print("회원정보수정 실패..");
			response.sendRedirect("update.jsp");
		}

	}

}
