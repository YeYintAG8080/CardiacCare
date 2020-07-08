<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Doctor Suggestion</title>
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

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/patientsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			<!--content nav bar -->
			<!-- Date  -->
			<table class="table">


				<!-- CUSTOMIZE START HERE -->

				<div class="container">

					<div id="accordion">
						<html:form>
							<logic:notEmpty name="PatientFormBean"
								property="frmTreatmentList">
								<logic:iterate name="PatientFormBean" id="treatment"
									property="frmTreatmentList">
									<div class="card" style="margin-bottom: 3px;">
										<div class="card-header bg-info">
											<a class="card-link" data-toggle="collapse"
												href="#<bean:write name="treatment" property="treatmentDate" format="MM-dd-YYYY"/>">
												<bean:write name="treatment" property="treatmentDate"
													format="MM-dd-YYYY" />&nbsp;&nbsp;:by
												${treatment.doctor.doctorName}
											</a>
										</div>
										<div
											id="<bean:write name="treatment" property="treatmentDate" format="MM-dd-YYYY"/>"
											class="collapse show" data-parent="#accordion">
											<div class="card-body"
												style="color: white; font-weight: bold; opacity: 1;">
												<p style="opacity: 1; color: black;">
													<bean:write name="treatment" property="suggestion" />
												</p>
											</div>
										</div>
									</div>
								</logic:iterate>
							</logic:notEmpty>
							<logic:empty name="PatientFormBean" property="frmTreatmentList">
								<div class="alert alert-primary alert-dismissible fade show">
									<strong>No suggestion yet.</strong>
									<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
								</div>
							</logic:empty>
						</html:form>



					</div>

				</div>
				<!-- container -->

				<!-- CUSTOMIZE END HERE -->

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
