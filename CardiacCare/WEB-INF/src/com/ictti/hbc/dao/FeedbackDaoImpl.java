package com.ictti.hbc.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Feedback;

public class FeedbackDaoImpl extends HibernateDaoSupport implements FeedbackDao {

	@Override
	public void savePatientFeedBack(Feedback feedback) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(feedback);
	}

}
