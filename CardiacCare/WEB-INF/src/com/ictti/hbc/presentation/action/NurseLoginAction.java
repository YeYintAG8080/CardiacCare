package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.Nurse;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.NurseService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.NurseForm;

public class NurseLoginAction extends BaseAction {
	private NurseService myNurseService;
	private PatientService myPatientService;
	
	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}
	public void setMyNurseService(NurseService myNurseService) {
		this.myNurseService = myNurseService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		return "gotoNurseLoginForm";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		NurseForm myform=(NurseForm) form;
		Nurse nurse=myNurseService.getNurseByEmailAndPassword(myform.getFrmLoginEmail(), myform.getFrmLoginPassword());
		
		if(nurse!=null){
			myform.setFrmLoginNurse(nurse);
			HttpSession session=request.getSession(true);
			session.setAttribute("session_id", session.getId());
 
			List<Patient> l = myPatientService.getPatientList();
			myform.setFrmPatientList(l);
			return "gotoNurseHome";
		}else{
			ActionErrors errors=new ActionErrors();
			errors.add("frmInvalidUserError", new ActionMessage("errors.invalidUserErrorKey"));
			saveErrors(request, errors);
			return "gotoNurseLoginForm";
		}
 	}

}
