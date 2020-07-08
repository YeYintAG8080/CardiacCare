package com.ictti.hbc.dao;

import java.util.List;

import com.ictti.hbc.business.entity.Feedback;

public interface AdminSearchFeedbackDao {

	public List<Feedback> getFeedbackByDate(String feedbackDate);

}
