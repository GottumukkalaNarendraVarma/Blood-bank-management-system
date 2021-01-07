<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request success form</title>
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
	<h1 style="text-align: center">Welcome to blood bank management
		system</h1>
	<p align="justify">"Your request has been registered successfully.
		Wait for admin to approve your request"</p>
	<table border=1>
		<tr>
			<th>RequesterId</th>
			<th>patientName</th>
			<th>RequiredBloodGroup</th>
			<th>City</th>
			<th>DoctorName</th>
			<th>HospitalName</th>
			<th>HospitalAddress</th>
			<th>Date</th>
			<th>ContactName</th>
			<th>ContactNumber</th>
			<th>ContactEmail</th>
			<th>Message</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.requesterId}"></c:out></td>
				<td><c:out value="${user.patientName}"></c:out></td>
				<td><c:out value="${user.reqBloodGroup}"></c:out></td>
				<td><c:out value="${user.city}"></c:out></td>
				<td><c:out value="${user.doctorName}"></c:out></td>
				<td><c:out value="${user.hospitalName}"></c:out></td>
				<td><c:out value="${user.hospitalAddress}"></c:out></td>
				<td><c:out value="${user.date}"></c:out></td>
				<td><c:out value="${user.contactName}"></c:out></td>
				<td><c:out value="${user.contactNumber}"></c:out></td>
				<td><c:out value="${user.contactEmail}"></c:out></td>
				<td><c:out value="${user.msg}"></c:out></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>