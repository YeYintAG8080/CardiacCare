<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<%@ include file="../inc/calendar.jsp"%>
<title>Admin Doctor Registration</title>
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
			<!-- <div id="content" class="p-4 p-md-5">-->
			<!--content nav bar -->
			<!-- Date  -->


			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<html:form action="/AdminDoctorRegistration" method="post"
					enctype="multipart/form-data">
					<div class="row">
						<logic:empty property="regFormControl"
							name="DoctorRegisterFormBean">

							<table class="table table-hover table-striped">

								<tr class="table-info">
									<th colspan="2">Doctor's Registration</th>

								</tr>

								<tbody>

									<%-- <tr class="table-info">
										<td>Doctor's Photo:</td>
										<td><html:file styleClass="form-control-file btn-primary"
												property="regPhotoUpload">
											</html:file> <html:errors property="FileEmptyError" /></td>
									</tr> --%>

									<tr class="table-info">
										<td>Doctor name:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorName"></html:text> <font><html:errors
													property="regDoctorName" /></font></td>
									</tr>

									<%-- <tr class="table-info">
										<td>Latest Degree:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorDegree"></html:text> <html:errors
												property="regDoctorDegree" /></td>
									</tr> --%>

									<tr class="table-info">
										<td>Specialization:</td>
										<td><html:select styleClass="form-control"
												property="regDoctorSpecialize">
												<html:option value="S">SELECT</html:option>
												<html:option value="Cardiologist">Cardiologist</html:option>
												<html:option value="Cardiac surgeon">Cardiac surgeon</html:option>
												<html:option value="Non-Invasive cardiologist">Non-Invasive cardiologist</html:option>
												<html:option value="Electrophysiologist">Electrophysiologist</html:option>
												<html:option value="Thoracic surgeon">Thoracic surgeon</html:option>
												<html:option value="Vascular surgeon">Vascular surgeon</html:option>
											</html:select> <html:errors property="SpecializeEmptyError" /></td>

									</tr>

									<%-- <tr class="table-info">
										<td>Experience:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorExperience"></html:text> <html:errors
												property="regDoctorExperience" /></td>
									</tr> --%>

									<tr class="table-info">
										<td>Date Of Birth:</td>
										<td><html:text property="regDoctorDOB" styleId="calendar"
												styleClass="form-control" /> <html:image
												src="./resource/images/calendar.gif"
												styleId="trigger"
												style="cursor: pointer; border: 1px solid red;"
												title="Date selector"
												onmouseover="this.style.background='red';"
												onmouseout="this.style.background=''"></html:image> <font
											face="Verdana" size="2" color="blue">&nbsp;YYYY-MM-DD</font>
											<script type="text/javascript">
												//         
												Calendar.setup({
													firstDay : 1,
													electric : false,
													singleClick : true,
													inputField : "calendar",
													button : "trigger",
													ifFormat : "%Y-%m-%d",
													daFormat : "%Y-%m-%d"
												});
												//
											</script> <html:errors property="regDoctorDOB" /> <html:errors
												property="dobError" /></td>
									</tr>

									<tr class="table-info">
										<td>Email:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorEmail"></html:text><font> <html:errors
													property="regDoctorEmail" /></font></td>
									</tr>

									<%-- <tr class="table-info">
										<td>Phone Number:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorPhone"></html:text> <font color="green">
												(eg.,0xx-xxxxxx,0x-xxxxxxx,0x-xxxxxxxxxxx) </font> <html:errors
												property="regDoctorPhone" /></td>
									</tr>

									<tr class="table-info">
										<td>Address:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorAddress"></html:text> <html:errors
												property="regDoctorAddress" /></td>
									</tr> --%>



									<%-- <tr class="table-info">
										<td>Doctor's certification:</td>
										<td><html:file styleClass="form-control-file btn-primary"
												property="regCertificateUpload">
											</html:file> <html:errors property="CertificateEmptyError" /></td>
									</tr> --%>

									<%-- <tr class="table-info">
										<td>Biography:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorBio"></html:text> <html:errors
												property="regDoctorBio" /></td>
									</tr> --%>



									<tr class="table-info">
										<td colspan="2" class="text-center"><html:submit
												property="btnRegister" value="Register"
												styleClass="btn btn-info"></html:submit> <html:submit
												property="btnRegisterCancel" value="Cancel"
												styleClass="btn btn-info "></html:submit></td>

									</tr>


								</tbody>
							</table>
						</logic:empty>

						<logic:notEmpty property="regfileName" name="AdminFormBean">
							<html:img src="${AdminFormBean.regfileName}" height="100"
								width="100" />
						</logic:notEmpty>


						<logic:notEmpty property="regFormControl"
							name="DoctorRegisterFormBean">
							<table class="table table-hover table-striped">

								<thread class="table-primary">
								<tr class="table-primary">
									<th colspan="2">Patient Registration Form</th>

								</tr>
								</thread>
								<tbody>

									<%-- <tr class="table-info">
										<td>Doctor's Photo:</td>
										<td><html:text styleClass="form-control"
												property="regfileName" disabled="true"></html:text></td>
									<tr class="table-info">
									<tr class="table-info">
										<td>Doctor name:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorName" disabled="true"></html:text></td>
									</tr>

									<tr class="table-info">
										<td>Latest Degree:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorDegree" disabled="true"></html:text></td>
									</tr> --%>
									
									<tr class="table-info">
										<td>Doctor's Name:</</td>
										<td><html:text styleClass="form-control"
												property="regDoctorName" disabled="true"></html:text></td>
									</tr>

									<tr class="table-info">
										<td>Specialization:</</td>
										<td><html:text styleClass="form-control"
												property="regDoctorSpecialize" disabled="true"></html:text></td>
									</tr>

									<%-- <tr class="table-info">
										<td>Experience:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorExperience" disabled="true"></html:text></td>
									</tr> --%>

									<tr class="table-info">
										<td>Date Of Birth:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorDOB" disabled="true"></html:text></td>
									</tr>

									<tr class="table-info">
										<td>Email:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorEmail" disabled="true"></html:text></td>
									</tr>

									<%-- <tr class="table-info">
										<td>Phone Number:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorPhone" disabled="true"></html:text></td>
									</tr> --%>

									<tr class="table-info">
										<td>Password:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorPassword" disabled="true"></html:text></td>
									</tr>

									<%-- <tr class="table-info">
										<td>Address:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorAddress" disabled="true"></html:text></td>
									</tr>

									<tr class="table-info">
										<td>Biography:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorBio" disabled="true"></html:text></td>
									</tr> --%>


									<%-- <tr class="table-info">
										<td>Duty shift:</td>
										<td><html:text styleClass="form-control"
												property="regDoctorShift" disabled="true"></html:text></td>
									</tr> --%>


									<tr class="table-info">
										<td colspan="2" class="text-center"><html:submit
												property="btnSave" value="Save" styleClass="btn btn-info"></html:submit>
											<html:submit property="btnCancel" value="Cancel"
												styleClass="btn btn-info "></html:submit></td>

									</tr>


								</tbody>
							</table>
						</logic:notEmpty>

					</div>
				</html:form>
			</div>
			<!-- CUSTOMIZE END HERE -->
			<!-- <div class="modal fade" id="myModal" role="dialog">
				<div class="modal-dialog">

					Modal content
					<div class="modal-content">

						<div class="modal-body">
							<h5>Registration Succeeded</h5>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-info" data-dismiss="modal"
								onclick="window.location.href = 'AdminDoctorRegistration.jsp';">Close</button>
						</div>
					</div>

				</div>
			</div> -->
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