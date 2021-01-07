<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success form</title>
<style>
table {
	border-collapse: collapse;
}

th, td {
	padding: 15px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

th {
	background-color: #4CAF50;
	color: white;
}

body {
	background-color: #E6E6FA;
	color: green;
}
</style>


</head>
<body>

	<p align="center">Registration successful</p>
	<p align="center">Please note your id for future reference</p>
	<table border=1>
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Age</th>
			<th>Gender</th>
			<th>BloodGroup</th>
			<th>City</th>
			<th>ContactNumber</th>
			<th>ContactEmail</th>
		</tr>
		<c:forEach items="${persons}" var="person">
			<tr>
				<td><c:out value="${person.id}"></c:out></td>
				<td><c:out value="${person.firstName}"></c:out></td>
				<td><c:out value="${person.lastName}"></c:out></td>
				<td><c:out value="${person.age}"></c:out></td>
				<td><c:out value="${person.gender}"></c:out></td>
				<td><c:out value="${person.bloodGroup}"></c:out></td>
				<td><c:out value="${person.city}"></c:out></td>
				<td><c:out value="${person.contactNumber}"></c:out></td>
				<td><c:out value="${person.contactEmail}"></c:out></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>