package com.ictti.hbc.dao;

import java.util.List;

import com.ictti.hbc.business.entity.Patient;

public interface AdminPatientDao {

	public List<Patient> getPatientListByName(String token);
	public List<Patient> getPatientListAll();
}
