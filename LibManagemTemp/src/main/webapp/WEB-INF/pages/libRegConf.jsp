<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian Registration</title>
</head>
<body bgcolor="lightblue">
	<br/><br/>
		<table border='1'>
			<tr>
				<th>Employee No</th>
				<td>${librarian.emplNo}</td>
			</tr>
			<tr>
				<th>First Name</th>
				<td>${librarian.firstName}</td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td>${librarian.lastName}</td>
			</tr>
			<tr>
				<th>Date of Birth</th>
				<td>${librarian.doB}</td>
			</tr>
		</table>
</body>
</html>