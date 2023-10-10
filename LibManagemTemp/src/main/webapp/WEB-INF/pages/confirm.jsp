<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Page</title>
</head>
<body>
	<center>
		 <h1 style='color: red; text-align: center;'>Book Checkout </h1>

				<h2>Your book checkout was successful for the following entity:</h2>
						<h1 style='color:red; text-align: center;'>BOOK DETAILS</h1>
		<table border='1'>
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
				<th>Year of Publication</th>
				<td>${book.yearOfPublication}</td>
			</tr>
			</table>

	</center>
</body>
</html>
