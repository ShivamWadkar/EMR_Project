<%@page import="com.emr.dto.DoctorDto"%>
<%@page import="com.emr.dto.PatientDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">


<title>Edit Profile</title>
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



</head>
<body id="home" data-spy="scroll" data-target="#navbar-wd"
	data-offset="98">
	<div style="text-align: center;">
		<%
		DoctorDto p = (DoctorDto) request.getAttribute("doctor");

		if (p == null) {
		%>
		<font color="red">You have not logged In Please Login First !</font>
		<%
		}
		%>
	</div>
	<div class="main-top">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="left-top">
						<a class="new-btn-d br-2" href="index"><span><b><i>eHealthBook</i></b></span></a>
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
				<a class="navbar-brand" href="index.html"><img
					src="images/logo6.png" height="60px" alt="image"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbar-wd" aria-controls="navbar-wd"
					aria-expanded="false" aria-label="Toggle navigation">
					<span></span> <span></span> <span></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end"
					id="navbar-wd">
					<ul class="navbar-nav">
						<li><a class="nav-link active" href="index">Home</a></li>
						<li><a class="nav-link" href="/doctor_dashboard">Dashboard</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->



	<section class="content home">
		<div class="container-fluid">
			<div class="block-header">
				<h2>Edit Profile</h2>

			</div>

			<div class="row clearfix">
				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="card">
						<div class="body">
							<form action="update_doctor_profile" method="POST"
								enctype="multipart/form-data">

								<div class="row clearfix">

									<div style="margin: auto; padding: 10px;" class="col-lg-3">
										<div class="card shadow-sm">
											<div class="card-header bg-transparent text-center">

												<img src="data:image/jpg;base64,<%=p.getBase64Image()%>"
													width="240" height="300" />

											</div>
										</div>
									</div>
									<div class="col-lg-10 col-sm-9">

										<div class="col-lg-12 col-12 resp"></div>

										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Fist Name</label>
												<div class="form-line">
													<input type="text" name="firstName"
														value="<%=p.getFirstName()%>" class="form-control" required>
												</div>
											</div>
										</div>
										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Last Name</label>
												<div class="form-line">
													<input type="text" name="lastName"
														value="<%=p.getLastName()%>" class="form-control" required>
												</div>
											</div>
										</div>
										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Gender</label> <select name="gender"
													class="form-control show-tick" required>
													<option value="">- Select -</option>
													<option value="Male">Male</option>
													<option value="Female">Female</option>
												</select>
											</div>
										</div>

										

										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Email</label>
												<div class="form-line">
													<input type="email" name="email"
														value="<%=p.getEmailId()%>" class="form-control" readonly>
												</div>
											</div>
										</div>

										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Mobile</label>
												<div class="form-line">
													<input type="tel" name="contactNo"
														value="<%=p.getPhoneNo()%>" maxlength="12"
														class="form-control" required>
												</div>
											</div>
										</div>

										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Education</label>
												<div class="form-line">
													<input type="text" name="education"
														value=" <%= p.getEducation() %>" class="form-control">
												</div>
											</div>
										</div>
										
										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Specialization</label>
												<div class="form-line">
													<input type="text" name="specialization"
														value=" <%= p.getSpecialization() %>" class="form-control" required >
												</div>
											</div>
										</div>
										
										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label>Experience</label>
												<div class="form-line">
													<input type="text" name="experience"
														value=" <%= p.getExperience() %>" class="form-control" required>
												</div>
											</div>
										</div>
										
										

										<div class="col-lg-12 col-12">
											<div class="form-group">
												<label> Profile Picture </label>
												<div class="form-line">
													<input type="file" class="form-control" id="customFile"
														name="file" accept="image/png, image/jpeg"
														style="opacity: 1; position: relative;" required>
												</div>
											</div>
										</div>





									</div>
								</div>
								<div style="text-align: center">
									<button
										style="background-color: #008CBA; border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px;"
										type="submit">Update</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>

		</div>
	</section>
	<!-- Start Footer -->
	<footer class="footer-box">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<p class="footer-company-name">
						All Rights Reserved. &copy; 2018 <a href="#">E-Health Book</a>
						Design By : <a href="https://html.design/">IET CDAC Group No :
							17</a>
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- End Footer -->

	<a href="#" id="scroll-to-top" class="new-btn-d br-2"><i
		class="fa fa-angle-up"></i></a>



	<a href="#" id="scroll-to-top" class="new-btn-d br-2"><i
		class="fa fa-angle-up"></i></a>

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