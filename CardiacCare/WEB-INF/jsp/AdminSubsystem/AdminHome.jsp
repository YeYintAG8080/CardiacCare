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
			<!-- <table class="table">
				<tr>
					<td>
						<form class="form-inline float-right">

							<input type="text" class="form-control mb-2 mr-sm-2">
							<button type="submit" class="btn btn-info mb-2">Search</button>
						</form>
					</td>
			</table> -->

			<!-- Page Content  -->
			<!-- 			<div id="content" class="p-4 p-md-5">
 -->



			<!--content nav bar -->
			<!-- Date  -->


			<!-- CUSTOMIZE START HERE -->

			<div class="container bg-info">


				<!-- <center>
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
			</div> -->

				<html:form action="/AdminHomePath">
					<table align="center">
						<tr>
							<td>Year:</td>
							<td><html:select property="year">
									<html:option value="0">Select</html:option>
									<html:option value="2009">2009</html:option>
									<html:option value="2010">2010</html:option>
									<html:option value="2011">2011</html:option>
									<html:option value="2012">2012</html:option>
								</html:select></td>
						</tr>
						<%-- <tr>
							<td>Ticket Center:</td>
							<td><html:select property="ticket">
									<html:option value="0">Select</html:option>
									<html:option value="ictti">ICTTI</html:option>
									<html:option value="air bagan">Air Bagan</html:option>
									<html:option value="Conlumbus">Conlumbus</html:option>
								</html:select></td>
						</tr> --%>
						<tr>
							<td>Chart Type:</td>
							<td><html:select property="chart">
									<html:option value="0">Select</html:option>
									<html:option value="1">Bar Chart</html:option>
									<html:option value="2">Pie Chart</html:option>
									<html:option value="3">Line Chart</html:option>
								</html:select></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><html:submit
									property="btnSend" value="Show"></html:submit> <html:submit
									property="btnCancel" value="Cancel"></html:submit></td>
						</tr>
					</table>
				</html:form>


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