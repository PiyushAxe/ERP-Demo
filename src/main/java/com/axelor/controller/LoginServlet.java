package com.axelor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.axelor.model.User;
import com.axelor.service.LoginService;
 
 
public class LoginServlet extends HttpServlet {
	
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
     String userId = request.getParameter("userId");   
     String password = request.getParameter("password");
     String selection = request.getParameter("myList");
     
     
     LoginService loginService = new LoginService();
     boolean result = loginService.authenticateUser(userId, password, selection);
     User user = loginService.getUserByUserId(userId);
     
     if(result == true && selection.equals("1")){
    	 
         request.getSession().setAttribute("user", user);      
         response.sendRedirect("teacher.jsp");
         
     }else if(result == true && selection.equals("2")){
    	 
    	 request.getSession().setAttribute("user", user);      
         response.sendRedirect("home.jsp");
     
     }else if(result == true && selection.equals("3")) {
    	 
    	 request.getSession().setAttribute("user", user);      
         response.sendRedirect("student.jsp");
		
	}else {
		
			response.sendRedirect("error.jsp");
		
		}
    }
}