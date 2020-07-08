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
      <script src="jquery.js"></script> 
    
  </head>
  <body >
    
    <div class="wrapper d-flex align-items-stretch">
  
     
    <%@ include file="../inc/receptionistsidebar.jsp" %>
        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5">
<%@ include file="../inc/navbar.jsp" %>


  <!--content nav bar -->
  <!-- Date  -->
        <table class="table">
    <tr>
        <td>
        <h5 id="date-label"></h5>
        </td>
        
        <td>
<!--         <form class="form-inline float-right">
            <label class="sr-only">Name</label>
            <input type="text" class="form-control mb-2 mr-sm-2">
            <button type="submit" class="btn btn-info mb-2">Search</button>
        </form> -->
        <html:form styleClass="form-inline float-right" action="/SearchPatientById">
            <label styleClass="sr-only mb-2">Patient Register ID:</label>
            <html:text  styleClass="form-control mb-2 mr-sm-2" property="serachPatient"></html:text>
            <html:submit styleClass="btn btn-info mb-2" property="" >Search</html:submit>
        </html:form>
        </td>
        </tr>
  </table>


  <!-- CUSTOMIZE START HERE -->

  <div class="container">
<div class="row">
  <table class="table table-hover table-striped">
    <thead class="table-info">
      <tr>
        <th>No</th>
        <th>Patient</th>
        <th>Register ID</th>
        <th>Date Of Birth</th>
  <th>Address</th>
  <th>Phone No</th>
  <th>Admitted Date</th>
  <th>Discharged Date</th>

      </tr>
    </thead>
    <tbody>
 	<c:set var="i" value="0"></c:set>
	<logic:iterate id="patient" name="PatientRegisterFormBean" property="list">
		<tr class="table-info">
        <td><c:out value="${i+1}"></c:out> 
        <c:set var="i" value="${i+1}"></c:set>
        </td>
        <td><bean:write name="patient" property="patientName" /></td>
         <td><bean:write name="patient" property="registerId" /></td>
         <td><bean:write name="patient" property="dateOfBirth" format="MM-dd-YYYY"/></td>
          <td><bean:write name="patient" property="address" /></td>
         <td><bean:write name="patient" property="phone" /></td>
         <td><bean:write name="patient" property="admittedDate" format="MM-dd-YYYY"/></td>
         <td><%-- <c:if test="${empty PatientRegisterFormBean.list[i-1].dischargedDate}"> --%>
			<logic:empty name="patient" property="dischargedDate">
				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">Discharge</button>
				 <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
       
        <div class="modal-body">
          <h5>Are you sure you want to discharge?</h5>
        </div>
        <div class="modal-footer">
        
   <input type="button" class="btn btn-info" data-dismiss="modal" value="YES" onclick="myFunctionYES()" />
   <input type="button"  class="btn btn-info" data-dismiss="modal" value="Cancel"  />
        </div>
      </div>
      
    </div>
  </div>
				  <script type="text/javascript">
     function myFunctionYES(){
    	 window.location.href="DischargePath.do?PatientId=<bean:write name='patient' property='id' />"; 
    		
    	 }

     </script>
     		</logic:empty>	
			<%-- </c:if> --%>
			<%-- <c:if test="${not empty PatientRegisterFormBean.list[i-1].dischargedDate}">
				${PatientRegisterFormBean.list[i-1].dischargedDate}					 
			</c:if>	 --%>					
			<logic:notEmpty name="patient" property="dischargedDate">
				<bean:write name="patient" property="admittedDate" format="MM-dd-YYYY"/>
			</logic:notEmpty>						
		</td>
          
  </tr>
	</logic:iterate>

      </tbody>
     </table>
     
        
     
     
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
