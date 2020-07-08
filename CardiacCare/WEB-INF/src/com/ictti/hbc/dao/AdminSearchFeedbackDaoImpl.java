package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Feedback;

public class AdminSearchFeedbackDaoImpl extends HibernateDaoSupport implements
		AdminSearchFeedbackDao {

	public List<Feedback> getFeedbackByDate(String feedbackDate) {
		String hql = "from Feedback f where f.feedbackDate=?";
		List<Feedback> l = getHibernateTemplate().find(hql,feedbackDate.trim());
		return l.isEmpty() || l==null? null:l;
	}

}
