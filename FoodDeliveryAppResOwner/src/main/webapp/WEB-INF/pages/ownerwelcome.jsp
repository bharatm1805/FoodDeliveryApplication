<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

  


   <c:forEach var="menu" items="${res}">   
   
  
  <a href="${menu.restaurantname}"> 
        <button type="button"> 
           ${menu.restaurantname}
        </button> 
    </a> 
    <br>
    <br>
    <a href="vieworders/${menu.restaurantname}"> 
        <button type="button"> 
           view orders
        </button> 
    </a>
    <br>
    <br>
    <a href="logout">
    <button type="button">Log out</button>
    </a>
      

   </c:forEach>  
  
  