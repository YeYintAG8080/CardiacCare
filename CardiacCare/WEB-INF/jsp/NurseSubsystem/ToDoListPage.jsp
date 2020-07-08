<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>To Do List</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="./resource/css/bootstrap-css/bootstrap.min.css">
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
				<c:if test="${NurseToDoListFormBean.frmRecordEnd<1}">

					<div class="alert alert-primary alert-dismissible fade show">
						<strong>No patient record.</strong>
						<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
					</div>

				</c:if>


				<c:if test="${NurseToDoListFormBean.frmRecordEnd>0}">
					<div class="row">
						<table class="table table-hover table-striped">
							<thead class="table-primary">
								<tr>
									<th>#</th>
									<th>Patient Name</th>
									<th>Registeration Id</th>
									<th>Date Of Birth</th>
									<th>Show Tasks</th>
								</tr>
							</thead>
							<tbody>

								<%-- <c:forEach var="i" begin="${NurseToDoListFormBean.frmRecordBegin}"
									end="${NurseToDoListFormBean.frmRecordEnd}" step="1">
									<tr class="table-info">

										<td>${i}</td>
										<td>${NurseToDoListFormBean.frmPatientList[i-1].patientName}</td>
										<td>${NurseToDoListFormBean.frmPatientList[i-1].registerId}</td>
										<td>${NurseToDoListFormBean.frmPatientList[i-1].dateOfBirth}</td>
										<td><a class="btn btn-info"
											href="ToDoListPage.do?frmLinkControl=2&patientId=${NurseToDoListFormBean.frmPatientList[i-1].id}">Tasks</a>
										</td>
										
									</tr>
								</c:forEach> --%>
								<c:set var="i" value="0"></c:set>
								<logic:iterate id="patient" name="NurseToDoListFormBean"
									property="frmPatientList">
									<tr class="table-info">

										<td><c:out value="${i+1}"></c:out> <c:set var="i"
												value="${i+1}"></c:set></td>
										<td><bean:write name="patient" property="patientName" />
										</td>
										<td><bean:write name="patient" property="registerId" /></td>
										<td><bean:write name="patient" property="dateOfBirth"
												format="MM-dd-YYYY" /></td>
										<td><a class="btn btn-info"
											href="ToDoListPage.do?frmLinkControl=2&patientId=<bean:write name="patient" property="id"/>">Tasks</a>
										</td>

									</tr>
								</logic:iterate>
							</tbody>
						</table>
					</div>
				</c:if>

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
