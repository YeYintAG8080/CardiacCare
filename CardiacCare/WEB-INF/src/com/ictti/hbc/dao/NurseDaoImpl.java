package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Nurse;

public class NurseDaoImpl extends HibernateDaoSupport implements NurseDao {

	@Override
	public Nurse getNurseByEmailAndPassword(String email, String password) {
		String hql="from Nurse n where n.email=? and n.password=?";
		Object[] param={email,password};
		List<Nurse> l=getHibernateTemplate().find(hql,param);
		
		return l.isEmpty() || l==null ? null:l.get(0);
	}

}
