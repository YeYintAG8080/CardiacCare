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
 


  <!-- CUSTOMIZE START HERE -->

  <div class="container">
<div class="alert alert-primary alert-dismissible fade show">
    <strong>No patient record found.</strong>
    <!-- <button type="button" class="close" data-dismiss="alert">&times;</button> -->
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
