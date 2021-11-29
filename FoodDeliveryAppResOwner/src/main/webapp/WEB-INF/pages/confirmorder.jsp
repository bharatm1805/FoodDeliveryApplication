<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
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
  <a class="active" href="home">Home</a>
  <a href="feedback">Feedback and Reviews</a>
  <a href="tracking">Track Order</a>
  <a href="logout">Log out</a>
</div>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h2>Order Details</h2>
<h3>Click the payment button below to confirm the order and move to payment<br>
<h3>Dish Name: ${name}
<h3>Quantity: ${quantity}</h3>

<h3>Cart value: ${cart}</h3>
<h3>Delivery Charges: Rs 50</h3>
<h3>Total Order cost: ${cost}</h3>
<a href="payment">Pay for the order</a> <br>
</body>
</html>