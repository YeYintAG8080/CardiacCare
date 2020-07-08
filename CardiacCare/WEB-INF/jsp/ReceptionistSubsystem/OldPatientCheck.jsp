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
				<html:form action="/PatientRegisterPath"  method="post"
					enctype="multipart/form-data">
				
					<div class="row">
<logic:empty property="frmRegFormControl" name="PatientRegisterFormBean">
						<table class="table table-hover table-striped">

							<thead class="table-primary">
								<tr class="table-primary">
									<th colspan="2"><center><h4>${PatientRegisterFormBean.regPateint.patientName } is already exist!</h4></center></th>

								</tr>
								</thead>
							<tbody>

								<tr class="table-info">
									<td>Patient's Name:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientName"></html:text>
										<html:errors property="regPatientName" />
										</td>
								</tr>

								<tr class="table-info">
									<td>Date Of Birth:</td>
									<td >
									<html:text property="regPatientDOB" styleId="calendar"
						styleClass="form-control" /> <html:image src="images/calendar.gif"
						styleId="trigger" style="cursor: pointer; border: 1px solid red;"
						title="Date selector" onmouseover="this.style.background='red';"
						onmouseout="this.style.background=''"></html:image> <font
						face="Verdana" size="2" color="blue">&nbsp;YYYY-MM-DD</font> <script
						type="text/javascript">
	//         
	Calendar.setup({
		firstDay : 1,
		electric : false,
		singleClick : true,
		inputField : "calendar",
		button : "trigger",
		ifFormat : "%Y-%m-%d",
		daFormat : "%Y-%m-%d"
	});
	//
</script><html:errors property="regPatientDOB" /><html:errors property="dateerror" />

									</td>
								</tr>

								<tr class="table-info">
									<td>Email:</td>
									<td><html:text styleClass="form-control"
											property="regPatientEmail"></html:text>
											<html:errors property="regPatientEmail" />
											</td>
								</tr>

								<tr class="table-info">
									<td>Phone Number:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientPhnoe"></html:text>
										 <font color="green">
											(eg.,0xx-xxxxxx,0x-xxxxxxx,0x-xxxxxxxxxxx) </font><html:errors property="regPatientPhnoe" /></td>
								</tr>

								 <tr class="table-info">
									<td>Address:</td>
									<td><html:text styleClass="form-control" 
										property="regPatinetAddress" ></html:text>
										<html:errors property="regPatinetAddress" />
										</td>
								</tr>


								<tr class="table-info">
									<td>Disease Name:</td>
									<td><html:text styleClass="form-control"  
										property="regPatientDisease"></html:text>
										<html:errors property="regPatientDisease" />
										</td>
								</tr>

								<tr class="table-info">
									<td>Weight:</td>
									<td><html:text styleClass="form-control"
										property="regPatientWeight"></html:text>
										<html:errors property="regPatientWeight" />
										</td>
								</tr>

								 <tr class="table-info">
									<td>Blood Group:</td>
									<td><html:select styleClass="form-control" property="regPatientBlood">
											<html:option value="S">SELECT</html:option>
											<html:option value="A">A</html:option>
											<html:option value="B">B</html:option>
											<html:option value="AB">AB</html:option>
											<html:option value="O">O</html:option>
									</html:select>
									<html:errors property="BloodEmptyError" />
									</td>
								</tr>
 
								<tr class="table-info">
									<td>Lab Result:</td>
									<td><html:file
										styleClass="form-control-file btn-primary" property="regUploadFile" ></html:file>
										<html:errors property="FileEmptyError" />
									</td>
								</tr>
								 <tr class="table-info">
									<td>Gender:</td>
									<td><html:radio property="regPatientGender" value="Male" />Male
										<html:radio property="regPatientGender" value="Female"/>Female
										<html:errors property="GenderEmptyError" />
									</td>
								</tr>

								<tr class="table-info">
									<td colspan="2" class="text-center"><html:submit property="btnRegister" value="Register" styleClass="btn btn-info"></html:submit>
							 <html:submit property="btnRegisterCancel" value="Cancel" styleClass="btn btn-info "></html:submit></td>

								</tr>


							</tbody>
						</table>
</logic:empty>
<%-- <logic:notEmpty property="frmRegFormControl" name="PatientRegisterFormBean" >
						<table class="table table-hover table-striped">

							<thread class="table-primary">
								<tr class="table-primary">
									<th colspan="2">Patient Registration Form</th>

								</tr>
								</thread>
							<tbody>

								<tr class="table-info">
									<td>Patient's Name:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientName" disabled="true"></html:text></td>
								</tr>

								<tr class="table-info">
									<td>Date Of Birth:</td>
									<td >
									<html:text styleClass="form-control" 
										property="regPatientDOB" disabled="true"></html:text>

									</td>
								</tr>

								<tr class="table-info">
									<td>Email:</td>
									<td><html:text styleClass="form-control"
											property="regPatientEmail" disabled="true" ></html:text></td>
								</tr>

								<tr class="table-info">
									<td>Phone Number:</td>
									<td><html:text styleClass="form-control" 
										property="regPatientPhnoe" disabled="true"></html:text> </td>
								</tr>

								 <tr class="table-info">
									<td>Address:</td>
									<td><html:text styleClass="form-control" 
										property="regPatinetAddress" disabled="true"></html:text></td>
								</tr>


								<tr class="table-info">
									<td>Disease Name:</td>
									<td><html:text styleClass="form-control"  
										property="regPatientDisease" disabled="true"></html:text></td>
								</tr>

								<tr class="table-info">
									<td>Weight:</td>
									<td><html:text styleClass="form-control"
										property="regPatientWeight" disabled="true"></html:text></td>
								</tr>

								 <tr class="table-info">
									<td>Blood Group:</td>
									<td><html:text styleClass="form-control"
										property="regPatientBlood" disabled="true"></html:text></td>
								</tr>
 
								<tr class="table-info">
									<td>Lab Result:</td>
									<td><html:text
										styleClass="form-control" property="regFileName" disabled="true"></html:text>

									</td>
								</tr>
								 <tr class="table-info">
									<td>Gender:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPatientGender" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Admitted Date:</td>
									<td>
									<html:text
										styleClass="form-control" property="regAdmittedDate" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Password:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPassword" disabled="true"></html:text>
									</td>
								</tr>
								
								<tr class="table-info">
									<td>Patient ID:</td>
									<td>
									<html:text
										styleClass="form-control" property="regPatientId" disabled="true"></html:text>
									</td>
								</tr>

								<tr class="table-info">
									<td colspan="2" class="text-center"><html:submit property="btnSave" value="Save" styleClass="btn btn-info"></html:submit>
							 <html:submit property="btnCancel" value="Cancel" styleClass="btn btn-info "></html:submit></td>

								</tr>


							</tbody>
						</table>
</logic:notEmpty> --%>


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
