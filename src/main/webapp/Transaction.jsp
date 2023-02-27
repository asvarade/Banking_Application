<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#table{
text-align:  center;
}
#logout{
color: black;
background-color:white; 
text-align: right;
}
</style>
</head>
<body>
<br>
<img src="https://www.freepnglogos.com/uploads/sbi-logo-png/sbi-logo-state-bank-india-group-vector-eps-0.png" width="90" height="30">
<div id ="logout"><a href="success.jsp"><u>Home</u></a></div>
<hr>


Account No : ${acc}<br><br>

Transaction To :-
<div name ="table" ><table><tr><th><u>Account No  </u></th><th><u>IFSC  </u></th><th><u>Amount</u></th></tr><br>
       <tr><th>${accountNo}</th><th>${ifsc}</th><th>${amount} Rs.</th></tr>
      
</body>
</html>