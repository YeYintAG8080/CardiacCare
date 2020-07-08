package com.ictti.hbc.business.service;

import java.util.List;

import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.dao.InjectionDao;

public class InjectionDoseService {
	private InjectionDao myInjectionDao;

	public void setMyInjectionDao(InjectionDao myInjectionDao) {
		this.myInjectionDao = myInjectionDao;
	}
	public List<InjectionDose> getInjectionListByTreatmentId(int treatment_id){
		return myInjectionDao.getInjectionListByTreatmentId(treatment_id);	
	}
	public InjectionDose getInjectionDoseByInjectionId(int injection_id){
		return myInjectionDao.getInjectionDoseByInjectionId(injection_id);	
	}
	public void CompleteTask(InjectionDose injection){
		myInjectionDao.CompleteTask(injection);
	}
	public void saveNewInjectionDose(InjectionDose injection){
		myInjectionDao.saveNewInjectionDose(injection);
	}
}
