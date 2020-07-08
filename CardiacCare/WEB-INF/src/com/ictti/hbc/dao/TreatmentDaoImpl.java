package com.ictti.hbc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Treatment;

public class TreatmentDaoImpl extends HibernateDaoSupport implements
		TreatmentDao {

	@Override
	public Treatment getTreatmentByDailyRecordId(int daily_record_id) {
		String hql="from Treatment t where t.dailyRecord.id=?";
		List<Treatment> l=getHibernateTemplate().find(hql,daily_record_id);
		return l.isEmpty() || l==null? null:l.get(0);
	}

	@Override
	public void saveNewTreatment(Treatment treatment) {
		getHibernateTemplate().saveOrUpdate(treatment);		
	}

	@Override
	public Treatment getTreatmentByDate(Date date) {
		String hql="from Treatment t where t.treatmentDate=?";
		List<Treatment> l=getHibernateTemplate().find(hql,date);
		return l.isEmpty() || l==null? null:l.get(0);
	}

}
