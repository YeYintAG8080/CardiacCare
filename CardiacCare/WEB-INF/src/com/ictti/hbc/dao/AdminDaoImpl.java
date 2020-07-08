package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Admin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	public Admin getAdminByEmailAndPassword(String frmLoginEmail,
			String frmLoginPassword) {
		String hql = "from Admin n where n.email=? and n.password=?";
		Object[] param = { frmLoginEmail, frmLoginPassword };
		List<Admin> l = getHibernateTemplate().find(hql, param);

		return l.isEmpty() || l == null ? null : l.get(0);
	}

}
