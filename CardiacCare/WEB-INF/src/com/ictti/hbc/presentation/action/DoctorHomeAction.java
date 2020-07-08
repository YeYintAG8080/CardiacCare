package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.DoctorForm;

public class DoctorHomeAction extends BaseAction {
	private PatientService myPatientService;
	private DailyRecordService myDailyRecordService;
	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}
	
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		
		if (request.getParameter("frmLinkControl").equals("1")) {
			DoctorForm myform = (DoctorForm) form;
			List<Patient> l = myPatientService.getPatientList();
			myform.setFrmPatientList(l);
			return "gotoPatientList";
		}else if(request.getParameter("frmLinkControl").equals("2")){
			DoctorForm myform = (DoctorForm) form;
			Patient patient = myPatientService.getPatientInfoDetailById(Integer
					.parseInt(request.getParameter("frmPatientDetailLinkId")));
			myform.setFrmPatient(patient);
			return "gotoPatientDetailInfoPage";
		}else if(request.getParameter("frmLinkControl").equals("3")){
			DoctorForm myform = (DoctorForm) form;
			List<DailyRecord> l=myDailyRecordService.getAllDailyRecordListByPatientId(Integer
					.parseInt(request.getParameter("frmPatientMedicalRecordLinkId")));
			myform.setFrmDailyRecordList(l);
			return "gotoPatientMedicalRecordListPage";
		}
		
		
		return null;
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
				return null;
		
	}

}
