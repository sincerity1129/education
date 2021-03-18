package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.POJO.DelAllService;
import com.POJO.DelOneServiceCon;
import com.POJO.JoinServiceCon;
import com.POJO.LoginServiceCon;
import com.POJO.LogoutServiceCon;
import com.POJO.MessageServiceCon;
import com.POJO.UpdateServiceCon;
import com.model.MemberDAO;
import com.model.MemberDTO;
import com.model.MessageDAO;
import com.model.MessageDTO;

@WebServlet("*.do")
public class Command extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		FrontCommand command = null;
		String URI = request.getRequestURI();
		String path = request.getContextPath();
		String resultURI = URI.substring(path.length() + 1);

		if (resultURI.equals("DelAllServiceCon.do")) {
			command = new DelAllService();			
		}
		else if (resultURI.equals("DelOneServiceCon.do")) {
			command = new DelOneServiceCon();			
		}
		else if (resultURI.equals("JoinServiceCon.do")) {
			command = new JoinServiceCon();			
		}
		else if (resultURI.equals("LoginServiceCon.do")) {
			command = new LoginServiceCon();			
		}

		else if (resultURI.equals("LogoutServiceCon.do")) {
			command = new LogoutServiceCon();			
		}
		else if (resultURI.equals("MessageServiceCon.do")) {
			command = new MessageServiceCon();			
		}		
		else if (resultURI.equals("UpdateServiceCon.do")) {
			command = new UpdateServiceCon();			
		}
		command.execute(request, response);
	}

}
