package com.ictti.hbc.presentation.action;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import javax.print.Doc;
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
import com.ictti.hbc.presentation.form.DoctorForm;

public class DoctorUpdateAction extends BaseAction {
	private DoctorService myDoctorService;

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		if (request.getParameter("btnUpdateProfile") != null) {
			// DoctorForm doctorformbean = (DoctorForm)
			// request.getSession(false).getAttribute("DoctorFormBean");
			DoctorForm doctorform = (DoctorForm) form;
			ActionErrors errors = new ActionErrors();
			if (!doctorform.getFrmComfirmPassword().equals("")) {
				
				if (!doctorform.getFrmPassword().equals(doctorform.getFrmComfirmPassword())) {
					System.out.println("Not Eq_New "+doctorform.getFrmPassword()+" Confirm: "+doctorform.getFrmComfirmPassword()+"___");
					errors.add("PasswordError", new ActionMessage(
							"errors.matchPassword"));
					saveErrors(request, errors);
					return "gotoUpdateProfile";
				} else {
					System.out.println("Else_New "+doctorform.getFrmPassword()+" Confirm: "+doctorform.getFrmComfirmPassword()+"___");
					doctorform.setFrmEditDoctorImageFilePath(doctorform.getFrmEditDoctorImage().getFileName().trim());
					 
					doctorform.setFrmFormControl("data");
					return "gotoUpdateProfile";
				}
			}else{
				DoctorForm doctorformbean =(DoctorForm) request.getSession(false).getAttribute("DoctorFormBean");
				doctorform.setFrmPassword(doctorformbean.getFrmLoginDoctor().getPassword());
				doctorform.setFrmFormControl("data");
				doctorform.setFrmEditDoctorImageFilePath(doctorform.getFrmEditDoctorImage().getFileName().trim());
				return "gotoUpdateProfile";
			}
		}
		
		if (request.getParameter("btnSave") != null) {
			String DoctorImageFilePath=null;
			DoctorForm doctorformbean=(DoctorForm) request.getSession(false).getAttribute("DoctorFormBean");
			Doctor loginDoctor=doctorformbean.getFrmLoginDoctor();
			
			DoctorForm myform = (DoctorForm) form;
			Doctor doctor=myDoctorService.getDoctorByEmailAndPassword(loginDoctor.getEmail(), loginDoctor.getPassword());
			
			try {
				DoctorImageFilePath = getServlet().getServletContext().getRealPath("")
						+ "\\image\\doctor_profile_images\\"+myform.getFrmEditDoctorImage().getFileName().trim();
				BufferedOutputStream outStream = new BufferedOutputStream(
						new FileOutputStream(DoctorImageFilePath));
				InputStream in = myform.getFrmEditDoctorImage().getInputStream();
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = in.read(buffer)) != -1) {
					outStream.write(buffer, 0, n);
				}
				in.close();
				outStream.close();
				doctor.setDoctorImage(myform.getFrmEditDoctorImage().getFileName().trim());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			doctor.setEmail(myform.getFrmEmail());
			doctor.setDegree(myform.getFrmDegree());
			doctor.setAddress(myform.getFrmAddress());
			doctor.setExperience(myform.getFrmExperience());
			doctor.setPhone(myform.getFrmPhone());
			doctor.setSpecialization(myform.getFrmSpecialization());
			doctor.setPassword(myform.getFrmPassword());
			
			myDoctorService.saveUpdateDoctor(doctor);
			 
				
			 
			 
			session.invalidate();
			return "gotoDoctorLoginForm";
		}

		return null;

	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("session_id") == null) {
			return "gotoDoctorLoginForm";
		}
		DoctorForm doctorformbean = (DoctorForm) request.getSession(false)
				.getAttribute("DoctorFormBean");
		DoctorForm myform = (DoctorForm) form;
		
		Doctor doctor = doctorformbean.getFrmLoginDoctor();
		System.out.println(doctor.getDoctorImage());
		myform.setFrmDoctorImage("./image/doctor_profile_images/"+doctor.getDoctorImage());
		myform.setFrmEmail(doctor.getEmail());
		myform.setFrmPassword(doctor.getPassword());
		myform.setFrmDegree(doctor.getDegree());
		myform.setFrmSpecialization(doctor.getSpecialization());
		myform.setFrmExperience(doctor.getExperience());
		myform.setFrmPhone(doctor.getPhone());
		myform.setFrmAddress(doctor.getAddress());

		myform.setFrmFormControl(null);

		return "gotoUpdateProfile";

	}

}
