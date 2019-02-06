<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"

<html>
<head>	
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login Page</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form method="post" action="LoginServlet">
<div style="padding: 100px 0 0 250px;">
<div id="login-box">
<h2>Login Page</h2>
Please provide your credential to use this website
<br>
<br>
<div id="login-box-name" style="margin-top:20px; color:blue;">User Id:</div>
<div id="login-box-field" style="margin-top:20px; color:blue; ">
<input name="userId" class="form-login" title="Username" value="" size="30" maxlength="50" />
</div>
<div id="login-box-name" style="color:blue;" >Password:</div>
<div id="login-box-field">
<input name="password" type="password" class="form-login" title="Password" value="" size="30" maxlength="48" />
 	<p>
             <label style="color:blue;">Select Role</label>
             <select name = "myList">
               <option value = "1">Teacher</option>
               <option value = "2">Admin</option>
               <option value = "3">Student</option>
             </select>
 	 </p>
</div>
<br />
<span class="login-box-options" style="color:blue;">
New User?  <a href="register.jsp" style="margin-left:30px;color:blue;">Register Here</a>
</span>
<br />
<br />
<input style="margin-left:100px;" type="submit" value="Login" />
</div>
</div>
</form>
</body>
</html>
