<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body bgcolor="lightblue">
		
	<form method="post" action="/studRegConf">
		<br>	<br>	<br>	
		
		<h1 style="color:green">Student Registration</h1>
		<table align="center">
		 	<tr>
		 		<td><h4>ENROLLMENT_NO</h4></td>
		 		<td><input type="text" name="enrolNo"/></td>
		 	</tr>
				<tr>
				<td><h4>LAST_NAME</h4></td>
		 		<td><input type="text" name="lastName"/></td>
		 	</tr>
		 		<tr>
		 		<td><h4>FIRST_NAME</h4></td>
		 		<td><input type="text" name="firstName"/></td>
		 	</tr>
				<tr>
				<td><h4>LAST_NAME</h4></td>
		 		<td>Date_of_Birth</td>
		 		<td><input type="date" name="doB"/></td>
		 	</tr>
				<tr>
		 		<td></td>
		 		<td><input type="submit" value="save"/></td>
		 	</tr>
		
		</table>
   </form>
</body>
</html>