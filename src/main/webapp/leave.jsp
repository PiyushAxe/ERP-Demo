<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is a leave page</title>
</head>
<body>

<p align="center"><b><font color="midnightblue">
</font></b></p>
<p align="center"><font face="Times New Roman" size="6" color="#000080">LEAVE FORM</font></p>

<table border="0" cellpadding="0" cellspacing="0" style="BORDER-COLLAPSE: collapse" bordercolor="#111111" width="100%" id="AutoNumber1" ALIGN="center">
  <tr>

<td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b>USER ID</b></p></td>
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b><input name="UserID" size="20" ></b></p></td>

     <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b>LEAVE TYPE</b></p></td>
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><select size="1" name="D1">
    <option selected value="Client interaction skills">Sick leave</option>
    </select></p></td>
  </tr>

<tr>
 

<td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b>USER  NAME</b></p></td>
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b><input name="native" size="20" ></b></p></td>

    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b>NO OF DAYS</b></p></td>
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b><input name="native" size="20" ></b></p></td>
</tr>

<tr>

    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b>FROM DATE</b></p></td>
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b><input name="native" size="20" ></b></p></td>
    
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b>TO DATE</b></p></td>
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b><input name="native" size="20" ></b></p></td>
</tr>

<tr>

 <td height="19" align="center" valign="middle" bgcolor="#ffffcc">
    <p align="left"><b>PURPOSE&nbsp; </b></td>
    <td height="19" align="center" valign="middle" bgcolor="#ffffcc">
    <p align="left"><b><textarea rows="2" name="address2" cols="20"></textarea></b></p></td>

<td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b>APPLY DATE</b></p></td>
    <td width="25%" bgcolor="#ffffcc" bordercolor="#ffffff">
    <p style="LINE-HEIGHT: 200%"><b><input name="native" size="20" ></b></p></td>

    
</tr>

</table>



<center>
<input type=button value="SUBMIT" name="submit" onfocus="vittu()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="RESET" name="submit">
<form action="post">
<input type= submit value="GO BACK" name="submit" formaction="http://localhost:8081/ERP-Demo/home.jsp">
</form>
</center>

</body>
</html>