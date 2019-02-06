package com.axelor.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LeaveServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String leaveType = request.getParameter("UserID");
		String nod;
		String fromDate;
		String toDate;
		String applyDate;
		
		out.println(leaveType);

	}

	
	
}
