<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Librarian Registration</title>
</head>
<body bgcolor="lightgreen">
		
	<form action="libRegConf" method="GET" >
		<br>	<br>	<br>	
		<h1 style="color:blue">--------&nbsp&nbspLibrarian Registration&nbsp&nbsp--------</h1>
		<table align="center">
		 	<tr>
		 		<td><h4>EMPLOYEE_NO</h4></td>
		 		<td><input type="text" name="emplNo"/></td>
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
				<td><h4>Date_of_Birth</h4></td>
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