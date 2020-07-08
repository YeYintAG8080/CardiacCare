package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.Admin;
import com.ictti.hbc.business.service.AdminPatientListService;
import com.ictti.hbc.business.service.AdminService;
import com.ictti.hbc.business.service.PatientReportService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.AdminForm;

public class AdminLoginAction extends BaseAction {

	private AdminService myAdminService;
	private AdminPatientListService myAdminPatientListService;

	public void setMyAdminPatientListService(
			AdminPatientListService myAdminPatientListService) {
		this.myAdminPatientListService = myAdminPatientListService;
	}

	public AdminService getMyAdminService() {
		return myAdminService;
	}

	public void setMyAdminService(AdminService myAdminService) {
		this.myAdminService = myAdminService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		AdminForm myForm = (AdminForm) form;
		

		myForm.setiMaxShow(5);
		// if next button, doNext
		if (null != request.getParameter("Next")) {
			myForm.setActualPage(myForm.getActualPage() + 1);
			return "gotoAdminPatientList";
		} else if (null != request.getParameter("prev")) {
			// if prev button, doPrev
			myForm.setActualPage(myForm.getActualPage() - 1);
			return "gotoAdminPatientList";
		} else {
			Admin admin = myAdminService.getAdminByEmailAndPassword(
					myForm.getFrmLoginEmail(), myForm.getFrmLoginPassword());
			if (admin != null) {
				myForm.setFrmAdminLogin(admin);
				HttpSession session = request.getSession(true);
				session.setAttribute("session_id", session.getId());

				myAdminPatientListService.getAllPatient(myForm);
				myForm.setiMaxShow(5);
				return "gotoAdminPatientList";
			} else {
				ActionErrors errors = new ActionErrors();
				errors.add("frmInvalidUserError", new ActionMessage(
						"errors.invalidUserErrorKey"));
				saveErrors(request, errors);
				return "gotoAdminLoginForm";
			}
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		return "gotoAdminLoginForm";
	}

}
