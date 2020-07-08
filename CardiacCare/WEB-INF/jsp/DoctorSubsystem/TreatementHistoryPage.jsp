<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Treatment History Page</title>
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
<body onload="showDate()">

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>

			<!--content nav bar -->
			<!-- Date  -->

			<!-- CUSTOMIZE START HERE -->

			<div class="container">

				<div class="row">
					<table class="table table-hover table-striped">

						<thead class="table-primary">
							<tr>
								<th colspan="2">Treatement</th>
							</tr>
						</thead>
						<tbody>
							<tr class="table-info">
								<td>Treatement date:</td>
								<td><bean:write name="DoctorFormBean"
										property="frmTreatment.treatmentDate" format="MM-dd-YYYY" /></td>
							</tr>


							<tr class="table-info">
								<td>Doctor Name:</td>
								<td>${DoctorFormBean.frmTreatment.doctor.doctorName}</td>
							</tr>
							<tr class="table-info">
								<td>Suggestion:</td>
								<td class="text-justify">${DoctorFormBean.frmTreatment.suggestion}</td>
							</tr>

						</tbody>
					</table>

					<logic:empty name="DoctorFormBean" property="frmInjectionDoseList">

					</logic:empty>
					<logic:notEmpty name="DoctorFormBean"
						property="frmInjectionDoseList">
						<table class="table">

							<thead class="table-primary">
								<tr>
									<th colspan="5">Injection</th>
								</tr>

								<tr>
									<th>Name</th>

									<th>Injection level</th>

									<th>Injection time</th>

									<th>Task completement</th>
								</tr>

							</thead>

							<tbody>
								<logic:present name="DoctorFormBean">
									<logic:iterate name="DoctorFormBean" id="injection_item"
										property="frmInjectionDoseList">
										<tr class="table-info">
											<td><bean:write name="injection_item"
													property="injectionDoseName" />
											</td>
											<td><bean:write name="injection_item"
													property="injectionLevel" />&nbsp;mg/ml
											</td>
											<td><bean:write name="injection_item"
													property="injectionStartTime" format="HH:mm a" />
											</td>
											<td><logic:match value="0" name="injection_item"
													property="complete">
													Not complete
												</logic:match> 
												<logic:match value="1" name="injection_item"
													property="complete">
													Completed
												</logic:match>
											</td>
										</tr>
									</logic:iterate>
								</logic:present>

							</tbody>
						</table>
					</logic:notEmpty>

					<logic:empty name="DoctorFormBean" property="frmMedicineList">

					</logic:empty>
					<logic:notEmpty name="DoctorFormBean" property="frmMedicineList">
						<table class="table">

							<thead class="table-primary">
								<tr>
									<th colspan="5">Medicine</th>
								</tr>

								<tr>
									<th>Name</th>

									<th>Medicine Times</th>

								</tr>

							</thead>

							<tbody>
								<logic:present name="DoctorFormBean">

									<logic:iterate name="DoctorFormBean" id="medicine_item"
										property="frmMedicineList">
										<tr class="table-info">
											<td><bean:write name="medicine_item"
													property="medicineName" /></td>

											<td><logic:match value="100" name="medicine_item"
													property="medicationTimes">
											Morning
										</logic:match> <logic:match value="010" name="medicine_item"
													property="medicationTimes">
											Afternoon
										</logic:match> <logic:match value="001" name="medicine_item"
													property="medicationTimes">
											Evening
										</logic:match> <logic:match value="110" name="medicine_item"
													property="medicationTimes">
											Morning-Afternoon
										</logic:match> <logic:match value="101" name="medicine_item"
													property="medicationTimes">
											Morning-Evening
										</logic:match> <logic:match value="011" name="medicine_item"
													property="medicationTimes">
											Afternoon-Evening
										</logic:match> <logic:match value="111" name="medicine_item"
													property="medicationTimes">
											Morning-Afternoon-Evening
										</logic:match></td>
										</tr>
									</logic:iterate>
								</logic:present>





							</tbody>
						</table>
					</logic:notEmpty>

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
