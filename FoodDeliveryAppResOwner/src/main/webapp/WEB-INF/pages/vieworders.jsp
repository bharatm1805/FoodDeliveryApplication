<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 10px;
}
</style>
</head>
<body>
	<div align="center">
		<p>View Orders</p>
	</div>
	<hr>
	<h4>Current Orders</h4>


	<table>
		<tr>
			<th>Id</th>
			<th>Dish name</th>
			<th>Quantity</th>
			<th>Cost</th>
		</tr>
		<c:forEach var="detailVar" items="${list}">
			<tr>
				<td>${detailVar.oid}</td>
				<td>${detailVar.dish_name}</td>
				<td>${detailVar.quantity}</td>
				<td>${detailVar.cost}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>




</body>
</html>