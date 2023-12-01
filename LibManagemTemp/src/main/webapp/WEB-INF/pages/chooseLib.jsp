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
				
		 	 	<br>	<br>		
			    
			    <h1 style="color:blue;">Start here for Book Management</h1> 
			    
			    
			   	<h2 style="color:green;">Please Choose an Option  </h2>
				<br>
				<input type='button' value='Book Search'
					onclick="window.location.href='/LibManagement/book/search';"/>
				<br><br>
						<input type='button' value='Safe Book '
					onclick="window.location.href='./safe';"/>
			    <br><br><hr/><br><br>
			    
				<input type='button' value='Book CheckOut'
					onclick="window.location.href='/LibManagement/book/lend';"/>
				<br><br>		
				<input type='button' value='Book Return'
					onclick="window.location.href='/LibManagement/book/bookBack';"/>
			    	    <br><br><hr/><br><br>
			    	    
			    	<input type='button' value='Back to Home'
					onclick="window.location.href='./home';"/>

			</center>

</body>
</html>