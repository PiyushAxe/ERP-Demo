<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Student</title>
	<center>	</center>
</head>
<body>
<!-- 
<form action="http://localhost:8081/ERP-Demo/home.jsp"></form> -->
<center><h3>Add a student here</h3>	
	<h3>Registration Form</h3>
</center>

<form action="StudentServlet" method="POST">
<table align="center" cellpadding = "10">
<tr>
<td> Name</td>
<td><input type="text" name="name" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" maxlength="100" required/></td>
</tr>
<tr>
<td>marks</td>
<td><input type="text" name="marks" maxlength="100" required/></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>
</form>

</body>


</html>