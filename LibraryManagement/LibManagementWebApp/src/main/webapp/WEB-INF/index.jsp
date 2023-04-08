<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Library Registration</title>
</head>
<body bgcolor="lightgreen">

   <h1 style="color: blue; text-align:center;"> Student Registration </h1>
  	 <form method="post" action="./control/register"> 
  	 	<br/><br/>
  	 	<h2 style="color: white; text-align:center">Enter your details here:</h2>
  	 	<br/>
  	 
  	 
  	 	<font color="blue" size="4">
  	 	  <table align ="center">
  	 	  <tr>
  	 	  	<td> Enrollment no. </td>
  	 	  	<td> <input type="text" name="enrollmentNo"/> </td>
  	 	  </tr>
  	 	    <tr>
  	 	  	<td> Last name </td>
  	 	  	<td> <input type="text" name="lastName"/> </td>
  	 	  </tr>
  	 	      <tr>
  	 	  	<td> First name </td>
  	 	  	<td> <input type="text" name="firstName"/> </td>
  	 	  </tr>
  	 	 
		
		</table>


   		<center>
   		<label for="doB">Enter date of birth</label>
   			<input type="date" required/><br/><br/>
 
   	     <label for="female">Female</label>
   	    	  <input type="radio" value="female" name="gender"/> 
   	      <label for="male">Male</label>
   	     	 <input type="radio" value="male" name="gender"/> <br/>
   	     	 <br/><br/>
   	     <input type="submit" value="save" />  	
	
   	     </center>
   	     </font>
   	</form>

</body>
</html>