<%@ include file="./inc/common.jsp"%>
<html:html>

<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title  -->
<title>Doctors' Info</title>

<!-- Favicon  -->
<link rel="icon" href="./resource/img/core-img/favicon.ico">

<!-- Style CSS -->
<link rel="stylesheet" href="./resource/style.css">

<!-- Card Style Links -->
<link href="./resource/css/main-page-css/doctor-info-card-style.css"
	rel="stylesheet">
<!-- //Card Style Links -->



</head>

<body>

	<!-- Preloader -->
	<div id="preloader">
		<div class="medilife-load"></div>
	</div>

	<!-- ***** Header Area Start ***** -->
	<header class="header-area">
		<!-- Top Header Area -->
		<div class="top-header-area">
			<div class="container h-100">
				<div class="row h-100">
					<div class="col-12 h-100">
						<div
							class="h-100 d-md-flex justify-content-between align-items-center">
							<p>
								Welcome to <span>HeartBeatCare</span>
							</p>
							<p>
								OPEN 24x7 &nbsp;<span>+12-823-611-8721</span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Main Header Area -->
		<div class="main-header-area" id="stickyHeader">
			<div class="container h-100">
				<div class="row h-100 align-items-center">
					<div class="col-12 h-100">
						<div class="main-menu h-100">
							<%@ include file="inc/clientnavbar.jsp"%>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- ***** Header Area End ***** -->

	<!-- ***** Breadcumb Area Start ***** -->
	<section class="breadcumb-area bg-img gradient-background-overlay"
		style="background-image: url(./resource/img/bg-img/breadcumb2.jpg);">
		<div class="container h-100">
			<div class="row h-100 align-items-center">
				<div class="col-12">
					<div class="breadcumb-content">
						<h3 class="breadcumb-title">Doctor Team</h3>
						<p>Our Hospital has a team led by the best cardiologist in
							Myanmar.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- ***** Breadcumb Area End ***** -->
	<!-- Team -->
	<section id="team" class="pb-5">
		<div></div>
		<div class="container">
			<!-- <h5 class="section-title h1">DOCTOR TEAM</h5> -->
		<div class="row">

			<logic:notEmpty property="frmDoctorList" name="DoctorTeamFormBean">
				<logic:iterate id="doctor" name="DoctorTeamFormBean"
					property="frmDoctorList">
					
					
					<div class="card" style="width: 15rem;">
						<div class="card-body">
							<h5 class="card-title"><bean:write name="doctor" property="doctorName" /></h5>
							<h6 class="card-subtitle mb-2 text-muted"><bean:write name='doctor' property='specialization' /></h6>
							<p class="card-text"><bean:write name='doctor' property='degree' /></p>
							<a href="DoctorInfoDetail.do?frmLinkControl=1&doctorId=<bean:write name="doctor" property='id'/>" class="card-link">Detail</a>  
						</div>
					</div>
					
					 
					
					 
				</logic:iterate>
			</logic:notEmpty>

			<%-- <logic:notEmpty property="frmDoctorList" name="DoctorTeamFormBean"> 
            <!-- Team member -->
            <logic:iterate id="doctor" name="DoctorTeamFormBean" property="frmDoctorList" >
            <div class="col-xs-12 col-sm-6 col-md-4">
                <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                    <div class="mainflip">
                        <div class="frontside">
                            <div class="card">
                                <div class="card-body text-center">
                                    <p><img class=" img-fluid" src="/CardiacCare/image/doctor_profile_images/FB_IMG_1567672678533.jpg" alt="card image"></p>
                                    <h4 class="card-title"><bean:write name="doctor" property="doctorName"/></h4>
                                    <p class="card-text"><bean:write name="doctor" property="degree"/></p>
                                    <p class="card-text"><bean:write name="doctor" property="specialization"/></p>
                                    <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                                </div>
                            </div>
                        </div>
                        <div class="backside">
                            <div class="card">
                                <div class="card-body text-center mt-4">
                                    <h4 class="card-title"><bean:write name="doctor" property="doctorName"/></h4>
                                    <p class="card-text"><bean:write name="doctor" property="experience"/></p>
                                    <ul class="list-inline">
                                        <li class="list-inline-item">
                                            <a class="social-icon text-xs-center" target="_blank" href="#">
                                                <i class="fa fa-facebook"></i>
                                            </a>
                                        </li>
                                        <li class="list-inline-item">
                                            <a class="social-icon text-xs-center" target="_blank" href="#">
                                                <i class="fa fa-twitter"></i>
                                            </a>
                                        </li>
                                        <li class="list-inline-item">
                                            <a class="social-icon text-xs-center" target="_blank" href="#">
                                                <i class="fa fa-skype"></i>
                                            </a>
                                        </li>
                                        <li class="list-inline-item">
                                            <a class="social-icon text-xs-center" target="_blank" href="#">
                                                <i class="fa fa-google"></i>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </logic:iterate>
            <!-- ./Team member -->
      </logic:notEmpty>   --%>

			<!--  <div class="card" style="width: 18rem;">
			<img class="card-img-top" src="/CardiacCare/image/doctor_profile_images/FB_IMG_1567672678533.jpg" alt="card image">
			<div class="card-body">
				<h5 class="card-title">Card Title</h5>
				<p class="card-text">Blah </p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
			
		</div> -->
			</div>
		</div>
	</section>
	<!-- Team -->



	<!-- ***** Footer Area Start ***** -->
	<footer class="footer-area section-padding-100">
		<!-- Main Footer Area -->
		<div class="main-footer-area">
			<div class="container-fluid">
				<div class="row">

					<!-- <div class="col-md-12 col-sm-12 col-xl-3"> -->
					<div class="footer-widget-area">
						<div class="footer-logo">
							<a class="navbar-brand" href="index.html"><img id="HBClogo"
								src="./resource/img/core-img/HeartBeatCareIcon.png" alt="Logo"></a>
						</div>
						<p>Discoveries is a one-stop hub for everything with HBC. On
							discoveries, you will find patient stories, research and
							innovation highlights, and news about our community</p>
						<div class="footer-social-info">
							<a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a>
							<a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
							<a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
							<a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
						</div>
					</div>
					<!-- </div> -->


				</div>
			</div>
		</div>
		<!-- Bottom Footer Area -->
		<div class="bottom-footer-area">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12">
						<div class="bottom-footer-content">
							<!-- Copywrite Text -->
							<div class="copywrite-text">
								<p>
									<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
									Team 2, Software Engineering 26th Batch, ICTTI.
									<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- ***** Footer Area End ***** -->




	<!-- jQuery (Necessary for All JavaScript Plugins) -->
	<script src="./resource/js/main-page-js/jquery-2.2.4.min.js"></script>
	<!-- Not Realate With Bootstrap Framework , DO not modify -->
	<!-- Popper js -->
	<script src="./resource/js/bootstrap-js/popper.min.js"></script>
	<!-- Bootstrap js -->
	<script src="./resource/js/bootstrap-js/bootstrap.min.js"></script>
	<!-- Plugins js -->
	<script src="./resource/js/main-page-js/plugins.js"></script>
	<!-- Active js -->
	<script src="./resource/js/main-page-js/active.js"></script>

</body>

</html:html>