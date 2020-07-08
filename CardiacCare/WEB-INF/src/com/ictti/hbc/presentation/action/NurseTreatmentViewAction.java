package com.ictti.hbc.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.InjectionDoseService;
import com.ictti.hbc.business.service.MedicineService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.NurseForm;

public class NurseTreatmentViewAction extends BaseAction {
	private TreatmentService myTreatmentService;

	private MedicineService myMedicineService;
	private InjectionDoseService myInjectionDoseService;

	public void setMyTreatmentService(TreatmentService myTreatmentService) {
		this.myTreatmentService = myTreatmentService;
	}

	public void setMyMedicineService(MedicineService myMedicineService) {
		this.myMedicineService = myMedicineService;
	}

	public void setMyInjectionDoseService(
			InjectionDoseService myInjectionDoseService) {
		this.myInjectionDoseService = myInjectionDoseService;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		NurseForm myform = (NurseForm) form;
		if (session.getAttribute("session_id") == null) {
			return "gotoNurseLoginForm";
		}

		Treatment treatment = myTreatmentService
				.getTreatmentByDailyRecordId(Integer.parseInt(myform
						.getFrmDailyRecordId()));
		if (treatment != null) {
			List<InjectionDose> injectionList = myInjectionDoseService
					.getInjectionListByTreatmentId(treatment.getId());
			List<Medicine> medicineList = myMedicineService
					.getMedicineListByTreatmentId(treatment.getId());

			myform.setFrmTreatment(treatment);
			myform.setFrmInjectionDoseList(injectionList);
			myform.setFrmMedicineList(medicineList);

			return "gotoTreatmentForm";
		} else {
			ActionErrors errors=new ActionErrors();
			errors.add("TreatmentNotProvidedErr", new ActionMessage("errors.TreatmentNotProvidedErrorKey"));
			saveErrors(request, errors);
			return "gotoTreatmentNotProvidedForm";
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
