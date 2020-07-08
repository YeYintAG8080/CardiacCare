<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Patient Search</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="./resource/css/bootstrap-css/bootstrap.min.css">
<link rel="stylesheet" href="./resource/css/panel-css/style.css">

<link rel="stylesheet" href="./resource/css/panel-css/panel.css">
<link rel="stylesheet" href="./resource/css/doctor-css/doctor-style.css">

</head>

<div class="wrapper d-flex align-items-stretch">

	<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

	<!-- Page Content  -->
	<div id="content" class="p-4 p-md-5">



		<jsp:include page="../inc/navbar.jsp"></jsp:include>
		<!-- Customize start here -->


		<div class="container bg-info"
			style="max-width: 90%; max-height: 100px;">
			<h4 class="text-center text-white">Search Patient for Treatment</h4>
			<div id="login-row"
				class="row justify-content-center align-items-center bg-info">
				<div id="login-column" class="col-md-7 col-sm-9">
					<div id="login-box" class="col-md-12">

						<div class="container" >
							<html:form action="/PatientSearchAction">
								<div class="row">
								<div class="col-md-12">
									<table class="table table-hover table-striped">

										<tbody>
											<tr class="table-info">
												<td style="padding-top:19px;">Registration Id:</td>
												<td>
													<html:text styleClass="form-control" property="frmPatientRegisterId"></html:text>
													<html:errors property="frmPatientRegisterId"/>
													<html:errors property="PatientNotFoundError"/>
												<html:errors property="MedicalRecordNotFound"/>
												</td>
											</tr>
											<tr class="table-info">
												<td class="text-center" colspan="2">
												<html:submit
														styleClass="btn btn-info mb-2" property="frmBtnSearch">Search</html:submit>
												
												
												</td>
											</tr>

										</tbody>
									</table>
									</div>
								</div>
							</html:form>
						</div>
					</div>
				</div>




				<!-- CUSTOMIZE END HERE -->
			</div>
		</div>
	</div>
</div>


<script src="./resource/js/bootstrap-js/jquery/jquery-3.4.1.min.js"></script>
<script src="./resource/js/bootstrap-js/jquery/popper.min.js"></script>
<script src="./resource/js/bootstrap-js/bootstrap.min.js"></script>
<script src="./resource/js/panel-js/main.js"></script>
<!-- other additional function for health care project (start)-->
<script src="./resource/js/panel-js/other-function.js"></script>


<!-- other additional function for health care project (end)-->
</body>
</html:html>
