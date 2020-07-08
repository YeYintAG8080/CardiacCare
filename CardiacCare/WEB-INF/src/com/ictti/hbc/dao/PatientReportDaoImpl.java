package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Doctor;

public class PatientReportDaoImpl extends HibernateDaoSupport implements
		PatientReportDao {

	/*@Override
	public List<PatientReport> getPatientReportByYear(int year) {
		String hql = "count(*),month from PatientReport r where r.year=? group by r.month";
		List<PatientReport> l = getHibernateTemplate().find(hql, year);
		return l.isEmpty() || l == null ? null : l;
	}*/

}
