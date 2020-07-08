package com.ictti.hbc.presentation.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.PatientForm;

public class PatientLoginAction extends BaseAction {
	private PatientService myPatientService;
	
	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		return "gotoPatientLoginForm";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		 	PatientForm patientform=(PatientForm) form;
		 	Patient loginPatient=myPatientService.getPatientByEmailAndPassword(patientform.getFrmLoginEmail(), patientform.getFrmLoginPassword());
		 	if(loginPatient!=null){
		 		patientform.setFrmLoginPatient(loginPatient);
				HttpSession session=request.getSession(true);
				session.setAttribute("session_id", session.getId());
	 
				return "gotoPatientProfile";
			}else{
				ActionErrors errors=new ActionErrors();
				errors.add("frmInvalidUserError", new ActionMessage("errors.invalidUserErrorKey"));
				saveErrors(request, errors);
				return "gotoPatientLoginForm";
			}
	}

}
