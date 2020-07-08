package com.ictti.hbc.business.service;


import java.util.List;

import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.dao.DoctorDao;
import com.ictti.hbc.presentation.form.DoctorForm;

public class DoctorService {
	private DoctorDao myDoctorDao;
	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}
	public Doctor getDoctorByEmailAndPassword(String email,String password){
		return myDoctorDao.getDoctorByEmailAndPassword(email, password);	
	}
	public void saveUpdateDoctor(Doctor doctor) {
 
		myDoctorDao.saveDoctor(doctor);
	}
	public List<Doctor> getDoctorList(){
		return myDoctorDao.getDoctorList();	
	}
	
	public Doctor getDoctorInfoByDoctorId(int id){
		return myDoctorDao.getDoctorInfoByDoctorId(id);
		
	}
}
