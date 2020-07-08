package com.ictti.hbc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.DailyRecord;

public class DailyRecordDaoImpl extends HibernateDaoSupport implements
		DailyRecordDao {

	@Override
	public List<DailyRecord> getAllDailyRecordListByPatientId(int patient_id) {
		String hql="from DailyRecord r where r.patient.id=? order by r.attemptDate desc";
		List<DailyRecord> l=getHibernateTemplate().find(hql,patient_id);
		return l.isEmpty() || l==null? null:l;
	}

	@Override
	public DailyRecord getDailyRecordById(int daily_record_id) {
		String hql="from DailyRecord r where r.id=?";
		List<DailyRecord> l=getHibernateTemplate().find(hql,daily_record_id);
		return l.isEmpty() || l==null? null:l.get(0);
	}


	@Override
	public void AddNewDailyRecord(DailyRecord record) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(record);
	}

	@Override
	public DailyRecord getDailyRecordByPatientIdAndCurrentDate(int patient_id,
			Date today) {
		 
		String hql="from DailyRecord r where r.patient.id=? and r.attemptDate=?";
		Object[] param={patient_id,today};
		List<DailyRecord> l=getHibernateTemplate().find(hql,param);
		 
		return l.isEmpty() || l==null? null:l.get(0);
	}

	
}
