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
	<!-- <div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">

			<!-- put new button:: Add Customer -->
		<!-- <input type='button' value='Add Customer'
				onclick="window.location.href='showForm'; return false;"
				class="add-button" />

			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="customer" items="${customers}">
					
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${customer.id}"/>
					</c:url>
					
					<c:url var="deleteLink" value="/customer/showFormForDelete">
						<c:param name="customerId" value="${customer.id}"/>
					</c:url>
				
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td>
							<a href='${updateLink}'>UPDATE</a>
										|
							<a href="${deleteLink}"
								onclick="if(!(confirm('Are you sure u want to delete this customer?')))return false;">DELETE</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div> -->	 
	<div id="wrapper">
		<div id= "header">
			<h2>Library Management - Book Search</h2>
		</div>
	
	</div>
	
	<div id="container">
	<h1 style = 'color:blue; text-align:center'>Book Search</h1>
		
		<form:form method="POST" modelAttribute = "bTrack">
		
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
					<th>Year of Publication</th>
					<td><form:input path= 'yearOfPublication'/></td>
				</tr>
	
				<tr>
						<td><input type="submit" value="search" class= "search"/></td>
				</tr>
		
			</tbody>
		</table>
		</form:form>
	</div>	
	
	
	</center>


</body>


</html>