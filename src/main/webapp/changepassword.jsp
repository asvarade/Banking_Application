<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input{
color: windowframe;
text-align: left;
background-origin: border-box;
size: 1000px;
}
#logout{
color: black;
background-color:white; 
text-align: right;
}
fieldset{
color: black;
background-color: #ddf4ff;
}
</style>
</head>
<body>
<br>
<img src="https://www.freepnglogos.com/uploads/sbi-logo-png/sbi-logo-state-bank-india-group-vector-eps-0.png" width="90" height="30"><br>
<div id ="logout"><a href="success.jsp"><u>Home</u></a></div>
<hr>
<form action="changepassword">
<fieldset>
<legend>Enter Password Details </legend>
<br>
<p>Enter Old Password And Set new PassWord</p><br>
Enter Old password : <input id ="input" type="text" name ="oldpass"><br><br>

Enter New Password : <input id ="input" type ="text" name ="newpass"><br><br>

ReEnter New Password : <input id ="input" type="text" name ="newpassagain"><br><br>

<input type ="submit" value ="Change Password">
</fieldset>
</form>
</body>
</html>