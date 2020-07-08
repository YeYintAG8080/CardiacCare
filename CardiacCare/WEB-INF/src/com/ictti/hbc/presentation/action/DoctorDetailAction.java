package com.ictti.hbc.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.business.service.DoctorService;
 
import com.ictti.hbc.presentation.form.DoctorTeamForm;

public class DoctorDetailAction extends BaseAction {
	private DoctorService myDoctorService;
	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		DoctorTeamForm doctorTeamForm=(DoctorTeamForm) form;
		Doctor doctor=myDoctorService.getDoctorInfoByDoctorId(Integer.parseInt(request.getParameter("doctorId")));
		doctorTeamForm.setFrmDoctorDetail(doctor);
		return "gotoDoctorDetailPage";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
