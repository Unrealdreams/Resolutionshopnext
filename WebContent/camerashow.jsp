<%@page import="by.bsac.model.database.Camera"%>
<%@page import="by.bsac.model.databaseparse.Parsedb"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Cover Template for Bootstrap</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
	integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"
	integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
	crossorigin="anonymous"></script>
<!-- Bootstrap core CSS -->

<!-- Bootstrap core CSS -->
<link href="../../../../dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="index.css" rel="stylesheet">
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

img {
	max-width: 100%;
	height: auto;
}
</style>

</head>
<body>
	<div class="site-wrapper">

		<div class="site-wrapper-inner">

			<div class="cover-container">

				<header class="masthead clearfix">
				<div class="inner">
					<h3 class="masthead-brand">ResolutionShop.by</h3>
					<nav class="nav nav-masthead"> <a class="nav-link active"
						href="http://localhost:8080/Resolutionshopnext/index.jsp">Home</a> <a
						class="nav-link" href="http://localhost:8080/Resolutionshopnext/Cameras.jsp">Cameras</a>
					<a class="nav-link" href="#">Lens</a> <a class="nav-link" href="http://localhost:8080/Resolutionshopnext/Signin.jsp">Sign
						in</a> </nav>
				</div>
				</header>
				<main role="main" class="inner cover">
				<h1 class="cover-heading">Select mark of camera:</h1>

				<p class="lead">
					<a href="http://localhost:8080/Resolutionshop/TestServlet?cmd=showcanon"
						class="btn btn-lg btn-secondary">Canon</a> <a
						href="http://localhost:8080/Resolutionshop/TestServlet?cmd=showsony"
						class="btn btn-lg btn-secondary">Sony</a> <a
						href="http://localhost:8080/Resolutionshop/TestServlet?cmd=showpanasonic"
						class="btn btn-lg btn-secondary">Panasonic</a> <a
						href="http://localhost:8080/Resolutionshop/Nikon.jsp"
						class="btn btn-lg btn-secondary">Nikon</a>
				</p>
				</main>

				<div class="container">
					<form action="Main" method="get">
						<%
							List<Camera> cameralist = (List<Camera>) request.getAttribute("cameralist");
						%>

						<br>
						<table>
							<tr>
								<th>Mark</th>
								<th>Model</th>
								<th>Cost</th>
							</tr>
							<%
								for (int i = 0; i < cameralist.size(); i++) {
							%>
							<TR>
								<%
									Camera camera = (Camera) cameralist.get(i);
								%>
								<TD><%=camera.getMark()%></TD>
								<TD><%=camera.getModel()%></TD>
								<TD>Cost:<%=camera.getCost()%>$
									<p><a href="http://localhost:8080/MyCanon/Servletphoto?cmd=showcanon"
						class="btn btn-lg btn-secondary">buy</a>
						<a href="http://localhost:8080/MyCanon/Servletphoto?cmd=showcanon"
						class="btn btn-lg btn-secondary">view</a></TD>

							</TR>
							<%
								}
							%>
						</TABLE>
						<p>
							
				</div>
			</div>
			<footer class="mastfoot">
			<div class="inner">
				<p>©ResolutionShop.by</p>
			</div>
			</footer>
		</div>

	</div>

	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="../../../../assets/js/vendor/popper.min.js"></script>
	<script src="../../../../dist/js/bootstrap.min.js"></script>




</body>
</html>