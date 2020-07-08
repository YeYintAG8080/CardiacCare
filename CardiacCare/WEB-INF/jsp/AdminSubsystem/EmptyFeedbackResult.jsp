<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Admin Patient Feedbcak</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="./resource/css/bootstrap-css/bootstrap.min.css">
<link rel="stylesheet" href="./resource/css/panel-css/style.css">

<link rel="stylesheet" href="./resource/css/panel-css/panel.css">
<link rel="stylesheet" href="./resource/css/admin-css/admin-style.css">
</head>
<body>
	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/adminsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			<!--content nav bar -->



			<table class="table">
				<tr>
					<td>
						<h5 id="date-label"></h5>
					</td>

					<td><html:form styleClass="form-inline float-right"
							action="/feedbackSearch">
							<label styleClass="sr-only mb-2">Search Feedback Date:</label>
							<html:text styleClass="form-control mb-2 mr-sm-2"
								property="serachFeedBackDate"></html:text>
							<html:submit styleClass="btn btn-info mb-2" property="">Search</html:submit>
						</html:form></td>
				</tr>
			</table>


			<div class="container">
				<div class="alert alert-primary alert-dismissible fade show">
					<strong>No comment yet.</strong>
					<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
				</div>
			</div>
		</div>
	</div>
	<!-- CUSTOMIZE END HERE -->


	<script src="./resource/js/bootstrap-js/jquery/jquery-3.4.1.min.js"></script>
	<script src="./resource/js/bootstrap-js/jquery/popper.min.js"></script>
	<script src="./resource/js/bootstrap-js/bootstrap.min.js"></script>
	<script src="./resource/js/panel-js/main.js"></script>
	<!-- other additional function for health care project (start)-->
	<script src="./resource/js/panel-js/other-function.js"></script>


	<!-- other additional function for health care project (end)-->
</body>
</html:html>