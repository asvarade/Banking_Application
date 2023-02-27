 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
type,a,input{
color: windowframe;
text-align: center;
background-origin: border-box;
size: 200px;

}
#logout{
color: black;
background-color:white; 
text-align: right;
}
img.profile{
text-align: center;
}</style>
</head>
<body>
<br>
<img src="https://www.freepnglogos.com/uploads/sbi-logo-png/sbi-logo-state-bank-india-group-vector-eps-0.png" width="90" height="30">
<img align="right" id ="profile" src="https://cdn-icons-png.flaticon.com/512/3177/3177440.png" width="50" height="50" style="text-align: right;">
<br><br><div id ="logout"><a href="index.jsp"><u>LogOut</u></a></div>

<hr><h3 style="background-color: #A9a9a9;">Successfully LogIn...</h3>
<p>Welcome to SBI Netbanking Services</p>
<hr>
   Account No :- ${account}<br><br>
    
    <form action ="changepassword.jsp">
   <input type ="submit" value ="Change Password"><br><br>
   </form>
   <form action="sendmoney">
   <input type ="submit" value ="Make Transaction" ><br><br>
   </form>
   <form action="balance">
     <input type ="submit" value ="  Check Balance  " style="text-align: right;"><br><br>
   </form>
   
   <form action="transaction">
     <input type ="submit"  width="100" value ="See Transaction"><br><br>
   </form>
   <form action ="diactivate">
   <input type= "submit" value ="Diactivate Account"><br><br>
   </form>
   
    <form action ="DepositAmount.jsp">
    <input type ="submit" value ="Deposit Money">
    </form>
</body>
</html>