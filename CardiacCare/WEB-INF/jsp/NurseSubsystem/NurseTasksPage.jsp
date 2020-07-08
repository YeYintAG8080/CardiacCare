<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ include file="../inc/common.jsp"%>

<html:html>
<head>
<title>Tasks</title>
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

			<jsp:include page="../inc/navbar.jsp"></jsp:include><!--content nav bar -->

			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<html:form action="/TaskCompleteAction">
					<logic:notEmpty property="frmNurseTaskMessage"
						name="NurseToDoListFormBean">
						<div class="alert alert-primary alert-dismissible fade show">
							<strong>No task yet.</strong>
							<!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
						</div>
					</logic:notEmpty>
					<div class="row">
						<logic:empty property="frmNurseTaskMessage"
							name="NurseToDoListFormBean">
							<table class="table">

								<thead class="table-primary">
									<tr>
										<th colspan="5">Tasks</th>
									</tr>

									<tr>
										<th>#</th>

										<th>Name</th>

										<th>Injection Level</th>

										<th>Injection Time</th>

										<th style="text-align: center;">Task Completement</th>

									</tr>

								</thead>

								<tbody>
									<logic:present name="NurseToDoListFormBean">
									<c:set var="i" value="0"></c:set>
										<logic:iterate name="NurseToDoListFormBean"
											id="injection_item" property="frmInjectionDoseList">
											<tr class="table-info">
												<td><c:out value="${i+1}"></c:out> <c:set var="i"
														value="${i+1}"></c:set></td>
												<td><bean:write name="injection_item"
														property="injectionDoseName" /></td>
												<td><bean:write name="injection_item"
														property="injectionLevel" />&nbsp;mg/ml</td>
												<td><bean:write name="injection_item"
														property="injectionStartTime" format="hh:mm a" /></td>
												<td style="text-align: center"><logic:match value="0"
														name="injection_item" property="complete">

														<html:submit styleClass="btn btn-info" property="btnDone">Done</html:submit>

														<html:hidden name="injection_item" property="frmTaskId"
															value="${injection_item.id}" />
													</logic:match> <logic:match value="1" name="injection_item"
														property="complete">
														<html:submit styleClass="btn btn-info" property="btnDone"
															disabled="true">Done</html:submit>
													</logic:match></td>
											</tr>
										</logic:iterate>
									</logic:present>

								</tbody>
							</table>
						</logic:empty>

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
