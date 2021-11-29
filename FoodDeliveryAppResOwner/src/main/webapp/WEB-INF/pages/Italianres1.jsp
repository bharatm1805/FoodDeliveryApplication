<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
 <head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>
</head>
<body>
<div class="topnav">
  <a class="active" href="italianres1">Update Menu</a>
  <a href="vieworders/italian1">View Orders</a>
  <a href="logout">Log out</a>
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
		<p>Details Page</p>
	</div>
	<hr>
	<h4>Items Details</h4>


	<table>
		<tr>
			<th>Id</th>
			<th>Item name</th>
			<th>Cost</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="detailVar" items="${list}">
			<tr>
				<td>${detailVar.id}</td>
				<td>${detailVar.name}</td>
				<td>${detailVar.cost}</td>
				<td><a href=" edititalianres1/${detailVar.id}">Edit</a></td>
				<td><a href=" deleteitalianres1/${detailVar.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>

<a href="additalianres1">Add item</a>



</body>
</html>