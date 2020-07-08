package com.ictti.hbc.dao;

import java.util.List;

import com.ictti.hbc.business.entity.Doctor;



public interface DoctorDao {
	public Doctor getDoctorByEmailAndPassword(String email,String password);
	public void saveDoctor(Doctor myDoctor);
	public List<Doctor> getDoctorList();
	public Doctor getDoctorInfoByDoctorId(int id);
}
