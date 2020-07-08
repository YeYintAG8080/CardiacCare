package com.ictti.hbc.presentation.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.PatientForm;

public class PatientDailyMedicalRecordAction extends BaseAction {
	private DailyRecordService myDailyRecordService;
	private TreatmentService myTreatmentService;

	public void setMyTreatmentService(TreatmentService myTreatmentService) {
		this.myTreatmentService = myTreatmentService;
	}

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

		if (request.getParameter("frmLinkControl").equals("2")) {
			// Medical Record Hist(List) to Detail Medical Record Page
			PatientForm patientform = (PatientForm) form;
			DailyRecord dailyrecord = myDailyRecordService
					.getDailyRecordById(Integer.parseInt(request
							.getParameter("frmDailyRecordId")));
			if (dailyrecord != null) {
				Treatment treatment = myTreatmentService
						.getTreatmentByDailyRecordId(dailyrecord.getId());

				if (treatment != null) {
					patientform.setFrmTreatmentId(String.valueOf(treatment
							.getId()));
				} else {
					patientform.setFrmTreatmentId(null);
				}
				patientform.setFrmDailyRecord(dailyrecord);
				return "gotoPatientDailyRecordForm";
			} else {
				return "gotoMedicalRecordNotCreatedPage";
			}
		} else if(request.getParameter("frmLinkControl").equals("1")){
			// Medical Record for today
			PatientForm patientform = (PatientForm) form;
			DailyRecord dailyrecord = myDailyRecordService
					.getDailyRecordByPatientIdAndCurrentDate(patientform
							.getFrmLoginPatient().getId(), new Date());
			if (dailyrecord != null) {
				Treatment treatment = myTreatmentService
						.getTreatmentByDailyRecordId(dailyrecord.getId());

				if (treatment != null) {
					patientform.setFrmTreatmentId(String.valueOf(treatment
							.getId()));
				} else {
					patientform.setFrmTreatmentId(null);
				}
				patientform.setFrmDailyRecord(dailyrecord);
				return "gotoPatientDailyRecordForm";
			} else {
				return "gotoMedicalRecordNotCreatedPage";
			}
		}
		return null;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
