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
<body>

			<center> 
			
				<h1 style="color:blue;">Start here for Registration</h1> 
				<h2 style="color:green;">Please Choose an Option  </h2>
				<br>				
				<input type='button' value='Student Registration'
					onclick="window.location.href='./studentReg'; return false;"
					class="search" />
					
				<input type='button' value='Librarian Registration'
					onclick="window.location.href='./libReg'; return false;"
					class="search" />
				
		 	 	<br>	<br>		
			    
			    <h1 style="color:blue;">Start here for Book Management</h1> 
			   	<h2 style="color:green;">Please Choose an Option  </h2>
				<br>
				<input type='button' value='Book Search'
					onclick="window.location.href='./bookSearch'; return false;"
					class="search" />
					
				<input type='button' value='Book CheckOut'
					onclick="window.location.href='./bCheckOut'; return false;"
					class="search" />
					
				<input type='button' value='Book Return'
					onclick="window.location.href='./bReturn'; return false;"
					class="search" />
			    

			</center>

</body>
</html>