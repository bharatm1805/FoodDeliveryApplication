<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
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
  
    <h1 class="text-center text-danger">Debit Card</h1>
    
     <div class="left border">
                    
                        <div class="icons"><h2>Payment <img src="https://img.icons8.com/color/48/000000/visa.png" /> <img src="https://img.icons8.com/color/48/000000/mastercard-logo.png" /> <img src="https://img.icons8.com/color/48/000000/maestro.png" /></h2> </div>
                          
                    <form action="payments" method="post"> 
                      
                      <span>Cardholder's name:</span> <input placeholder="Rohit Khiladi" name="card"> <span>Card Number:</span> <input placeholder="5568 6780 4567 9909" name="cardNo">
                        <div class="row">
                            <div class="col-4"><span>Expiry date:</span> <input placeholder="YY/MM" name="exp"> </div>
                            <div class="col-4"><span>CVV:</span> <input id="cvv" name="cvv"> </div>
                        </div>
                        <div class="container text-center">
                             <button type="submit" class="btn btn-success">Submit</button>
                        </div>
                    </form>
     </div> 
    
    
    
    

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