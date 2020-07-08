package com.ictti.hbc.dao;

import java.util.Date;

import com.ictti.hbc.business.entity.Treatment;

public interface TreatmentDao {
public Treatment getTreatmentByDailyRecordId(int daily_record_id);
public void saveNewTreatment(Treatment treatment);
public Treatment getTreatmentByDate(Date date);
}
