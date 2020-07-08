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

public class ReceptionistHomePageAction extends BaseAction {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		/*Check Session*/
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoReceptionistLoginForm";
		}
		
			ReceptionistForm myForm=(ReceptionistForm) form;
			 
			List<Patient> list=myReceptionistService.getAllPatient();
			if(list!=null){
				myForm.setList(list);
				myForm.setBegin(1);
				myForm.setEnd(list.size());
				return "gotoHome";
			}else{
				return "gotoNoList";
			}
			
	}

	

}
