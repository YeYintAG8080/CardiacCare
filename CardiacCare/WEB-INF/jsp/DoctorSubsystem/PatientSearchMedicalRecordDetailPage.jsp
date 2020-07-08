<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Medical Record Creating Page</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="./resource/css/bootstrap-css/bootstrap.min.css">
<link rel="stylesheet" href="./resource/css/panel-css/style.css">
<link rel="stylesheet" href="./resource/css/panel-css/panel.css">
<link rel="stylesheet" href="./resource/css/nurse-css/nurse-style.css">
</head>
<body onload="showDate()">

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">



			<jsp:include page="../inc/navbar.jsp"></jsp:include>


			<!-- CUSTOMIZE START HERE -->
	
			<div class="container">
			<html:form>
				<div class="row">
				
					<table class="table table-hover table-striped">
				
						<thead class="table-primary">
							<tr>
								<th>Medical Record For</th>
								<th  style="text-align: right;">
							
								 <logic:empty property="frmTreatmentId" name="DoctorPatientSearchFormBean">
								 	
								 	<a href="AddTreatmentLink.do"
											class="btn btn-info btn-md">Add Treatment</a>
								 </logic:empty>
								 <logic:notEmpty property="frmTreatmentId" name="DoctorPatientSearchFormBean">
								 	<a href="DoctorTreatmentPageLoadLink.do?medicalrecordId=${DoctorPatientSearchFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-md">Treatment</a>
								 </logic:notEmpty>
									
								 
								
								</th>
							</tr>
							</thead>
						<tbody>
							<tr class="table-info">
								<td>Attempt date:</td>
								<td>
									<bean:write name="DoctorPatientSearchFormBean" property="frmDailyRecord.attemptDate" format="MM-dd-YYYY"/>
								</td>
							</tr>
							<tr class="table-info">
								<td>Blood presure:</td>
								<td>${DoctorPatientSearchFormBean.frmDailyRecord.bloodPressure} mmhg</td>
							</tr>

							<tr class="table-info">
								<td>SpO2 level:</td>
								<td>${DoctorPatientSearchFormBean.frmDailyRecord.spo2Level}</td>
							</tr>

							<tr class="table-info">
								<td>Diabetes:</td>
								<td>${DoctorPatientSearchFormBean.frmDailyRecord.diabetes} mg/dl</td>
							</tr>

							<tr class="table-info">
								<td>Body Temperature:</td>
								<td>${DoctorPatientSearchFormBean.frmDailyRecord.bodyTemperature}F</td>
							</tr>

							<tr class="table-info">
								<td>Pulse Rate:</td>
								<td>${DoctorPatientSearchFormBean.frmDailyRecord.pulseRate} beats per minute</td>
							</tr>
							
							<tr class="table-info">
								<td>Blood Test:</td>
								<td>
								<c:choose>
									<c:when test="${DoctorPatientSearchFormBean.frmDailyRecord.bloodTest!=null}">
									<a href="FileDownloadLink.do?frmDownload=bloodtest&frmDailyRecordId=${DoctorPatientSearchFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${DoctorPatientSearchFormBean.frmDailyRecord.bloodTest==null}">
										-
									</c:when>
								</c:choose>	
								</td>
							</tr>
							
							<tr class="table-info">
								<td>Echocardiography:</td>
								<td>
								<c:choose>
									<c:when test="${DoctorPatientSearchFormBean.frmDailyRecord.echocardiography!=null}">
									<a href="FileDownloadLink.do?frmDownload=echocardiography&frmDailyRecordId=${DoctorPatientSearchFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${DoctorPatientSearchFormBean.frmDailyRecord.echocardiography==null}">
										-
									</c:when>
								</c:choose>		
								</td>
							</tr>

							<tr class="table-info">
								<td>Electrocardiography:</td>
								<td>
								<c:choose>
									<c:when test="${DoctorPatientSearchFormBean.frmDailyRecord.electrocardigraphy!=null}">
									<a href="FileDownloadLink.do?frmDownload=electrocardiography&frmDailyRecordId=${DoctorPatientSearchFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${DoctorPatientSearchFormBean.frmDailyRecord.electrocardigraphy==null}">
										-
									</c:when>
								
								</c:choose>
							 </td>
							</tr>
						</tbody>
					</table>
				
				</div>
				</html:form>
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
