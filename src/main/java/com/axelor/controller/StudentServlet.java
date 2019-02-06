package com.axelor.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.model.Student;
import com.axelor.service.StudentService;

public class StudentServlet extends HttpServlet {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	 response.setContentType("text/html;charset=UTF-8");
    	 PrintWriter out = response.getWriter();
    	 String name = request.getParameter("name");
    	 String marks = request.getParameter("marks");
    	 String email = request.getParameter("email");
    	 
    	 System.err.println(email);
    	 
    	 Student student = new Student(name, marks,email);
    	 
    	 try {
    		 
    		StudentService studentService = new StudentService();
    		boolean result = studentService.added(student); 
    		out.println("<html>");
            out.println("<head>");      
            out.println("<title>Student Added</title>");    
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            
    		 if(result) {
    			 out.println("<h1>Thanks for adding new student:</h1>");
                 out.println("You can add more here.<a href=home.jsp>Click here</a>");
    			 
    		 }else{
            	 
                 out.println("<h1>Registration Failed</h1>");
                 out.println("To try again<a href=add.jsp>Click here</a>");
                 out.println("Possible Reason: Student already exist");
             }
             
             out.println("</center>");
             out.println("</body>");
             out.println("</html>");
             
    	  }finally {    
        	 
             out.close();
    	 }
    	 
    	 
    	 
    	 
    
    }
}
