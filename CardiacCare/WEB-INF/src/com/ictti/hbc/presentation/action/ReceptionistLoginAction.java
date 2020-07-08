package com.ictti.hbc.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.Receptionist;
import com.ictti.hbc.business.service.ReceptionistService;
import com.ictti.hbc.presentation.form.ReceptionistForm;

public class ReceptionistLoginAction extends BaseAction {
	private ReceptionistService myReceptionistService;
	public void setMyReceptionistService(ReceptionistService myReceptionistService) {
		this.myReceptionistService = myReceptionistService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		return "gotoReceptionistLoginForm";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		ReceptionistForm myForm=(ReceptionistForm) form;
		Receptionist recept=myReceptionistService.getRecptionistLoginByEmailandPassword(myForm.getFrmRepLoginEmail(),myForm.getFrmRepLoginPassword());
		if(recept !=null){
			myForm.setLoginReceptionist(recept);
			HttpSession session=request.getSession(true);
			session.setAttribute("session_id", request.getSession().getId());

			return "gotoReceptionistHome";
			
		}else{
			ActionErrors errors = new ActionErrors();
			errors.add("frmInvalidUserError", new ActionMessage(
					"errors.invalidUserErrorKey"));
			saveErrors(request, errors);
			return "gotoReceptionistLoginForm";
		}
	}

}
