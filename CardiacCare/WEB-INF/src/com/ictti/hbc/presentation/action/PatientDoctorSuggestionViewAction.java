package com.ictti.hbc.presentation.action;

import java.util.ArrayList;
import java.util.List;

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

public class PatientDoctorSuggestionViewAction extends BaseAction {
	private DailyRecordService myDailyRecordService;
	private TreatmentService myTreatmentService;
	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}	
	public void setMyTreatmentService(TreatmentService myTreatmentService) {
		this.myTreatmentService = myTreatmentService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoPatientLoginForm";
		}
		List<Treatment> treatmentList=new ArrayList<Treatment>();
		PatientForm patientform=(PatientForm) form;
		
		List<DailyRecord> dailyRecordList=myDailyRecordService.getAllDailyRecordListByPatientId(patientform.getFrmLoginPatient().getId());
		if(dailyRecordList==null)
			System.out.println("lis is null");
		if(dailyRecordList!=null){
			for(DailyRecord dailyRecord:dailyRecordList){
				Treatment treatment=myTreatmentService.getTreatmentByDailyRecordId(dailyRecord.getId());
				if(treatment!=null){
					treatmentList.add(treatment);
				}		
			}
			patientform.setFrmTreatmentList(treatmentList);
			return "gotoDoctorSuggestionPage";
		}else{
			//No daily record
			patientform.setFrmTreatmentList(null);
			return "gotoDoctorSuggestionPage";
		}

	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
