<%@ include file="../inc/common.jsp"%>
<html:html>
<html lang="en">
<head>
<%@ include file="../inc/calendar.jsp"%>
<title>Check Register</title>
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
	href="./resource/css/receptionist-css/receptionist-style.css">

</head>
<body>

	<div class="wrapper d-flex align-items-stretch">

		<%@ include file="../inc/receptionistsidebar.jsp" %>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">
			<%@ include file="../inc/navbar.jsp" %>


			<!--content nav bar -->
			<!-- Date  -->
			<h3 id="date-label"></h3>


			<!-- CUSTOMIZE START HERE -->
			<div class="container bg-info"
				style="max-width: 90%; max-height: 100px;">
				<h4 class="text-center text-white">Search Patient</h4>
				<div id="login-row"
					class="row justify-content-center align-items-center bg-info">
					<!-- <div id="login-column" class="col-md-6"> -->
						<!-- <div id="login-box" class="col-md-12"> -->
							<html:form styleId="login-form" styleClass="form"
								action="/SearchPatientById" method="post">

								<div class="container bg-info">
									<div class="row">
										<table class="table table-hover table-striped">
											<!-- <thead class="table-primary">
												<tr>
													<th colspan="2">Check Patient</th>
												</tr>
												</thread> -->
											<tbody>
													<tr class="table-info">
													<td>Patient's Register ID:</td>
													<td><html:text styleClass="form-control"
															property="serachPatient"></html:text> <html:errors
															property="regPatientEmail" /></td>
												</tr>
												<tr class="table-info">
													<td class="text-center" colspan="2"><html:submit
															styleClass="btn btn-info align" property="btnSearch"
															value="Search"></html:submit></td>
												</tr>
											</tbody>
										</table>

									</div>
								</div>
							</html:form>
				 




					<!-- CUSTOMIZE END HERE -->
				</div>
			</div>
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
