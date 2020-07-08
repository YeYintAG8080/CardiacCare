package com.ictti.hbc.business.service;

import java.util.Date;

import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.dao.TreatmentDao;

public class TreatmentService {
	private TreatmentDao myTreatmentDao;

	public void setMyTreatmentDao(TreatmentDao myTreatmentDao) {
		this.myTreatmentDao = myTreatmentDao;
	}
	public Treatment getTreatmentByDailyRecordId(int daily_record_id){
		return myTreatmentDao.getTreatmentByDailyRecordId(daily_record_id);
		
	}
	public void saveNewTreatment(Treatment treatment){
		myTreatmentDao.saveNewTreatment(treatment);
	}
	public Treatment getTreatmentByDate(Date date){
		return myTreatmentDao.getTreatmentByDate(date);
	}
	
}
