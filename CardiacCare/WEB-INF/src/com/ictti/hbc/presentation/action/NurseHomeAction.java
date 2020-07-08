package com.ictti.hbc.presentation.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import com.ictti.hbc.presentation.form.NurseForm;

public class NurseHomeAction extends BaseAction {
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
			return "gotoNurseLoginForm";
		}

		if (request.getParameter("frmLinkControl").equals("1")) {
			NurseForm myform = (NurseForm) form;
			List<Patient> l = myPatientService.getPatientList();
			myform.setFrmPatientList(l);
			return "gotoNurseHome";
		} else if (request.getParameter("frmLinkControl").equals("2")) {
			NurseForm myform = (NurseForm) form;
			Patient patient = myPatientService.getPatientInfoDetailById(Integer
					.parseInt(myform.getFrmPatientDetailLinkId()));
			myform.setFrmPatient(patient);
			return "gotoPatientInfoForm";
		} else if (request.getParameter("frmLinkControl").equals("3")) {
			//Home Page (Patient List) -> Medical record List 
			NurseForm myform = (NurseForm) form;
			List<DailyRecord> l = null;

			l = myDailyRecordService.getAllDailyRecordListByPatientId(Integer
					.parseInt(myform.getFrmPatientMedicalRecordLinkId()));

			if (l != null) {
				SimpleDateFormat myformat = new SimpleDateFormat("MM-dd-yyyy");
				Date todayDate = Calendar.getInstance().getTime();
				String strTodayDate = myformat.format(todayDate);
				String strRetrieveDate = myformat.format(l.get(0)
						.getAttemptDate());

				if (strTodayDate.equals(strRetrieveDate)) {

					myform.setFrmHaveTodayMedicalRecord("1");

				} else {
					myform.setFrmHaveTodayMedicalRecord(null);
				}

				myform.setFrmDailyRecordList(l);
				if (session.getAttribute("NurseCreateRecordFormBean") != null) {
					session.removeAttribute("NurseCreateRecordFormBean");// ** not to
																// conflit with
																// this bean in
																// later
				}
				return "gotoDailyRecordListForm";
			} else {
				myform.setFrmHaveTodayMedicalRecord(null);
				myform.setFrmDailyRecordList(null);
				if (session.getAttribute("NurseCreateRecordFormBean") != null) {
					session.removeAttribute("NurseCreateRecordFormBean");// ** not to
																// conflit with
																// this bean in
																// later
				}
				return "gotoDailyRecordListForm";
			}
		}else if (request.getParameter("frmLinkControl").equals("4")) {
			//Medical Record Create Page (Click Cancel Btn) -> Medical Record List for particular patient id;
			//Use NurseCreateRecordFormBean
			NurseForm myform = (NurseForm) form;
			List<DailyRecord> l = null;

			l = myDailyRecordService.getAllDailyRecordListByPatientId(Integer.parseInt(request.getParameter("patientId")));

			if (l != null) {
				SimpleDateFormat myformat = new SimpleDateFormat("MM-dd-yyyy");
				Date todayDate = Calendar.getInstance().getTime();
				String strTodayDate = myformat.format(todayDate);
				String strRetrieveDate = myformat.format(l.get(0)
						.getAttemptDate());

				if (strTodayDate.equals(strRetrieveDate)) {

					myform.setFrmHaveTodayMedicalRecord("1");

				} else {
					myform.setFrmHaveTodayMedicalRecord(null);
				}
				
				myform.setFrmDailyRecordList(l);
				 
				if (session.getAttribute("NurseFormBean") != null) {
					session.removeAttribute("NurseFormBean");// ** not to
																// conflit with
																// this bean in
																// later
				}
				
				return "gotoDailyRecordListForm";
			} else {
				myform.setFrmHaveTodayMedicalRecord(null);
				myform.setFrmDailyRecordList(null);
				if (session.getAttribute("NurseFormBean") != null) {
					session.removeAttribute("NurseFormBean");// ** not to
																// conflit with
																// this bean in
																// later
				}
				return "gotoDailyRecordListForm";
			}
		}

		return null;

	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoNurseLoginForm";
		}
		if (request.getParameter("frmBtnSearch") != null) {
			NurseForm myform = (NurseForm) form;
			List<Patient> l = myPatientService
					.getPatientListByRegisterId(myform.getFrmRegisterId());
			myform.setFrmPatientList(l);
			return "gotoNurseHome";
		}
		return null;
	}

}
