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
	<h1 style="color:blue; text-align:center;">Librarian Registration Confirmation</h1>
	<center>
		<table border='1'>
			<tr>
				<th>Employee No</th>
				<td>${libReg.emplNo}</td>
			</tr>
			<tr>
				<th>First Name</th>
				<td>${libReg.firstName}</td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td>${libReg.lastName}</td>
			</tr>
			<tr>
				<th>Date of Birth</th>
				<td>${libReg.doB}</td>
			</tr>
		</table>
		
		<input type='button' value='Back to Home'
					onclick="window.location.href='./home';"/>
</center>
</html>