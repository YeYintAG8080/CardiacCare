package com.ictti.hbc.presentation.action;


import java.io.File;

import java.io.FileOutputStream;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

import com.ictti.hbc.business.entity.Patient;

import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.business.service.ReceptionistService;
import com.ictti.hbc.presentation.form.ReceptionistForm;

public class PatientRegisterAction extends BaseAction {
	private ReceptionistService myReceptionistService;
	private PatientService myPatientService;
	
	
	
	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	public ReceptionistService getMyReceptionistService() {
		return myReceptionistService;
	}

	public void setMyReceptionistService(
			ReceptionistService myReceptionistService) {
		this.myReceptionistService = myReceptionistService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		/*Check Session*/
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoReceptionistLoginForm";
		}		
		ReceptionistForm myForm = (ReceptionistForm) form;
		
		
		
		
		/*FirstRegisterCancel*/
		if (request.getParameter("btnRegisterCancel") != null) {
			myForm.setFrmRegFormControl(null);
			myForm.setFrmRepLoginEmail("");
			myForm.setRegPatientBlood("");
			myForm.setRegPatientDisease("");
			myForm.setRegPatientDOB("");
			myForm.setRegPatientEmail("");
			myForm.setRegPatientGender("");
			myForm.setRegPatientName("");
			myForm.setRegPatientPhnoe("");
			myForm.setRegPatientWeight("");
			myForm.setRegPatinetAddress("");
			return "gotoRecptHome";
		}
		
		/*PressRegister*/
		if (request.getParameter("btnRegister") != null) {
			
			int flag = 0;
			ActionErrors errors = new ActionErrors();
			SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd");
			Date dateofbirth=format.parse(myForm.getRegPatientDOB());
			if(dateofbirth.after(new Date())){
				errors.add("dateerror", new ActionMessage("errors.dateGreater"));
				
				saveErrors(request, errors);
				myForm.setFrmRegFormControl(null);
				flag = 1;
			}
			
			if(myForm.getRegPatientBlood().equals("S")) {
				errors.add("BloodEmptyError", new ActionMessage("errors.Blood"));
				saveErrors(request, errors);
				myForm.setFrmRegFormControl(null);
				flag = 1;
			}
			if (myForm.getRegPatientGender() == null) {
				errors.add("GenderEmptyError", new ActionMessage(
						"errors.Gender"));
				saveErrors(request, errors);
				myForm.setFrmRegFormControl(null);
				flag = 1;
			}
			/*if (myForm.getRegUploadFile().getFileSize() == 0) {
				errors.add("FileEmptyError", new ActionMessage("errors.File"));
				saveErrors(request, errors);
				myForm.setFrmRegFormControl(null);
				flag = 1;
			}*/
			if (flag == 0) {
				Patient patient=myPatientService.getPatientByNameandDOBandEmail(myForm.getRegPatientName(),myForm.getRegPatientDOB(),myForm.getRegPatientEmail());
				if(patient !=null){
					myForm.setRegPateint(patient);
					myForm.setRegPatientName(patient.getPatientName());
					SimpleDateFormat date=new SimpleDateFormat("YYYY-MM-dd");
					
					myForm.setRegPatientDOB(date.format(patient.getDateOfBirth()));
					myForm.setRegPatientEmail(patient.getEmail());
					myForm.setRegPatientPhnoe(patient.getPhone());
					myForm.setRegPatinetAddress(patient.getAddress());
					myForm.setRegPatientDisease(patient.getDiseaseName());
					myForm.setRegPatientWeight(String.valueOf(patient.getWeight()));
					myForm.setRegPatientBlood(patient.getBloodGroup());
					myForm.setRegPatientGender(patient.getGender());
					myForm.setRegPassword(patient.getPassword());
					myForm.setRegPatientId(patient.getRegisterId());
					myForm.setFrmRegFormControl(null);
					return "gotoUpdate";
				}else{
					myForm.setFrmRegFormControl("data");
					String Password=myReceptionistService.getPassword(7);
					myForm.setRegPassword(Password);
					
					String id="pcc";
					String PatientId=null;
					int count=myReceptionistService.getCount();
					if(count <= 8){
						PatientId=id+"0"+Integer.valueOf(count+1)+"-"+myForm.getRegPatientName();
					}else{
						PatientId=id+Integer.valueOf(count+1)+"-"+myForm.getRegPatientName();
					}
					myForm.setRegPatientId(PatientId);
					FormFile myFile = myForm.getRegUploadFile();
					String FileName = myFile.getFileName().trim();
					myForm.setRegFileName(FileName);
					SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
					myForm.setRegAdmittedDate(myFormat.format(new Date()));
				}
				return "gotoPatientRegister";
				}
			
		}
		
		/*Don't Save Patient Information*/
		if (request.getParameter("btnCancel") != null) {
			myForm.setFrmRegFormControl(null);
			return "gotoPatientRegister";
		}
		
		/*Save PatientInformation*/
		if (request.getParameter("btnSave") != null) {

			try {

				FormFile file = myForm.getRegUploadFile();

				// Get the servers upload directory real path name
				String filePath = getServlet().getServletContext().getRealPath("") +"\\image\\update_lab_result\\";
						
						
				myForm.setRegFilePath(filePath);
				// create the upload folder if not exists
				File folder = new File(filePath);
				if (!folder.exists()) {
					folder.mkdir();
				}

				String fileName = file.getFileName();

				if (!("").equals(fileName)) {

					System.out.println("Server path:" + filePath);
					File newFile = new File(filePath, fileName);

					if (!newFile.exists()) {
						FileOutputStream fos = new FileOutputStream(newFile);
						fos.write(file.getFileData());
						fos.flush();
						fos.close();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			myReceptionistService.prepareForMail(myForm);
			myReceptionistService.savePatientInfo(myForm);
			
			/*Return to Register Page with no data*/
			myForm.setFrmRegFormControl(null);
			myForm.setFrmRepLoginEmail("");
			myForm.setRegPatientBlood("");
			myForm.setRegPatientDisease("");
			myForm.setRegPatientDOB("");
			myForm.setRegPatientEmail("");
			myForm.setRegPatientGender("");
			myForm.setRegPatientName("");
			myForm.setRegPatientPhnoe("");
			myForm.setRegPatientWeight("");
			myForm.setRegPatinetAddress("");
List<Patient> list=myReceptionistService.getAllPatient();
			
			myForm.setList(list);
			myForm.setBegin(1);
			myForm.setEnd(list.size());
			return "gotoRecptHome";
		}
		
		return "gotoPatientRegister";
		
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		
		return "gotoPatientRegister";
	}

}
