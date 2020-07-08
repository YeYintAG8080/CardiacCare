package com.ictti.hbc.presentation.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.InjectionDoseService;
import com.ictti.hbc.business.service.MedicineService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.DoctorForm;
import com.ictti.hbc.util.InputInjection;
import com.ictti.hbc.util.InputMedicine;

public class DoctorAddTreatmentAction extends BaseAction {
	private DailyRecordService myDailyRecordService;
	private TreatmentService myTreatmentService;
	private InjectionDoseService myInjectionDoseService;
	private MedicineService myMedicineService;
	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}
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
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		DoctorForm doctoraddtreatmentformbean=(DoctorForm) request.getSession(false).getAttribute("DoctorAddTreatmentFormBean");
		doctoraddtreatmentformbean.setFrmAddTreatmentFormControl(null);//fresh buffer
		return "gotoAddTreatmentForm";
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		if(request.getParameter("saveBtn")!=null){
		//add treatment page to confirm page
		DoctorForm doctorform=(DoctorForm) form;
		List<InputInjection> inputInjectionList=new ArrayList<>();
		List<InputMedicine> inputMedicineList=new ArrayList<>();
 
		for(int i=0;i<=30;i++){
			if(request.getParameter("injection-name"+String.valueOf(i))==null && request.getParameter("injection-level"+String.valueOf(i))==null && request.getParameter("injection-time"+String.valueOf(i))==null){
				continue;
			}
			try{
			InputInjection inputInjection=new InputInjection();
			Date inputdate=new SimpleDateFormat("HH:mm").parse(request.getParameter("injection-time"+String.valueOf(i)));
			inputdate.setSeconds(0);
			
			inputInjection.setInputInjectionNames(request.getParameter("injection-name"+String.valueOf(i)));
			inputInjection.setInputInjectionLevels(request.getParameter("injection-level"+String.valueOf(i)));
			inputInjection.setInputInjectionTimes(inputdate);
			
			inputInjectionList.add(inputInjection);
			}catch(ParseException pe){
				System.out.println(pe.getMessage());
			}
		}
		
		for(int i=0;i<=30;i++){
			if(request.getParameter("medicine-name"+String.valueOf(i))==null && request.getParameter("medication-time"+String.valueOf(i))==null){
				continue;
			}
			InputMedicine inputMedicine=new InputMedicine(); 
			String[] checkBoxValues=request.getParameterValues("medication-time"+String.valueOf(i));
			String[] times={"0","0","0"};
			for(String time:checkBoxValues){
				if(time.equals("Morning"))
					times[0]="1";
				else if(time.equals("Afternoon"))
					times[1]="1";
				else if(time.equals("Evening"))
					times[2]="1";
			}
			inputMedicine.setInputMedicineNames(request.getParameter("medicine-name"+String.valueOf(i))); 			
			inputMedicine.setInputMedicationTimes(times[0]+times[1]+times[2]);
			inputMedicineList.add(inputMedicine);
		}

		doctorform.setFrmInputInjectionList(inputInjectionList);
		doctorform.setFrmInputMedicineList(inputMedicineList);
		doctorform.setFrmAddTreatmentFormControl("1");
		return "gotoAddTreatmentForm";
		}
		else if(request.getParameter("confirmBtn")!=null){
		//confirm page to treatment page
			 
			DoctorForm doctorpatientsearchformbean=(DoctorForm) session.getAttribute("DoctorPatientSearchFormBean");
			DoctorForm doctorformbean=(DoctorForm) session.getAttribute("DoctorFormBean");
			System.out.println(doctorformbean.getFrmMedicalRecordId());
			//
			DailyRecord medicalrecord=null;
			if(doctorformbean.getFrmMedicalRecordId()!=null){
				medicalrecord=myDailyRecordService.getDailyRecordById(Integer.parseInt(doctorformbean.getFrmMedicalRecordId()));
			}else if(doctorpatientsearchformbean.getFrmSearchPatientId()!=null){
				medicalrecord=myDailyRecordService.getDailyRecordByPatientIdAndCurrentDate(Integer.parseInt(doctorpatientsearchformbean.getFrmSearchPatientId()), new Date());
			}
			int medicalrecord_id=medicalrecord.getId();
			 
			DoctorForm doctorform=(DoctorForm) form;
			doctorform.setFrmAddTreatmentFormControl(null);	
			
			DailyRecord record=myDailyRecordService.getDailyRecordById(medicalrecord_id);
			Treatment treatment=new Treatment();
			treatment.setTreatmentDate(new Date());
			treatment.setSuggestion(doctorform.getFrmDoctorSuggestion());
			
			treatment.setDoctor(doctorformbean.getFrmLoginDoctor());
			treatment.setDailyRecord(record);
			myTreatmentService.saveNewTreatment(treatment);
			
			Treatment dbTreatment=myTreatmentService.getTreatmentByDailyRecordId(medicalrecord_id);
			
			List<InputInjection> inputInjectionList=doctorform.getFrmInputInjectionList();
			for(InputInjection inputInjection:inputInjectionList){
				InjectionDose injection=new InjectionDose();
				injection.setInjectionDoseName(inputInjection.getInputInjectionNames());
				injection.setInjectionLevel(inputInjection.getInputInjectionLevels());
				injection.setInjectionStartTime(inputInjection.getInputInjectionTimes());
				injection.setComplete("0");
				injection.setTreatment(dbTreatment);
				myInjectionDoseService.saveNewInjectionDose(injection);
			}
			doctorform.setFrmInputInjectionList(null);//refresh buffer after insert
			
			List<InputMedicine> inputMedicineList=doctorform.getFrmInputMedicineList();
			for(InputMedicine inputMedicine:inputMedicineList){
				Medicine medicine=new Medicine();
				medicine.setMedicineName(inputMedicine.getInputMedicineNames());
				medicine.setMedicationTimes(inputMedicine.getInputMedicationTimes());
				medicine.setTreatment(dbTreatment);
				myMedicineService.saveMedicine(medicine);
			}
			doctorform.setFrmInputMedicineList(null);//fresh buffer after insert
			doctorform.setFrmDoctorSuggestion(null);//fresh buffer
			doctorform.setFrmAddTreatmentFormControl(null);//fresh buffer
			
			Treatment treatmentHistory=myTreatmentService.getTreatmentByDailyRecordId(medicalrecord_id);
			List<InjectionDose> injectionList = myInjectionDoseService
					.getInjectionListByTreatmentId(treatmentHistory.getId());
			List<Medicine> medicineList = myMedicineService
					.getMedicineListByTreatmentId(treatmentHistory.getId());
			 
			doctorformbean.setFrmTreatment(treatmentHistory);
			doctorformbean.setFrmInjectionDoseList(injectionList);
			doctorformbean.setFrmMedicineList(medicineList);
			
			if(doctorformbean.getFrmMedicalRecordId()!=null){
				doctorformbean.setFrmMedicalRecordId(null);
			}else if(doctorpatientsearchformbean.getFrmSearchPatientId()!=null){
				doctorpatientsearchformbean.setFrmSearchPatientId(null);
			}
			return "gotoTreatmentHistoryPage";
		}else if(request.getParameter("ConfirmCancelBtn")!=null){
			DoctorForm doctorform=(DoctorForm) form;
			doctorform.setFrmInputMedicineList(null);//fresh buffer after insert
			doctorform.setFrmDoctorSuggestion(null);//fresh buffer
			doctorform.setFrmAddTreatmentFormControl(null);//fresh buffer
			return "gotoAddTreatmentForm";
		}
		return null;
	}
}
