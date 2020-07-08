package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Receptionist;

public class ReceptionistDaoImpl extends HibernateDaoSupport implements
		ReceptionistDao {

	public Receptionist getReceptionistByEmailandPassword(String email,
			String password) {
		String hql="from Receptionist i where i.email=? and i.password=?";
		Object[] param={email,password};
		List l=getHibernateTemplate().find(hql,param);
		return (Receptionist) (l.isEmpty()|| l==null? null:l.get(0));
	}

}
