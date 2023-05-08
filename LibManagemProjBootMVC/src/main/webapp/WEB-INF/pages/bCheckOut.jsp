<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkout</title>
</head>
<body>
	<center>
		<h1 style ='color:blue; text-align:center'>Book Checkout</h1>
			<form:form method="POST" modelAttribute = "bookLend">
				<table>
				<tr>
					<th>BOOK ID</th>
					<td><form:input path= 'bookId'/></td>
				</tr>
						<tr>
					<th>BOOK NAME</th>
					<td><form:input path= 'bookName'/></td>
				</tr>
						<tr>
					<th>AUTHOR LAST NAME</th>
					<td><form:input path= 'authorLastName'/></td>
				</tr>
						<tr>
					<th>AUTHOR FIRST NAME</th>
					<td><form:input path= 'authorFirstName'/></td>
				</tr>
						<tr>
					<th>YEAR OF PUBLISH</th>
					<td><form:input path= 'yearOfPublish'/></td>
				</tr>
				<tr> 
					<td><input type = 'submit' value='register'></td>
				</tr>
					
				
				</table>
			</form:form>




	</center>

		
		
</body>
</html>