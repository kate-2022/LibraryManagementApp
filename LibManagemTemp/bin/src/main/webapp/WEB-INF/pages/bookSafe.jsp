<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body> 
	<center>
 
	<div id="wrapper">
		<div id= "header">
			<h2>Library Management - Add Book to Catalogue</h2>
		</div>
	
	</div>
	
	<div id="container">
	<h1 style = 'color:blue; text-align:center'>Safe Book to Catalogue</h1>
		
		<form:form  modelAttribute = "safeB"> 
		<table>	
			<tbody><tr>
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
					<th>Subject Area</th>
					<td><form:input path= 'subjectArea'/></td>
				</tr>
						<tr>
					<th>Year of Publication</th>
					<td><form:input path= 'yearOfPublication'/></td>
				</tr>
							<tr>
					<th>Book available</th>
					<td><form:input path= 'bookStatus'/></td>
				</tr>
						<tr>
					<th>Date of Loan</th>
					<td><form:input path= 'dateOfLoan' /></td>
				</tr>
	
				<tr>
						<td><input type="submit" value="save" class= "search"/></td>
				</tr>
		
			</tbody>
		</table>
		 </form:form>
	</div>	
		
			<input type='button' value='Back to Home'
					onclick="window.location.href='/LibManagement/lib/home';"/>  	
		
	
	</center>

</body>


</html>