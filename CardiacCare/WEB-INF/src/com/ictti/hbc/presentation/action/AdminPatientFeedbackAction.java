package com.ictti.hbc.presentation.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.business.service.AdminPatientFeedbackService;
import com.ictti.hbc.presentation.form.AdminForm;

public class AdminPatientFeedbackAction extends BaseAction {
	private AdminPatientFeedbackService myAdminPatientFeedbackService;

	public AdminPatientFeedbackService getMyAdminPatientFeedbackService() {
		return myAdminPatientFeedbackService;
	}

	public void setMyAdminPatientFeedbackService(
			AdminPatientFeedbackService myAdminPatientFeedbackService) {
		this.myAdminPatientFeedbackService = myAdminPatientFeedbackService;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
HttpSession session = request.getSession(false);
		
		if (session.getAttribute("session_id") == null) {
			return "gotoAdminLoginForm";
		}
		AdminForm myForm = (AdminForm) form;
		List<Feedback> l = myAdminPatientFeedbackService.getAllFeedback(myForm);
		/*List<String> lname = new ArrayList<String>();

		for (int i = 0; i < l.size(); i++) {
			String name = l.get(i).getPatient().getPatientName();
			System.out.println(name);
			lname.add(name);
		}*/
		if(l==null || l.isEmpty()){
			myForm.setFrmFeedbackList(null);
		}else{
		myForm.setFrmFeedbackList(l);
		}
		/*request.setAttribute("name", lname);
		myForm.setBeginP(1);
		myForm.setEndP(l.size());*/
		return "gotoAdminPatientFeedback";
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
		List<Feedback> l = myAdminPatientFeedbackService.getAllFeedback(myForm);
		/*if (myForm == null) {
			myForm.getFrmFeedbackDate();
			return "gotoSearchFeedbackList";
		}*/if (l == null) {
			return "gotoEmpty";
		} else{
			myForm.getFrmFeedbackDate();
		}
			myForm.setFrmFeedbackList(l);
			/*request.setAttribute("Patient", lname)*/;
			/*myForm.setBeginP(1);
			myForm.setEndP(l.size());*/
			myForm.setSerachFeedBackDate(null);
			return "gotoSearchFeedbackList";
		}  
	}

