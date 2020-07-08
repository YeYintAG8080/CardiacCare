<%@ include file="../inc/common.jsp" %>
<html:html>
<head>
<title>Patient Information</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="./resource/css/bootstrap-css/bootstrap.min.css">
<link rel="stylesheet" href="./resource/css/panel-css/style.css">

<link rel="stylesheet" href="./resource/css/panel-css/panel.css">
<link rel="stylesheet" href="./resource/css/doctor-css/doctor-style.css">

</head>
<body onload="showDate()">

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			
			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<div class="row">
				
					<table class="table table-hover table-striped">
					<html:form>
						<thead class="table-primary">
							<tr>
								<th>Personal Information</th>
								<th><a class="btn btn-info"
											href="DoctorPatientListPage.do?frmLinkControl=1">Back</a>
									<a class="btn btn-info"
											href="DoctorPatientListPage.do?frmLinkControl=3&frmPatientMedicalRecordLinkId=${DoctorFormBean.frmPatient.id}">Medical
												Record</a></th>
							</tr>
							</thead>
						<tbody>

							<tr class="table-info">
								<td>Name:</td>
								<td>${DoctorFormBean.frmPatient.patientName}</td>
							</tr>
							<tr class="table-info">
								<td>Registeration Id:</td>
								<td>${DoctorFormBean.frmPatient.registerId}</td>
							</tr>
							<tr class="table-info">
								<td>Date of birth:</td>
								<td> 
									<bean:write name="DoctorFormBean" property="frmPatient.dateOfBirth" format="MM-dd-YYYY"/>
								</td>
							</tr>

							<tr class="table-info">
								<td>Disease name:</td>
								<td>${DoctorFormBean.frmPatient.diseaseName}</td>
							</tr>

							<tr class="table-info">
								<td>Gender:</td>
								<td>${DoctorFormBean.frmPatient.gender}</td>
							</tr>

							<tr class="table-info">
								<td>Blood group:</td>
								<td>${DoctorFormBean.frmPatient.bloodGroup}</td>
							</tr>

							<tr class="table-info">
								<td>Weight:</td>
								<td>${DoctorFormBean.frmPatient.weight}lb</td>
							</tr>

							<tr class="table-info">
								<td>Lab result:</td>
								<td>
								<c:choose>
									<c:when test="${DoctorFormBean.frmPatient.updateLabResult!=''}">
									<a href="FileDownloadLink.do?frmDownload=updatelabresult&patientId=${DoctorFormBean.frmPatient.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${DoctorFormBean.frmPatient.updateLabResult==''}">
									-
									</c:when>
								</c:choose>
								</td>
							</tr>

						</tbody>
						</html:form>
					</table>
					
				</div>
			</div>
			<!-- CUSTOMIZE END HERE -->
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
