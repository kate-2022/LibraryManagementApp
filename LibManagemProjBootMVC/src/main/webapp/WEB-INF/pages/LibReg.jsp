<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Librarian Registration</title>
</head>
<body bgcolor="blue">
		
	<form method="post" action="./control/LReg">
		<table align="center">
		 	<tr>
		 		<td>ENROLLMENTNO</td>
		 		<td><input type="text" name="emplNo"/></td>
		 	</tr>
				<tr>
		 		<td>LASTNAME</td>
		 		<td><input type="text" name="lastName"/></td>
		 	</tr>
		 		<tr>
		 		<td>FIRSTNAME</td>
		 		<td><input type="text" name="firstName"/></td>
		 	</tr>
				<tr>
		 		<td>ENROLLMENTNO</td>
		 		<td><input type="date" name="doB"/></td>
		 	</tr>
				<tr>
		 		<td></td>
		 		<td><input type="submit" value="save"/></td>
		 	</tr>
		
		</table>

</body>

</html>
