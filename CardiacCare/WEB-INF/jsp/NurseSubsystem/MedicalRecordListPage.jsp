<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Medical Record List</title>
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
	
<style>
	.record-block{
		background-color:#17a2b8;
		opacity:0.9;
		min-height:93px;
		max-height:93px;
		min-width:93px;
		max-width:98px;
		margin-left:1px;
		margin-right:1px;
		margin-top:1px;
		padding-top:35px;
		text-align: center;
	}
</style>	
	
</head>
<body onload="showDate()">

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/nursesidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">
			<jsp:include page="../inc/navbar.jsp"></jsp:include>

			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<div class="row">
				
				<logic:present name="NurseFormBean">
				<!-- if record is not empty -->
				<logic:notEmpty property="frmDailyRecordList" name="NurseFormBean">
					<logic:notEmpty property="frmHaveTodayMedicalRecord"
						name="NurseFormBean">
						
						<%-- <c:forEach var="i" begin="${NurseFormBean.frmMedicalRecordBegin}"
							end="${NurseFormBean.frmMedicalRecordEnd}" step="1"> --%>	
							
							<%-- ${NurseFormBean.frmDailyRecordList[i-1].attemptDate} --%>
							
							<%-- <a href="MedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=${NurseFormBean.frmDailyRecordList[i-1].id}"> --%>
							
							<logic:iterate id="dailyRecord" name="NurseFormBean" property="frmDailyRecordList" >
							<a href="MedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=<bean:write name="dailyRecord" property="id"/>">
								<div class="record-block">
								<bean:write name="dailyRecord" property="attemptDate" format="MM-dd-YYYY"  />
								</div>
							</a>
							</logic:iterate>
						<%-- </c:forEach> --%>
					</logic:notEmpty>

					<logic:empty property="frmHaveTodayMedicalRecord"
						name="NurseFormBean">
						<div class="container">
						<div class="row">
							<a href="MedicalRecordCreateFormLoadLink.do?frmLinkControl=2&patientId=${NurseFormBean.frmPatientMedicalRecordLinkId}">
							<div class="record-block">
							Add
							</div>
							</a>
						 
							
							<%-- <c:forEach var="i" begin="${NurseFormBean.frmMedicalRecordBegin}"
								end="${NurseFormBean.frmMedicalRecordEnd}" step="1">
								
								<a href="MedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=${NurseFormBean.frmDailyRecordList[i-1].id}">
								<div class="record-block" style="min-height:93px;max-height:93px;min-width:93px;max-width:93px;margin-left:2px;margin-right:2px;margin-top:2px;">
								<bean:write name="NurseFormBean" property="${frmDailyRecordList[i-1].attemptDate}" format="MM-dd-YYYY"  />
								</div>
								</a>
							 	
							 	
							</c:forEach> --%>
							<logic:iterate id="dailyRecord" name="NurseFormBean" property="frmDailyRecordList" >
							<a href="MedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=<bean:write name="dailyRecord" property="id"/>">
								<div class="record-block">
								<bean:write name="dailyRecord" property="attemptDate" format="MM-dd-YYYY"  />
								</div>
							</a>
							</logic:iterate>
							</div>
				 		</div> 
					</logic:empty>
				</logic:notEmpty>
				
				
				<!-- if record is empty -->
				<logic:empty property="frmDailyRecordList" name="NurseFormBean">
					<a 	href="MedicalRecordCreateFormLoadLink.do?frmLinkControl=2&patientId=${NurseFormBean.frmPatientMedicalRecordLinkId}">
					<div class="record-block">
					Add
					</div>
					</a>
				</logic:empty>
				</logic:present>
				<!-- After Insert  -->
				
				<logic:present name="NurseCreateRecordFormBean">
				<logic:notEmpty property="frmDailyRecordList" name="NurseCreateRecordFormBean">
					<logic:notEmpty property="frmHaveTodayMedicalRecord"
						name="NurseCreateRecordFormBean">
						
						<logic:iterate id="dailyRecord" name="NurseCreateRecordFormBean" property="frmDailyRecordList" >
							<a href="MedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=<bean:write name="dailyRecord" property="id"/>">
								<div class="record-block">
								<bean:write name="dailyRecord" property="attemptDate" format="MM-dd-YYYY"  />
								</div>
							</a>
						</logic:iterate>
					</logic:notEmpty>

					<logic:empty property="frmHaveTodayMedicalRecord"
						name="NurseCreateRecordFormBean">
							 
							<a href="MedicalRecordCreateFormLoadLink.do?frmLinkControl=2&patientId=${NurseCreateRecordFormBean.frmPatientMedicalRecordLinkId}">
							<div class="record-block" >
							Add
							</div>
							</a>
							 
						
							<logic:iterate id="dailyRecord" name="NurseCreateRecordFormBean" property="frmDailyRecordList" >
							<a href="MedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=<bean:write name="dailyRecord" property="id"/>">
								<div class="record-block">
								<bean:write name="dailyRecord" property="attemptDate" format="MM-dd-YYYY"  />
								</div>
							</a>
							</logic:iterate>
				 
					</logic:empty>
				</logic:notEmpty>
				
				
				<!-- if record is empty -->
				<logic:empty property="frmDailyRecordList" name="NurseCreateRecordFormBean">
					<a href="MedicalRecordCreateFormLoadLink.do?frmLinkControl=2&patientId=${NurseCreateRecordFormBean.frmPatientMedicalRecordLinkId}">
								<div class="record-block" >
								Add
								</div>
					</a>
				</logic:empty>
				</logic:present>
				
				
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
