<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body bgcolor="lightgreen">
			<h1 style="color:blue; text-align:center;">--------&nbsp&nbsp Student Registration &nbsp&nbsp--------</h1></center>
			<br><br><br>
	<form:form modelAttribute="stud">
	 <center>                      
		<table style =align:center>
		 <tbody><tr>
		 		<th>ENROLLMENT_NO</th>
		 		<td><form:input path='enrolNo'/></td>
		 	</tr>
				<tr>
				<th>LAST_NAME</th>
					<td><form:input path='lastName'/></td>
		 	</tr>
		 		<tr>
		 		<th>FIRST_NAME</th>
					<td><form:input path='firstName'/></td>
		 	</tr>
				<tr>
				<th>Date_of_Birth</th>
					<td><form:input path='doB' type = "date"/></td>
		 	</tr>
				<tr>
		 		<td></td>
		 		<td><input type="submit" value="save"/></td>
		 	</tr>	
		 	</tbody>		
		</table>
				<input type='button' value='Back to Home'
					onclick="window.location.href='./home';"/>
   </center>
   </form:form>
  
</body>
</html>