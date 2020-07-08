package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Doctor;

public class AdminDoctorDaoImpl extends HibernateDaoSupport implements
		AdminDoctorDao {

	
	public Doctor getDoctorByName(String strName) {
		String hql = "from Doctor i where i.doctorName=?";
		List l = getHibernateTemplate().find(hql, strName);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

	public void saveNewDoctor(Doctor doctor) {
		getHibernateTemplate().saveOrUpdate(doctor);		
	}

	
}
