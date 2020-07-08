package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.business.entity.Nurse;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.DoctorService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.DoctorForm;
import com.ictti.hbc.presentation.form.NurseForm;

public class DoctorLoginAction extends BaseAction {
	private DoctorService myDoctorService;
	private PatientService myPatientService;

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		 
		return "gotoDoctorLoginForm";
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		DoctorForm myform = (DoctorForm) form;
		Doctor doctor = myDoctorService.getDoctorByEmailAndPassword(
				myform.getFrmLoginEmail(), myform.getFrmLoginPassword());

		if (doctor != null) {
			myform.setFrmLoginDoctor(doctor);
			HttpSession session = request.getSession(true);
			session.setAttribute("session_id", session.getId());

			if(doctor.getProfileFill().equals("0")){
				 
				 return "gotoDoctorProfileFillForm";
 
			}else if(doctor.getProfileFill().equals("1")){
				List<Patient> l = myPatientService.getPatientList();
				myform.setFrmPatientList(l);
				return "gotoPatientList";
			}
			
		} else {
			ActionErrors errors = new ActionErrors();
			errors.add("frmInvalidUserError", new ActionMessage(
					"errors.invalidUserErrorKey"));
			saveErrors(request, errors);
			return "gotoDoctorLoginForm";
		}
		return null;
	}

}
