<!DOCTYPE html>
<html>
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

<h2>Pick the cuisine you want to eat</h2>
<p>Move the mouse over the button to view the restaurants serving that cuisine</p>

<div class="dropdown">
  <button class="dropbtn">Indian</button>
  <div class="dropdown-content">
    <a href="indrest1">Indian Restaurant 1</a>
    <a href="indrest2">Indian Restaurant 2</a>
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">Italian</button>
  <div class="dropdown-content">
    <a href="itarest1">Italian Restaurant 1</a>
    <a href="itarest2">Italian Restaurant 2</a>
  </div>
</div>

</body>
</html>
