<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page isELIgnored="false" %>
     
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
  <h1 class="text-center">Add Account</h1>

	<form class="m-5 pb-2" action="pay" method="post">
		<div class="form-group ">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email" name="email"> 
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password" name="pass">
		</div>
		 <div class="form-group">
			<label for="cname">CardHolderName</label> <input
				type="text" class="form-control" id="cname"
				 placeholder="Rohit Khiladi" name="name"> 
		</div>
		<div class="form-group">
			<label for="no">CardNumber</label> <input
				type="text" class="form-control" id="no"
				placeholder="9876 6567 6789 9743" name="cno">
		</div>
		
		<div class="form-group">
			<label for="date">Date</label> <input
				type="text" class="form-control" id="date"
				 placeholder="24/12" name="date"> 
		</div>
		<div class="form-group">
			<label for="cvv">Cvv</label> <input
				type="text" class="form-control" id="cvv"
				placeholder="589" name="cvv">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		
		<div class="form-row">
  
  <a href="CreditCards" class="card-link">Not Now Credit</a>
  <a href="DebitCard" class="card-link">Not Now Debit</a>
  
  </div>
	</form>


	<!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
    -->
  </body>
</html>