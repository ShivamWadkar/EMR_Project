<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="emr.pojo.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	div{
		height: 50px;
		max-width: 50px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<div >


	<%
	Patient p = (Patient) request.getAttribute("patient");
	if (p != null) {
	%>
	<h3>
		Welcome
		<%=p.getFirstName()%></h3>
	
	</div>
	<div style="top:03%; left:80%">
	<%
	Blob image = null;

	byte[] imgData = null;

			image = p.getProfilePhoto();

			imgData = image.getBytes(1, (int) image.length());


		// display the image

		response.setContentType("image/gif");

		OutputStream o = response.getOutputStream();

		o.write(imgData);

		o.flush();

		o.close();

	
	%>
	<%
	}
	%>
</div>
	

	
</body>
</html>