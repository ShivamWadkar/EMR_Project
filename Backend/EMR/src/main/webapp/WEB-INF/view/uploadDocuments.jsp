<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Upload Documents</title>

    <!-- Icons font CSS-->
    <link href="Forms/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="Forms/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="Forms/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="Forms/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="Forms/css/main.css" rel="stylesheet" media="all">
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
    <link rel="stylesheet" type="text/css" href="Forms/Login_form/css/main.css">
    <link rel="stylesheet" type="text/css" href="Forms/Login_form/css/util.css">



</head>
<body id="home" data-spy="scroll" data-target="#navbar-wd"
	data-offset="98">

	<div class="main-top">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="left-top">
						<a class="new-btn-d br-2" href="#"><span>eHealthBook</span></a>
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
						<li><a class="nav-link" href="patient_dashboard">Dashboard</a></li>
						<li><a class="nav-link" href="index">Log-out</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->

	

	<div class="container-login100">
        <div class="wrapper wrapper--w680">
            <div class="card card-5">
                <div class="card-body">
                    <h2>New Document</h2>
                	<small class="text-muted">Add new document.</small>
                    <form action="add_document" method="POST" enctype="multipart/form-data">
                        <div class="row row-space">
                            <div class="col-lg-12 col-sm-12">
                                        <div class="form-group">
                                            <label>Document Type *</label>
                                           <select name="documentType">
                                           	  <option value="select" >-- Select --</option>
											  <option value="prescription" >Prescription</option>
											  <option value="test" >Test Report</option>
											</select>
                                        </div>
                                    </div>
                        </div>
                        <div class="row row-space">
                        	<div class="col-6">
                                        <div class="form-group" style="position:relative;">
                                            <label>Scanned Documents</label>
                                            <div class="form-line">
                                               <input type="file" name="file" class="form-control" accept="image/gif, image/png, image/jpg, image/jpeg" style="opacity:1; position:relative;" multiple>
                                            </div>
                                            <button type="button" id="Clear" class="btn btn-xs btn-link" style="display:none; position:absolute; top:-10px; right:0px;" onclick="$('input[name=\'imgs[]\']').val(''); $(this).hide()">Clear Files</button>
                                        </div>
                                    </div>
                            <div class="col-6">
                                <div class="input-group">
                                    <label class="label">Date</label>
                                    <div class="input-group-icon">
                                    <br>
                                        <input class="input--style-4 js-datepicker" type="date" name="documentDate">
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Description</label>
                                            <div class="form-line">
                                                <textarea rows="3" cols="2" name="description" class="form-control no-resize auto-growth"></textarea>
                                            </div>
                                        </div>
                                    </div>
                        
                        
                        <div class="p-t-15" style="text-align: center;">
                            <button type="submit" class="btn btn--radius-2 btn--blue">Add</button>
                        </div>
                        
                    </form>
                </div>
            </div>
        </div>
    </div>



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