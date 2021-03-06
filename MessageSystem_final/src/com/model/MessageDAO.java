package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessageDAO {

	ResultSet rs = null;
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	ArrayList<MessageDTO> mList = null;
	MessageDTO mDto = null;

	public void conn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				psmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert(MessageDTO dto) {
		conn();
		try {
			String sql = "insert into message values(num.nextval, ?, ?, ?, sysdate)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getSend());
			psmt.setString(2, dto.getReceive());
			psmt.setString(3, dto.getContent());
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public ArrayList<MessageDTO> select(String email) {
		mList = new ArrayList<MessageDTO>();

		conn();
		try {
			String sql = "select * from message where receive = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int num = rs.getInt(1);
				String send = rs.getString(2);
				String receive = rs.getString(3);
				String content = rs.getString(4);
				String date = rs.getString(5);

				mDto = new MessageDTO(num, receive, send, content, date);
				mList.add(mDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return mList;
	}
	
	public int deleteAll(String email) {
		conn();
		try {
		String sql = "delete from message where receive = ?";		
		psmt = conn.prepareStatement(sql);		
		psmt.setString(1, email);
		
		cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	
	public int deleteSelect(int num) {
		conn();
		
		try {
		String sql = "delete from message where num = ?";
		
		psmt = conn.prepareStatement(sql);		
		psmt.setInt(1, num);
		
		cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return cnt;
	}

}
