package com.ictti.hbc.presentation.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.InjectionDoseService;
import com.ictti.hbc.business.service.MedicineService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.PatientForm;

public class PatientTreatmentViewAction extends BaseAction {
	private DailyRecordService myDailyRecordService;

	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}

	private TreatmentService myTreatmentService;
	private InjectionDoseService myInjectionDoseService;
	private MedicineService myMedicineService;

	public void setMyInjectionDoseService(
			InjectionDoseService myInjectionDoseService) {
		this.myInjectionDoseService = myInjectionDoseService;
	}

	public void setMyMedicineService(MedicineService myMedicineService) {
		this.myMedicineService = myMedicineService;
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
		if (request.getParameter("frmLinkControl").equals("1")) {
			PatientForm patientform = (PatientForm) form;
			System.out.println(patientform.getFrmLoginPatient().getId());
			DailyRecord medicalRecord = myDailyRecordService
					.getDailyRecordByPatientIdAndCurrentDate(patientform
							.getFrmLoginPatient().getId(), new Date());
			if (medicalRecord != null) {
				Treatment treatment = myTreatmentService
						.getTreatmentByDailyRecordId(medicalRecord.getId());

				if (treatment != null) {
					List<InjectionDose> injectionList = myInjectionDoseService
							.getInjectionListByTreatmentId(treatment.getId());
					List<Medicine> medicineList = myMedicineService
							.getMedicineListByTreatmentId(treatment.getId());

					patientform.setFrmTreatment(treatment);
					patientform.setFrmInjectionDoseList(injectionList);
					patientform.setFrmMedicineList(medicineList);

					return "gotoDailyTreatmentPage";
				} else {
					return "gotoTreatmentNotCreatedPage";
				}
			}else{
				 
					return "gotoTreatmentNotCreatedPage";
				 
			}
		} else if (request.getParameter("frmLinkControl").equals("2")) {
			PatientForm patientform = (PatientForm) form;
			Treatment treatment = myTreatmentService
					.getTreatmentByDailyRecordId(Integer.parseInt(request
							.getParameter("medicalrecordId")));
			if (treatment != null) {
				List<InjectionDose> injectionList = myInjectionDoseService
						.getInjectionListByTreatmentId(treatment.getId());
				List<Medicine> medicineList = myMedicineService
						.getMedicineListByTreatmentId(treatment.getId());

				patientform.setFrmTreatment(treatment);
				patientform.setFrmInjectionDoseList(injectionList);
				patientform.setFrmMedicineList(medicineList);

				return "gotoDailyTreatmentPage";
			} else {
				return "gotoTreatmentNotCreatedPage";
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
