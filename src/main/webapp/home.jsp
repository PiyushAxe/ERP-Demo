<%@page import="javax.sound.midi.SysexMessage"%>
<%@page import="com.axelor.service.RegisterService"%>
<%@page import="java.util.List"%>
<%@page import="com.axelor.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.axelor.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link rel="stylesheet" type="text/css" href="css/style.css"/>
     <title>Result Page</title>
    
</head>
<body>
<center>
     <div id="container">
         <h1>Result Page</h1>
             <b>This is Sample List Page</b><br/>
             <%=new Date()%></br>
             <%
                 User user = (User) session.getAttribute("user");
             %>     
             <b>Welcome <%= user.getFirstName() + " " + user.getLastName()%></b>     
             <br/>
             <a href="logout.jsp">Logout</a>
             <table>
             	<tr>
              		<td><form action="http://localhost:8081/ERP-Demo/add.jsp"><input type= "submit" value="Add Students"></form></td>
					<td><form action="http://localhost:8081/ERP-Demo/view.jsp"><input type= "submit" value="View List of Student"></form></td>
					<td><form action="http://localhost:8081/ERP-Demo/leave.jsp"><input type="submit" value="Leave Request"></form></td>
         		</tr>
         	 </table>
         </p>
			<h3>Below is the list of all the Users.</h3>
         <table>
             <thead>
                 <tr>
                     <th>User ID</th>
                     <th>First Name</th>
                     <th>Middle Name</th>
                     <th>Last Name</th>
                     <th>email</th> 
                     <th>phone</th>               
                 </tr>
             </thead>
             <tbody>
                 <%
                     LoginService loginService = new LoginService();
                     List<User> list = loginService.getListOfUsers();
                     for (User u : list) {
                 %>
                 <tr>
                 	 
                     <td><%=u.getUserId()%></td>
                     <td><%=u.getFirstName()%></td>
                     <td><%=u.getMiddleName()%></td>
                     <td><%=u.getLastName()%></td>
                     <td><%=u.getEmail()%></td>
                     <td><%=u.getPhone() %></td>
                     <td> <form action="http://localhost:8081/ERP-Demo/add.jsp"><input type= "submit" value="Add more"></form></td>
                 </tr>
                 <%}%>
             <tbody>
         </table>    
         <br/>
        
        
         <table>
         <form method="post">
         <tr> 
         <td>Enter ID you want to delete</td>
			<td> <input name="UserID" type="text" required/></td>
			<td> <input type="submit" value="Submit" ></td>
         </tr>
         <br>
         <%
         
		 LoginService loginS = new LoginService();
         List<User> list1 = loginS.getListOfUsers();
         for (User u : list) {
        	 String first = request.getParameter("UserID");
             if(u.getUserId().equalsIgnoreCase(first)){
            	 System.out.println(first);
            	 RegisterService rs =new RegisterService();
            	 rs.deleteUser(u);
            	 
            	 String path = "http://localhost:8081/ERP-Demo/home.jsp";
            	 response.sendRedirect(path);
            	 
             }  %>
          <%}%>
         </form>
         </table>
     </div>
    </center>
</body>
</html>