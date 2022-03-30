<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">


<title>Dashboard</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">

<!-- Site Icons -->
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">

<!--------------------------->
<link rel="stylesheet" type="text/css" href="Forms/Login_form/css/util.css">
<link rel="stylesheet" type="text/css" href="Forms/Login_form/css/main.css">
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

	<div class="main-top">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="left-top">
						<a class="new-btn-d br-2" href="#"><span><b><i>eHealthBook</i></b></span></a>
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
						<!---<li><a class="nav-link" href="profile">Profile</a></li>--->
						
						<div class="dropdown btn-group">
                             <a class="nav-link" data-toggle="dropdown" href="#"> PRESCRIPTIONS <span class="caret"></span> </a>
                             <ul class="dropdown-menu">
                                <li><a href="upload_documents">New Prescription</a></li>
                                <li><a href="#">Prescriptions</a></li>
                             </ul>
                         </div>
                         
                         
                         <div class="dropdown btn-group">
                             <a class="nav-link" data-toggle="dropdown" href="#"> TEST REPORTS <span class="caret"></span> </a>
                             <ul class="dropdown-menu">
                                <li><a href="upload_documents">New Test</a></li>
                                <li><a href="/doctor_signup">Tests</a></li>
                             </ul>
                         </div>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->


</section>    
    <section class="content home">
        <div class="container-fluid">
            <div class="block-header">
                <h2>Profile Update</h2>
                <small class="text-muted">Update your personal details.</small>
            </div>
            
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <div class="card">
                        <div class="body">
                            <forms action="">
                               
                                <div class="row clearfix">
                                     <img class="profile_img" src="https://source.unsplash.com/300x200/?student" alt="Patient Photo">
                                    
                                    <div class="col-lg-10 col-sm-9">
                                       
                                        <div class="col-lg-12 col-12 resp"></div>
                                       
                                        <div class="col-lg-12 col-12">
                                            <div class="form-group">
                                                <label>Name</label>
                                                <div class="form-line">
                                                   <input type="text" name="name" value="Shubhada Shinde" class="form-control">
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-lg-12 col-12">
                                            <div class="form-group">
                                                <label>Gender</label>
                                                <select name="gender" class="form-control show-tick">
                                                    <option value="">- Select -</option>
                                                    <option value="Male"  >Male</option>
                                                    <option value="Female" >Female</option>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="col-lg-12 col-12">
                                            <div class="form-group">
                                                <label>Blood Group</label>
                                                <select name="blood_group" class="form-control show-tick">
                                                    <option value="">-- Select Blood Group --</option>
                                                    <option value="A-"  >A-</option>
                                                    <option value="A+" >A+</option>
                                                    <option value="B-" >B-</option>
                                                    <option value="B+" >B+</option>
                                                    <option value="AB-" >AB-</option>
                                                    <option value="AB+" >AB+</option>
                                                    <option value="O-" >O-</option>
                                                    <option value="O+" >O+</option>
                                                    <option value="Others" >Others</option>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="col-lg-12 col-12">
                                            <div class="form-group">
                                                <label>Email</label>
                                                <div class="form-line">
                                                   <input type="email" name="email" value="shubhadashinde1010@gmail.com" class="form-control" readonly>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-lg-12 col-12">
                                            <div class="form-group">
                                                <label>Mobile</label>
                                                <div class="form-line">
                                                   <input type="tel" name="mobile" value="" maxlength="12" class="form-control">
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-lg-12 col-12">
                                            <div class="form-group">
                                                <label>Date of Birth (YYYY-MM-DD)</label>
                                                <div class="form-line">
                                      <input type="text" name="dob" value="2004-03-10" class="form-control datepicker">
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
                                           
                                        <div class="col-lg-12 col-12">
                                            <div class="form-group">
                                                <label>Profile Pic (Leave Blank If Not Want to Update)</label>
                                                <div class="form-line">
                                                   <input type="file" name="img" class="form-control" accept="image/gif, image/png, image/jpg, image/jpeg" style="opacity:1; position:relative;">
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-sm-12">
                                            <input type="checkbox" name="profile_pic" value="Yes" id="rememberme" class="filled-in chk-col-pink">
                                            <label for="rememberme">Remove Current Profile Picture</label>
                                        </div>
                                                                                
                                        <div class="col-12 col-lg-12">
                                            <button type="submit" class="btn btn-raised g-bg-cyan">Update Now</button>
                                            <button type="reset" class="btn btn-raised">Reset</button>
                                        </div>
                                        
                                        
                                    </div>
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