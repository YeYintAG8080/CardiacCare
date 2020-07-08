<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Patient List</title>
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
	href="./resource/css/doctor-css/doctor-style.css">
</head>
<body onload="showDate()">
	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			<!--content nav bar -->
			<!-- Date  -->
			<table class="table">
				<tr>
					<td><%-- <html:form action="/NurseHomePage"
							styleClass="form-inline float-right">
							<font>Register ID:&nbsp;</font>
							<html:text styleClass="form-control mb-2 mr-sm-2"
								property="frmRegisterId"></html:text>

							<html:submit styleClass="btn btn-info mb-2"
								property="frmBtnSearch">Search</html:submit>
						</html:form> --%></td>
			</table>
			<!-- CUSTOMIZE START HERE -->

			<div class="container">
			<c:if test="${DoctorFormBean.frmRecordEnd<1}">
						<div class="alert alert-primary alert-dismissible fade show">
							<strong>No patient record.</strong>
							<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
						</div>
					</c:if>
				<div class="row">
					
					<c:if test="${DoctorFormBean.frmRecordEnd>0}">
						<table class="table table-hover table-striped">
							<thead class="table-primary">
								<tr>
									<th>#</th>
									<th>Patient Name</th>
									<th>Register Id</th>
									<th>Date Of Birth</th>
									<th>Detail Information</th>
									<th>Medical Records</th>
								</tr>
							</thead>
							<tbody>

								<c:set var="i" value="0"></c:set>
								
								<logic:iterate id="patient" name="DoctorFormBean" property="frmPatientList">
									<tr class="table-info">
									 
										<td><c:out value="${i+1}"></c:out> 
											<c:set var="i" value="${i+1}"></c:set>
										<td>
											<bean:write name="patient" property="patientName"/>
										</td>
										<td> 
											<bean:write name="patient" property="registerId"/>
										</td>
										<td>
											<bean:write name="patient" property="dateOfBirth" format="MM-dd-YYYY"/>
										</td>
										<td><a class="btn btn-info"
											href="DoctorPatientListPage.do?frmLinkControl=2&frmPatientDetailLinkId=<bean:write name="patient" property="id"/>">Detail</a>
										</td>
										<td><a class="btn btn-info"
											href="DoctorPatientListPage.do?frmLinkControl=3&frmPatientMedicalRecordLinkId=<bean:write name="patient" property="id"/>">Medical
												Record</a></td>
									</tr>
								</logic:iterate>
							</tbody>
						</table>
					</c:if>
				</div>
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