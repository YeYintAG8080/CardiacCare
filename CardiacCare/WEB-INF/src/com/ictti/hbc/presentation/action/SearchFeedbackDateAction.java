package com.ictti.hbc.presentation.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.business.service.AdminPatientFeedbackService;
import com.ictti.hbc.presentation.form.AdminForm;

public class SearchFeedbackDateAction extends BaseAction {
	private AdminPatientFeedbackService myAdminPatientFeedbackService;

	public AdminPatientFeedbackService getMyAdminPatientFeedbackService() {
		return myAdminPatientFeedbackService;
	}

	public void setMyAdminPatientFeedbackService(
			AdminPatientFeedbackService myAdminPatientFeedbackService) {
		this.myAdminPatientFeedbackService = myAdminPatientFeedbackService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
HttpSession session = request.getSession(false);
		
		if (session.getAttribute("session_id") == null) {
			return "gotoAdminLoginForm";
		}
		AdminForm myForm = (AdminForm) form;

		List<Feedback> l = myAdminPatientFeedbackService
				.getSearchFeedback(myForm);
		if (l == null) {
			return "gotoEmpty";
		} 
		else  {
			List<String> pname = new ArrayList<String>();
			for (int i = 0; i < l.size(); i++) {
				String name = l.get(i).getPatient().getPatientName();
				System.out.println(name);
				pname.add(name);
			}
			
			myForm.setFrmFeedbackList(l);
			request.setAttribute("Patient", pname);
			myForm.setBeginP(1);
			myForm.setEndP(l.size());
			myForm.setSerachFeedBackDate(null);
			return "gotoSearchFeedbackList";
		}
		
	}}
