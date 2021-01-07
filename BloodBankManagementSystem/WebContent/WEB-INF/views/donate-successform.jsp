<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donate success form</title>
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
	<h5 style="text-align: center">Every drop of blood can save
		life.Your request has been collected successfully</h5>
	<p>Your details are</p>
	<table border=1>
		<tr>
			<th>PatientId</th>
			<th>Time Of The day</th>
			<th>blood glucose level</th>
			<th>notes</th>

		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.patientId}"></c:out></td>
				<td><c:out value="${user.timeOfTheDay}"></c:out></td>
				<td><c:out value="${user.bloodGlucoseLevel}"></c:out></td>
				<td><c:out value="${user.notes}"></c:out></td>

			</tr>
		</c:forEach>
	</table>


</body>
</html>