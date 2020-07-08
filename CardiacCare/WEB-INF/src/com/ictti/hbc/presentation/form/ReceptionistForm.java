package com.ictti.hbc.presentation.form;

import java.util.List;

import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.entity.Receptionist;

public class ReceptionistForm extends ValidatorForm {
	/*ReceptionistLogin*/
	private String frmRepLoginEmail;
	private String frmRepLoginPassword;
	
	private Receptionist loginReceptionist;
	

	public Receptionist getLoginReceptionist() {
		return loginReceptionist;
	}

	public void setLoginReceptionist(Receptionist loginReceptionist) {
		this.loginReceptionist = loginReceptionist;
	}

	public String getFrmRepLoginEmail() {
		return frmRepLoginEmail;
	}

	public void setFrmRepLoginEmail(String frmRepLoginEmail) {
		this.frmRepLoginEmail = frmRepLoginEmail;
	}

	public String getFrmRepLoginPassword() {
		return frmRepLoginPassword;
	}

	public void setFrmRepLoginPassword(String frmRepLoginPassword) {
		this.frmRepLoginPassword = frmRepLoginPassword;
	}

	
	/*PatientRegisterForm*/
	private String regPatientName;
	private String regPatientDOB;
	private String regPatientEmail;
	private String regPatientPhnoe;
	private String regPatinetAddress;
	private String regPatientDisease;
	private String regPatientWeight;
	private FormFile regUploadFile;
	private String regPatientGender;
	private String regPatientBlood;
	private String frmRegFormControl;
	private String regFileName;
	private String regAdmittedDate;
	private String regFilePath;
	private String regPassword;
	private String regPatientId;
	
	
	
	
	
	public String getRegPatientId() {
		return regPatientId;
	}

	public void setRegPatientId(String regPatientId) {
		this.regPatientId = regPatientId;
	}

	public String getRegPassword() {
		return regPassword;
	}

	public void setRegPassword(String regPassword) {
		this.regPassword = regPassword;
	}

	public String getRegFilePath() {
		return regFilePath;
	}

	public void setRegFilePath(String regFilePath) {
		this.regFilePath = regFilePath;
	}

	public String getRegAdmittedDate() {
		return regAdmittedDate;
	}

	public void setRegAdmittedDate(String regAdmittedDate) {
		this.regAdmittedDate = regAdmittedDate;
	}

	public String getRegFileName() {
		return regFileName;
	}

	public void setRegFileName(String regFileName) {
		this.regFileName = regFileName;
	}

	public String getFrmRegFormControl() {
		return frmRegFormControl;
	}

	public void setFrmRegFormControl(String frmRegFormControl) {
		this.frmRegFormControl = frmRegFormControl;
	}

	public String getRegPatientName() {
		return regPatientName;
	}

	public void setRegPatientName(String regPatientName) {
		this.regPatientName = regPatientName;
	}

	public String getRegPatientDOB() {
		return regPatientDOB;
	}

	public void setRegPatientDOB(String regPatientDOB) {
		this.regPatientDOB = regPatientDOB;
	}

	public String getRegPatientEmail() {
		return regPatientEmail;
	}

	public void setRegPatientEmail(String regPatientEmail) {
		this.regPatientEmail = regPatientEmail;
	}

	public String getRegPatientPhnoe() {
		return regPatientPhnoe;
	}

	public void setRegPatientPhnoe(String regPatientPhnoe) {
		this.regPatientPhnoe = regPatientPhnoe;
	}

	public String getRegPatinetAddress() {
		return regPatinetAddress;
	}

	public void setRegPatinetAddress(String regPatinetAddress) {
		this.regPatinetAddress = regPatinetAddress;
	}

	public String getRegPatientDisease() {
		return regPatientDisease;
	}

	public void setRegPatientDisease(String regPatientDisease) {
		this.regPatientDisease = regPatientDisease;
	}

	public String getRegPatientWeight() {
		return regPatientWeight;
	}

	public void setRegPatientWeight(String regPatientWeight) {
		this.regPatientWeight = regPatientWeight;
	}

	public FormFile getRegUploadFile() {
		return regUploadFile;
	}

	public void setRegUploadFile(FormFile regUploadFile) {
		this.regUploadFile = regUploadFile;
	}

	public String getRegPatientGender() {
		return regPatientGender;
	}

	public void setRegPatientGender(String regPatientGender) {
		this.regPatientGender = regPatientGender;
	}

	public String getRegPatientBlood() {
		return regPatientBlood;
	}

	public void setRegPatientBlood(String regPatientBlood) {
		this.regPatientBlood = regPatientBlood;
	}
	
	private Patient regPateint;


	public Patient getRegPateint() {
		return regPateint;
	}

	public void setRegPateint(Patient regPateint) {
		this.regPateint = regPateint;
	}
	
	/*PatientList*/
	private List<Patient> list;
	private int end;
	private int begin;

	public List<Patient> getList() {
		return list;
	}

	public void setList(List<Patient> list) {
		this.list = list;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}
	
	/*private int PatientId;


	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	
	
*/	
	
	private String name;
	private String DOB;
	private String email;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private String serachPatient;


	public String getSerachPatient() {
		return serachPatient;
	}

	public void setSerachPatient(String serachPatient) {
		this.serachPatient = serachPatient;
	}
	
	
}
