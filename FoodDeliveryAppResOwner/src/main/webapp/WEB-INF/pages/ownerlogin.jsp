<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


</head>
<body>

		<h3>Welcome to login Page</h3>
		<br>
   <form action="ownerwelcome" method="post">

   
  
    <label for="uname"><b>User name</b></label>
    <br>
    <br>
    <input type="text" placeholder="Enter Username" name="uname" required>
    <br>
	<br>
    <label for="psw"><b>Password</b></label>
    <br>
    <br>
    <input type="password" placeholder="Enter Password" name="psw" required>
    <br>
    <br>
    <button type="submit">Login</button>
    

</form>

</body>
</html>