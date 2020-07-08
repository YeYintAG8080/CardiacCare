package com.ictti.hbc.business.service;

import java.util.List;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.dao.AdminPatientDao;
import com.ictti.hbc.presentation.form.AdminForm;

public class AdminPatientListService {

	private AdminPatientDao myAdminPatientDao;

	public AdminPatientDao getMyAdminPatientDao() {
		return myAdminPatientDao;
	}

	public void setMyAdminPatientDao(AdminPatientDao myAdminPatientDao) {
		this.myAdminPatientDao = myAdminPatientDao;
	}

	public void getAllPatient(AdminForm myForm) {
		List<Patient> l = myAdminPatientDao.getPatientListAll();
		

		if(l!=null){
			myForm.setFrmPatientList(l);
			//set the first page
			myForm.setActualPage(1);
			//set the maximum size of the result list
			myForm.setiMaxData(l.size());
		}else{
			myForm.setFrmPatientList(null);
			 
			 
		}
		
		
		
	}

}
