package com.ictti.hbc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Feedback;

public class AdminPatientFeedbackDaoImpl extends HibernateDaoSupport implements
		AdminPatientFeedbackDao {

	public List<Feedback> getPatientListById(int id) {
		String hql = "from Feedback i where i.id like?";
		List<Feedback> l = getHibernateTemplate().find(hql,id);
		return l;
	}

	public List<Feedback> getFeedbackListAll() {
		String hql = "from Feedback i";
		List<Feedback> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l==null?null:l;
	}

	public List<Feedback> getSerachFeedbackList(Date date) {
		String hql="from Feedback i where i.feedbackDate=?";
		List<Feedback> l=getHibernateTemplate().find(hql,date);
		return l==null || l.isEmpty()? null:l;
	}

}
