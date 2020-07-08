<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Patient Profile Update</title>
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
						 
						<html:form action="/UpdatePatientProfileAction">
						<logic:empty name="PatientProfileUpdateFormBean" property="frmEditFormControl">
							<tbody>
								<tr class="table-info">
									<td>Name:</td>
									<td>${PatientProfileUpdateFormBean.frmLoginPatient.patientName}</td>
								</tr>
								<tr class="table-info">
									<td>Registeration Id:</td>
									<td>${PatientProfileUpdateFormBean.frmLoginPatient.registerId}</td>
								</tr>
								<tr class="table-info">
									<td>Date of birth:</td>
									<td><bean:write name="PatientProfileUpdateFormBean"
											property="frmLoginPatient.dateOfBirth" format="MM-dd-YYYY" /></td>
								</tr>

								<tr class="table-info">
									<td>Disease name:</td>
									<td>${PatientProfileUpdateFormBean.frmLoginPatient.diseaseName}</td>
								</tr>

								<tr class="table-info">
									<td>Gender:</td>
									<td>${PatientProfileUpdateFormBean.frmLoginPatient.gender}</td>
								</tr>

								<tr class="table-info">
									<td>Blood group:</td>
									<td>${PatientProfileUpdateFormBean.frmLoginPatient.bloodGroup}</td>
								</tr>

								<tr class="table-info">
									<td>Weight:</td>
									<td>
									
										<div class="row">
											<div class="col-md-10">
												<html:text property="frmUpdateWeight" styleClass="form-control"></html:text>
												<html:errors property="frmUpdateWeight"/>
											</div>
											<div class="col-md-2">
												&nbsp;lb
											</div>
										</div>
										
									
									
											
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Phone no:</td>
									<td><html:text property="frmUpdatePhone" styleClass="form-control"></html:text>
									<html:errors property="frmUpdatePhone"/></td>
								</tr>
								
								<tr class="table-info">
									<td>Address:</td>
									<td><html:text property="frmUpdateAddress" styleClass="form-control"></html:text>
									<html:errors property="frmUpdateAddress"/></td>
								</tr>
								
								<tr class="table-info">
									<td>Email:</td>
									<td>${PatientProfileUpdateFormBean.frmLoginPatient.email}</td>
								</tr>
								
								<tr class="table-info">
									<td>Admitted date:</td>
									<td><bean:write name="PatientProfileUpdateFormBean"
											property="frmLoginPatient.admittedDate" format="MM-dd-YYYY" />
									</td>
								</tr>
							 
								<tr class="table-info">
										<td colspan="2" class="text-center">
										<html:submit styleClass="btn btn-info"
												property="btnUpdateProfile" value="Update Profile">
										</html:submit></td>

								</tr>
							</tbody>
							</logic:empty>
							
							<logic:notEmpty name="PatientProfileUpdateFormBean" property="frmEditFormControl">
								<tbody>
								<tr class="table-info">
									<td>Name:</td>
									<td>
									<input type="text" class="form-control" value="${PatientProfileUpdateFormBean.frmLoginPatient.patientName}" disabled="disabled">
									</td>
								</tr>
								<tr class="table-info">
									<td>Registeration Id:</td>
									<td>
										<input type="text" class="form-control" value="${PatientProfileUpdateFormBean.frmLoginPatient.registerId}" disabled="disabled">
									</td>
								</tr>
								<tr class="table-info">
									<td>Date of birth:</td>
									<td><bean:write name="PatientProfileUpdateFormBean"
											property="frmLoginPatient.dateOfBirth" format="MM-dd-YYYY" /></td>
								</tr>

								<tr class="table-info">
									<td>Disease name:</td>
									<td>
										<input type="text" class="form-control" value="${PatientProfileUpdateFormBean.frmLoginPatient.diseaseName}" disabled="disabled">
									</td>
								</tr>

								<tr class="table-info">
									<td>Gender:</td>
									<td>
										<input type="text" class="form-control" value="${PatientProfileUpdateFormBean.frmLoginPatient.gender}" disabled="disabled">
									</td>
								</tr>

								<tr class="table-info">
									<td>Blood group:</td>
									<td> 
										<input type="text" class="form-control" value="${PatientProfileUpdateFormBean.frmLoginPatient.bloodGroup}" disabled="disabled">
									</td>
								</tr>

								<tr class="table-info">
									<td>Weight:</td>
									<td>
									<html:text property="frmUpdateWeight" styleClass="form-control" disabled="true"></html:text>&nbsp;lb
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Phone no:</td>
									<td> 
									 
									<html:text property="frmUpdatePhone" styleClass="form-control" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Address:</td>
									<td> 
									 
									<html:text property="frmUpdateAddress" styleClass="form-control" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Email:</td>
									<td>
									<input type="text" class="form-control" value="${PatientProfileUpdateFormBean.frmLoginPatient.email}" disabled="disabled">
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Admitted date:</td>
									<td><bean:write name="PatientProfileUpdateFormBean"
											property="frmLoginPatient.admittedDate" format="MM-dd-YYYY" />
									</td>
								</tr>
							 
								<tr class="table-info">
										<td colspan="2" class="text-center">
										<html:submit styleClass="btn btn-info"
												property="btnUpdateConfirm" value="Confirm">
										</html:submit>
										
										<a href="UpdatePatientProfile.do?frmLinkControl=2"
											class="btn btn-info btn-md">Cancel</a>
										</td>
								</tr>
							</tbody>
							</logic:notEmpty>
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
