package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.InjectionDoseService;
import com.ictti.hbc.business.service.MedicineService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.DoctorForm;

public class DoctorTreatmentAction extends BaseAction {
	private TreatmentService myTreatmentService;
	private InjectionDoseService myInjectionDoseService;
	private MedicineService myMedicineService;
	public void setMyTreatmentService(TreatmentService myTreatmentService) {
		this.myTreatmentService = myTreatmentService;
	}
	public void setMyInjectionDoseService(
			InjectionDoseService myInjectionDoseService) {
		this.myInjectionDoseService = myInjectionDoseService;
	}
	public void setMyMedicineService(MedicineService myMedicineService) {
		this.myMedicineService = myMedicineService;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		DoctorForm doctorform=(DoctorForm) form;
		Treatment treatmentHistory=myTreatmentService.getTreatmentByDailyRecordId(Integer.parseInt(request.getParameter("medicalrecordId")));
		if(treatmentHistory==null){
			return "gotoTreatmentNotProvidedPage";
		}else{
			List<InjectionDose> injectionList = myInjectionDoseService
					.getInjectionListByTreatmentId(treatmentHistory.getId());
			List<Medicine> medicineList = myMedicineService
					.getMedicineListByTreatmentId(treatmentHistory.getId());	
			doctorform.setFrmTreatment(treatmentHistory);
			doctorform.setFrmInjectionDoseList(injectionList);
			doctorform.setFrmMedicineList(medicineList);
	
			return "gotoTreatmentHistoryPage";
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
