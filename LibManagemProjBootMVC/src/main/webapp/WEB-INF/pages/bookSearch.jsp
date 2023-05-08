<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body> 
	<center>
		<h1 style = 'color:blue; text-align:center'>Book Search</h1>
		<form:form method="GET" modelAttribute = "bookTrack">
		
		<table>
				<tr>
					<th>BOOK ID</th>
					<td><form:input path= 'bookId'/></td>
				</tr>
						<tr>
					<th>BOOK ID</th>
					<td><form:input path= 'bookName'/></td>
				</tr>
						<tr>
					<th>BOOK ID</th>
					<td><form:input path= 'authorLastName'/></td>
				</tr>
						<tr>
					<th>BOOK ID</th>
					<td><form:input path= 'authorFirstName'/></td>
				</tr>
						<tr>
					<th>BOOK ID</th>
					<td><form:input path= 'yearOfPublish'/></td>
				</tr>
				
					
				
				</table>
		
		
		
		
		
		
		</form:form>
	
	
	
	</center>

</body>
</html>