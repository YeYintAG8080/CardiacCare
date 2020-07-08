package com.ictti.hbc.presentation.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.DoctorForm;

public class DoctorPatientSearchAction extends BaseAction {
	private PatientService myPatientService;
	private DailyRecordService myDailyRecordService;
	private TreatmentService myTreatmentService;
	public void setMyTreatmentService(TreatmentService myTreatmentService) {
		this.myTreatmentService = myTreatmentService;
	}
	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}
	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		return "gotoPatientSearchForm";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		DoctorForm myform=(DoctorForm) form;
		ActionErrors errors=new ActionErrors();
		Patient patient=myPatientService.getPatientByRegisterId(myform.getFrmPatientRegisterId());
		if(patient!=null){
			//Patient Found!
			 
			DailyRecord record=myDailyRecordService.getDailyRecordByPatientIdAndCurrentDate(patient.getId(), new Date());
			 
			 
			myform.setFrmSearchPatientId(String.valueOf(patient.getId()));
			if(record!=null){
				//Medical Record Exit
				myform.setFrmDailyRecord(record);
				Treatment treatment=myTreatmentService.getTreatmentByDailyRecordId(record.getId());
				if(treatment!=null){
					//DoctorForm doctorformbean=(DoctorForm) request.getSession(false).getAttribute("DoctorFormBean");
					myform.setFrmTreatmentId(String.valueOf(treatment.getId()));
				}else{
					//DoctorForm doctorformbean=(DoctorForm) request.getSession(false).getAttribute("DoctorFormBean");
					myform.setFrmTreatmentId(null);
				}
				return "gotoMedicalRecordDetailPage";
			}else{
				//No Medical Record IS PROVIDED BY NURSE
				errors.add("MedicalRecordNotFound",new ActionMessage("errors.MedicalRecordNotFound"));
				saveErrors(request, errors);
				return "gotoPatientSearchForm";
			}
		}else{
			//Patient Not Found!!!
			errors.add("PatientNotFoundError",new ActionMessage("errors.PatientNotFoundError"));
			saveErrors(request, errors);
			return "gotoPatientSearchForm";
		}
	}

}
