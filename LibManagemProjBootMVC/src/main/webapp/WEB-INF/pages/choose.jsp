<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Overview</title>
</head>
<body bgcolor="lightblue">
			<center> 
			
				<h1 style="color:blue;">Start here for Registration</h1> 
				<h2 style="color:green;">Please Choose an Option  </h2>
				<br>				
				<input type='button' value='Student Registration'
					onclick="window.location.href='./studReg';"/> 
					
				<input type='button' value='Librarian Registration'
					onclick="window.location.href='./librReg';"/>
				
		 	 	<br>	<br>		
			    
			    <h1 style="color:blue;">Start here for Book Management</h1> 
			   	<h2 style="color:green;">Please Choose an Option  </h2>
				<br>
				<input type='button' value='Book Search'
					onclick="window.location.href='/LibManagement/book/search';"/>
					
				<input type='button' value='Book CheckOut'
					onclick="window.location.href='/LibManagement/book/check';"/>
					
				<input type='button' value='Book Return'
					onclick="window.location.href='/LibManagement/book/bookBack';"/>
			    

			</center>

</body>
</html>