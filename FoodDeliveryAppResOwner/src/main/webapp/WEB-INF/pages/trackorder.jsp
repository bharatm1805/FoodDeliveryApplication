<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 
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
  <a  href="home">Home</a>
  <a href="feedback">Feedback and Reviews</a>
  <a  class="active" href="tracking">Track Order</a>
  <a href="logout">Log Out</a>
</div>

<title></title>
</head>
<body>
<h1>Executive Details page</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Phone number</th><th>Executive name</th><th>Vehicle number</th><th>Order id</th></tr>  
      
   <tr>  
   <td>${phone}</td>  
   <td>${name}</td>  
   <td>${vehicle}</td>  
   <td>${orderid}</td> 
    
     
   </tr>  
   
   </table> 
  <h3>Your order will be delivered within 30 minutes by our delivery executive:</h3>
     <div align= "center">
     <h2>Name: ${name}</h2>
     <h2>Phone No.: ${phone}</h2>
  <h2>Order Details</h2>
  <h3>Dish Name: ${dname}</h3>
  <h3>Quantity: ${quantity}</h3>
  <h3>Restaurant name: ${rname}</h3>

     </div>
     
</body>
</html>