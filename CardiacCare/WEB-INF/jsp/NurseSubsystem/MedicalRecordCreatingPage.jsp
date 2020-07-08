<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Medical Record Create</title>
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
	href="./resource/css/nurse-css/nurse-style.css">
</head>
<body onload="showDate()">

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/nursesidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">



			<jsp:include page="../inc/navbar.jsp"></jsp:include>

			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<html:form action="/DailyRecordSavePath" method="post" enctype="multipart/form-data">
					<div class="row">

						<table class="table table-hover table-striped">

							<thead class="table-primary">
								<tr>
									<th colspan="2">Add Medical Record</th>

								</tr>
							</thead>
							<tbody>
							<logic:empty name="NurseCreateRecordFormBean" property="frmDailyRecordCreateFormControl">
								<tr class="table-info">
									<td>Blood presure:</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-6">
									<html:text styleClass="form-control"
											property="frmBloodPresure"></html:text>
									</div>
									<div class="col-md-6" style="margin-top:10px;">
										mmhg (Upper-Lower)
									</div>
										<html:errors property="frmBloodPresure"></html:errors>
									</div>
									</div>
									</td>
									
								</tr>

								<tr class="table-info">
									<td>SpO2 level:</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-6">
									<html:text styleClass="form-control"
											property="frmSpO2Level"></html:text>
									</div>
									<div class="col-md-6" style="margin-top:10px;">
										&nbsp;%
									</div>
										<html:errors property="frmSpO2Level"></html:errors>
									</div>
									</div>
									</td>
								</tr>

								<tr class="table-info">
									<td>Body temperature:</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-6">
									<html:text styleClass="form-control"
											property="frmBodyTemperature"></html:text>
									</div>
									<div class="col-md-6" style="margin-top:10px;">
									&nbsp;F	
									</div>
									<html:errors property="frmBodyTemperature"></html:errors>
									</div>
									</div>	
									</td>
								</tr>

								<tr class="table-info">
									<td>Diabetes:</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-6">
									<html:text styleClass="form-control"
											property="frmDiabetes"></html:text>
									</div>
									<div class="col-md-6" style="margin-top:10px;">
										&nbsp;mg/dl
									</div>
										<html:errors property="frmDiabetes"></html:errors>
									</div>
									</div>
									</td>
								</tr>

								<tr class="table-info">
									<td>Blood test:</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-10">
									<html:file styleClass="form-control-file btn-primary"
											property="frmBloodTest"></html:file>
									</div>
									</div>
									</div>		
									</td>
								</tr>

								<tr class="table-info">
									<td>Pulse rate</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-6">
									<html:text styleClass="form-control"
											property="frmPulseRate"></html:text>
									</div>
									<div class="col-md-6" style="margin-top:10px;">
										&nbsp;beats&nbsp;per&nbsp;minute
									</div>
										<html:errors property="frmPulseRate"></html:errors>
									</div>
									</div>
									</td>
								</tr>

								<tr class="table-info">
									<td>Echocardiography:</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-10">
									<html:file styleClass="form-control-file btn-primary"
											property="frmEchocardiography"></html:file>
									</div>
									</div>
									</div>		
									</td>
								</tr>

								<tr class="table-info">
									<td>Electrocardiography:</td>
									<td>
									<div class="container">
									<div class="row">
									<div class="col-md-10">
									<html:file styleClass="form-control-file btn-primary"
											property="frmElectrocardiography"></html:file>
									</div>
									</div>
									</div>		
									</td>
								</tr>

								<tr class="table-info">
									<td colspan="2" class="text-center"><html:submit
											styleClass="btn btn-info" property="frmBtnSave">Save</html:submit>
										<a href="DailyRecordCreatePageCancelLink.do?frmLinkControl=4&patientId=${NurseCreateRecordFormBean.frmPatientMedicalRecordLinkId}"
											class="btn btn-info btn-md">Cancel</a>
									</td>
								</tr>
								</logic:empty>
								
								
								<logic:notEmpty name="NurseCreateRecordFormBean" property="frmDailyRecordCreateFormControl">
								<tr class="table-info">
									<td>Blood presure:</td>
									<td><html:text styleClass="form-control"
											property="frmBloodPresure" disabled="true"></html:text>
									&nbsp;mmhg (Upper Blood-Lower Blood)		
									</td>
								</tr>

								<tr class="table-info">
									<td>SpO2 level:</td>
									<td><html:text styleClass="form-control"
											property="frmSpO2Level" disabled="true"></html:text>
									&nbsp;%		
									</td>
								</tr>

								<tr class="table-info">
									<td>Body temperature:</td>
									<td><html:text styleClass="form-control"
											property="frmBodyTemperature" disabled="true"></html:text>
									&nbsp;F		
									</td>
								</tr>

								<tr class="table-info">
									<td>Diabetes:</td>
									<td><html:text styleClass="form-control"
											property="frmDiabetes" disabled="true"></html:text>
									&nbsp;mg/dl
									</td>
								</tr>

								<tr class="table-info">
									<td>Blood test:</td>
									<td><html:text styleClass="form-control"
											property="frmBloodTestFilePath" disabled="true"></html:text></td>
								</tr>

								<tr class="table-info">
									<td>Pulse rate</td>
									<td><html:text styleClass="form-control"
											property="frmPulseRate" disabled="true"></html:text>
									&nbsp;beats&nbsp;per&nbsp;minute
									</td>
								</tr>

								<tr class="table-info">
									<td>Echocardiography:</td>
									<td><html:text styleClass="form-control"
											property="frmEchocardiographyFilePath" disabled="true"></html:text></td>
								</tr>

								<tr class="table-info">
									<td>Electrocardiography:</td>
									<td><html:text styleClass="form-control"
											property="frmElectrocardiographyFilePath" disabled="true"></html:text></td>
								</tr>

								<tr class="table-info">
									<td colspan="2" class="text-center"><html:submit
											styleClass="btn btn-info" property="frmBtnConfirm">Confirm</html:submit>
										
										<a href="DailyRecordConfirmPageCancelLink.do?frmLinkControl=2&patientId=${NurseCreateRecordFormBean.frmPatientMedicalRecordLinkId}"
											class="btn btn-info btn-md">Cancel</a>
									</td>
								</tr>
								</logic:notEmpty>
							</tbody>
						</table>
						


					</div>
				</html:form>
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
