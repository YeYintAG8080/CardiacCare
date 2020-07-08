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

		<jsp:include page="../inc/nursesidebar.jsp"></jsp:include>

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
								<th>Daily Medical Record</th>
								<th  style="text-align: right;"><a href="TreatmentPageLoadLink.do?frmDailyRecordId=${NurseFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-md">Treatement</a>
								</th>
							</tr>
							</thead>
						<tbody>
							<tr class="table-info">
								<td>Attempt date:</td>
								<td>
								<bean:write name="NurseFormBean" property="frmDailyRecord.attemptDate" format="MM-dd-YYYY"/>
								</td>
							</tr>
							<tr class="table-info">
								<td>Blood presure:</td>
								<td>${NurseFormBean.frmDailyRecord.bloodPressure} mmhg</td>
							</tr>

							<tr class="table-info">
								<td>SpO2 level:</td>
								<td>${NurseFormBean.frmDailyRecord.spo2Level}</td>
							</tr>

							<tr class="table-info">
								<td>Diabetes:</td>
								<td>${NurseFormBean.frmDailyRecord.diabetes} mg/dl</td>
							</tr>

							<tr class="table-info">
								<td>Body Temperature:</td>
								<td>${NurseFormBean.frmDailyRecord.bodyTemperature}F</td>
							</tr>

							<tr class="table-info">
								<td>Pulse Rate:</td>
								<td>${NurseFormBean.frmDailyRecord.pulseRate} beats per minute</td>
							</tr>
							
							<tr class="table-info">
								<td>Blood Test:</td>
								<td>
								<c:choose>
									<c:when test="${NurseFormBean.frmDailyRecord.bloodTest!=null}">
									<a href="FileDownloadLink.do?frmDownload=bloodtest&frmDailyRecordId=${NurseFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${NurseFormBean.frmDailyRecord.bloodTest==null}">
										-
									</c:when>
								</c:choose>	
								</td>
							</tr>
							
							<tr class="table-info">
								<td>Echocardiography:</td>
								<td>
								<c:choose>
									<c:when test="${NurseFormBean.frmDailyRecord.echocardiography!=null}">
									<a href="FileDownloadLink.do?frmDownload=echocardiography&frmDailyRecordId=${NurseFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${NurseFormBean.frmDailyRecord.echocardiography==null}">
										-
									</c:when>
								</c:choose>		
								</td>
							</tr>

							<tr class="table-info">
								<td>Electrocardiography:</td>
								<td>
								<c:choose>
									<c:when test="${NurseFormBean.frmDailyRecord.electrocardigraphy!=null}">
									<a href="FileDownloadLink.do?frmDownload=electrocardiography&frmDailyRecordId=${NurseFormBean.frmDailyRecord.id}"
											class="btn btn-info btn-sm">Download</a>
									</c:when>
									<c:when test="${NurseFormBean.frmDailyRecord.electrocardigraphy==null}">
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
