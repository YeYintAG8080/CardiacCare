package com.ictti.hbc.presentation.action;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

import com.ictti.hbc.business.service.AdminDoctorService;
import com.ictti.hbc.business.service.AdminService;
import com.ictti.hbc.presentation.form.AdminForm;

public class AdminDoctorRegistrationAction extends BaseAction {

	private AdminDoctorService myAdminDoctorService;
	private AdminService myAdminService;

	public AdminService getMyAdminService() {
		return myAdminService;
	}

	public void setMyAdminService(AdminService myAdminService) {
		this.myAdminService = myAdminService;
	}

	public AdminDoctorService getMyAdminDoctorService() {
		return myAdminDoctorService;
	}

	public void setMyAdminDoctorService(AdminDoctorService myAdminDoctorService) {
		this.myAdminDoctorService = myAdminDoctorService;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		return "gotoDoctorRegistrationFirst";
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
HttpSession session = request.getSession(false);
		
		if (session.getAttribute("session_id") == null) {
			return "gotoAdminLoginForm";
		}
		AdminForm myForm = (AdminForm) form;
		/* Check Session */

		/*
		 * HttpSession session = request.getSession(false); if
		 * (session.getAttribute("id") == null) { return "gotoAdminLoginForm"; }
		 */
		if (request.getParameter("btnRegisterCancel") != null) {
			myForm.setRegFormControl(null);
			return "gotoAdminHome";
		}

		/* PressRegister */
		if (request.getParameter("btnRegister") != null) {

			int flag = 0;
			ActionErrors errors = new ActionErrors();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date dateofbirth = format.parse(myForm.getRegDoctorDOB());
			if (dateofbirth.after(new Date())) {
				errors.add("dateerror", new ActionMessage("errors.dateGreater"));

				saveErrors(request, errors);
			}
			if (myForm.getRegDoctorSpecialize().equals("S")) {
				errors.add("SpecializeEmptyError", new ActionMessage(
						"errors.Specialize"));
				saveErrors(request, errors);
				myForm.setRegFormControl(null);
				flag = 1;
			}
			/*
			 * if (myForm.getRegPhotoUpload().getFileSize() == 0) {
			 * errors.add("FileEmptyError", new ActionMessage("errors.File"));
			 * saveErrors(request, errors); myForm.setRegFormControl(null); flag
			 * = 1; }
			 */
			SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date DocDOB = myFormat.parse(myForm.getRegDoctorDOB());
			Date currentDate = new Date();
			long dobYear = currentDate.getYear() - DocDOB.getYear();
			if (dobYear < 30) {
				errors.add("dobError", new ActionMessage("errors.regError"));
				saveErrors(request, errors);
				myForm.setRegFormControl(null);
				flag = 1;
			}

			/*
			 * if (!myForm.getRegFormControl().equals(
			 * myForm.getFrmRegConfPassword())) { errors.add("passwordError",
			 * new ActionMessage( "errors.matchPassword")); saveErrors(request,
			 * errors); flag = 1; }
			 */
			/*
			 * if (flag == 0) { myAdminDoctorService.checkDoctorName(myForm); if
			 * (myForm.getFrmRegAccountNameError() == null) {
			 * errors.add("accountError", new ActionMessage( "errors.account"));
			 * saveErrors(request, errors); }
			 */

			if (flag == 0) {
				myForm.setRegFormControl("data");
				String Password = myAdminDoctorService.getPassword(7);
				myForm.setRegDoctorPassword(Password);
				// FormFile myFile = myForm.getRegPhotoUpload();
				// String FileName = myFile.getFileName().trim();
				// myForm.setRegfileName(FileName);
				return "gotoDoctorRegistration";//
			}
			return "gotoDoctorRegistration";
		}
		// return "gotoDoctorRegistration";
		// }

		/*
		 * if (request.getParameter("btnRegister") != null) {
		 * myForm.setRegFormControl("data"); String Password =
		 * myAdminDoctorService.getPassword(7);
		 * myForm.setRegDoctorPassword(Password); FormFile myFile =
		 * myForm.getRegPhotoUpload(); String FileName =
		 * myFile.getFileName().trim(); myForm.setRegfileName(FileName); return
		 * "gotoDoctorRegistration"; }
		 */

		if (request.getParameter("btnCancel") != null) {
			myForm.setRegFormControl(null);
			return "gotoDoctorRegistrationFirst";
		}

		if (request.getParameter("btnSave") != null) {

			/*
			 * try {
			 * 
			 * FormFile file = myForm.getRegPhotoUpload();
			 * 
			 * // Get the servers upload directory real path name String
			 * filePath = getServlet().getServletContext().getRealPath( "") +
			 * "/images/";
			 * 
			 * myForm.setRegfilePath(filePath); // create the upload folder if
			 * not exists File folder = new File(filePath); if
			 * (!folder.exists()) { folder.mkdir(); }
			 * 
			 * String fileName = file.getFileName();
			 * 
			 * if (!("").equals(fileName)) {
			 * 
			 * System.out.println("Server path:" + filePath); File newFile = new
			 * File(filePath, fileName);
			 * 
			 * if (!newFile.exists()) { FileOutputStream fos = new
			 * FileOutputStream(newFile); fos.write(file.getFileData());
			 * fos.flush(); fos.close(); } } } catch (Exception e) {
			 * e.printStackTrace(); }
			 */
			// myForm.setRegprofileFill("0");
			myAdminDoctorService.saveDoctorInfo(myForm);

			/* Return to Register Page with no data */
			myForm.setRegFormControl(null);
			myForm.setRegDoctorEmail("");
			myForm.setRegDoctorDOB("");
			myForm.setRegDoctorName("");
			myForm.setRegDoctorSpecialize("");
			myForm.setRegDoctorAddress("");
			myForm.setRegDoctorDegree("");
			myForm.setRegDoctorExperience("");
			myForm.setRegDoctorPhone("");
			myForm.setRegDoctorBio("");
			
			return "gotoDoctorRegistration";
		}
		return "gotoDoctorRegistration";
	}
}
