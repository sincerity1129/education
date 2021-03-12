package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Model1DAO;
import com.model.Model1DTO;

@WebServlet("/joinProgram")
public class joinProgram extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("EUC-KR");

		String id = request.getParameter("join_id");
		String pw = request.getParameter("join_pw");
		String name = request.getParameter("join_name");
		
		Model1DAO dao = new Model1DAO();
		Model1DTO dto = new Model1DTO(id, pw, name);

		int cnt = dao.join(dto);

		if (cnt > 0) {
			response.sendRedirect("main.jsp");
		} else {
			response.sendRedirect("join.jsp");
		}
	}

}
