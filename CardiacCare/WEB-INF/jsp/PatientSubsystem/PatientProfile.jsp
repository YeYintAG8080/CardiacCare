<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Patient Profile</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="./resource/css/bootstrap-css/bootstrap.min.css">
<link rel="stylesheet" href="./resource/css/panel-css/style.css">

<link rel="stylesheet" href="./resource/css/panel-css/panel.css">
<link rel="stylesheet"
	href="./resource/css/patient-css/patient-style.css">
</head>
<body onload="showDate()"
	style="background-image: url(./resource/img/bg-img/hero1.jpg);">
<!-- ./resource/img/bg-img/hero1.jpg -->
	<!-- <div class="bg-image"
		style="background-image: url(./resource/panel-images/p_logo.jpg);"></div> -->

	<div class="wrapper d-flex align-items-stretch">

		<%@ include file="../inc/patientsidebar.jsp"%>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">



			<%@ include file="../inc/navbar.jsp"%>

			<!--content nav bar -->
			<!-- Date  -->


			<!-- CUSTOMIZE START HERE -->

			<div class="container">

				<div class="row">
					<table class="table table-hover table-striped">
						<thead class="table-primary">

							<tr>
								<th>Your Profile</th>
								<th></th>

							</tr>
						</thead>
						<html:form>
							<tbody>

								<tr class="table-info">
									<td>Name:</td>
									<td>${PatientFormBean.frmLoginPatient.patientName}</td>
								</tr>
								<tr class="table-info">
									<td>Registeration Id:</td>
									<td>${PatientFormBean.frmLoginPatient.registerId}</td>
								</tr>
								<tr class="table-info">
									<td>Date of birth:</td>
									<td><bean:write name="PatientFormBean"
											property="frmLoginPatient.dateOfBirth" format="MM-dd-YYYY" /></td>
								</tr>

								<tr class="table-info">
									<td>Disease name:</td>
									<td>${PatientFormBean.frmLoginPatient.diseaseName}</td>
								</tr>

								<tr class="table-info">
									<td>Gender:</td>
									<td>${PatientFormBean.frmLoginPatient.gender}</td>
								</tr>

								<tr class="table-info">
									<td>Blood group:</td>
									<td>${PatientFormBean.frmLoginPatient.bloodGroup}</td>
								</tr>

								<tr class="table-info">
									<td>Weight:</td>
									<td>${PatientFormBean.frmLoginPatient.weight}&nbsp;lb</td>
								</tr>
								
								<tr class="table-info">
									<td>Phone no:</td>
									<td>${PatientFormBean.frmLoginPatient.phone}</td>
								</tr>
								
								<tr class="table-info">
									<td>Address:</td>
									<td>${PatientFormBean.frmLoginPatient.address}</td>
								</tr>
								
								<tr class="table-info">
									<td>Email:</td>
									<td>${PatientFormBean.frmLoginPatient.email}</td>
								</tr>
								
								<tr class="table-info">
									<td>Admitted date:</td>
									<td><bean:write name="PatientFormBean"
											property="frmLoginPatient.admittedDate" format="MM-dd-YYYY" />
									</td>
								</tr>
								<tr class="table-info">
									<td>Lab result:</td>
									<td><c:choose>
											<c:when
												test="${PatientFormBean.frmLoginPatient.updateLabResult!=''}">
												<a
													href="FileDownloadLink.do?frmDownload=updatelabresult&patientId=${PatientFormBean.frmLoginPatient.id}"
													class="btn btn-info btn-sm">Download</a>
											</c:when>
											<c:when
												test="${PatientFormBean.frmLoginPatient.updateLabResult==''}">
									-
									</c:when>
										</c:choose></td>
								</tr>

							</tbody>
						</html:form>

					</table>
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
