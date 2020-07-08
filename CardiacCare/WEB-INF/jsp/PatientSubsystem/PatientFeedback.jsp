<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Feedback</title>
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




			<!-- CUSTOMIZE START HERE -->
			<div class="container">
				<html:form action="/PatientFeedbackAction">
					<div class="row-sm-12">
						<h4>Comments/Suggestions:</h4>
						<html:textarea styleClass="form-control"
								cols="20" rows="5" property="frmPatientFeedback"></html:textarea>
						<html:errors property="frmPatientFeedback"/>
					</div>


					<br>
					<td class="text-center" colspan="2">
						<html:submit styleClass="btn btn-md btn-info"
								property="submitBtn">Submit</html:submit>
					</td>
					</br>
					<br>
					<br>
					<h5 class="text-center">We value your feedback.Thank You!</h5>
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
