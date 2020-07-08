<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Daily Medical Record</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="./resource/css/bootstrap-css/bootstrap.min.css">
<link rel="stylesheet" href="./resource/css/panel-css/style.css">
<link rel="stylesheet" href="./resource/css/panel-css/panel.css">
<link rel="stylesheet" href="./resource/css/nurse-css/patient-style.css">
</head>
<body onload="showDate()">

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/patientsidebar.jsp"></jsp:include>

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
								<th>Medical record for <bean:write name="PatientFormBean" property="frmDailyRecord.attemptDate" format="MM-dd-YYYY"/></th>
								<th  style="text-align: right;">
							
						
								 <logic:notEmpty property="frmTreatmentId" name="PatientFormBean">
								 	<a href="DailyTreatment.do?frmLinkControl=2&medicalrecordId=${PatientFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-md">Treatment</a>
								 </logic:notEmpty> 
									
								 
								
								</th>
							</tr>
							</thead>
						<tbody>
							<tr class="table-info">
								<td>Attempt date:</td>
								<td>
									<bean:write name="PatientFormBean" property="frmDailyRecord.attemptDate" format="MM-dd-YYYY"/>
								</td>
							</tr>
							<tr class="table-info">
								<td>Blood presure:</td>
								<td>${PatientFormBean.frmDailyRecord.bloodPressure} mmhg</td>
							</tr>

							<tr class="table-info">
								<td>SpO2 level:</td>
								<td>${PatientFormBean.frmDailyRecord.spo2Level}</td>
							</tr>

							<tr class="table-info">
								<td>Diabetes:</td>
								<td>${PatientFormBean.frmDailyRecord.diabetes} mg/dl</td>
							</tr>

							<tr class="table-info">
								<td>Body Temperature:</td>
								<td>${PatientFormBean.frmDailyRecord.bodyTemperature}F</td>
							</tr>

							<tr class="table-info">
								<td>Pulse Rate:</td>
								<td>${PatientFormBean.frmDailyRecord.pulseRate} beats per minute</td>
							</tr>
							
							<tr class="table-info">
								<td>Blood Test:</td>
								<td>
								<c:choose>
									<c:when test="${PatientFormBean.frmDailyRecord.bloodTest!=null}">
									<a href="FileDownloadLink.do?frmDownload=bloodtest&frmDailyRecordId=${PatientFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${PatientFormBean.frmDailyRecord.bloodTest==null}">
										-
									</c:when>
								</c:choose>	
								</td>
							</tr>
							
							<tr class="table-info">
								<td>Echocardiography:</td>
								<td>
								<c:choose>
									<c:when test="${PatientFormBean.frmDailyRecord.echocardiography!=null}">
									<a href="FileDownloadLink.do?frmDownload=echocardiography&frmDailyRecordId=${PatientFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${PatientFormBean.frmDailyRecord.echocardiography==null}">
										-
									</c:when>
								</c:choose>		
								</td>
							</tr>

							<tr class="table-info">
								<td>Electrocardiography:</td>
								<td>
								<c:choose>
									<c:when test="${PatientFormBean.frmDailyRecord.electrocardigraphy!=null}">
									<a href="FileDownloadLink.do?frmDownload=electrocardiography&frmDailyRecordId=${PatientFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${PatientFormBean.frmDailyRecord.electrocardigraphy==null}">
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
