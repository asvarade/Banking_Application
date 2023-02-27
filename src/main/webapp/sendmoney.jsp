<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#logout{
color: black;
background-color:white; 
text-align: right;
}
input{
color: windowframe;
text-align: left ;
background-origin: border-box;
size: 200px;
}
label {
	width:120px;
	display:inline-block;
}
fieldset{
color: black;
background-color: #ddf4ff;
}
</style>
</head>
<body>
<br>
<img src="https://www.freepnglogos.com/uploads/sbi-logo-png/sbi-logo-state-bank-india-group-vector-eps-0.png" width="90" height="30">

<div id ="logout"><a href="success.jsp"><u>Home</u></a></div>
<hr>
 
<fieldset>
<legend>Enter details </legend>
<br>
<br>
<form action="moneysent">
<label>Account Number :</label> <input type ="text" name ="accountNo">
<br><br>
<label>IFSC code :</label> <input type ="text" name ="ifsc">
<br><br>
<label>Amount :</label> <input type ="text" name ="amount">

<input type ="submit" value ="PAY">
</fieldset>
</form>
</body>
</html>