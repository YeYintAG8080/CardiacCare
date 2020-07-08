package com.ictti.hbc.presentation.action;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.NurseForm;

public class DailyRecordAction extends BaseAction {
	private DailyRecordService myDailyRecordService;
	private PatientService myPatientService;

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		
		if (session.getAttribute("session_id") == null) {
			return "gotoNurseLoginForm";
		}

		if (request.getParameter("frmLinkControl").equals("1")) {
			NurseForm myform = (NurseForm) form;
			DailyRecord dailyrecord = myDailyRecordService
					.getDailyRecordById(Integer.parseInt(myform
							.getFrmDailyRecordId()));
			myform.setFrmDailyRecord(dailyrecord);
			return "gotoMedicalRecordDetailForm";
		} else if (request.getParameter("frmLinkControl").equals("2")) {
			//Medical Record List Page -> Medical Record Create Page
			
			NurseForm myform = (NurseForm) form;//Use NurseCreateRecordFormBean
			if(session.getAttribute("NurseFormBean")!=null){
			session.removeAttribute("NurseFormBean");//** not to conflit with this bean in later
			}
			
			myform.setFrmBloodPresure(null);
			myform.setFrmSpO2Level(null);
			myform.setFrmBodyTemperature(null);
			myform.setFrmDiabetes(null);
			myform.setFrmPulseRate(null);
			myform.setFrmBloodTest(null);
			myform.setFrmBloodTestFilePath(null);
			myform.setFrmEchocardiography(null);
			myform.setFrmEchocardiographyFilePath(null);
			myform.setFrmElectrocardiography(null);
			myform.setFrmElectrocardiographyFilePath(null);
			myform.setFrmDailyRecordCreateFormControl(null);//****
			
			myform.setFrmPatientMedicalRecordLinkId(request.getParameter("patientId"));
			return "gotoMedicalRecordCreateForm";
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
		if (request.getParameter("frmBtnSave") != null) {
			String strBloodTestFile=myform.getFrmBloodTest().getFileName().trim();
			String strEchocardiography=myform.getFrmEchocardiography().getFileName().trim();
			String strElectrocardiography=myform.getFrmElectrocardiography().getFileName().trim();
			myform.setFrmBloodTestFilePath(strBloodTestFile);
			myform.setFrmEchocardiographyFilePath(strEchocardiography);
			myform.setFrmElectrocardiographyFilePath(strElectrocardiography);
			myform.setFrmDailyRecordCreateFormControl("data");
			return "gotoMedicalRecordCreateForm";
			
		} else if (request.getParameter("frmBtnCancel") != null || request.getParameter("frmBtnConfirmCancel") != null) {
			System.out.println("cancel");
			myform.setFrmDailyRecordCreateFormControl(null);
			List<DailyRecord> l = myDailyRecordService.getAllDailyRecordListByPatientId(Integer.parseInt(myform.getFrmPatientMedicalRecordLinkId()));

			SimpleDateFormat myformat = new SimpleDateFormat("MM-dd-yyyy");
			Date todayDate = Calendar.getInstance().getTime();
			String strTodayDate = myformat.format(todayDate);
			String strRetrieveDate = myformat.format(l.get(0).getAttemptDate());
			if (strTodayDate.equals(strRetrieveDate)) {
				myform.setFrmHaveTodayMedicalRecord("1");
			}else{
				myform.setFrmHaveTodayMedicalRecord(null);
			}

			myform.setFrmDailyRecordList(l);
			
			myform.setFrmBloodPresure(null);
			myform.setFrmSpO2Level(null);
			myform.setFrmBodyTemperature(null);
			myform.setFrmDiabetes(null);
			myform.setFrmPulseRate(null);
			myform.setFrmBloodTest(null);
			myform.setFrmBloodTestFilePath(null);
			myform.setFrmEchocardiography(null);
			myform.setFrmEchocardiographyFilePath(null);
			myform.setFrmElectrocardiography(null);
			myform.setFrmElectrocardiographyFilePath(null);
			
			return "gotoDailyRecordListForm";
		}else if (request.getParameter("frmBtnConfirm") != null){
			String BloodTestfilePath=null;
			String EchocardiographyFilePath=null;
			String ElectrocardiographyFilePath=null;
			String patient_id=myform.getFrmPatientMedicalRecordLinkId();
			
			DailyRecord daily_record=new DailyRecord();
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date todaySaveDate=new Date();
			//String todayText=sdf.format(todayDate);
			
			Patient patient=myPatientService.getPatientInfoDetailById(Integer.parseInt(patient_id));
			
			if(myform.getFrmBloodTest()!=null){
			try {
				BloodTestfilePath = getServlet().getServletContext().getRealPath("")
						+ "\\image\\blood_test\\"+myform.getFrmBloodTest().getFileName().trim();
				BufferedOutputStream outStream = new BufferedOutputStream(
						new FileOutputStream(BloodTestfilePath));
				InputStream in = myform.getFrmBloodTest().getInputStream();
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = in.read(buffer)) != -1) {
					outStream.write(buffer, 0, n);
				}
				in.close();
				outStream.close();
				daily_record.setBloodTest(BloodTestfilePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			if(myform.getFrmEchocardiography()!=null){
			try {
				
				EchocardiographyFilePath = getServlet().getServletContext().getRealPath("")
						+ "\\image\\echocardiography\\"+myform.getFrmEchocardiography().getFileName().trim();
				
				BufferedOutputStream outStream = new BufferedOutputStream(
						new FileOutputStream(EchocardiographyFilePath));
				InputStream in = myform.getFrmEchocardiography().getInputStream();
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = in.read(buffer)) != -1) {
					outStream.write(buffer, 0, n);
				}
				in.close();
				outStream.close();
				daily_record.setEchocardiography(EchocardiographyFilePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			if(myform.getFrmElectrocardiography()!=null){
			try {
				
				ElectrocardiographyFilePath = getServlet().getServletContext().getRealPath("")
						+ "\\image\\electrocardiography\\"+myform.getFrmElectrocardiography().getFileName().trim();
				
				BufferedOutputStream outStream = new BufferedOutputStream(
						new FileOutputStream(ElectrocardiographyFilePath));
				InputStream in = myform.getFrmElectrocardiography().getInputStream();
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = in.read(buffer)) != -1) {
					outStream.write(buffer, 0, n);
				}
				in.close();
				outStream.close();
				daily_record.setElectrocardigraphy(ElectrocardiographyFilePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			
			daily_record.setAttemptDate(todaySaveDate);
			daily_record.setBloodPressure(myform.getFrmBloodPresure());
			daily_record.setSpo2Level(myform.getFrmSpO2Level());
			daily_record.setBodyTemperature(myform.getFrmBodyTemperature());
			daily_record.setDiabetes(myform.getFrmDiabetes());
			daily_record.setPulseRate(myform.getFrmPulseRate());
			/*if(myform.getFrmBloodTest()!=null){
			
			}
			if(myform.getFrmEchocardiography()!=null){
			
			}
			if(myform.getFrmElectrocardiography()!=null){
			
			}*/
			daily_record.setPatient(patient);
			
			myDailyRecordService.AddNewDailyRecord(daily_record);
			
			//After adding new record, go to daily record list
			List<DailyRecord> l = myDailyRecordService.getAllDailyRecordListByPatientId(Integer.parseInt(myform.getFrmPatientMedicalRecordLinkId()));

			SimpleDateFormat myformat = new SimpleDateFormat("MM-dd-yyyy");
			Date todayDate = Calendar.getInstance().getTime();
			String strTodayDate = myformat.format(todayDate);
			String strRetrieveDate = myformat.format(l.get(0).getAttemptDate());
			if (strTodayDate.equals(strRetrieveDate)) {
				
				myform.setFrmHaveTodayMedicalRecord("1");
			}else{
				
				myform.setFrmHaveTodayMedicalRecord(null);
			}
			myform.setFrmDailyRecordList(null);
			myform.setFrmDailyRecordList(l);//to reload daily record list in page
			
			myform.setFrmBloodPresure(null);
			myform.setFrmSpO2Level(null);
			myform.setFrmBodyTemperature(null);
			myform.setFrmDiabetes(null);
			myform.setFrmPulseRate(null);
			myform.setFrmBloodTest(null);
			myform.setFrmBloodTestFilePath(null);
			myform.setFrmEchocardiography(null);
			myform.setFrmEchocardiographyFilePath(null);
			myform.setFrmElectrocardiography(null);
			myform.setFrmElectrocardiographyFilePath(null);
			
			
			
			return "gotoDailyRecordListForm"; 
		}

		return null;
	}

}
