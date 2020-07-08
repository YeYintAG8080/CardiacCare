<%@ include file="../inc/common.jsp"%>
<html:html>
<head>

<title>Doctor Home</title>
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
	href="./resource/css/doctor-css/doctor-style.css">
</head>
<body>
<div class="wrapper d-flex align-items-stretch">
	
    <jsp:include page="../inc/doctorsidebar.jsp"></jsp:include>
	 
        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5">
      <jsp:include page="../inc/navbar.jsp"></jsp:include>
    <!-- CUSTOMIZE START HERE -->  


	<!-- CUSTOMIZE START HERE -->
			<html:form action="/UpdateDoctorProfileAction" method="post" enctype="multipart/form-data">
				

				<logic:empty property="frmFormControl" name="DoctorProfileUpdateFormBean">
					<div class="container">
						<div class="row">

							<table class="table table-hover table-striped">

								<thead class="table-primary">
									<tr>
										<th colspan="2">Profile Update Page</th>

									</tr>
									</thead>
								<tbody>
									
									<tr class="table-info">
										<td>  
											<html:img alt="${DoctorProfileUpdateFormBean.frmDoctorImage}" src="${DoctorProfileUpdateFormBean.frmDoctorImage}" style="width:150px;height:250px;" />
										</td>
										<td>
											<html:file styleClass="form-control-file btn-primary"
											property="frmEditDoctorImage"></html:file>
										</td>
									</tr>
									<tr class="table-info">
										<td>Email:</td>
										<td><html:text property="frmEmail" styleClass="form-control"></html:text>
											<html:errors property="frmEmail"/>
										</td>
										 
									</tr>

									<tr class="table-info">
										<td>Password:</td>
										<td><html:password property="frmPassword" styleClass="form-control"></html:password>
										<html:errors property="frmPassword"/>
										</td>
										
									</tr>
									
									<tr class="table-info">
										<td> Confirm Password:</td>
										<td><html:password property="frmComfirmPassword" styleClass="form-control" ></html:password>
										<font color="red"></font>
										<html:errors property="PasswordError"/>
										
										
										
										</td>
										<!-- <td><input class="form-control" type="password" placeholder="Password"></td>  -->
									</tr>
										<tr class="table-info">
										<td>Degree:</td>
										<td><html:text property="frmDegree" styleClass="form-control"></html:text>
										<html:errors property="frmDegree"/>
										</td>
									</tr>
							

									<tr class="table-info">
										<td>Specialization:</td>
										<td><%-- <html:text property="frmSpecialization" styleClass="form-control"></html:text>
											<html:errors property="frmSpecialization"/> --%>
											<html:select styleClass="form-control"
												property="frmSpecialization">
												<html:option value="Cardiologist">Cardiologist</html:option>
												<html:option value="Cardiac surgeon">Cardiac surgeon</html:option>
												<html:option value="Non-Invasive cardiologist">Non-Invasive cardiologist</html:option>
												<html:option value="Electrophysiologist">Electrophysiologist</html:option>
												<html:option value="Thoracic surgeon">Thoracic surgeon</html:option>
												<html:option value="Vascular surgeon">Vascular surgeon</html:option>
											</html:select>
										</td>
										 
									</tr>
									<tr class="table-info">
										<td>Experience:</td>
										<td><html:text property="frmExperience" styleClass="form-control" ></html:text>
											<html:errors property="frmExperience"/>
										</td>
									</tr>

								

									<tr class="table-info">
										<td>Phone:</td>
										<td><html:text property="frmPhone" styleClass="form-control" ></html:text>
											<html:errors property="frmPhone"/>
										</td>
									</tr>
									<tr class="table-info">
										<td>Address:</td>
										<td><html:text property="frmAddress" styleClass="form-control"></html:text>
											<html:errors property="frmAddress"/>
										</td>
									</tr>
									
									<tr class="table-info">
										<td colspan="2" class="text-center">
										<html:submit styleClass="btn btn-info"
												property="btnUpdateProfile" value="Update Profile">
										</html:submit></td>

									</tr>


								</tbody>

							</table>
						</div>

					</div>
				</logic:empty>
				<logic:notEmpty property="frmFormControl" name="DoctorProfileUpdateFormBean">
					<div class="container">
						<div class="row">

							<table class="table table-hover table-striped">

								<thead class="table-primary">
									<tr>
										<th colspan="2">Profile Update Page</th>

									</tr>
									</thead>
								<tbody>

									<tr class="table-info">
										<td>Doctor profile:</td>
										<td><html:text property="frmEditDoctorImageFilePath" styleClass="form-control" disabled="true"></html:text></td>
										 
									</tr>
									
									<tr class="table-info">
										<td>Email:</td>
										<td><html:text property="frmEmail" styleClass="form-control" disabled="true"></html:text></td>
										 
									</tr>

									<tr class="table-info">
										<td>Password:</td>
										<td><html:password property="frmPassword" styleClass="form-control" disabled="true"></html:password></td>
										<!-- <td><input class="form-control" type="password" placeholder="Password"></td>  -->
									</tr>
									
									<tr class="table-info">
										<td> Comfirm Password:</td>
										<td><html:password property="frmComfirmPassword" styleClass="form-control" disabled="true"></html:password></td>
										<!-- <td><input class="form-control" type="password" placeholder="Password"></td>  -->
									</tr>
										<tr class="table-info">
										<td>Degree:</td>
										<td><html:text property="frmDegree" styleClass="form-control" disabled="true"></html:text></td>
									</tr>
							

									<tr class="table-info">
										<td>Specialization:</td>
										<td><html:text property="frmSpecialization" styleClass="form-control" disabled="true"></html:text></td>
										<!--  <td><input class="form-control" type="text"></td> -->
									</tr>
									<tr class="table-info">
										<td>Experience:</td>
										<td><html:text property="frmExperience" styleClass="form-control" disabled="true"></html:text></td>
									</tr>

								

									<tr class="table-info">
										<td>Phone:</td>
										<td><html:text property="frmPhone" styleClass="form-control" disabled="true"></html:text></td>
									</tr>
									<tr class="table-info">
										<td>Address:</td>
										<td><html:text property="frmAddress" styleClass="form-control" disabled="true"></html:text></td>
									</tr>

									<%-- <tr class="table-info">
										<td>Change Profile:</td>
										<td><html:text property="frmImage" styleClass="form-control" disabled="true"></html:text></td>
									</tr> --%>

									<tr class="table-info">
										<td colspan="2" class="text-center"><html:submit styleClass="btn btn-info"
												property="btnSave" value="Save"></html:submit>
												</td>

									</tr>


								</tbody>

							</table>
						</div>

					</div>
				</logic:notEmpty>
				</html:form>


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