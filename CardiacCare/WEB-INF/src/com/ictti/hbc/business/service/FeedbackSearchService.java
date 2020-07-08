package com.ictti.hbc.business.service;

import java.util.List;

import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.dao.AdminSearchFeedbackDao;

public class FeedbackSearchService {
	private AdminSearchFeedbackDao myAdminSearchFeedbackDao;

	public AdminSearchFeedbackDao getMyAdminSearchFeedbackDao() {
		return myAdminSearchFeedbackDao;
	}

	public void setMyAdminSearchFeedbackDao(
			AdminSearchFeedbackDao myAdminSearchFeedbackDao) {
		this.myAdminSearchFeedbackDao = myAdminSearchFeedbackDao;
	}

	public List<Feedback> getFeedbackbyDate(String feedbackDate) {
		return myAdminSearchFeedbackDao.getFeedbackByDate(feedbackDate) ;
	}

}
