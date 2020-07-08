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
import com.ictti.hbc.business.service.ReceptionistService;
import com.ictti.hbc.presentation.form.ReceptionistForm;

public class PatientUpdateAction extends BaseAction {
private ReceptionistService myReceptionistService;


	public ReceptionistService getMyReceptionistService() {
	return myReceptionistService;
}


public void setMyReceptionistService(ReceptionistService myReceptionistService) {
	this.myReceptionistService = myReceptionistService;
}


	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		ReceptionistForm myForm = (ReceptionistForm) form;
		/* Check Session */
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoRecptLoginForm";
		}

		/* PatientUpdateCancel */
		if (request.getParameter("btnUpdateCancel") != null) {
			myForm.setFrmRegFormControl(null);
			
			return "gotoPatientRegister";
		}
		/* PateintUpdate */
		if (request.getParameter("btnUpdate") != null) {
			int flag = 0;
			ActionErrors errors = new ActionErrors();
			/*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date dateofbirth = format.parse(myForm.getRegPatientDOB());
			if (dateofbirth.after(new Date())) {
				errors.add("dateerror", new ActionMessage("errors.dateGreater"));

				saveErrors(request, errors);
			}*/

			/*if (myForm.getRegUploadFile().getFileSize() == 0) {
				errors.add("FileEmptyError", new ActionMessage("errors.File"));
				saveErrors(request, errors);
				myForm.setFrmRegFormControl(null);
				flag = 1;
			}*/
			if(flag==0){
				myForm.setFrmRegFormControl("data");
				/*String Password=myReceptionistService.getPassword(7);
				myForm.setRegPassword(Password);
				
				String id="pcc";
				String PatientId=null;
				int count=myReceptionistService.getCount();
				if(count <= 9){
					PatientId=id+"0"+Integer.valueOf(count+1)+"-"+myForm.getRegPatientName();
				}else{
					PatientId=id+Integer.valueOf(count+1)+"-"+myForm.getRegPatientName();
				}
				myForm.setRegPatientId(PatientId);*/
				FormFile myFile = myForm.getRegUploadFile();
				String FileName = myFile.getFileName().trim();
				myForm.setRegFileName(FileName);
				SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
				myForm.setRegAdmittedDate(myFormat.format(new Date()));
				return "gotoUpdateComfirm";
			}
			return "gotoUpdateComfirm";
		}
		if(request.getParameter("btnUpdateSaveCancel") !=null){
			myForm.setFrmRegFormControl(null);
			return "gotoUpdateComfirm";
		}
		if(request.getParameter("btnUpdateSave") !=null){
			
			try {

				FormFile file = myForm.getRegUploadFile();

				// Get the servers upload directory real path name
				String filePath = getServlet().getServletContext().getRealPath("") +"\\image\\update_lab_result\\";
				myForm.setRegFilePath(filePath);		
						
				myForm.setRegFilePath(filePath);
				// create the upload folder if not exists
				File folder = new File(filePath);
				if (!folder.exists()) {
					folder.mkdir();
				}

				String fileName = file.getFileName();
				myForm.setRegFileName(fileName);
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
			myReceptionistService.saveUpdatePatientInfo(myForm);
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
		return "gotoUpdateComfirm";
	}

}
