<!DOCTYPE html>
<html lang="en">

<head>
<title>User's Login Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="Forms/Login_form/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/css/util.css">
<link rel="stylesheet" type="text/css"
	href="Forms/Login_form/css/main.css">
<!--===============================================================================================-->
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
</head>

<body>

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
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="container-login100">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
			<form action="verify_patient" method="post"
				class="login100-form validate-form">
				<div style="text-align: center;">
				<% 
					String msg = (String)request.getAttribute("errormsg");
					if(msg != null){
		
					%>

						<font color="red" > <%=msg %></font>

					<%
					}
					
					//String loginId = (String)session.getAttribute("uname");
				%>
				<!--  <p><%-- loginId --%></p>  -->
				</div>
				<span class="login100-form-title p-b-37"> Patient's Login </span>

				<div class="wrap-input100 validate-input m-b-20"
					data-validate="Enter username or email">
					<input class="input100" type="text" name="uname"
						placeholder="username or email"> <span
						class="focus-input100"></span>
				</div>
				
				<div class="wrap-input100 validate-input m-b-25"
					data-validate="Enter password">
					<input class="input100" type="password" name="pass"
						placeholder="password"> <span class="focus-input100"></span>
				</div>

				<div class="container-login100-form-btn">
					<button class="login100-form-btn">Sign In</button>
				</div>
				<br/>
				<div class="text-center">
					<a href="/patient_signup" class="txt2 hov1"> Sign Up </a>
				</div>
			</form>


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

</body>

</html>