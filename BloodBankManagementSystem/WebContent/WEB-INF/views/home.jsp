<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style type="text/css">
li {
	display: inline;
	float: left;
	border-right: 1px solid #bbb;
}

li:last-child {
	border-right: none;
}

li a {
	color: green;
}

a {
	display: block;
	padding: 8px;
	background-color: #dddddd;
}

ul {
	background-color: #dddddd;
}

.active {
	background-color: #4CAF50;
}

ul {
	position: fixed;
	top: 0;
	width: 100%;
	border: 1px solid #e7e7e7;
	background-color: #f3f3f3;
}

body {
	background-color: #E6E6FA;
	color: green;
}

p {
	background-color: lightgrey;
	text-indent: 30px;
	text-align: justify;
}

img {
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 600px;
	height: 200px;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: blue;
	color: white;
	text-align: center;
}

.header {
	overflow: hidden;
	background-color: #E6E6FA;
	padding: 20px 10px;
}
</style>
</head>
<body>
	<div class="header">
		<h1 style="text-align: center">Welcome to Blood Bank Management
			System</h1>
	</div>
	<ul>
		<li><a href="register">Register</a></li>
		<li><a href="check">Check BloodAvailability</a></li>
		<li><a href="request">Request Blood</a></li>
		<li><a href="donate">Donate blood</a></li>
		<li><a href="process">Approve/Reject Request</a></li>
	</ul>
	<img alt="an image is supposed to be present here"
		src="https://wallpapercave.com/wp/wp4323457.jpg">
	<p style="color: navy">This software system is an online blood bank
		management system that helps in managing various blood bank operations
		effectively. This project consists of a central repository containing
		various blood deposits available along with associated details. These
		details include blood type, donor contact details. These details help
		in maintaining and monitoring the blood deposits. The project is an
		online system that allows to check whether required blood deposits of
		a particular group are available in the blood bank. Moreover the
		system also has added features such as patient name and contacts,
		blood booking . This online system is developed on java platform and
		supported by an MySql database to store blood and user specific details.</p>
	<div class="footer">
		<h3 style="text-align: center">Thanks for visiting</h3>
	</div>
</body>
</html>