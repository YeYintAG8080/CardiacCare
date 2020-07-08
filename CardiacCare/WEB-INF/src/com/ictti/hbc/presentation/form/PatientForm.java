package com.ictti.hbc.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.entity.Treatment;

public class PatientForm extends ValidatorForm {
	//Login Page
	private String frmLoginEmail;
	private String frmLoginPassword;
	//After Login
	private Patient frmLoginPatient;
	//Patient DailyRecord Detail
	private DailyRecord frmDailyRecord;
	private String frmTreatmentId;
	//Medical Record List(History) 
	private List<DailyRecord> frmDailyRecordList;
	//Treatment History Page
	private Treatment frmTreatment;
	private List<InjectionDose> frmInjectionDoseList;
	private List<Medicine> frmMedicineList;
	//Doctor suggestion
	private List<Treatment> frmTreatmentList;
	//Patient Feedback
	private String frmPatientFeedback;
	//Patient Updte Profile
	private Integer frmUpdateWeight;
	private String frmUpdatePhone;
	private String frmUpdateAddress;
	private String frmEditFormControl;
	public String getFrmEditFormControl() {
		return frmEditFormControl;
	}
	public void setFrmEditFormControl(String frmEditFormControl) {
		this.frmEditFormControl = frmEditFormControl;
	}
	public Integer getFrmUpdateWeight() {
		return frmUpdateWeight;
	}
	public void setFrmUpdateWeight(Integer frmUpdateWeight) {
		this.frmUpdateWeight = frmUpdateWeight;
	}
	public String getFrmUpdatePhone() {
		return frmUpdatePhone;
	}
	public void setFrmUpdatePhone(String frmUpdatePhone) {
		this.frmUpdatePhone = frmUpdatePhone;
	}
	public String getFrmUpdateAddress() {
		return frmUpdateAddress;
	}
	public void setFrmUpdateAddress(String frmUpdateAddress) {
		this.frmUpdateAddress = frmUpdateAddress;
	}
	public String getFrmPatientFeedback() {
		return frmPatientFeedback;
	}
	public void setFrmPatientFeedback(String frmPatientFeedback) {
		this.frmPatientFeedback = frmPatientFeedback;
	}
	public List<Treatment> getFrmTreatmentList() {
		return frmTreatmentList;
	}
	public void setFrmTreatmentList(List<Treatment> frmTreatmentList) {
		this.frmTreatmentList = frmTreatmentList;
	}
	public Treatment getFrmTreatment() {
		return frmTreatment;
	}
	public void setFrmTreatment(Treatment frmTreatment) {
		this.frmTreatment = frmTreatment;
	}
	public List<InjectionDose> getFrmInjectionDoseList() {
		return frmInjectionDoseList;
	}
	public void setFrmInjectionDoseList(List<InjectionDose> frmInjectionDoseList) {
		this.frmInjectionDoseList = frmInjectionDoseList;
	}
	public List<Medicine> getFrmMedicineList() {
		return frmMedicineList;
	}
	public void setFrmMedicineList(List<Medicine> frmMedicineList) {
		this.frmMedicineList = frmMedicineList;
	}
	public List<DailyRecord> getFrmDailyRecordList() {
		return frmDailyRecordList;
	}
	public void setFrmDailyRecordList(List<DailyRecord> frmDailyRecordList) {
		this.frmDailyRecordList = frmDailyRecordList;
	}
	public String getFrmTreatmentId() {
		return frmTreatmentId;
	}
	public void setFrmTreatmentId(String frmTreatmentId) {
		this.frmTreatmentId = frmTreatmentId;
	}
	public DailyRecord getFrmDailyRecord() {
		return frmDailyRecord;
	}
	public void setFrmDailyRecord(DailyRecord frmDailyRecord) {
		this.frmDailyRecord = frmDailyRecord;
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
	public Patient getFrmLoginPatient() {
		return frmLoginPatient;
	}
	public void setFrmLoginPatient(Patient frmLoginPatient) {
		this.frmLoginPatient = frmLoginPatient;
	}
	
}
