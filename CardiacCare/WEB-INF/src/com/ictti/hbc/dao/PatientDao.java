package com.ictti.hbc.dao;

import java.util.List;

import com.ictti.hbc.business.entity.Patient;

public interface PatientDao {
	public List<Patient> getPatientList();
	public Patient getPatientInfoDetailById(int patient_id);
	public List<Patient> getPatientListByRegisterId(String register_id);
	public Patient getPatientByRegisterId(String register_id);
	public Patient getPatientByEmailAndPassword(String email,String password);
	public void saveNewPatient(Patient patient);
	public int getListSize();
	public Patient getPatient(String regPatientName, String regPatientDOB,String regPatientEmail);
	public List<Patient> getAllPatient();
	public Patient setDischargedDate(int id);
	public Patient getPatientById(String serachPatient);
	public void updatePatientProfile(Patient patient);
}
