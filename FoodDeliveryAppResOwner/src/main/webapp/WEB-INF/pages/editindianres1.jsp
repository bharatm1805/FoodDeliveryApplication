<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>

	<div align="center">
		<p>Edit Page</p>
	</div>


	<form:form action="saveindianres1" method="GET" modelAttribute="userReg">
      
      
		<form:hidden value="${editdto.id}"  path="id"/>

		<br>
		<br>
		<label>Item name:</label>
		<form:input value="${editdto.name}" path="name" />
		<br>
		<br>
		<label>cost:</label>
		<form:input value="${editdto.cost}" path="cost" />
		<br>
		<br>
		<input type="submit" value="save">
	</form:form>



</body>
</html>
