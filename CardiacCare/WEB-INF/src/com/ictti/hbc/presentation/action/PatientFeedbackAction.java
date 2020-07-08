package com.ictti.hbc.presentation.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.FeedbackService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.PatientForm;

public class PatientFeedbackAction extends BaseAction {
	private PatientService myPatientService;
	private FeedbackService myFeedbackService;
	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}
	public void setMyFeedbackService(FeedbackService myFeedbackService) {
		this.myFeedbackService = myFeedbackService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoPatientLoginForm";
		}
		return "gotoFeedBackForm";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoPatientLoginForm";
		}
		PatientForm patientfeedbackform=(PatientForm) form;
		PatientForm patientformbean=(PatientForm) request.getSession(false).getAttribute("PatientFormBean");
		Patient loginPatient=patientformbean.getFrmLoginPatient();
		
		String inputtimeString=new SimpleDateFormat("HH:mm:ss").format(new Date());
		Date inputtime=new SimpleDateFormat("HH:mm:ss").parse(inputtimeString);
		
		Feedback feedback=new Feedback();
		feedback.setFeedbackDate(new Date());
		feedback.setFeedbackTimestamp(inputtime);
		feedback.setFeedback(patientfeedbackform.getFrmPatientFeedback());
		feedback.setPatient(loginPatient);
		myFeedbackService.savePatientFeedback(feedback);
		
		patientfeedbackform.setFrmPatientFeedback(null);
		return "gotoFeedBackForm";
	}

}
