<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
        
		<h3>Welcome to add item Page</h3>
		<br>
		
	

	<form:form action="saveindianres1" method="GET"
		modelAttribute="userReg">
		<br>
		<label>Item ID:</label>
		<form:input path="id" />
		<br>
		<label>Item name:</label>
		<form:input path="name" />

		<br>
		<br>

		<label>cost :</label>
		<form:input path="cost" />

		<br>
		<br>

		<input type="submit" value="ADD">
	</form:form>

	

</body>
</html>




