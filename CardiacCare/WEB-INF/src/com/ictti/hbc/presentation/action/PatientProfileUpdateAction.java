package com.ictti.hbc.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.PatientForm;

public class PatientProfileUpdateAction extends BaseAction {
	private PatientService myPatientService;
	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoPatientLoginForm";
		}
		
		if(request.getParameter("frmLinkControl").equals("1")){
			PatientForm patientformbean=(PatientForm) request.getSession(false).getAttribute("PatientFormBean");
			Patient loginPatient=patientformbean.getFrmLoginPatient();
			
			PatientForm myForm=(PatientForm) form;
			myForm.setFrmLoginPatient(loginPatient);
			myForm.setFrmUpdateWeight(loginPatient.getWeight());
			myForm.setFrmUpdatePhone(loginPatient.getPhone());
			myForm.setFrmUpdateAddress(loginPatient.getAddress());
			myForm.setFrmEditFormControl(null);
			return "gotoUpdateProfilePage";
		}else if(request.getParameter("frmLinkControl").equals("2")){
			PatientForm patientformbean=(PatientForm) request.getSession(false).getAttribute("PatientFormBean");
			Patient loginPatient=patientformbean.getFrmLoginPatient();
			
			PatientForm myForm=(PatientForm) form;
			myForm.setFrmLoginPatient(loginPatient);
			myForm.setFrmUpdateWeight(loginPatient.getWeight());
			myForm.setFrmUpdatePhone(loginPatient.getPhone());
			myForm.setFrmUpdateAddress(loginPatient.getAddress());
			myForm.setFrmEditFormControl(null);
			return "gotoUpdateProfilePage";
		}
		return null;
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			 
			return "gotoPatientLoginForm";
		}
		PatientForm myForm=(PatientForm) form;
		if(request.getParameter("btnUpdateProfile")!=null){
			//goto confirm page
			myForm.setFrmEditFormControl("data");
			return "gotoUpdateProfilePage";
		}else if(request.getParameter("btnUpdateConfirm")!=null){
			PatientForm patientformbean=(PatientForm) request.getSession(false).getAttribute("PatientFormBean");
			Patient loginPatient=patientformbean.getFrmLoginPatient();
			
			if(myForm.getFrmUpdateWeight()!=null){
				loginPatient.setWeight(myForm.getFrmUpdateWeight());
			}
			if(myForm.getFrmUpdatePhone()!=null){
				System.out.println(myForm.getFrmUpdatePhone());
				loginPatient.setPhone(myForm.getFrmUpdatePhone());
			}
			if(myForm.getFrmUpdateAddress()!=null){
				loginPatient.setAddress(myForm.getFrmUpdateAddress());
			}
			
			myPatientService.updatePatientProfile(loginPatient);
			myForm.setFrmEditFormControl("data");
			
			Patient newLoginPatient=myPatientService.getPatientByEmailAndPassword(loginPatient.getEmail(), loginPatient.getPassword());
			patientformbean.setFrmLoginPatient(newLoginPatient);
			return "gotoPatientProfilePage";
		}
		return null;
		
	}

}
