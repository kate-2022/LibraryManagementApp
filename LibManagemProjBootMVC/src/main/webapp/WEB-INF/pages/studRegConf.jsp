<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body bgcolor="lightblue">
	<br/><br/>
	<h1 style="color:blue; text-align:center;">Student Registration Confirmation</h1>
	<center>
		<table border='1'>
			<tr>
				<th>Enrollment No</th>
				<td>${stud.enrolNo}</td>
			</tr>
			<tr>
				<th>First Name</th>
				<td>${stud.firstName}</td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td>${stud.lastName}</td>
			</tr>
			<tr>
				<th>Date of Birth</th>
				<td>${stud.doB}</td>
			</tr>
		</table>
</center>
</html>