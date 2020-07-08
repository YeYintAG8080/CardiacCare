<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Medical Record Creating Page</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="./resource/css/bootstrap-css/bootstrap.min.css">
 

</head>
<body class="bg-info">

			<!-- CUSTOMIZE START HERE -->
			<div class="container"><!-- container -->
				<html:form action="/DoctorProfileFillAction" method="post" enctype="multipart/form-data">	
					<div class="row">
						<div class="col-md-8 offset-md-2">
							<table class="table table-hover table-striped">
								<thead class="table-primary">
								<tr>
									<th colspan="2">Please fill your information</th>
								</tr>
								</thead>
								<logic:empty name="DoctorProfileFillFormBean" property="frmDoctorProfileFillFormControl">
								<tbody>
									<tr class="table-info">
										<td>
											Name:
										</td>
										<td>
											${DoctorFormBean.frmLoginDoctor.doctorName}
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Date of birth:
										</td>
										<td> 
											<bean:write name="DoctorFormBean" property="frmLoginDoctor.dateOfBirth" format="MM-dd-YYYY"/>
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Specialization:
										</td>
										<td>
											${DoctorFormBean.frmLoginDoctor.specialization}
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Email:
										</td>
										<td>
											${DoctorFormBean.frmLoginDoctor.email}
										</td>
									</tr>
									
									
									<tr class="table-info">
										<td>
											Degree:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillDegree"></html:text>
											<html:errors property="frmProfileFillDegree"/>
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Experience:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillExperience"></html:text>
											<html:errors property="frmProfileFillExperience"/>
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Phone:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillPhone"></html:text>
											<html:errors property="frmProfileFillPhone"/>
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Address:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillAddress"></html:text>
											<html:errors property="frmProfileFillAddress"/>
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Biography:
										</td>
										<td>
											<html:textarea styleClass="form-control"
								cols="20" rows="5" property="frmProfileFillBiography"></html:textarea>
											<html:errors property="frmProfileFillBiography"/>
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Doctor profile image:
										</td>
										<td>
											<html:file styleClass="form-control-file btn-primary"
											property="frmProfileFillDoctorImage"></html:file>
											<html:errors property="frmProfileFillDoctorImageError"/>
										</td>
									</tr>
									<tr class="table-info">
										<td colspan="2" class="text-center"> 
										 	<html:submit
											styleClass="btn btn-info" property="frmBtnSave">Save</html:submit>
										</td>
										 
									</tr>
								</tbody>
								</logic:empty>
							
							
							<!-- ////////////////////////////////////////// -->
							
							
								<logic:notEmpty name="DoctorProfileFillFormBean" property="frmDoctorProfileFillFormControl">
								<tbody>
									<tr class="table-info">
										<td>
											Name:
										</td>
										<td>
											${DoctorProfileFillFormBean.frmLoginDoctor.doctorName}
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Date of birth:
										</td>
										<td> 
											<bean:write name="DoctorProfileFillFormBean" property="frmLoginDoctor.dateOfBirth" format="MM-dd-YYYY"/>
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Specialization:
										</td>
										<td>
											${DoctorProfileFillFormBean.frmLoginDoctor.specialization}
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Email:
										</td>
										<td>
											${DoctorProfileFillFormBean.frmLoginDoctor.email}
										</td>
									</tr>
									
									
									<tr class="table-info">
										<td>
											Degree:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillDegree" disabled="true"></html:text>
										
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Experience:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillExperience" disabled="true"></html:text>
											
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Phone:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillPhone" disabled="true"></html:text>
										
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Address:
										</td>
										<td>
											<html:text styleClass="form-control"
											property="frmProfileFillAddress" disabled="true"></html:text>
										
										</td>
									</tr>
									<tr class="table-info">
										<td>
											Biography:
										</td>
										<td>
											<html:textarea styleClass="form-control"
								cols="20" rows="5" property="frmProfileFillBiography" disabled="true"></html:textarea>
									
										</td>
									</tr>
									
									<tr class="table-info">
										<td>
											Doctor profile image:
										</td>
										<td>
											<bean:write name="DoctorProfileFillFormBean" property="frmProfileFillDoctorImageFilePath"/>
										</td>
									</tr>
									<tr class="table-info">
										<td colspan="2" class="text-center"> 
										 	<html:submit
											styleClass="btn btn-info" property="frmBtnConfirm">Confirm</html:submit>
											<a href="DoctorProfileFillCancel.do"
											class="btn btn-info btn-md">Cancel</a>
										</td>
										 
									</tr>
								</tbody>
								</logic:notEmpty>
							</table>
						</div>
					</div>
				</html:form>
			</div><!-- container -->
			<!-- CUSTOMIZE END HERE -->
 

	<script src="./resource/js/bootstrap-js/jquery/jquery-3.4.1.min.js"></script>
	<script src="./resource/js/bootstrap-js/jquery/popper.min.js"></script>
	<script src="./resource/js/bootstrap-js/bootstrap.min.js"></script>



	<!-- other additional function for health care project (end)-->
</body>
</html:html>