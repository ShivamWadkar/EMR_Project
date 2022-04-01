<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">


<title>Health Lab - Responsive HTML5 Template</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">

<!-- Site Icons -->
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">

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

	<div class="main-top">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="left-top">
						<a class="new-btn-d br-2" href="#"><span>E-HealthBook</span></a>
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
						<li><a class="nav-link active" href="#home">Home</a></li>
						<li><a class="nav-link" href="#about">About Us</a></li>
						<li><a class="nav-link" href="#gallery">Gallery</a></li>
							<li><a class="nav-link" href="#contactus">Contact Us</a></li>
						<div class="dropdown btn-group">
                             <a class="nav-link" data-toggle="dropdown" href="#"> LOGIN <span class="caret"></span> </a>
                             <ul class="dropdown-menu">
                                <li><a href="/patient_login">PATIENT</a></li>
                                <li><a href="http://localhost:3000/login">DOCTOR</a></li>
                             </ul>
                         </div>
                         
                         
                         <div class="dropdown btn-group">
                             <a class="nav-link" data-toggle="dropdown" href="#"> SIGN UP <span class="caret"></span> </a>
                             <ul class="dropdown-menu">
                                <li><a href="/patient_signup">PATIENT</a></li>
                                <li><a href="/doctor_signup">DOCTOR</a></li>
                             </ul>
                         </div>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->

	<!-- Start Banner -->
	<div class="ulockd-home-slider">
		<div class="container-fluid">
			<div class="row">
				<div class="pogoSlider" id="js-main-slider">
					<div class="pogoSlider-slide" data-transition="fade"
						data-duration="1500"
						style="background-image: url(images/slider-01.jpg);">
						<div class="lbox-caption pogoSlider-slide-element">
							<div class="lbox-details">
								<h1>Welcome to E-Health Book</h1>
								<p>Our Application Stores the health records Digitally.</p>

							</div>
						</div>
					</div>
					<div class="pogoSlider-slide" data-transition="fade"
						data-duration="1500"
						style="background-image: url(images/slider-02.jpg);">
						<div class="lbox-caption pogoSlider-slide-element">
							<div class="lbox-details">
								<h1>We are here to maintain the health record digitally</h1>
								<p></p>

							</div>
						</div>
					</div>
					<div class="pogoSlider-slide" data-transition="fade"
						data-duration="1500"
						style="background-image: url(images/slider-03.jpg);">
						<div class="lbox-caption pogoSlider-slide-element">
							<div class="lbox-details">
								<h1>Welcome to Health Information Record System</h1>
								
							</div>
						</div>

					</div>
				</div>
				<!-- .pogoSlider -->
			</div>
		</div>
	</div>
	<!-- End Banner -->

	<!-- Start About us -->
	<div id="about" class="about-box">
		<div class="about-a1">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="title-box">
							<h2>About Us</h2>

						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12">
						<div class="row align-items-center about-main-info">
							<div class="col-lg-6 col-md-6 col-sm-12">
								<h1>Welcome to E-Health Book</h1>
								<p>Electronic Medical Record is a web-based application
									which is used to capture, organize, maintain and retrieve
									patients medical records on day-to-day basis.</p>
								<p>This Application consist of a Comprehensive database used
									to store and access patients healthcare information. The major
									goal of the EMR is to serve as a repository of the clinicals
									observations and analysis of the patient. It contains modules
									like Authentication, Document management, Event management,
									Access management and Encryption.</p>
								<a href="#" class="new-btn-d br-2">Read More</a>
							</div>
							<div class="col-lg-6 col-md-6 col-sm-12">
								<div class="about-m">
								<img src="images/aboutusimg.jpg" alt="">
									<!---<ul id="banner">
										<li><img src="images/emr.jpg" alt="" width="50px"
											height="500px"></li>
										<li></li>
										<li><img src="images/about-img-03.jpg" alt=""></li>
									</ul>----->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End About us -->


	<!-- Start Gallery -->
	<div id="gallery" class="gallery-box">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<div class="title-box">
						<h2>Gallery</h2>
						<p>Electronic Medical Record</p>
					</div>
				</div>
			</div>

			<div class="popup-gallery row clearfix">
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src=" https://www.istockphoto.com/photo/doctor-is-showing-the-medical-report-to-her-patient-gm1036234460-277379355"
							alt="">
						<div class="box-content">
							
						<!---	<ul class="icon">
								<li><a href="images/gallery-01.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>---->
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://www.istockphoto.com/photo/electronic-medical-record-concept-gm904427708-249419297"
							alt="">
						<div class="box-content">
							
							<ul class="icon">
								<li><a href="images/gallery-02.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://www.istockphoto.com/photo/background-image-for-medical-and-health-work-showing-images-of-electronic-medical-gm1310391398-399810310"
							alt="">
						<div class="box-content">
							<ul class="icon">
								<li><a href="images/gallery-03.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://www.istockphoto.com/photo/consultant-showing-patient-test-results-on-digital-tablet-gm502561107-44010612"
							alt="">
						<div class="box-content">
							
							<ul class="icon">
								<li><a href="images/gallery-04.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://www.istockphoto.com/photo/changing-of-medical-record-working-by-hand-to-electronic-medical-record-gm1045143564-279700229"
							alt="">
						<div class="box-content">
							
							<ul class="icon">
								<li><a href="images/gallery-05.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://www.istockphoto.com/photo/hospital-doctors-using-digital-patient-chart-gm524326035-52314504"
							alt="">
						<div class="box-content">
						
							<ul class="icon">
								<li><a href="images/gallery-06.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://www.istockphoto.com/photo/have-a-look-at-your-bloodwork-results-gm1293814791-388076671"
							alt="">
						<div class="box-content">
							
							<ul class="icon">
								<li><a href="images/gallery-07.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img src="https://www.istockphoto.com/photo/female-doctor-sitting-in-office-with-electronic-medical-record-screen-on-background-gm1146139334-308740133" alt="">
						<div class="box-content">
						
							<ul class="icon">
								<li><a href="images/gallery-08.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Gallery -->

	<!-- Start Contact Us -->
	<div id="contactus" class="contactus-box">
	  <div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<div class="title-box">
						<h2>Contact Us</h2>
	                <div class="subscribe-box">
		              <div class="container">
			              <div class="row">
				             <div class="col-lg-12">
			  
					     <div class="subscribe-inner text-center clearfix">
						

						<form action="#" method="post">
							<div class="form-group">
								<input class="form-control-1" id="name-1" name="name" placeholder="Name" required="" type="text">
								<br><br>
								<input class="form-control-1" id="message-1" name="message" placeholder="Message " required="" type="text">
							</div>
							<div class="form-group">
								<button type="submit" class="new-btn-d br-2">
									Send Message
								</button>
							</div>
						</form>
					   </div>
				    </div>
			      </div>
		         </div>
	           </div>
			</div>
		  </div>
		</div>
	</div>
	</div>
	<!-- End contact us -->


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