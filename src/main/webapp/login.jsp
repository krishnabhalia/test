<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form method="get" action="LoginServlet">
	<br>Login<br>
Username<input type="text" name="uname1" value="" pattern="[A-Za-z]{1,}" required/><br/>  
Password<input type="password" name="upass1"  value=""  required/><br/>  

<input type="submit" value="login"/>  
	</form>
</body>
</html>