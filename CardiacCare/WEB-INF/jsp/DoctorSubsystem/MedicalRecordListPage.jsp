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
<link rel="stylesheet" href="./resource/css/panel-css/style.css">
<link rel="stylesheet" href="./resource/css/panel-css/panel.css">
<link rel="stylesheet" href="./resource/css/doctor-css/doctor-style.css">

<style>
.record-block {
	background-color: #17a2b8;
	opacity: 0.9;
	min-height: 93px;
	max-height: 93px;
	min-width: 93px;
	max-width: 98px;
	margin-left: 1px;
	margin-right: 1px;
	margin-top: 1px;
	padding-top: 35px;
	text-align: center;
}
</style>

</head>
<body onload="showDate()">

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">
			<jsp:include page="../inc/navbar.jsp"></jsp:include>

			<!-- CUSTOMIZE START HERE -->

			<div class="container">
			<logic:empty property="frmDailyRecordList" name="DoctorFormBean">
						<div class="alert alert-primary alert-dismissible fade show">
							<strong>No medical record yet.</strong>
							<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
						</div>
					</logic:empty>
				<div class="row">


					<!-- if record is not empty -->
					<logic:notEmpty property="frmDailyRecordList" name="DoctorFormBean">
						<logic:iterate id="dailyRecord" name="DoctorFormBean"
							property="frmDailyRecordList">
							<a
								href="DoctorMedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=<bean:write name="dailyRecord" property="id"/>">
								<div class="record-block">
									<bean:write name="dailyRecord" property="attemptDate"
										format="MM-dd-YYYY" />
								</div>
							</a>
						</logic:iterate>

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
