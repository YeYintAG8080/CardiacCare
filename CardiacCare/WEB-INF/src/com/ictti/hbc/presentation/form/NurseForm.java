package com.ictti.hbc.presentation.form;

import java.util.List;

import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.business.entity.Nurse;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.entity.Treatment;

public class NurseForm extends ValidatorForm {
	private String frmLoginEmail;
	private String frmLoginPassword;
	private Nurse frmLoginNurse;
	private String frmRecordBegin;
	private String frmRecordEnd;
	private String frmMedicalRecordBegin;
	private String frmMedicalRecordEnd;
	private String frmHaveTodayMedicalRecord=null;
	private String frmDailyRecordId=Integer.valueOf("-1").toString();
	private DailyRecord frmDailyRecord;
	private String frmRegisterId;
	private Patient frmPatient;
	private String frmLinkControl;
	private String frmPatientDetailLinkId=Integer.valueOf("-1").toString();	
	private String frmPatientTreatementLinkId=Integer.valueOf("-1").toString();
	private String frmPatientMedicalRecordLinkId=Integer.valueOf("-1").toString();
	//File Download Link 
	private String frmDownload;
	//Daily Record Creating Page 
	private String frmBloodPresure;
	private String frmSpO2Level;
	private String frmBodyTemperature;
	private String frmDiabetes;
	private FormFile frmBloodTest;
	private String frmPulseRate;
	private FormFile frmEchocardiography;
	private FormFile frmElectrocardiography;
	private String frmDailyRecordCreateFormControl=null;//for confirm view
	private String frmBloodTestFilePath;//for confirm view
	private String frmEchocardiographyFilePath;//for confirm view
	private String frmElectrocardiographyFilePath;//for confirm view
	//Treatment View Page
	private Treatment frmTreatment;
	private List<InjectionDose> frmInjectionDoseList;
	private List<Medicine> frmMedicineList;
	//Nurse Tasks Page Message
	private String frmNurseTaskMessage;
	private String frmTaskId;
	private String frmPatientId;
	private List<String> frmTaskButtonControl;
	public List<String> getFrmTaskButtonControl() {
		return frmTaskButtonControl;
	}

	public void setFrmTaskButtonControl(List<String> frmTaskButtonControl) {
		this.frmTaskButtonControl = frmTaskButtonControl;
	}

	public String getFrmPatientId() {
		return frmPatientId;
	}

	public void setFrmPatientId(String frmPatientId) {
		this.frmPatientId = frmPatientId;
	}

	public String getFrmTaskId() {
		return frmTaskId;
	}

	public void setFrmTaskId(String frmTaskId) {
		this.frmTaskId = frmTaskId;
	}

	public String getFrmNurseTaskMessage() {
		return frmNurseTaskMessage;
	}

	public void setFrmNurseTaskMessage(String frmNurseTaskMessage) {
		this.frmNurseTaskMessage = frmNurseTaskMessage;
	}

	public String getFrmDownload() {
		return frmDownload;
	}

	public void setFrmDownload(String frmDownload) {
		this.frmDownload = frmDownload;
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

	public String getFrmRegisterId() {
		return frmRegisterId;
	}

	public void setFrmRegisterId(String frmRegisterId) {
		this.frmRegisterId = frmRegisterId;
	}
	public String getFrmDailyRecordCreateFormControl() {
		return frmDailyRecordCreateFormControl;
	}

	public String getFrmBloodTestFilePath() {
		return frmBloodTestFilePath;
	}

	public void setFrmBloodTestFilePath(String frmBloodTestFilePath) {
		this.frmBloodTestFilePath = frmBloodTestFilePath;
	}

	public String getFrmEchocardiographyFilePath() {
		return frmEchocardiographyFilePath;
	}

	public void setFrmEchocardiographyFilePath(String frmEchocardiographyFilePath) {
		this.frmEchocardiographyFilePath = frmEchocardiographyFilePath;
	}

	public String getFrmElectrocardiographyFilePath() {
		return frmElectrocardiographyFilePath;
	}

	public void setFrmElectrocardiographyFilePath(
			String frmElectrocardiographyFilePath) {
		this.frmElectrocardiographyFilePath = frmElectrocardiographyFilePath;
	}

	public void setFrmDailyRecordCreateFormControl(
			String frmDailyRecordCreateFormControl) {
		this.frmDailyRecordCreateFormControl = frmDailyRecordCreateFormControl;
	}

	public String getFrmBloodPresure() {
		return frmBloodPresure;
	}

	public void setFrmBloodPresure(String frmBloodPresure) {
		this.frmBloodPresure = frmBloodPresure;
	}

	public String getFrmSpO2Level() {
		return frmSpO2Level;
	}

	public void setFrmSpO2Level(String frmSpO2Level) {
		this.frmSpO2Level = frmSpO2Level;
	}

	public String getFrmBodyTemperature() {
		return frmBodyTemperature;
	}

	public void setFrmBodyTemperature(String frmBodyTemperature) {
		this.frmBodyTemperature = frmBodyTemperature;
	}

	public String getFrmDiabetes() {
		return frmDiabetes;
	}

	public void setFrmDiabetes(String frmDiabetes) {
		this.frmDiabetes = frmDiabetes;
	}

	public FormFile getFrmBloodTest() {
		return frmBloodTest;
	}

	public void setFrmBloodTest(FormFile frmBloodTest) {
		this.frmBloodTest = frmBloodTest;
	}

	public String getFrmPulseRate() {
		return frmPulseRate;
	}

	public void setFrmPulseRate(String frmPulseRate) {
		this.frmPulseRate = frmPulseRate;
	}

	public FormFile getFrmEchocardiography() {
		return frmEchocardiography;
	}

	public void setFrmEchocardiography(FormFile frmEchocardiography) {
		this.frmEchocardiography = frmEchocardiography;
	}

	public FormFile getFrmElectrocardiography() {
		return frmElectrocardiography;
	}

	public void setFrmElectrocardiography(FormFile frmElectrocardiography) {
		this.frmElectrocardiography = frmElectrocardiography;
	}


	
	public String getFrmPatientTreatementLinkId() {
		return frmPatientTreatementLinkId;
	}

	public void setFrmPatientTreatementLinkId(String frmPatientTreatementLinkId) {
		this.frmPatientTreatementLinkId = frmPatientTreatementLinkId;
	}

	private List<Patient> frmPatientList;
	private List<DailyRecord> frmDailyRecordList;
	public DailyRecord getFrmDailyRecord() {
		return frmDailyRecord;
	}

	public void setFrmDailyRecord(DailyRecord frmDailyRecord) {
		this.frmDailyRecord = frmDailyRecord;
	}

	public String getFrmDailyRecordId() {
		return frmDailyRecordId;
	}

	public void setFrmDailyRecordId(String frmDailyRecordId) {
		this.frmDailyRecordId = frmDailyRecordId;
	}

	public String getFrmMedicalRecordBegin() {
		if(frmDailyRecordList!=null){
			return Integer.valueOf("1").toString();
		}else{
			return Integer.valueOf("0").toString();	
		}
	}

	public void setFrmMedicalRecordBegin(String frmMedicalRecordBegin) {
		this.frmMedicalRecordBegin = frmMedicalRecordBegin;
	}

	public String getFrmMedicalRecordEnd() {
		if(frmDailyRecordList!=null){
			return Integer.valueOf(frmDailyRecordList.size()).toString();
		}else{
			return Integer.valueOf("0").toString();	
		}
	}

	public void setFrmMedicalRecordEnd(String frmMedicalRecordEnd) {
		this.frmMedicalRecordEnd = frmMedicalRecordEnd;
	}


	public String getFrmHaveTodayMedicalRecord() {
		return frmHaveTodayMedicalRecord;
	}

	public void setFrmHaveTodayMedicalRecord(String frmHaveTodayMedicalRecord) {
		this.frmHaveTodayMedicalRecord = frmHaveTodayMedicalRecord;
	}


	public List<DailyRecord> getFrmDailyRecordList() {
		return frmDailyRecordList;
	}

	public void setFrmDailyRecordList(List<DailyRecord> frmDailyRecordList) {
		this.frmDailyRecordList = frmDailyRecordList;
	}


	public String getFrmPatientMedicalRecordLinkId() {
		return frmPatientMedicalRecordLinkId;
	}

	public void setFrmPatientMedicalRecordLinkId(
			String frmPatientMedicalRecordLinkId) {
		this.frmPatientMedicalRecordLinkId = frmPatientMedicalRecordLinkId;
	}

	public String getFrmPatientDetailLinkId() {
		return frmPatientDetailLinkId;
	}

	public void setFrmPatientDetailLinkId(String frmPatientDetailLinkId) {
		this.frmPatientDetailLinkId = frmPatientDetailLinkId;
	}

	public Nurse getFrmLoginNurse() {
		return frmLoginNurse;
	}

	public void setFrmLoginNurse(Nurse frmLoginNurse) {
		this.frmLoginNurse = frmLoginNurse;
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

	public String getFrmLinkControl() {
		return frmLinkControl;
	}

	public void setFrmLinkControl(String frmLinkControl) {
		this.frmLinkControl = frmLinkControl;
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

	public List<Patient> getFrmPatientList() {
		return frmPatientList;
	}

	public void setFrmPatientList(List<Patient> frmPatientList) {
		this.frmPatientList = frmPatientList;
	}

	public Patient getFrmPatient() {
		return frmPatient;
	}

	public void setFrmPatient(Patient frmPatient) {
		this.frmPatient = frmPatient;
	}

}
