package com.ictti.hbc.business.service;

import java.util.List;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.dao.PatientDao;

public class PatientService {
	private PatientDao myPatientDao;

	public void setMyPatientDao(PatientDao myPatientDao) {
		this.myPatientDao = myPatientDao;
	}
	public Patient getPatientByEmailAndPassword(String email,String password){
		return myPatientDao.getPatientByEmailAndPassword(email, password);	
	}
	public List<Patient> getPatientList(){
		return myPatientDao.getPatientList();
	}
	
	public Patient getPatientInfoDetailById(int patient_id){
		return myPatientDao.getPatientInfoDetailById(patient_id);
		
	}
	
	public List<Patient> getPatientListByRegisterId(String register_id){
		return myPatientDao.getPatientListByRegisterId(register_id);
	}
	
	public Patient getPatientByRegisterId(String register_id){
		return myPatientDao.getPatientByRegisterId(register_id);
	}
	
	public Patient getPatientByNameandDOBandEmail(String regPatientName,
			String regPatientDOB, String regPatientEmail) {
		
		
		return myPatientDao.getPatient(regPatientName,regPatientDOB,regPatientEmail);
	}
	
	public void updatePatientProfile(Patient patient){
		myPatientDao.updatePatientProfile(patient);
	}
}
