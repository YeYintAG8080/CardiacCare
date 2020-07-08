<%@ include file="../inc/common.jsp"%>
<html:html>
<head>
<title>Admin Patient Feedback</title>
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
<body >
	<div class="wrapper d-flex align-items-stretch">

		<jsp:include page="../inc/adminsidebar.jsp"></jsp:include>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<jsp:include page="../inc/navbar.jsp"></jsp:include>
			<!--content nav bar -->
			<!-- Date  -->
			<%-- <table class="table">
				<tr>
					<td><html:form action="/feedbackSearch">
							<form class="form-inline float-right">

								<html:text styleClass="form-control mb-2 mr-sm-2"
									property="frmFeedbackDate"></html:text>
								<html:submit styleClass="btn btn-info mb-2" property="frmBtnSearch">Search</html:submit>
							</form>
						</html:form></td>
			</table> --%>
			
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
        <html:form styleClass="form-inline float-right" action="/feedbackSearch">
            <label styleClass="sr-only mb-2">Search Feedback Date:</label>
            <html:text  styleClass="form-control mb-2 mr-sm-2" property="serachFeedBackDate"></html:text>
            <html:submit styleClass="btn btn-info mb-2" property="" >Search</html:submit>
        </html:form>
        </td>
        </tr>
  </table>

			<!-- Page Content  -->
			<!-- 			<div id="content" class="p-4 p-md-5">
 -->



			<!--content nav bar -->
			<!-- Date  -->


			<!-- CUSTOMIZE START HERE -->

			<div class="container">
				<div class="bg ">

					<h5 class="mb-1">Patient's Feedback</h5>
					<div class="reviews-members pt-1 pb-1">


						 <html:form action="/AdminPatientFeedback">
							<logic:notEmpty property="frmFeedbackList" name="AdminFormBean">
								<c:forEach var="i" begin="${AdminFormBean.beginP}"
									end="${AdminFormBean.endP}" step="1">
									<!-- <hr> -->
									<div class="bg-info reviews-members-body">
										<hr>
									</div>
									<h6 class="mb-1">
									
										<a class="text-black">${requestScope.Patient[i-1]}</a>
									</h6>
									<h6>
										<p class="text-black">gave FEEDBACK on
											${AdminFormBean.frmFeedbackList[i-1].feedbackDate}</p>
									</h6>
									<p>${AdminFormBean.frmFeedbackList[i-1].feedback}</p>
								</c:forEach>
							</logic:notEmpty>
						</html:form>
						

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