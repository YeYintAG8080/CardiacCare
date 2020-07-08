package com.ictti.hbc.dao;

import java.util.Date;
import java.util.List;

import com.ictti.hbc.business.entity.Feedback;

public interface AdminPatientFeedbackDao {
	
	public List<Feedback> getPatientListById(int id);
	public List<Feedback> getFeedbackListAll();
	public List<Feedback> getSerachFeedbackList(Date date);

}
