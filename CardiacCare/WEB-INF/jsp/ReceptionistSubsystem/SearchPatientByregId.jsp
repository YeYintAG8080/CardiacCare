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
     <script type="text/javascript">
     function myFunctionYES(){
    	 window.location.href="DischargePath.do?PatientId=${requestScope.patient.id}"; 
    		/*  var val=confirm("Do you want to diacharge the patient?"); 
    		if(val==true){
    			window.location.href="DischargePath.do?PatientId=${requestScope.patient.id}"; 
    			return true;
    		}else{
    			
    			return false;
    		} */
    	 

    	 }
/*      function myFunctionYES(){
    	 window.location.href="DischargePath.do?PatientId=${requestScope.patient.id}"; 
     } */
     </script>
  </head>
  <body >
    
    <div class="wrapper d-flex align-items-stretch">
  
     
    <%@ include file="../inc/receptionistsidebar.jsp" %>
        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5">
<%@ include file="../inc/navbar.jsp" %>


  <!--content nav bar -->
  <!-- Date  -->
       <%--  <table class="table">
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
            <label class="sr-only">Name</label>
            <html:text  styleClass="form-control mb-2 mr-sm-2" property="serachPatient"></html:text>
            <html:submit styleClass="btn btn-info mb-2" property="btnSearch" >Search</html:submit>
        </html:form>
        </td>
  </table> --%>


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
 <tr class="table-info">
        <td><c:out value="${i+1}"></c:out> 
<c:set var="i" value="${i+1}"></c:set></td>
        <td>${requestScope.patient.patientName}</td>
         <td>${requestScope.patient.registerId}</td>
         <td>${requestScope.patient.dateOfBirth}</td>
          <td>${requestScope.patient.address}</td>
         <td>${requestScope.patient.phone}</td>
         <td>${requestScope.patient.admittedDate}</td>
          <td><c:if test="${empty requestScope.patient.dischargedDate}">
				
				<%-- <form>
				<input type="button" value="Discharge" onclick="myFunction()" />
				<html:button styleClass="btn btn-info" property="btnDischarge" onclick="myFunction();">Discharge</html:button>
				</form> --%>
				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">Discharge</button>
			</c:if>
			<c:if test="${not empty requestScope.patient.dischargedDate}">
				${requestScope.patient.dischargedDate}					 
			</c:if>						
									
		</td>

      </tbody>
     </table>
     
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
