package com.ictti.hbc.business.service;

import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.dao.FeedbackDao;

public class FeedbackService {
	private FeedbackDao myFeedbackDao;

	public void setMyFeedbackDao(FeedbackDao myFeedbackDao) {
		this.myFeedbackDao = myFeedbackDao;
	}
	public void savePatientFeedback(Feedback feedback){
		myFeedbackDao.savePatientFeedBack(feedback);
	}
}
