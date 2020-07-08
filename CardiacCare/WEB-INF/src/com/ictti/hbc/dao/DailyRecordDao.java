package com.ictti.hbc.dao;

import java.util.Date;
import java.util.List;

import com.ictti.hbc.business.entity.DailyRecord;

public interface DailyRecordDao {
	public List<DailyRecord> getAllDailyRecordListByPatientId(int patient_id);
	public DailyRecord getDailyRecordById(int daily_record_id);
	public void AddNewDailyRecord(DailyRecord record);
	public DailyRecord getDailyRecordByPatientIdAndCurrentDate(int patient_id,Date today);
}
