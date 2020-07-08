<%@ include file="../inc/common.jsp" %>
<html:html>
<head>
	<title>Nurse Login</title>
	
	 <!-- Favicon  -->
    <link rel="icon" href="./resource/img/core-img/favicon.ico">
	
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="./resource/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="./resource/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
 	<link rel="stylesheet" type="text/css" href="./resource/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="./resource/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
 <!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="./resource/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="./resource/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="./resource/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<!-- 	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css"> -->
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="./resource/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="./resource/css/login-page-css/login-util.css">
	<link rel="stylesheet" type="text/css" href="./resource/css/login-page-css/login-main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-50">
				<html:form action="/NurseLoginPath" styleClass="login100-form validate-form">
					<span class="login100-form-title p-b-33">
						Nurse Account Login
					</span>

					<div class="wrap-input100 validate-input">
						&nbsp;<h3>Email</h3>
						<html:text styleId="Email" styleClass="input100" property="frmLoginEmail"></html:text>
						 
						<span class="focus-input100-1"></span>
						<span class="focus-input100-2"></span>
						<html:errors property="frmLoginEmail"/>
					</div>

					<div class="wrap-input100 rs1 validate-input">
						&nbsp;<h3>Password</h3>
						<html:password styleId="Password" styleClass="input100" property="frmLoginPassword"></html:password>
						
						<span class="focus-input100-1"></span>
						<span class="focus-input100-2"></span>
						<html:errors property="frmLoginPassword"/>
						
					</div>
					<div align="center">
				 
						<html:errors property="frmInvalidUserError"/>
					 
					</div>
					<div class="container-login100-form-btn m-t-20">
						<!-- <button class="login100-form-btn" onclick="window.location.href = './NurseSubsystem/NurseHomePage.html';">
							Sign in
						</button> -->
						 <html:submit styleClass="btn login100-form-btn btn-info" property="btnLogin">Sign In</html:submit>
					</div>

					<div class="text-center p-t-45 p-b-4">
						<span class="txt1">
							Forgot
						</span>

						<a href="#" class="txt2 hov1">
							Username / Password?
						</a>
					</div>

					<div class="text-center">
						<span class="txt1">
							Create an account?
						</span>

						<a href="#" class="txt2 hov1">
							Sign up
						</a>
					</div>
				</html:form>
			</div>
		</div>
	</div>
	

	
<!--===============================================================================================-->
	<script src="./resource/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="./resource/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="./resource/vendor/bootstrap/js/popper.js"></script>
	<script src="./resource/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="./resource/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="./resource/vendor/daterangepicker/moment.min.js"></script>
	<script src="./resource/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="./resource/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="./resource/js/login-page-main.js"></script>
	<script src="./resource/js/placeholder.js"></script>

</body>
</html:html>