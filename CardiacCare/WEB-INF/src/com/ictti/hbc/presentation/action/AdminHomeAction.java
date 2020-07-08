package com.ictti.hbc.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.presentation.form.AdminForm;

public class AdminHomeAction extends BaseAction {

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
HttpSession session = request.getSession(false);
		
		if (session.getAttribute("session_id") == null) {
			return "gotoAdminLoginForm";
		}
		return "gotoAdminHome";
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
		return null;
	}

}
