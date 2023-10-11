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
	<c:choose>
	 	<c:when test="${status eq 'success'}">
	 		<h1 style='color:green'; text-align: center'>
	 			Registration completed successfully
            </h1>
       </c:when>
       <c:otherwise>
       		<h1 style='color:green'; text-align: center'>
	 			Registration not successful
            </h1>
       </c:otherwise>
     </c:choose>
</body>
</html>