<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Admin Patient List</title>
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
	href="./resource/css/admin-css/admin-style.css">
</head>
<body onload="showDate()">
	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/adminsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			 

			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<html:form action="/AdminPatientList">
				<logic:empty property="frmPatientList" name="AdminFormBean">
					<div class="alert alert-primary alert-dismissible fade show">
							<strong>No patient record.</strong>
							<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
						</div>
				</logic:empty>
					<logic:notEmpty property="frmPatientList" name="AdminFormBean">

						<table class="table table-hover table-striped">
							<tr>
								<th class="table-info" colspan="7">Patient List</th>
							</tr>
							<tr class="table-primary">
								<th>No</th>
								<th>Patient Name</th>
								<th>Date Of Birth</th>
								<th>Address</th>
								<th>Phone No</th>
								<th>Admitted Date</th>
								<!-- <th>Discharged Date</th> -->
							</tr>
							<c:forEach var="i" begin="${AdminFormBean.begin}"
								end="${AdminFormBean.end}" step="1">
								<tr class="table-info">
									<td>${i}</td>
									<td>${AdminFormBean.frmPatientList[i-1].patientName}</td>
									<td>
									 <fmt:formatDate value="${AdminFormBean.frmPatientList[i-1].dateOfBirth}" pattern="MM-dd-YYYY"/>
									</td>
									<td>${AdminFormBean.frmPatientList[i-1].address}</td>
									<td>${AdminFormBean.frmPatientList[i-1].phone}</td>
									<td>
										<fmt:formatDate value="${AdminFormBean.frmPatientList[i-1].admittedDate}" pattern="MM-dd-YYYY"/>
									</td>
									<%-- <td>${AdminFormBean.frmPatientList[i-1].dischargedDate}</td> --%>
								</tr>
							</c:forEach>
						 
						</table>
						
						<table align="center">
						<tr>
							<td>
								<div align="center">
									<c:if test="${AdminFormBean.prevBtn}">
										<html:submit
												property="prev" value="Previous" styleClass="btn btn-info" />
									
									</c:if>
								</div>
							</td>
							<td>
								<div align="center">
									<c:if test="${AdminFormBean.nextBtn}">
										<html:submit property="Next" value="Next"
											styleClass="btn btn-info"></html:submit>
									</c:if>
								</div>
							</td>
						</tr>
					</table>
					</logic:notEmpty>

					

				</html:form>
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