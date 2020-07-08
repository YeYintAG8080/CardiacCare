package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.business.entity.Nurse;
 
public class DoctorDaoImpl extends HibernateDaoSupport implements DoctorDao {

	@Override
	public Doctor getDoctorByEmailAndPassword(String email, String password) {
		String hql="from Doctor d where d.email=? and d.password=?";
		Object[] param={email,password};
		List<Doctor> l=getHibernateTemplate().find(hql,param);
		
		return l.isEmpty() || l==null ? null:l.get(0);
	}

	@Override
	public void saveDoctor(Doctor myDoctor) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(myDoctor);
	}

	@Override
	public List<Doctor> getDoctorList() {
		String hql="from Doctor d where d.profileFill='1'";
	 
		List<Doctor> l=getHibernateTemplate().find(hql);
		
		return l.isEmpty() || l==null ? null:l;
	}

	@Override
	public Doctor getDoctorInfoByDoctorId(int id) {
		String hql="from Doctor d where d.id=?";
		Object[] param={id};
		List<Doctor> l=getHibernateTemplate().find(hql,param);
		
		return l.isEmpty() || l==null ? null:l.get(0);
	}
	

}
