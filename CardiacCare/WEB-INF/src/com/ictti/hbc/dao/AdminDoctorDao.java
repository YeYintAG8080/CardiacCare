package com.ictti.hbc.dao;

import com.ictti.hbc.business.entity.Doctor;

public interface AdminDoctorDao {
	
	public Doctor getDoctorByName(String strName);
	
	void saveNewDoctor(Doctor doctor);
	
	

}
