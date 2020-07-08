package com.ictti.hbc.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class SearchOldPatientAction extends BaseAction {

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return "gotoSearch";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		/*Check Session*/
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoReceptionistLoginForm";
		}
		
		return "gotoSearch";
	}
	
	
}
