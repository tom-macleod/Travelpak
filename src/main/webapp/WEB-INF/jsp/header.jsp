<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<title>Travelpak</title>
	<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Lobster" />
	<link type="text/css" rel="stylesheet" href="css/cerulean-bootstrap.css" />
	<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>

<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<c:url value="/" var="home" />
	        	<a href="${home}" class="navbar-brand lobster">Travelpak</a>
	        </div>
			<ul class="nav navbar-nav">
				<c:url value="/displayAboutPage" var="about" />
				<li><a href="${home}">Home</a></li>
				<li><a href="${about}">About</a></li>
				<li><a href="#">Packages</a></li>
			</ul>
		</div>
	</nav>


