<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian LogIn</title>
</head>
<body bgcolor="lightgreen">
			<h1 style="color:blue; text-align:center;">--------&nbsp&nbsp Librarian LogIn &nbsp&nbsp--------</h1></center>
			<br><br><br>
	<form:form modelAttribute="libLog">
	 <center>                      
		<table style =align:center>
		 <tbody>
			<tr>
		 		<th>E-Mail</th>
					<td><form:input path='eMail' type = "email"/></td>
		 	</tr>
				<tr>
				<th>Password</th>
					<td><form:input path='password' type = "password"/></td>
		 	</tr>
				<tr>
		 		<td></td>
		 		<td><input type="submit" value="log in"/></td>
		 	</tr>	
		 	
		 	</tbody>		
		</table>
				<input type='button' value='Back to Home'
					onclick="window.location.href='./home';"/>
   </center>
   </form:form>
  
</body>
</html>