package com.axelor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.model.Student;
import com.axelor.model.User;
import com.axelor.service.RegisterService;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String selection = request.getParameter("myList");

		System.out.println(selection);

		List<Student> student = new ArrayList<Student>();
		Student std = new Student();
		std.setEmail("test@gmail.com");
		std.setMarks("45");
		std.setName("popopa");

		student.add(std);

		User user = new User(firstName, middleName, lastName, email, userId, password, phone, student, selection);

		try {

			RegisterService registerService = new RegisterService();
			boolean result = registerService.register(user);
			System.err.println(phone);
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Registration</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>");

			if (result) {

				out.println("<h1>Thanks for Registering with us :</h1>");
				out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");

			} else {

				out.println("<h1>Registration Failed</h1>");
				out.println("To try again<a href=register.jsp>Click here</a>");
				out.println("Possible Reason: User already exist");
			}

			out.println("</center>");
			out.println("</body>");
			out.println("</html>");

		} finally {

			out.close();

		}
	}

}