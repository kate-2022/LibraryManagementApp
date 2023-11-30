<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkout</title>
</head>
<body bgcolor="lightblue">
	<center>
			<h2>Library Management - Book CheckOut</h2>

		<h1 style ='color:blue; text-align:center'>Book Checkout</h1>

				<table>
				<tr>			
					<th>Book ID</th>
					<td>${book.bookId}</td>
				</tr>
				<tr>			
					<th>Book Name</th>
					<td>${book.bookName}</td>
				</tr>
				<tr>			
					<th>Author Last Name</th>
					<td>${book.authorLastName}</td>
				</tr>
				<tr>			
					<th>Author First Name</th>
					<td>${book.authorFirstName}</td>
				</tr>		
				<tr>			
					<th>Subject Area</th>
					<td>${book.subjectArea}</td>
				</tr>	
				<tr>			
					<th>Year of Publication</th>
					<td>${book.yearOfPublication}</td>
				</tr>	
						<tr>			
					<th>Date of Loan</th>
					<td>${book.dateOfLoan}</td>
				</tr>		
				
			     <tr>
						<td><input type="submit" value="lend" class= "save"/></td>
				</tr>
				</table>

			
				<input type='button' value='Back to Home'
					onclick="window.location.href='/LibManagement/lib/home';"/>  	
	</center>

</body>
</html>