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

		<table border='1' style= align:center>
			<tr>
				<th>Enrollment No</th>
				<td>${studReg.enrolNo}</td>
			</tr>
			<tr>
				<th>First Name</th>
				<td>${studReg.firstName}</td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td>${studReg.lastName}</td>
			</tr>
			<tr>
				<th>Date of Birth</th>
				<td>${studReg.doB}</td>
			</tr>
					<tr>
				<th>e-mail</th>
				<td>${studReg.eMail}</td>
			</tr>
		</table>
		
				<input type='button' value='Back to Home'
					onclick="window.location.href='./home';"/>
			    

</html>