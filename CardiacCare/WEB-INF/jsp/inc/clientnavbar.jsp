<%@ include file="./common.jsp"%>
<nav class="navbar h-100 navbar-expand-lg">
	<!-- Logo Area  -->
	<a class="navbar-brand" href="index.do"><img id="HBClogo"
		src="./resource/img/core-img/HeartBeatCareIcon.png"
		alt="Logo"></a>

	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#medilifeMenu" aria-controls="medilifeMenu"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="medilifeMenu">
		<!-- Menu Area -->
		<ul class="navbar-nav ml-auto">
			<li class="nav-item active"><a class="nav-link" href="index.do">Home
					<span class="sr-only">(current)</span>
			</a></li>

			<li class="nav-item"><a class="nav-link" href="aboutus.do">About
					Us</a></li>
			<li class="nav-item"><a class="nav-link" href="doctorinfo.do">Doctor
					Team</a></li>
			<!-- <li class="nav-item">
                                            <a class="nav-link" href="blog.html">News</a>
                                        </li> -->
			<li class="nav-item"><a class="nav-link" href="contactus.do">Contact
					Us</a></li>

			<c:if test="${sessionScope.session_id!=null}">
			
				<c:choose>
					<c:when test="${sessionScope.NurseFormBean.frmLoginNurse!=null}">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">Nurse</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">

								<a class="dropdown-item"
									href="NurseHomePage.do?frmLinkControl=1">Nurse Home</a> <a
									class="dropdown-item" href="logoutPath.do">Logout</a>
							</div></li>
					</c:when>
					<c:when test="${sessionScope.DoctorFormBean.frmLoginDoctor!=null}">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">Doctor</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item"
									href="DoctorPatientListPage.do?frmLinkControl=1">Doctor
									Home</a> <a class="dropdown-item" href="logoutPath.do">Logout</a>
							</div></li>
					</c:when>
					<c:when test="${sessionScope.PatientFormBean.frmLoginPatient!=null}">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">Patient</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item"
									href="PatientProfile.do">Patient
									Home</a> <a class="dropdown-item" href="logoutPath.do">Logout</a>
							</div></li>
					</c:when>
					<c:when test="${sessionScope.ReceptionistFormBean.loginReceptionist!=null}">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">Receptionist</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item"
									href="SearchOldPatient.do">Receptionist
									Home</a> <a class="dropdown-item" href="logoutPath.do">Logout</a>
							</div></li>
					</c:when>
					<c:when test="${sessionScope.AdminFormBean.frmAdminLogin!=null}">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">Admin</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item"
									href="AdminPatientList.do">Admin
									Home</a> <a class="dropdown-item" href="logoutPath.do">Logout</a>
							</div></li>
					</c:when>
				</c:choose>
			</c:if>

			<c:if test="${sessionScope.session_id==null}">
				 <li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Login</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="PatientLogin.do">Patient</a>
					</div></li>  
					 
			</c:if>

		</ul>
		<!-- Appointment Button -->
		<!-- <a href="#" class="btn medilife-appoint-btn ml-30">For <span>emergencies</span> Click here</a> -->
	</div>
</nav>