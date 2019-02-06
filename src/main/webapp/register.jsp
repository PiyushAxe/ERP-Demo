<html>
<head>
<title>Registration Form</title>
<style type="text/css">
h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}
</style>
</head>
<body>
<h3>Registration Form</h3>
<form action="RegisterServlet" method="POST">
<table align="center" cellpadding = "10">
<tr>
<td>First Name</td>
<td><input type="text" name="firstName" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<tr>
<td>Middle Name</td>
<td><input type="text" name="middleName" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" maxlength="100" /></td>
</tr>
<tr>
<td>User ID</td>
<td><input type="text" name="userId" maxlength="100" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password" maxlength="100" /></td>
</tr>
<tr>
<tr>
<td>Phone</td>
<td><input type="text" name="phone" maxlength="100" /></td>
</tr>
<tr>

     <td>        <label style="color:white;">Select Role</label></td>
           <td>  <select name = "myList">
               <option value = "1">Teacher</option>
               <option value = "2">Admin</option>
               <option value = "3">Student</option>
             </select> </td>
 	 
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