<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
  <a  href="home">Home</a>
  <a class="active" href="feedback">Feedback and Reviews</a>
  <a href="tracking">Track Order</a>
  <a href="logout">Log out</a>
</div>
<meta charset="ISO-8859-1">

</head>
<body>
        
		<h3>Welcome to Feedback Page</h3>
		<br>
		
	

	<form:form action="viewfeedbacks" method="GET"
		modelAttribute="userReg">
		
		<label>Restaurant name:</label>
		<br>
		<form:select path="restaurantname">
			<form:option value="Indiarestaurant1" label="Indiarestaurant1"></form:option>
			<form:option value="Indiarestaurant2" label="Indiarestaurant2"></form:option>
			<form:option value="Italianrestaurant1" label="Italianrestaurant1"></form:option>
			<form:option value="Italianrestaurant2" label="Italianrestaurant2"></form:option>
		</form:select>
		<br>
        <br>
		<label>Rating(min 1 to max 5)</label>
		<br>
		<form:input path="rating" />

		<br>
		<br>

		<label>What was not up to mark?</label>
		<br>
		<form:input path="needtoimprove" />

		<br>
		<br>

		<label>What did you like?</label>
		<br>
		<form:input path="customerlike" />

		<br>
		<br>
        
        <label>write reviews</label>
        <br>
		<form:input path="reviews" />
		
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>

	

</body>
</html>




