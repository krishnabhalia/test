<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
</head>
<body>
    <form method="get" action="SignUpServlet">
    SignUp<br>
	<br>
Username<input type="text" name="uname" value=""  pattern="[A-Za-z]{1,}" required/><br/>  
Password<input type="password" name="upass"  value="" required/><br/>  
<input type="hidden" name="role"  value="Employee" /><br/>  

<input type="submit" value="signup"/>  
	</form>
</body>
</html> 