package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.ReceptionistService;
import com.ictti.hbc.presentation.form.ReceptionistForm;

public class SearchPatientByIdAction extends BaseAction {
private ReceptionistService myReceptionistService;


	public ReceptionistService getMyReceptionistService() {
	return myReceptionistService;
}


public void setMyReceptionistService(ReceptionistService myReceptionistService) {
	this.myReceptionistService = myReceptionistService;
}


	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoReceptionistLoginForm";
		}
		ReceptionistForm myForm=(ReceptionistForm) form;
		Patient patient=myReceptionistService.getPatientById(myForm.getSerachPatient());
		if(patient==null){
			
			return "gotoEmpty";
				
		}else{
			myForm.setRegPateint(patient);
			request.setAttribute("patient", patient);
			myForm.setSerachPatient(null);
			return "gotoHome";
		}
		
		
	}
	
}
