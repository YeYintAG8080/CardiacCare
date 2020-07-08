package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.dao.AdminPatientDao;

public class AdminPatientDaoImpl extends HibernateDaoSupport implements
		AdminPatientDao {

	public List<Patient> getPatientListByName(String token) {
		String hql = "from Patient i where i.patientName like?";
		List<Patient> l = getHibernateTemplate().find(hql, token + "%");
		return l;
	}

	public List<Patient> getPatientListAll() {
		String hql = "from Patient i";
		List<Patient> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : l;
	}

}
