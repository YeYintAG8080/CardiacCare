<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Nurse Home</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="./resource/css/bootstrap-css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resource/css/panel-css/style.css">

<link rel="stylesheet"
	href="./resource/css/panel-css/panel.css">
<link rel="stylesheet"
	href="./resource/css/nurse-css/nurse-style.css">
</head>
<body onload="showDate()">
	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			<!--content nav bar -->

			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<div class="alert alert-primary alert-dismissible fade show">
							<strong>Treatment is not provided.</strong>
							<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
						</div>
				</div>
			</div>
			<!-- CUSTOMIZE END HERE -->
		</div>
	

	<script
		src="./resource/js/bootstrap-js/jquery/jquery-3.4.1.min.js"></script>
	<script
		src="./resource/js/bootstrap-js/jquery/popper.min.js"></script>
	<script
		src="./resource/js/bootstrap-js/bootstrap.min.js"></script>
	<script src="./resource/js/panel-js/main.js"></script>
	<!-- other additional function for health care project (start)-->
	<script src="./resource/js/panel-js/other-function.js"></script>


	<!-- other additional function for health care project (end)-->
</body>
</html:html>