package com.ictti.hbc.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.service.AdminPatientListService;
import com.ictti.hbc.presentation.form.AdminForm;

public class AdminPatientListAction extends BaseAction {
	public AdminPatientListService myAdminPatientListService;

	public AdminPatientListService getMyAdminPatientListService() {
		return myAdminPatientListService;
	}

	public void setMyAdminPatientListService(
			AdminPatientListService myAdminPatientListService) {
		this.myAdminPatientListService = myAdminPatientListService;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
HttpSession session = request.getSession(false);
		
		if (session.getAttribute("session_id") == null) {
			return "gotoAdminLoginForm";
		}
		AdminForm myForm = (AdminForm) form;
		myAdminPatientListService.getAllPatient(myForm);
		myForm.setiMaxShow(5);
		return "gotoAdminPatientList";
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
		  myForm.setiMaxShow(5);
		  //if next button, doNext
		  if(null != request.getParameter("Next"))
			  myForm.setActualPage(myForm.getActualPage() + 1);
		  //if prev button, doPrev
		  if(null != request.getParameter("prev"))
			  myForm.setActualPage(myForm.getActualPage() - 1);	  
		 
		return "gotoAdminPatientList";
	}

}
