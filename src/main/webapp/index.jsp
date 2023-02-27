<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SBI Net Banking</title>

<style>
h2 {
	color: white ;
	background : #A9a9a9;
	padding: 3px;
}
label {
	width:120px;
	display:inline-block;
	background-origin: border-box;
}
h6{
color:navy;
}
h5{
color:navy;
}
div.main{
position: relative;
right: 30px
border: 3px solid;
}
legend {
	color: navy;
	border-bottom-width: 10px;
	border-left: 20px;
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

<h2>Welcome to SBI Net Banking</h2>

<hr>
<div id ="index">
<h5>enter details carefully</h5>
<form action="success">
<div id ="main">
<fieldset>
<legend>Enter AccountNo & Password </legend>
<br>
<label>Account Number :</label> <input type ="text" name ="accountNo">
<br><br>
<label>Password :</label> <input type = "password" name ="password">
<br><br>
<input type="submit" value="Click Here to LogIn"  >
<br>
</div>
</fieldset>
<p>haven't registered? <a href="Register.jsp">Click here to Register</a><p>
  
</form>


<h6><a href ="TermsCondition.jsp">Terms of Service (Terms & Conditions)*</a></h6>
</div>

</body>

</html>