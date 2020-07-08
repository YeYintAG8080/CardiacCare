package com.ictti.hbc.business.service;

import com.ictti.hbc.business.entity.Nurse;
import com.ictti.hbc.dao.NurseDao;

public class NurseService {
	private NurseDao myNurseDao;
	
	
	
	public void setMyNurseDao(NurseDao myNurseDao) {
		this.myNurseDao = myNurseDao;
	}



	public Nurse getNurseByEmailAndPassword(String email,String password){
		return myNurseDao.getNurseByEmailAndPassword(email, password);	
	}
}
