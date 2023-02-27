<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label{
color:maroon;
width:130px;
height:20px;
display: inline-block;
text-align: left;
}
#logout{
color: black;
background-color:white; 
text-align: right;
}
div.whole{
border-top-color: black;
width: 200;
}
input{
width:160px;
text-align: left;
background-origin: border-box;
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
<div id ="logout"><a href="index.jsp"><u>Back</u></a></div>
<hr>
<h3>Net Banking Registration</h3>

<hr>


<form action="register">
<div class="whole">
<h5> Enter Details Carefully</h5><br>
<fieldset>
<legend>Details </legend>
<br>
<label>First Name : </label><input type ="text" name ="fname"><br><br>
<label>Middle Name : </label> <input type ="text" name ="mname"><br><br>
<label>Last name : </label> <input type ="text" name ="lname"><br><br>
<label>Mobile No : </label> <input type ="text" name ="mobileNo"><br><br>

<label>Account No : </label><input type= "text" name ="accountNo"><br><br>

<label>IFSC code : </label><input type ="text" name ="ifsc"><br><br>

<label>AdhaarCard No : </label> <input type ="text" name ="addhar"><br><br>

<label>PanCard No : </label> <input type ="text" name ="pan"><br><br>

<label>City : </label> <input type ="text" name="city"><br><br>

<label>State : </label> <input type ="text" name ="state"><br><br>

<p><u><i>set username & password</i></u></p>

<label>set username </label><input type ="text" name ="setusername"><br><br>
<label>set password </label><input type ="password" name ="password"><br><br>
<label>reenter password </label><input type ="password" name ="password1" ><br><br>

<input type ="submit" value ="Submit" >
</fieldset>
</form>
</div>

</body>
</html>