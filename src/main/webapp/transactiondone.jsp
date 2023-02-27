<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
p,h3{
text-align: center;
}
#logout{
text-align: right;
}
#msg{
color: green;
}
</style>
</head>
<body><br>
<img src="https://www.freepnglogos.com/uploads/sbi-logo-png/sbi-logo-state-bank-india-group-vector-eps-0.png" width="90" height="30"><br>
<div id ="logout"><a href="success.jsp"><u>Home</u></a></div>
<div id ="logout"><a href= "index.jsp"><u>LogOut</u></a></div>
<hr><h3 id ="msg">Transaction Succesfully</h3>

<h3 >Available balance is ${availabelbalance}</h3>
<br>
<p>Thanx For Using SBI Net Banking</p>
</body>
</html>