<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page of Registration</title>
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