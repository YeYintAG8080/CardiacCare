package com.ictti.hbc.presentation.form;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.hbc.business.entity.Admin;
import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.business.entity.Patient;

public class AdminForm extends ValidatorForm {

	private String frmLoginEmail;
	private String frmLoginPassword;
	private Admin frmAdminLogin;

	private List<Patient> frmPatientList;
	private List<Feedback> frmFeedbackList;

	/* Doctor Registration */
	private String regDoctorName;
	private String regDoctorDOB;
	private String regDoctorExperience;
	private String regDoctorBio;
	private String regDoctorDegree;
	private String regDoctorSpecialize;
	private FormFile regPhotoUpload;
	//private FormFile regCertificateUpload;
	private String regFormControl;
	private String regDoctorNameError;
	private String regDoctorEmail;
	private String regDoctorAddress;
	private String regDoctorPassword;
	/*
	 * private String FrmRegConfPassword; private String FrmRegAccountNameError;
	 */
	private String regfilePath;
	private String regfileName;
	private String regprofileFill;
	/*
	 * private Doctor regPhoto;
	 * 
	 * public Doctor getRegPhoto() { return regPhoto; }
	 * 
	 * public void setRegPhoto(Doctor regPhoto) { this.regPhoto = regPhoto; }
	 */

	// Report
	private String year;
	private String chart;
	private String patient;
	private String frmFeedbackDate;

	private String frmRecordBegin;
	private String frmRecordEnd;

	public String getFrmRecordBegin() {
		return Integer.valueOf("1").toString();
	}

	public void setFrmRecordBegin(String frmRecordBegin) {
		this.frmRecordBegin = frmRecordBegin;
	}

	public String getFrmRecordEnd() {
		if (frmFeedbackDate != null) {
			return Integer.valueOf(frmFeedbackList.size()).toString();
		}
		return "0";
	}

	public void setFrmRecordEnd(String frmRecordEnd) {
		this.frmRecordEnd = frmRecordEnd;
	}

	public String getFrmFeedbackDate() {
		return frmFeedbackDate;
	}

	public void setFrmFeedbackDate(String frmFeedbackDate) {
		this.frmFeedbackDate = frmFeedbackDate;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getChart() {
		return chart;
	}

	public void setChart(String chart) {
		this.chart = chart;
	}

	public String getRegprofileFill() {
		return regprofileFill;
	}

	public void setRegprofileFill(String regprofileFill) {
		this.regprofileFill = regprofileFill;
	}

	// patient list paging
	private int actualPage;
	private int iMaxShow;
	private int iMaxData; // total number of records
	private String end;
	private String begin;

	public String getEnd() {
		int iEnd = actualPage * iMaxShow;
		if (iEnd > iMaxData) {
			iEnd = iMaxData;
		}
		return Integer.valueOf(iEnd).toString();
	}

	public String getBegin() {
		int iBegin = (actualPage - 1) * iMaxShow + 1;
		return Integer.valueOf(iBegin).toString();
	}

	private boolean prevBtn;
	private boolean nextBtn;

	public boolean isPrevBtn() {
		if (getActualPage() == 1) {
			prevBtn = false;
		} else {
			prevBtn = true;
		}
		return prevBtn;
	}

	public boolean isnextBtn() {
		if (getActualPage() == getFinalPage()) {
			nextBtn = false;
		} else {
			nextBtn = true;
		}
		return nextBtn;
	}

	private int finalPage;

	public int getFinalPage() {
		finalPage = (int) Math.ceil((double) iMaxData / iMaxShow);
		return finalPage;
	}

	public String getRegfileName() {
		return regfileName;
	}

	public void setRegfileName(String regfileName) {
		this.regfileName = regfileName;
	}

	private Doctor regDoctor;
	private String regDoctorPhone;

	public String getRegDoctorPhone() {
		return regDoctorPhone;
	}

	public void setRegDoctorPhone(String regDoctorPhone) {
		this.regDoctorPhone = regDoctorPhone;
	}

	public Doctor getRegDoctor() {
		return regDoctor;
	}

	public void setRegDoctor(Doctor regDoctor) {
		this.regDoctor = regDoctor;
	}

	public String getRegfilePath() {
		return regfilePath;
	}

	public void setRegfilePath(String regfilePath) {
		this.regfilePath = regfilePath;
	}

	/*
	 * public String getFrmRegAccountNameError() { return
	 * FrmRegAccountNameError; }
	 * 
	 * public void setFrmRegAccountNameError(String frmRegAccountNameError) {
	 * FrmRegAccountNameError = frmRegAccountNameError; }
	 * 
	 * public String getFrmRegConfPassword() { return FrmRegConfPassword; }
	 * 
	 * public void setFrmRegConfPassword(String frmRegConfPassword) {
	 * FrmRegConfPassword = frmRegConfPassword; }
	 */

	public String getRegDoctorPassword() {
		return regDoctorPassword;
	}

	public void setRegDoctorPassword(String regDoctorPassword) {
		this.regDoctorPassword = regDoctorPassword;
	}

	public String getRegDoctorEmail() {
		return regDoctorEmail;
	}

	public void setRegDoctorEmail(String regDoctorEmail) {
		this.regDoctorEmail = regDoctorEmail;
	}

	public String getRegDoctorAddress() {
		return regDoctorAddress;
	}

	public void setRegDoctorAddress(String regDoctorAddress) {
		this.regDoctorAddress = regDoctorAddress;
	}

	public String getRegDoctorNameError() {
		return regDoctorNameError;
	}

	public void setRegDoctorNameError(String regDoctorNameError) {
		this.regDoctorNameError = regDoctorNameError;
	}

	public FormFile getRegPhotoUpload() {
		return regPhotoUpload;
	}

	public void setRegPhotoUpload(FormFile regPhotoUpload) {
		this.regPhotoUpload = regPhotoUpload;
	}

	/*public FormFile getRegCertificateUpload() {
		return regCertificateUpload;
	}

	public void setRegCertificateUpload(FormFile regCertificateUpload) {
		this.regCertificateUpload = regCertificateUpload;
	}*/

	public String getRegFormControl() {
		return regFormControl;
	}

	public void setRegFormControl(String regFormControl) {
		this.regFormControl = regFormControl;
	}

	public String getRegDoctorDOB() {
		return regDoctorDOB;
	}

	public void setRegDoctorDOB(String regDoctorDOB) {
		this.regDoctorDOB = regDoctorDOB;
	}

	public String getRegDoctorName() {
		return regDoctorName;
	}

	public void setRegDoctorName(String regDoctorName) {
		this.regDoctorName = regDoctorName;
	}

	public String getRegDoctorExperience() {
		return regDoctorExperience;
	}

	public void setRegDoctorExperience(String regDoctorExperience) {
		this.regDoctorExperience = regDoctorExperience;
	}

	public String getRegDoctorBio() {
		return regDoctorBio;
	}

	public void setRegDoctorBio(String regDoctorBio) {
		this.regDoctorBio = regDoctorBio;
	}

	public String getRegDoctorDegree() {
		return regDoctorDegree;
	}

	public void setRegDoctorDegree(String regDoctorDegree) {
		this.regDoctorDegree = regDoctorDegree;
	}

	public String getRegDoctorSpecialize() {
		return regDoctorSpecialize;
	}

	public void setRegDoctorSpecialize(String regDoctorSpecialize) {
		this.regDoctorSpecialize = regDoctorSpecialize;
	}

	public List<Feedback> getFrmFeedbackList() {
		return frmFeedbackList;
	}

	public void setFrmFeedbackList(List<Feedback> frmFeedbackList) {
		this.frmFeedbackList = frmFeedbackList;
	}

	private int endP;
	private int beginP;

	public int getEndP() {
		return endP;
	}

	public void setEndP(int endP) {
		this.endP = endP;
	}

	public int getBeginP() {
		return beginP;
	}

	public void setBeginP(int beginP) {
		this.beginP = beginP;
	}

	public List<Patient> getFrmPatientList() {
		return frmPatientList;
	}

	public int getActualPage() {
		return actualPage;
	}

	public void setActualPage(int actualPage) {
		this.actualPage = actualPage;
	}

	public int getiMaxShow() {
		return iMaxShow;
	}

	public void setiMaxShow(int iMaxShow) {
		this.iMaxShow = iMaxShow;
	}

	public int getiMaxData() {
		return iMaxData;
	}

	public void setiMaxData(int iMaxData) {
		this.iMaxData = iMaxData;
	}

	public void setFrmPatientList(List<Patient> frmPatientList) {
		this.frmPatientList = frmPatientList;
	}

	public Admin getFrmAdminLogin() {
		return frmAdminLogin;
	}

	public void setFrmAdminLogin(Admin frmAdminLogin) {
		this.frmAdminLogin = frmAdminLogin;
	}

	public String getFrmLoginEmail() {
		return frmLoginEmail;
	}

	public void setFrmLoginEmail(String frmLoginEmail) {
		this.frmLoginEmail = frmLoginEmail;
	}

	public String getFrmLoginPassword() {
		return frmLoginPassword;
	}

	public void setFrmLoginPassword(String frmLoginPassword) {
		this.frmLoginPassword = frmLoginPassword;
	}

	/* search feedback date */
	private String serachFeedBackDate;

	public String getSerachFeedBackDate() {
		return serachFeedBackDate;
	}

	public void setSerachFeedBackDate(String serachFeedBackDate) {
		this.serachFeedBackDate = serachFeedBackDate;
	}

}
