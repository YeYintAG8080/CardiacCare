package com.ictti.hbc.presentation.action;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.DoctorService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.DoctorForm;

public class DoctorProfileFillAction extends BaseAction {
	private DoctorService myDoctorService;
	private PatientService myPatientService;

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}
	
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		DoctorForm  doctorprofilefillformbean=(DoctorForm) request.getSession(false).getAttribute("DoctorProfileFillFormBean");
		 
		doctorprofilefillformbean
				.setFrmDoctorProfileFillFormControl(null);
		doctorprofilefillformbean.setFrmProfileFillDoctorImageFilePath(null);
		doctorprofilefillformbean.setFrmProfileFillAddress(null);
		doctorprofilefillformbean.setFrmProfileFillDegree(null);
		doctorprofilefillformbean.setFrmProfileFillDoctorImage(null);
		doctorprofilefillformbean.setFrmProfileFillExperience(null);
		doctorprofilefillformbean.setFrmProfileFillPhone(null);
		doctorprofilefillformbean.setFrmProfileFillBiography(null);
		 return "gotoDoctorProfileFillForm";
	}
	
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		DoctorForm doctorformbean = (DoctorForm) request.getSession(false)
				.getAttribute("DoctorFormBean");
		DoctorForm doctorprofilefillformbean = (DoctorForm) form;
		if (request.getParameter("frmBtnSave") != null) {
			 
			if(doctorprofilefillformbean.getFrmProfileFillDoctorImage().getFileName().equals("")){
			 
				ActionErrors errors=new ActionErrors();
				errors.add("frmProfileFillDoctorImageError",new ActionMessage("errors.frmProfileFillDoctorImageError"));
				saveErrors(request, errors);
				return "gotoDoctorProfileFillForm";
			}else{
			 
			doctorprofilefillformbean.setFrmLoginDoctor(doctorformbean
					.getFrmLoginDoctor());
			doctorprofilefillformbean
					.setFrmDoctorProfileFillFormControl("data");
			doctorprofilefillformbean.setFrmProfileFillDoctorImageFilePath(doctorprofilefillformbean.getFrmProfileFillDoctorImage().getFileName().trim());
			return "gotoDoctorProfileFillForm";
			}
			
		} else if (request.getParameter("frmBtnConfirm") != null) {
			String DoctorImageFilePath=null;
			Doctor updateDoctor=doctorprofilefillformbean.getFrmLoginDoctor();
			updateDoctor.setProfileFill("1");
			
			try {
				DoctorImageFilePath = getServlet().getServletContext().getRealPath("")
						+ "\\image\\doctor_profile_images\\"+doctorprofilefillformbean.getFrmProfileFillDoctorImage().getFileName().trim();
				BufferedOutputStream outStream = new BufferedOutputStream(
						new FileOutputStream(DoctorImageFilePath));
				InputStream in = doctorprofilefillformbean.getFrmProfileFillDoctorImage().getInputStream();
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = in.read(buffer)) != -1) {
					outStream.write(buffer, 0, n);
				}
				in.close();
				outStream.close();
				updateDoctor.setDoctorImage(doctorprofilefillformbean.getFrmProfileFillDoctorImage().getFileName().trim());
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
			updateDoctor.setPhone(doctorprofilefillformbean.getFrmProfileFillPhone());
			updateDoctor.setAddress(doctorprofilefillformbean.getFrmProfileFillAddress());
			updateDoctor.setDegree(doctorprofilefillformbean.getFrmProfileFillDegree());
			updateDoctor.setExperience(doctorprofilefillformbean.getFrmProfileFillExperience());
			updateDoctor.setBiography(doctorprofilefillformbean.getFrmProfileFillBiography());
			myDoctorService.saveUpdateDoctor(updateDoctor);
			Doctor UpdatedDoctor=myDoctorService.getDoctorByEmailAndPassword(updateDoctor.getEmail(), updateDoctor.getPassword());
			doctorformbean.setFrmLoginDoctor(UpdatedDoctor);
			List<Patient> l = myPatientService.getPatientList();
			doctorformbean.setFrmPatientList(l);
			return "gotoPatientList";
		}
		return null;
	}

}
