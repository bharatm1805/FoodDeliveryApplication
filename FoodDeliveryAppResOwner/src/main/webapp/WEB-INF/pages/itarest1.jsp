<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
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
  <a class="active" href="home">Home</a>
  <a href="feedback">Feedback and Reviews</a>
  <a href="tracking">Track Order</a>
  <a href="logout">Log out</a>
</div>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h2>Italian Restaurant 1</h1>
<h3>Cost for two: Rs 600<br>
Rating: 4.3</h3>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Cost</th></tr>  
   <c:forEach var="menu" items="${list}">   
   <tr>  
   <td>${menu.id}</td>  
   <td>${menu.name}</td>  
   <td>${menu.cost}</td>     
   </tr>  
   </c:forEach>  
</table>
<form action="confirmorderitarest1">
  <label for="dish">Enter Dish Id:</label><br>
  <input type="text" id="dish" name="dish"><br>
  <label for="quantity">Enter Quantity</label><br>
  <input type="text" id="quantity" name="quantity"><br><br>
  <input type="submit" value="Add to Cart">
</form> 
</body>
</html>