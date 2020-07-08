<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Add Treatment</title>
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

<link rel="stylesheet" href="./resource/css/doctor-css/todotask.css">
<style>
input[type="text"].injectionInput {
	min-width: 40%;
}

input[type="text"].medicineInput {
	min-width: 40%;
}
</style>

</head>
<body>
	<%@ include file="../inc/calendar.jsp"%>

	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">



			<jsp:include page="../inc/navbar.jsp"></jsp:include>

			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<html:form action="/AddTreatmentAction">
					<div class="row">
						<logic:empty name="DoctorAddTreatmentFormBean"
							property="frmDoctorSuggestion">   
                  Suggestion <html:textarea styleClass="form-control"
								cols="20" rows="5" property="frmDoctorSuggestion"></html:textarea>


							<table id="myTable" class="table injection-list table-margin"
								style="margin-top: 15px;">
								<tbody class="table-info">
									<tr class="table-info">
										<td colspan="2">Injection
										<td>
										<td style="text-align: right;color:white;"><a
											class="btn btn-sm btn-info" id="addinjectionrow">Add</a></td>

									</tr>
									<tr class="table-info">
										<td>Injection name</td>
										<td>Injection level</td>
										<td colspan="2">Injection Time</td>
									</tr>
								</tbody>
							</table>



							<table id="myTable" class="table medicine-list table-margin">
								<tbody class="table-info">
									<tr class="table-info">
										<td>Medicine
										<td>
										<td style="text-align: right;color:white;"><a
											class="btn btn-sm btn-info" id="addmedicinerow">Add</a></td>
									</tr>
									<tr class="table-info">
										<td>Medicine name</td>
										<td colspan="2">Medicine time</td>
									</tr>

								</tbody>
							</table>
							<div class="container">
								<div class="row">
									<div class="col-md-2 offset-md-5">
										<html:submit styleClass="btn btn-md btn-info"
											property="saveBtn">Save</html:submit>
										
									</div>
								</div>
							</div>
						</logic:empty>

						<logic:notEmpty name="DoctorAddTreatmentFormBean"
							property="frmDoctorSuggestion">
               		 Suggestion <html:textarea styleClass="form-control"
								cols="20" rows="5" property="frmDoctorSuggestion" disabled="true"></html:textarea>

							<table id="myTable"
								class="table injection-list table-margin" style="margin-top: 15px;">
								<tbody class="table-info">
									<tr class="table-info">
										<td colspan="2">Injection
										<td>
									</tr>
									<tr class="table-info">
										<td>Injection name</td>
										<td>Injection level</td>
										<td>Injection Time</td>
									</tr>
									<logic:notEmpty name="DoctorAddTreatmentFormBean"
										property="frmInputInjectionList">
										<logic:iterate id="inputInjectionItem"
											name="DoctorAddTreatmentFormBean"
											property="frmInputInjectionList">
											<tr class="table-info">
												<td><bean:write name="inputInjectionItem"
														property="inputInjectionNames" /></td>

												<td><bean:write name="inputInjectionItem"
														property="inputInjectionLevels" /></td>

												<td><bean:write name="inputInjectionItem"
														property="inputInjectionTimes" format="hh:mm a" /></td>
											</tr>
										</logic:iterate>
									</logic:notEmpty>
								</tbody>
							</table>

							<table id="myTable"
								class="table injection-list table-margin">
								<tbody class="table-info">
									<tr class="table-info">
										<td>Medicine
										<td>
									</tr>
									<tr class="table-info">
										<td>Medicine name</td>
										<td>Medication time</td>
									</tr>
									<logic:notEmpty name="DoctorAddTreatmentFormBean"
										property="frmInputMedicineList">
										<logic:iterate id="inputMedicineItem"
											name="DoctorAddTreatmentFormBean"
											property="frmInputMedicineList">
											<tr class="table-info">
												<td><bean:write name="inputMedicineItem"
														property="inputMedicineNames" /></td>

												<td><logic:match value="100" name="inputMedicineItem"
														property="inputMedicationTimes">
											Morning
										</logic:match> <logic:match value="010" name="inputMedicineItem"
														property="inputMedicationTimes">
											Afternoon
										</logic:match> <logic:match value="001" name="inputMedicineItem"
														property="inputMedicationTimes">
											Evening
										</logic:match> <logic:match value="110" name="inputMedicineItem"
														property="inputMedicationTimes">
											Morning-Afternoon
										</logic:match> <logic:match value="101" name="inputMedicineItem"
														property="inputMedicationTimes">
											Morning-Evening
										</logic:match> <logic:match value="011" name="inputMedicineItem"
														property="inputMedicationTimes">
											Afternoon-Evening
										</logic:match> <logic:match value="111" name="inputMedicineItem"
														property="inputMedicationTimes">
											Morning-Afternoon-Evening
										</logic:match></td>

											</tr>
										</logic:iterate>

									</logic:notEmpty>
								</tbody>
							</table>
							
							
								<div class="container">
									<div class="row">
									<div class="col-md-4 offset-md-5">
										<html:submit styleClass="btn btn-md btn-info" style="max-width:90px;"
								property="confirmBtn">Confirm</html:submit>
										<html:submit styleClass="btn btn-md btn-info"
								property="ConfirmCancelBtn" style="max-width:80px;margin-left:5px;">Cancel</html:submit> 
										</div>
									</div> 
								</div>	 
								 
							
						</logic:notEmpty>
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
	<!--  -->
	<script src="./resource/js/doctor-js/injection_dose_js.js"></script>
	<script src="./resource/js/doctor-js/medicine_js.js"></script>


	<script src="./resource/css/bootstrap-css/bootstrap.min.js"></script>
	<script src="./resource/jquery-1.11.1.min.js"></script>
	<!--  -->

	<!-- other additional function for health care project (end)-->
</body>
</html:html>
