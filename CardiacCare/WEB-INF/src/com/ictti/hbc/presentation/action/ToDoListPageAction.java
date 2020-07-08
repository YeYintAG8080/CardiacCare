package com.ictti.hbc.presentation.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
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
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.entity.Treatment;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.InjectionDoseService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.business.service.TreatmentService;
import com.ictti.hbc.presentation.form.NurseForm;

public class ToDoListPageAction extends BaseAction {
	private PatientService myPatientService;
	private DailyRecordService myDailyRecordService;
	private TreatmentService myTreatmentService;
	private InjectionDoseService myInjectionDoseService;

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
		NurseForm myform = (NurseForm) form;
		if(request.getParameter("frmLinkControl")!=null){
		if (request.getParameter("frmLinkControl").equals("1")) {
			// To do list page Loading

			List<Patient> l = myPatientService.getPatientList();
			
			myform.setFrmPatientList(l);
			return "gotoTodolistPage";

		} else if (request.getParameter("frmLinkControl").equals("2")) {
			// To do list page->nurse tasks page

			Calendar currentTime = Calendar.getInstance();
			currentTime.set(currentTime.get(Calendar.YEAR),
					currentTime.get(Calendar.MONTH),
					currentTime.get(Calendar.DAY_OF_MONTH),
					currentTime.get(Calendar.HOUR_OF_DAY),
					currentTime.get(Calendar.MINUTE),
					currentTime.get(Calendar.SECOND));
			
			myform.setFrmNurseTaskMessage(null);
			int patient_id = Integer
					.parseInt(request.getParameter("patientId"));

			myform.setFrmPatientId(request.getParameter("patientId"));

			Date today = new Date();
			DailyRecord record = myDailyRecordService
					.getDailyRecordByPatientIdAndCurrentDate(patient_id, today);

			if (record != null) {
				Treatment treatment = myTreatmentService
						.getTreatmentByDailyRecordId(record.getId());
				if (treatment != null) {
					List<InjectionDose> injection_list = myInjectionDoseService
							.getInjectionListByTreatmentId(treatment.getId());

					if (injection_list != null) {
						myform.setFrmNurseTaskMessage(null);

						for (int i = 0; i < injection_list.size(); i++) {
							
							if (injection_list.get(i).getComplete().equals("0")) {
								
								Calendar beforeTime = Calendar.getInstance();

								Date dbTime = injection_list.get(i)
										.getInjectionStartTime();
								beforeTime.set(Calendar.HOUR_OF_DAY,
										dbTime.getHours());
								beforeTime.set(Calendar.MINUTE,
										dbTime.getMinutes());
								beforeTime.set(Calendar.SECOND,
										dbTime.getSeconds());
								beforeTime.add(Calendar.MINUTE, -30);// 3 minutes
																	// before
																	// injection
																	// time
								if (currentTime.compareTo(beforeTime) == 0) {
									System.out.println("0");
									injection_list.get(i).setComplete("0");
								} else if (currentTime.compareTo(beforeTime) == 1) {
									System.out.println("1");
									Calendar expireTime = Calendar
											.getInstance();
									expireTime.set(Calendar.HOUR_OF_DAY,
											dbTime.getHours());
									expireTime.set(Calendar.MINUTE,
											dbTime.getMinutes());
									expireTime.set(Calendar.SECOND,
											dbTime.getSeconds());
									expireTime.add(Calendar.MINUTE, 30);// after
																		// 3
																		// minutes
																		// of
																		// specific
																		// time
									System.out.println(beforeTime.getTime());
									System.out.println(currentTime.getTime());
									System.out.println(expireTime.getTime());
									// Nested Conditions
									if (currentTime.compareTo(expireTime) == -1) {
										System.out.println("Nested -1");
										injection_list.get(i).setComplete("0");
									} else if (currentTime
											.compareTo(expireTime) == 0) {
										System.out.println("Nested 0");
										injection_list.get(i).setComplete("0");
									} else if (currentTime
											.compareTo(expireTime) == 1) {
										System.out.println("Nested 1-");
										injection_list.get(i).setComplete("1");
									}

								} else if (currentTime.compareTo(beforeTime) == -1) {
									System.out.println("-1");
									injection_list.get(i).setComplete("1");
								}
							} else if (injection_list.get(i).getComplete().equals("1")) {
								System.out.println("complete 1");
							}

						}//for loop end

						myform.setFrmInjectionDoseList(injection_list);
						return "gotoTaskListPage";
					} else {
						// No Injection List (No task for nurse)
						myform.setFrmNurseTaskMessage("No Task Yet");
						return "gotoTaskListPage";
					}

				} else {
					// No treatment
					myform.setFrmNurseTaskMessage("No Task Yet");
					return "gotoTaskListPage";
				}
			} else {
				// No Record for today
				myform.setFrmNurseTaskMessage("No Task Yet");
				return "gotoTaskListPage";
			}
		}
		}else{
			//After submit we get /TaskCompleteAction.do Post Method
			//Then We refresh this link-> WE must not conflict with post method 
			//We consider as GET LINK REFRESH
			// To do list page Loading
			List<Patient> l = myPatientService.getPatientList();
			myform.setFrmPatientList(l);
			return "gotoTodolistPage";
			
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
		NurseForm myform = (NurseForm) form;
		
		Calendar currentTime = Calendar.getInstance();
		currentTime.set(currentTime.get(Calendar.YEAR),
				currentTime.get(Calendar.MONTH),
				currentTime.get(Calendar.DAY_OF_MONTH),
				currentTime.get(Calendar.HOUR_OF_DAY),
				currentTime.get(Calendar.MINUTE),
				currentTime.get(Calendar.SECOND));
		
		if(myform.getFrmTaskId()!=null){
		InjectionDose injection = myInjectionDoseService
				.getInjectionDoseByInjectionId(Integer.parseInt(myform
						.getFrmTaskId()));
		injection.setComplete("1");
		myInjectionDoseService.CompleteTask(injection);

		// Task Page-> Task Page

		myform.setFrmNurseTaskMessage(null);
		int patient_id = Integer.parseInt(myform.getFrmPatientId());
		myform.setFrmPatientId(null);

		Date today = new Date();
		DailyRecord record = myDailyRecordService
				.getDailyRecordByPatientIdAndCurrentDate(patient_id, today);

		if (record != null) {
			Treatment treatment = myTreatmentService
					.getTreatmentByDailyRecordId(record.getId());
			if (treatment != null) {
				List<InjectionDose> injection_list = myInjectionDoseService
						.getInjectionListByTreatmentId(treatment.getId());

				if (injection_list != null) {
					myform.setFrmNurseTaskMessage(null);
					
					
					for (int i = 0; i < injection_list.size(); i++) {
						
						if (injection_list.get(i).getComplete().equals("0")) {
							System.out.println("pointer here");
							Calendar beforeTime = Calendar.getInstance();

							Date dbTime = injection_list.get(i)
									.getInjectionStartTime();
							beforeTime.set(Calendar.HOUR_OF_DAY,
									dbTime.getHours());
							beforeTime.set(Calendar.MINUTE,
									dbTime.getMinutes());
							beforeTime.set(Calendar.SECOND,
									dbTime.getSeconds());
							beforeTime.add(Calendar.MINUTE, -30);// 3 minutes
																// before
																// injection
																// time
							if (currentTime.compareTo(beforeTime) == 0) {
								System.out.println("0");
								injection_list.get(i).setComplete("0");
							} else if (currentTime.compareTo(beforeTime) == 1) {
								System.out.println("1");
								Calendar expireTime = Calendar
										.getInstance();
								expireTime.set(Calendar.HOUR_OF_DAY,
										dbTime.getHours());
								expireTime.set(Calendar.MINUTE,
										dbTime.getMinutes());
								expireTime.set(Calendar.SECOND,
										dbTime.getSeconds());
								expireTime.add(Calendar.MINUTE, 30);// after
																	// 3
																	// minutes
																	// of
																	// specific
																	// time

								// Nested Conditions
								if (currentTime.compareTo(expireTime) == -1) {
									System.out.println("Nested -1");
									injection_list.get(i).setComplete("0");
								} else if (currentTime
										.compareTo(expireTime) == 0) {
									System.out.println("Nested 0");
									injection_list.get(i).setComplete("0");
								} else if (currentTime
										.compareTo(expireTime) == 1) {
									System.out.println("Nested 1");
									injection_list.get(i).setComplete("1");
								}

							} else if (currentTime.compareTo(beforeTime) == -1) {
								System.out.println("-1");
								injection_list.get(i).setComplete("1");
							}
						} else if (injection_list.get(i).getComplete().equals("1")) {
							System.out.println("complete 1");
						}

					}//for loop end
					
					myform.setFrmInjectionDoseList(injection_list);
					return "gotoTaskListPage";
				} else {
					// No Injection List (No task for nurse)
					myform.setFrmNurseTaskMessage("No Task Yet");
					return "gotoTaskListPage";
				}

			} else {
				// No treatment
				myform.setFrmNurseTaskMessage("No Task Yet");
				return "gotoTaskListPage";
			}
		} else {
			// No Record for today
			myform.setFrmNurseTaskMessage("No Task Yet");
			return "gotoTaskListPage";
		}
		}
		return null;
	}

}
