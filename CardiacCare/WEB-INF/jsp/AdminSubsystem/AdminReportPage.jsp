<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Admin Home</title>
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
	href="./resource/css/admin-css/admin-style.css">
</head>
<body onload="showDate()">
	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/adminsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			<!--content nav bar -->
			<!-- Date  -->
			<table class="table">
				<tr>
					<td>
						<form class="form-inline float-right">

							<input type="text" class="form-control mb-2 mr-sm-2">
							<button type="submit" class="btn btn-info mb-2">Search</button>
						</form>
					</td>
			</table>

			<!-- Page Content  -->
			<!-- 			<div id="content" class="p-4 p-md-5">
 -->



			<!--content nav bar -->
			<!-- Date  -->


			<!-- CUSTOMIZE START HERE -->

			<div class="container bg-info">


				<center>
					<div>
						<h2 style="color: white;">Monthly Report</h2>

						<img src="../panel-images/Hospital-performance.png"
							class="img-thumbnail" alt="Monthly Report" width="700"
							height="700">
					</div>
					<br> <br>
					<div>
						<h2 style="color: white;">Yearly Report</h2>
						<img src="../panel-images/MD-referrals.png" class="img-thumbnail"
							alt="Yearly Report" width="700" ; height="700";>
					</div>
				</center>
				
				
				<br> <br>
			</div>



			<!-- CUSTOMIZE END HERE -->
		</div>
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