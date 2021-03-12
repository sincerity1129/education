package com.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginProgram")
public class loginProgram extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		String id = request.getParameter("login_id");
		String pw = request.getParameter("login_pw");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			String sql = "select name from model1 where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();

			if (rs.next()) {
				name = rs.getString("NAME");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		if (name != null) {
			response.sendRedirect("loginSuccess.jsp?name=" + URLEncoder.encode(name, "EUC_KR"));
		} else {
			response.sendRedirect("loginFail.jsp");
		}

	}

}
