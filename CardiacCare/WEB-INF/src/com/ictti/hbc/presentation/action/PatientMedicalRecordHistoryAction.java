package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.presentation.form.DoctorForm;
import com.ictti.hbc.presentation.form.PatientForm;

public class PatientMedicalRecordHistoryAction extends BaseAction {
	private DailyRecordService myDailyRecordService;
	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoPatientLoginForm";
		}
		PatientForm patientform = (PatientForm) form;
		List<DailyRecord> l=myDailyRecordService.getAllDailyRecordListByPatientId(patientform.getFrmLoginPatient().getId());
		patientform.setFrmDailyRecordList(l);
		return "gotoPatientMedicalRecordListPage";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
