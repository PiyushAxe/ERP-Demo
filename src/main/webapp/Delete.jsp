<%@page import="java.util.List"%>
<%@page import="com.axelor.service.StudentService"%>
<%@page import="com.axelor.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete a student</title>
</head>
<body>

<form method="post">
         <tr> 
         <td>Enter ID you want to delete</td>
			<td> <input name="StudentID" type="text" /></td>
			<td> <input type="submit" value="Submit"></td>
			<td> </td>
         </tr>
         <br>
        
        
         <%
         
         StudentService studentService = new StudentService();
         List<Student> list = studentService.getListOfStudent();
         
         for (Student ls : list) {
        	 String first = request.getParameter("StudentID");
        	// long x= Long.valueOf(first);
             if(ls.getName().equalsIgnoreCase(first)){
            	 System.out.println(first);
            	 StudentService stu =new StudentService();
            	 stu.deleteStudent(ls);
            	 
            	 String path = "http://localhost:8081/ERP-Demo/view.jsp";
            	 response.sendRedirect(path);
            	 
             }  %>
             
          <%}%>
       
         </form>
         </table>

</body>
</html>