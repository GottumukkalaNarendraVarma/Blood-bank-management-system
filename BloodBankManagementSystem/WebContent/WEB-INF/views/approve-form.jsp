<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Approve form</title>
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
	<f:form action="decide" method="post" modelAttribute="approveRequest">
		<h1 style="text-align: center">Welcome to blood bank management
			system</h1>
		User id<f:input required="required" path="userId" />
		<br>
		First name<f:input required="required" path="firstName" />
		<br>
		Last name<f:input required="required" path="lastName" />
		<br>
		<input type="submit" value="submit">

	</f:form>

</body>
</html>