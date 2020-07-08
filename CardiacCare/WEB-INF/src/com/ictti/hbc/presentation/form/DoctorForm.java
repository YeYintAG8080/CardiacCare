package com.ictti.hbc.presentation.form;

import java.util.Date;
import java.util.List;

import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.util.InputInjection;
import com.ictti.hbc.util.InputMedicine;

public class DoctorForm extends ValidatorForm {
	//Login Page Inputs
	private String frmLoginEmail;
	private String frmLoginPassword;
	
	//After Login (Valid Doctor)
	private Doctor frmLoginDoctor;
	private List<Patient> frmPatientList;
	private String frmRecordBegin;
	private String frmRecordEnd;
	//Patient Detail Info
	private Patient frmPatient;
	//Patient's Daily Medical Record List Page
	private List<DailyRecord> frmDailyRecordList;
	//Patient Search Form
	private String frmPatientRegisterId;
	private String frmSearchPatientId;
	//Patient's Medical Record Detail Form
	private DailyRecord frmDailyRecord;
	private String frmTreatmentId;
	private String frmMedicalRecordId;
	//Patient's Treatment Page
	private Treatment frmTreatment;
	private List<InjectionDose> frmInjectionDoseList;
	private List<Medicine> frmMedicineList;
	//Add Treatement Page
	private List<InputInjection> frmInputInjectionList;	
	private List<InputMedicine> frmInputMedicineList;
	private String frmAddTreatmentFormControl;
	private String frmDoctorSuggestion;
	//Doctor's Profile Update Page
	private String frmDoctorImage;
	private FormFile frmEditDoctorImage;
	private String frmEditDoctorImageFilePath;
	private String frmPassword;
	private String frmComfirmPassword;
	private String frmFormControl;
	private String frmEmail;
	private String frmDegree;
	private String frmSpecialization;
	private String frmExperience;
	private String frmPhone;
	private String frmAddress;
	//Doctor's Profile fill page
	private String frmDoctorProfileFillFormControl;
	private String frmProfileFillDegree;
	private String frmProfileFillExperience;
	private String frmProfileFillPhone;
	private String frmProfileFillAddress;
	private String frmProfileFillBiography;
	private FormFile frmProfileFillDoctorImage;
	private String frmProfileFillDoctorImageFilePath;
	 
		public String getFrmMedicalRecordId() {
			return frmMedicalRecordId;
		}
		public void setFrmMedicalRecordId(String frmMedicalRecordId) {
			this.frmMedicalRecordId = frmMedicalRecordId;
		}
	public String getFrmDoctorProfileFillFormControl() {
		return frmDoctorProfileFillFormControl;
	}
	public void setFrmDoctorProfileFillFormControl(
			String frmDoctorProfileFillFormControl) {
		this.frmDoctorProfileFillFormControl = frmDoctorProfileFillFormControl;
	}
	public String getFrmProfileFillDegree() {
		return frmProfileFillDegree;
	}
	public void setFrmProfileFillDegree(String frmProfileFillDegree) {
		this.frmProfileFillDegree = frmProfileFillDegree;
	}
	public String getFrmProfileFillExperience() {
		return frmProfileFillExperience;
	}
	public void setFrmProfileFillExperience(String frmProfileFillExperience) {
		this.frmProfileFillExperience = frmProfileFillExperience;
	}
	public String getFrmProfileFillPhone() {
		return frmProfileFillPhone;
	}
	public void setFrmProfileFillPhone(String frmProfileFillPhone) {
		this.frmProfileFillPhone = frmProfileFillPhone;
	}
	public String getFrmProfileFillAddress() {
		return frmProfileFillAddress;
	}
	public void setFrmProfileFillAddress(String frmProfileFillAddress) {
		this.frmProfileFillAddress = frmProfileFillAddress;
	}
	public String getFrmProfileFillBiography() {
		return frmProfileFillBiography;
	}
	public void setFrmProfileFillBiography(String frmProfileFillBiography) {
		this.frmProfileFillBiography = frmProfileFillBiography;
	}
	public FormFile getFrmProfileFillDoctorImage() {
		return frmProfileFillDoctorImage;
	}
	public void setFrmProfileFillDoctorImage(FormFile frmProfileFillDoctorImage) {
		this.frmProfileFillDoctorImage = frmProfileFillDoctorImage;
	}
	public String getFrmProfileFillDoctorImageFilePath() {
		return frmProfileFillDoctorImageFilePath;
	}
	public void setFrmProfileFillDoctorImageFilePath(
			String frmProfileFillDoctorImageFilePath) {
		this.frmProfileFillDoctorImageFilePath = frmProfileFillDoctorImageFilePath;
	}
	public String getFrmEditDoctorImageFilePath() {
		return frmEditDoctorImageFilePath;
	}
	public void setFrmEditDoctorImageFilePath(String frmEditDoctorImageFilePath) {
		this.frmEditDoctorImageFilePath = frmEditDoctorImageFilePath;
	}
	public FormFile getFrmEditDoctorImage() {
		return frmEditDoctorImage;
	}
	public void setFrmEditDoctorImage(FormFile frmEditDoctorImage) {
		this.frmEditDoctorImage = frmEditDoctorImage;
	}
	public String getFrmDoctorImage() {
		return frmDoctorImage;
	}
	public void setFrmDoctorImage(String frmDoctorImage) {
		this.frmDoctorImage = frmDoctorImage;
	}
	public String getFrmSearchPatientId() {
		return frmSearchPatientId;
	}
	public void setFrmSearchPatientId(String frmSearchPatientId) {
		this.frmSearchPatientId = frmSearchPatientId;
	}
	public String getFrmPassword() {
		return frmPassword;
	}
	public void setFrmPassword(String frmPassword) {
		this.frmPassword = frmPassword;
	}
	public String getFrmComfirmPassword() {
		return frmComfirmPassword;
	}
	public void setFrmComfirmPassword(String frmComfirmPassword) {
		this.frmComfirmPassword = frmComfirmPassword;
	}
	public String getFrmFormControl() {
		return frmFormControl;
	}
	public void setFrmFormControl(String frmFormControl) {
		this.frmFormControl = frmFormControl;
	}
	public String getFrmEmail() {
		return frmEmail;
	}
	public void setFrmEmail(String frmEmail) {
		this.frmEmail = frmEmail;
	}
	public String getFrmDegree() {
		return frmDegree;
	}
	public void setFrmDegree(String frmDegree) {
		this.frmDegree = frmDegree;
	}
	public String getFrmSpecialization() {
		return frmSpecialization;
	}
	public void setFrmSpecialization(String frmSpecialization) {
		this.frmSpecialization = frmSpecialization;
	}
	public String getFrmExperience() {
		return frmExperience;
	}
	public void setFrmExperience(String frmExperience) {
		this.frmExperience = frmExperience;
	}
	public String getFrmPhone() {
		return frmPhone;
	}
	public void setFrmPhone(String frmPhone) {
		this.frmPhone = frmPhone;
	}
	public String getFrmAddress() {
		return frmAddress;
	}
	public void setFrmAddress(String frmAddress) {
		this.frmAddress = frmAddress;
	}
	public List<DailyRecord> getFrmDailyRecordList() {
		return frmDailyRecordList;
	}
	public void setFrmDailyRecordList(List<DailyRecord> frmDailyRecordList) {
		this.frmDailyRecordList = frmDailyRecordList;
	}
	public Patient getFrmPatient() {
		return frmPatient;
	}
	public void setFrmPatient(Patient frmPatient) {
		this.frmPatient = frmPatient;
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
	public List<InputMedicine> getFrmInputMedicineList() {
		return frmInputMedicineList;
	}
	public void setFrmInputMedicineList(List<InputMedicine> frmInputMedicineList) {
		this.frmInputMedicineList = frmInputMedicineList;
	}
	public List<InputInjection> getFrmInputInjectionList() {
		return frmInputInjectionList;
	}
	public void setFrmInputInjectionList(List<InputInjection> frmInputInjectionList) {
		this.frmInputInjectionList = frmInputInjectionList;
	}
	public String getMedicineListBegin() {
		return "1";
	}
	public String getInjectionListBegin() {
		return "1";
	}
	public String getFrmDoctorSuggestion() {
		return frmDoctorSuggestion;
	}
	public void setFrmDoctorSuggestion(String frmDoctorSuggestion) {
		this.frmDoctorSuggestion = frmDoctorSuggestion;
	}
	public String getFrmAddTreatmentFormControl() {
		return frmAddTreatmentFormControl;
	}
	public void setFrmAddTreatmentFormControl(String frmAddTreatmentFormControl) {
		this.frmAddTreatmentFormControl = frmAddTreatmentFormControl;
	}
	public String getFrmRecordBegin() {
		return Integer.valueOf("1").toString();
	}
	public void setFrmRecordBegin(String frmRecordBegin) {
		this.frmRecordBegin = frmRecordBegin;
	}
	public String getFrmRecordEnd() {
		if(frmPatientList!=null){
			return Integer.valueOf(frmPatientList.size()).toString();
			}
			return "0";
	}
	public void setFrmRecordEnd(String frmRecordEnd) {
		this.frmRecordEnd = frmRecordEnd;
	}
	public String getFrmTreatmentId() {
		return frmTreatmentId;
	}
	public void setFrmTreatmentId(String frmTreatmentId) {
		this.frmTreatmentId = frmTreatmentId;
	}
	public Treatment getFrmTreatment() {
		return frmTreatment;
	}
	public void setFrmTreatment(Treatment frmTreatment) {
		this.frmTreatment = frmTreatment;
	}
	public DailyRecord getFrmDailyRecord() {
		return frmDailyRecord;
	}
	public void setFrmDailyRecord(DailyRecord frmDailyRecord) {
		this.frmDailyRecord = frmDailyRecord;
	}
	public String getFrmPatientRegisterId() {
		return frmPatientRegisterId;
	}
	public void setFrmPatientRegisterId(String frmPatientRegisterId) {
		this.frmPatientRegisterId = frmPatientRegisterId;
	}
	public List<Patient> getFrmPatientList() {
		return frmPatientList;
	}
	public void setFrmPatientList(List<Patient> frmPatientList) {
		this.frmPatientList = frmPatientList;
	}
	public Doctor getFrmLoginDoctor() {
		return frmLoginDoctor;
	}
	public void setFrmLoginDoctor(Doctor frmLoginDoctor) {
		this.frmLoginDoctor = frmLoginDoctor;
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
}
