<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Page</title>
<style>
.save {
  background-color: blue;
  color: white;
  padding: 10px;
</style>

</head>
<body>
	<center>
		 <h1 style='color: red; text-align: center;'>Book Checkout </h1>

				<h2>Your book checkout was successful for the following entity:</h2>
						<h1 style='color: green; text-align: center;'>BOOK DETAILS</h1>
		  <h1 style ='color:blue; text-align:center'>Book Checkout</h1>
		  
			<form:form action = "/home"  method="GET" modelAttribute = "bTrack">
		<table border='1'>
			
				<tr>
					<th>Book ID</th>
					<td><form:input path= 'bookId'/></td>
				</tr>
						<tr>
					<th>Book Name</th>
					<td><form:input path= 'bookName'/></td>
				</tr>
						<tr>
					<th>Author Last Name</th>
					<td><form:input path= 'authorLastName'/></td>
				</tr>
						<tr>
					<th>Author First Name</th>
					<td><form:input path= 'authorFirstName'/></td>
				</tr>
						<tr>
					<th>Year of Publication</th>
					<td><form:input path= 'yearOfPublication'/></td>
				</tr>			
				
				</table>
			     <tr>
						<td><input type="text" value="lend" class= "save"/></td>
				</tr>

			</form:form>


	</center>
</body>
</html>
