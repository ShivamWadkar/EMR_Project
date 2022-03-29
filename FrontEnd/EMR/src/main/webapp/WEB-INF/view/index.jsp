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
						<a class="new-btn-d br-2" href="#"><span>Electronic
								Medical Record</span></a>
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
						
						<!-- 
						<li><a class="nav-link" href="/login">Login</a></li>
						<li><a class="nav-link" href="/signup">Sign up</a></li>
						 -->
						 
						  <div class="dropdown btn-group">
                             <a class="nav-link" data-toggle="dropdown" href="#"> LOGIN <span class="caret"></span> </a>
                             <ul class="dropdown-menu">
                                <li><a href="/patientLogin">PATIENT</a></li>
                                <li><a href="/doctorLogin">DOCTOR</a></li>
                             </ul>
                         </div>
                         
                         
                         <div class="dropdown btn-group">
                             <a class="nav-link" data-toggle="dropdown" href="#"> SIGN UP <span class="caret"></span> </a>
                             <ul class="dropdown-menu">
                                <li><a href="patientsignup">PATIENT</a></li>
                                <li><a href="doctorsignup">DOCTOR</a></li>
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
								<p>Fusce convallis ante id purus sagittis malesuada. Sed
									erat ipsum</p>

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
									patient’s medical records on day-to-day basis.</p>
								<p>This Application consist of a Comprehensive database used
									to store and access patients’ healthcare information. The major
									goal of the EMR is to serve as a repository of the clinicals
									observations and analysis of the patient. It contains modules
									like Authentication, Document management, Event management,
									Access management and Encryption.</p>
								<a href="#" class="new-btn-d br-2">Read More</a>
							</div>
							<div class="col-lg-6 col-md-6 col-sm-12">
								<div class="about-m">
									<ul id="banner">
										<li><img src="images/emr.jpg" alt="" width="50px"
											height="500px"></li>
										<li><img src="images/about-img-02.jpg" alt=""></li>
										<li><img src="images/about-img-03.jpg" alt=""></li>
									</ul>
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
						<p>Electrnic Medical Record</p>
					</div>
				</div>
			</div>

			<div class="popup-gallery row clearfix">
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://tse1.mm.bing.net/th?id=OIP.-4klJtL_8XlZE5ICmt_YWwHaE8&pid=Api&P=0&w=264&h=176"
							alt="">
						<div class="box-content">
							<h3 class="title">Lorem ipsum dolor</h3>
							<ul class="icon">
								<li><a href="images/gallery-01.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img
							src="https://tse2.mm.bing.net/th?id=OIP._VLZDwfPS-bNegstq_08wQHaD3&pid=Api&P=0&w=360&h=188"
							alt="">
						<div class="box-content">
							<h3 class="title">Lorem ipsum dolor</h3>
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
							src="https://media.istockphoto.com/photos/electronic-medical-record-concept-picture-id904427688"
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
							src="https://tse4.mm.bing.net/th?id=OIP.jWd2a5cehDvnQAM1wFBc0gHaDt&pid=Api&P=0&w=355&h=177"
							alt="">
						<div class="box-content">
							<h3 class="title">Lorem ipsum dolor</h3>
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
							src="https://tse3.mm.bing.net/th?id=OIP.XDHdpPGzQVBaHy-q_UlDjgHaFj&pid=Api&P=0&w=230&h=172"
							alt="">
						<div class="box-content">
							<h3 class="title">Lorem ipsum dolor</h3>
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
							src="https://pmrpressrelease.com/wp-content/uploads/2019/07/Electronic-Medical-Records-Systems1.jpg"
							alt="">
						<div class="box-content">
							<h3 class="title">Lorem ipsum dolor</h3>
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
							src="https://tse2.mm.bing.net/th?id=OIP.zmRWSzVYdYXCdPbMCadZiQHaFC&pid=Api&P=0&w=258&h=176"
							alt="">
						<div class="box-content">
							<h3 class="title">Lorem ipsum dolor</h3>
							<ul class="icon">
								<li><a href="images/gallery-07.jpg"><i
										class="fa fa-picture-o" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="box-gallery">
						<img src="images/gallery-08.jpg" alt="">
						<div class="box-content">
							<h3 class="title">Lorem ipsum dolor</h3>
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