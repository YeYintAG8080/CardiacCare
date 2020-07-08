package com.ictti.hbc.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.DoctorForm;

public class DoctorMedicalRecordAction extends BaseAction {
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
			return "gotoDoctorLoginForm";
		}
		
		if(request.getParameter("frmLinkControl").equals("1")){
			DoctorForm doctorform=(DoctorForm) form;
			DailyRecord record=myDailyRecordService.getDailyRecordById(Integer.parseInt(request.getParameter("frmDailyRecordId")));
			Treatment treatment=myTreatmentService.getTreatmentByDailyRecordId(Integer.parseInt(request.getParameter("frmDailyRecordId")));
			 
			if(treatment!=null){
				doctorform.setFrmTreatmentId(String.valueOf(treatment.getId()));	
			}else{
				doctorform.setFrmTreatmentId(null);	
			}
			doctorform.setFrmMedicalRecordId(request.getParameter("frmDailyRecordId"));
			doctorform.setFrmDailyRecord(record);
			return "gotoMedicalRecordDetailPage";
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
