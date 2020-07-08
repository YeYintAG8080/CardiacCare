package com.ictti.hbc.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.dao.AdminPatientFeedbackDao;
import com.ictti.hbc.presentation.form.AdminForm;

public class AdminPatientFeedbackService {

	private AdminPatientFeedbackDao myAdminPatientFeedbackDao;

	public AdminPatientFeedbackDao getMyAdminPatientFeedbackDao() {
		return myAdminPatientFeedbackDao;
	}

	public void setMyAdminPatientFeedbackDao(
			AdminPatientFeedbackDao myAdminPatientFeedbackDao) {
		this.myAdminPatientFeedbackDao = myAdminPatientFeedbackDao;
	}

	public List<Feedback> getAllFeedback(AdminForm myForm) {
		List<Feedback> l = myAdminPatientFeedbackDao.getFeedbackListAll();
		return l;
	}

	public List<Feedback> getSearchFeedback(AdminForm myForm)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if(myForm.getSerachFeedBackDate().equals("")){
			return null;
		}else{
			Date date = format.parse(myForm.getSerachFeedBackDate());

			return myAdminPatientFeedbackDao.getSerachFeedbackList(date);
		}
		

	}

}
