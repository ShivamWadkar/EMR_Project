<%@page import="com.emr.pojo.Event"%>
<%@page import="java.util.List"%>

<%@page import="com.emr.pojo.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">


<title>Events</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">

<!-- Site Icons -->
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">

<!--------------------------->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/css/util.css">
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/css/main.css">
<!--------------------------->
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Pogo Slider CSS -->
<link rel="stylesheet" href="css/pogo-slider.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="css/style.css">
<!-- Responsive CSS -->
<link rel="stylesheet" href="css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="css/custom.css">

<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap"
	rel="stylesheet">
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css'>

<!--Only for demo purpose - no need to add.-->
<link rel="stylesheet" href="css/demo.css" />

<link rel="stylesheet" href="css/style.css">

</head>
<body id="home" data-spy="scroll" data-target="#navbar-wd"
	data-offset="98">

	<div class="main-top">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="left-top">
						<a class="new-btn-d br-2" href="#"><span><b>eHealthBook</b></span></a>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="wel-nots"></div>

				</div>
			</div>
		</div>
	</div>
	<!-- End top bar -->

	<!-- Start header -->
	<header class="top-header">
		<nav class="navbar header-nav navbar-expand-lg">
			<div class="container">
				<a class="navbar-brand" href="/index"><img
					src="images/logo6.png" height="60px" alt="image"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbar-wd" aria-controls="navbar-wd"
					aria-expanded="false" aria-label="Toggle navigation">
					<span></span> <span></span> <span></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end"
					id="navbar-wd">
					<ul class="navbar-nav">
						<li><a class="nav-link" href="index">Home</a></li>
						<li><a class="nav-link" href="patient_dashboard">Dashboard</a></li>
						<li><a class="nav-link" href="signOut">LOGOUT</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->
<body>
	<div style="text-align: center;">
		<%
		List<Event> evens = (List<Event>) request.getAttribute("events");
		if (evens == null) {
		%>
		<font color="red">You have not logged In Please Login First !</font>
		<%
		}
		
		%>
	</div>



	<div class="container-login100">

		<div class="container-fluid">

			<section>
				<div class="rt-container">
					<div class="col-rt-08">
						<div class="Scriptcontent">

							<!-- Patient Profile -->
							<div class="student-profile py-4">
								<div class="container">
									<div class="row">

										<div class="col-lg-12">
											<div class="card shadow-sm">
												<div class="card-header bg-transparent border-0">
													<h3 class="mb-0">
														<i class="far fa-clone pr-1"></i> Events
													</h3>
												</div>
												
												<div class="card-body pt-0">
													<table class="table">
														<thead>
															<tr>
																<th scope="col">SrNo.</th>
																<th scope="col">Type</th>
																<th scope="col">Description</th>
																<th scope="col">Date</th>
																<th scope="col">Action</th>
															</tr>
														</thead>
														<tbody>
															<%
															for (Event event : evens) {
																int id = event.getId() * 8659;
																int count = 1;
															%>
															<tr>
																<td><%= count %></td>
																<td><%= event.getEventType() %></td>
																<td><%= event.getEventDescription() %></td>
																<td><%= event.getEventDate() %></td>
																<td><a class="btn btn-danger" href="http://localhost:8080/deleteEvents/<%=id %>" role="button">Delete</a> </td>
															</tr>

															<%
																count++;
															}
															%>


														</tbody>
													</table>
												</div>
												
											</div>
											<div style="height: 26px"></div>

										</div>
									</div>
								</div>
							</div>
							<!-- partial -->

						</div>
					</div>
				</div>
			</section>





			</div>

			</div>
			<!-- Analytics -->


			<!-- end profile -->










			<!-- Start Footer -->
			<footer class="footer-box">
				<div class="container">
					<div class="row">
						<div class="col-lg-12">
							<p class="footer-company-name">
								All Rights Reserved. &copy; 2018 <a href="#">E-Health Book</a>
								Design By : <a href="https://html.design/">IET CDAC Group No
									: 17</a>
							</p>
						</div>
					</div>
				</div>
			</footer>
			<!-- End Footer -->
		
		<a href="#" id="scroll-to-top" class="new-btn-d br-2"><i
			class="fa fa-angle-up"></i></a> <a href="#" id="scroll-to-top"
			class="new-btn-d br-2"><i class="fa fa-angle-up"></i></a>

		<!-- ALL JS FILES -->
		<script src="js/jquery.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<!-- ALL PLUGINS -->
		<script src="js/jquery.magnific-popup.min.js"></script>
		<script src="js/jquery.pogo-slider.min.js"></script>
		<script src="js/slider-index.js"></script>
		<script src="js/smoothscroll.js"></script>
		<script src="js/TweenMax.min.js"></script>
		<script src="js/main.js"></script>
		<script src="js/owl.carousel.min.js"></script>
		<script src="js/form-validator.min.js"></script>
		<script src="js/contact-form-script.js"></script>
		<script src="js/isotope.min.js"></script>
		<script src="js/images-loded.min.js"></script>
		<script src="js/custom.js"></script>
</body>
</html>

