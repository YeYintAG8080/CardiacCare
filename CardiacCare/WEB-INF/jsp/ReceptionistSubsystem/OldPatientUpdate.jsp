<%@ include file="../inc/common.jsp" %>
<html:html>
<html lang="en">
  <head>
    <title>Receptionist Home</title>
    <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="./resource/css/bootstrap-css/bootstrap.min.css"> 
    <link rel="stylesheet" href="./resource/css/panel-css/style.css">

    <link rel="stylesheet" href="./resource/css/panel-css/panel.css">
     <link rel="stylesheet" href="./resource/css/receptionist-css/receptionist-style.css">
  </head>
  <body >
    
    <div class="wrapper d-flex align-items-stretch">
  
     
  <%@ include file="../inc/receptionistsidebar.jsp" %>
        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5">
<%@ include file="../inc/navbar.jsp" %>


  <!--content nav bar -->
  <!-- Date  -->

			
				<div class="container">
				<html:form action="/PatientUpdate"  method="post"
					enctype="multipart/form-data">
				
					<div class="row">
<logic:empty property="frmRegFormControl" name="PatientRegisterFormBean">
						<table class="table table-hover table-striped">

							<thread class="table-success">
								<tr class="table-success">
									<th colspan="2"><center><h5>${PatientRegisterFormBean.regPateint.patientName } is admitted paitent!</h5></center></th>

								</tr>
								</thread>
							<tbody>

								<tr class="table-success">
									<td>Patient's Name:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientName" disabled="true"></html:text>
										<%-- <html:errors property="regPatientName" /> --%>
										</td>
								</tr>

								<tr class="table-success">
									<td>Date Of Birth:</td>
									<td >
								<html:text styleClass="form-control" 
										property="regPatientDOB" disabled="true"></html:text>
									</td>
								</tr>

								<tr class="table-success">
									<td>Email:</td>
									<td><html:text styleClass="form-control"
											property="regPatientEmail" disabled="true"></html:text>
											<%-- <html:errors property="regPatientEmail" /> --%>
											</td>
								</tr>

								<tr class="table-success">
									<td>Phone Number:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientPhnoe"></html:text>
										 <font color="green">
											(eg.,0xx-xxxxxx,0x-xxxxxxx,0x-xxxxxxxxxxx) </font><html:errors property="regPatientPhnoe" /></td>
								</tr>

								 <tr class="table-success">
									<td>Address:</td>
									<td><html:text styleClass="form-control" 
										property="regPatinetAddress" ></html:text>
										<html:errors property="regPatinetAddress" />
										</td>
								</tr>


								<tr class="table-success">
									<td>Disease Name:</td>
									<td><html:textarea styleClass="form-control"  
										property="regPatientDisease"></html:textarea>
										<html:errors property="regPatientDisease" />
										</td>
								</tr>

								<tr class="table-success">
									<td>Weight:</td>
									<td><html:text styleClass="form-control"
										property="regPatientWeight"></html:text>
										<html:errors property="regPatientWeight" />
										</td>
								</tr>

								 <tr class="table-success">
									<td>Blood Group:</td>
									<td><html:text styleClass="form-control"
										property="regPatientBlood" disabled="true"></html:text></td>
									<%-- <html:errors property="BloodEmptyError" /> --%>
									
								</tr>
 
								<tr class="table-success">
									<td>Lab Result:</td>
									<td><html:file
										styleClass="form-control-file btn-success" property="regUploadFile" ></html:file>
										<html:errors property="FileEmptyError" />
									</td>
								</tr>
								 <tr class="table-success">
									<td>Gender:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPatientGender" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-success">
									<td>Patient ID:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPatientId" disabled="true"></html:text>
									</td>
								</tr>
								
								
								<tr class="table-success">
									<td colspan="2" class="text-center"><html:submit property="btnUpdate" value="Update" styleClass="btn btn-success"></html:submit>
							 <html:submit property="btnUpdateCancel" value="Cancel" styleClass="btn btn-success"></html:submit></td>

								</tr>


							</tbody>
						</table>
</logic:empty>
<logic:notEmpty property="frmRegFormControl" name="PatientRegisterFormBean" >
						<table class="table table-hover table-striped">

							<thread class="table-success">
								<tr class="table-success">
									<th colspan="2">Patient Update Form</th>

								</tr>
								</thread>
							<tbody>

								<tr class="table-success">
									<td>Patient's Name:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientName" disabled="true"></html:text></td>
								</tr>

								<tr class="table-success">
									<td>Date Of Birth:</td>
									<td >
									<html:text styleClass="form-control" 
										property="regPatientDOB" disabled="true"></html:text>

									</td>
								</tr>

								<tr class="table-success">
									<td>Email:</td>
									<td><html:text styleClass="form-control"
											property="regPatientEmail" disabled="true" ></html:text></td>
								</tr>

								<tr class="table-success">
									<td>Phone Number:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientPhnoe" disabled="true"></html:text> </td>
								</tr>

								 <tr class="table-success">
									<td>Address:</td>
									<td><html:textarea styleClass="form-control" 
										property="regPatinetAddress" disabled="true"></html:textarea></td>
								</tr>


								<tr class="table-success">
									<td>Disease Name:</td>
									<td><html:text styleClass="form-control"  
										property="regPatientDisease" disabled="true"></html:text></td>
								</tr>

								<tr class="table-success">
									<td>Weight:</td>
									<td><html:text styleClass="form-control"
										property="regPatientWeight" disabled="true"></html:text></td>
								</tr>

								 <tr class="table-success">
									<td>Blood Group:</td>
									<td><html:text styleClass="form-control"
										property="regPatientBlood" disabled="true"></html:text></td>
								</tr>
 
								<tr class="table-success">
									<td>Lab Result:</td>
									<td><html:text
										styleClass="form-control" property="regFileName" disabled="true"></html:text>

									</td>
								</tr>
								 <tr class="table-success">
									<td>Gender:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPatientGender" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-success">
									<td>Admitted Date:</td>
									<td>
									<html:text
										styleClass="form-control" property="regAdmittedDate" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-success">
									<td>Password:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPassword" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-success">
									<td>Patient ID:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPatientId" disabled="true"></html:text>
									</td>
								</tr>

								<tr class="table-success">
									<td colspan="2" class="text-center"><html:submit property="btnUpdateSave" value="UpdateSave" styleClass="btn btn-success"></html:submit>
							 <html:submit property="btnUpdateSaveCancel" value="Cancel" styleClass="btn btn-success"></html:submit></td>

								</tr>


							</tbody>
						</table>
</logic:notEmpty>


					</div>
					
					</html:form>
			</div>
  </div>
</div>
        <!-- CUSTOMIZE END HERE -->
     

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
