package com.ictti.hbc.business.service;

import java.util.Date;
import java.util.List;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.dao.DailyRecordDao;

public class DailyRecordService {
	private DailyRecordDao myDailyRecordDao;

	public void setMyDailyRecordDao(DailyRecordDao myDailyRecordDao) {
		this.myDailyRecordDao = myDailyRecordDao;
	}
	public List<DailyRecord> getAllDailyRecordListByPatientId(int patient_id){
	 
		return myDailyRecordDao.getAllDailyRecordListByPatientId(patient_id);		
	}
	public DailyRecord getDailyRecordById(int daily_record_id){
		return myDailyRecordDao.getDailyRecordById(daily_record_id);
	}
	public void AddNewDailyRecord(DailyRecord daily_record){
		myDailyRecordDao.AddNewDailyRecord(daily_record);
	}
	public DailyRecord getDailyRecordByPatientIdAndCurrentDate(int patient_id,Date today){
		return myDailyRecordDao.getDailyRecordByPatientIdAndCurrentDate(patient_id, today);
	}
	
}
