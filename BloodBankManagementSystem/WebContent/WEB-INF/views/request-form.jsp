<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request form</title>
<style type="text/css">
input {
	width: 100%;
}

input[type=text] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
}

input[type=button], input[type=submit], input[type=reset] {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

body {
	background-color: #E6E6FA;
	color: green;
}
</style>

</head>

<body>
	<h1 style="text-align: center">Welcome to blood bank management
		system</h1>
	<f:form action="save" method="post" modelAttribute="requestBlood">

		Requester id<f:input required="required" path="requesterId" />
		<br>
		Patient name<f:input required="required" path="patientName" />
		<br>
		Required blood group<f:input required="required" path="reqBloodGroup" />
		<br>
		City<f:input required="required" path="city" />
		<br>
		Doctor name<f:input required="required" path="doctorName" />
		<br>
		Hospital name<f:input required="required" path="hospitalName" />
		<br>
		Hospital address<f:input required="required" path="hospitalAddress" />
		<br>
		Date<f:input required="required" path="date" />
		<br>
		Contact name<f:input required="required" path="contactName" />
		<br>
		Contact number<f:input required="required" path="contactNumber" />
		<br>
		Contact email<f:input required="required" path="contactEmail" />
		<br>
		Custom message<f:input required="required" path="msg" />
		<br>
		<input type="Submit" value="submit">

	</f:form>


</body>
</html>