package com.ictti.hbc.business.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.struts.upload.FormFile;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.entity.Receptionist;
import com.ictti.hbc.dao.PatientDao;
import com.ictti.hbc.dao.ReceptionistDao;
import com.ictti.hbc.presentation.form.ReceptionistForm;
import com.ictti.hbc.util.MailConfigGmail;

public class ReceptionistService {
private ReceptionistDao myReceptionistDao;
private PatientDao myPatientDao;



	public PatientDao getMyPatientDao() {
	return myPatientDao;
}


public void setMyPatientDao(PatientDao myPatientDao) {
	this.myPatientDao = myPatientDao;
}


	public ReceptionistDao getMyReceptionistDao() {
	return myReceptionistDao;
}


public void setMyReceptionistDao(ReceptionistDao myReceptionistDao) {
	this.myReceptionistDao = myReceptionistDao;
}


	public Receptionist getRecptionistLoginByEmailandPassword(
			String email, String Password) {
		
		return myReceptionistDao.getReceptionistByEmailandPassword(email,Password);
	}

	public String getPassword(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJ"
                                    + "0123456789"
                                    + "klmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 

	public void savePatientInfo(ReceptionistForm myForm) throws ParseException {
	Patient patient=new Patient();
	patient.setAddress(myForm.getRegPatinetAddress());
	SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	patient.setAdmittedDate(format.parse(myForm.getRegAdmittedDate()));
	patient.setBloodGroup(myForm.getRegPatientBlood());
	patient.setDateOfBirth(format.parse(myForm.getRegPatientDOB()));
	patient.setDischargedDate(null);
	patient.setDiseaseName(myForm.getRegPatientDisease());
	patient.setEmail(myForm.getRegPatientEmail());
	patient.setGender(myForm.getRegPatientGender());
	patient.setId(null);
	patient.setPassword(myForm.getRegPassword());
	patient.setPatientName(myForm.getRegPatientName());
	patient.setPhone(myForm.getRegPatientPhnoe());
	patient.setWeight(Integer.parseInt(myForm.getRegPatientWeight()));
	patient.setRegisterId(myForm.getRegPatientId());
	if(myForm.getRegFileName().isEmpty()){
		patient.setUpdateLabResult("");
	}else{
		patient.setUpdateLabResult(myForm.getRegFilePath()+myForm.getRegFileName());
	}
	
	
	myPatientDao.saveNewPatient(patient);	
	}



	public int getCount() {
		// TODO Auto-generated method stub
		return myPatientDao.getListSize();
	}


	public void prepareForMail(ReceptionistForm myForm){
		System.out.println("Entry to send mail");
		String strFrom = "HeartBeatCare@hbc.site";
		String strSubject = "ID and Password";
		String strContent = new String();
		try {
			VelocityEngine engine = new VelocityEngine();
			
			Properties properties = new Properties();
			properties.setProperty(VelocityEngine.RESOURCE_LOADER, "classpath");
			properties.setProperty("classpath."+ VelocityEngine.RESOURCE_LOADER + ".class",ClasspathResourceLoader.class.getName());
					
					
			
			//1
			engine.init(properties);			
			
			
			//4 get template under the WEB-INF/src
			Template tm = engine.getTemplate("mailTemplate.vm");
			
			//2
			VelocityContext vc = new VelocityContext();
			
			//3
			// Put job list
			vc.put("name", myForm.getRegPatientName());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
					
			vc.put("today", today);
			vc.put("password",myForm.getRegPassword());
			vc.put("id",myForm.getRegPatientId());
			StringWriter sw = new StringWriter();
			
			//5
			tm.merge(vc, sw);
			strContent = sw.toString();
			if (strContent != null) {
				// Create an email object
				MailConfigGmail smtpMailSender = new MailConfigGmail();
				smtpMailSender.sendToOne(myForm.getRegPatientEmail(),strSubject,
						strContent, strFrom);
				System.out.println("Mail can send successfully");
				
			} else {
				
				System.out.println("Mail cannot send because the	message is null.");
			}
		} catch (Exception e) {
			
			//System.out.println("Mail cannot send.");
		}		
		System.out.println("Successfully send mail");
	}

	
	public void saveUpdatePatientInfo(ReceptionistForm myForm) throws ParseException {
		Patient p=myForm.getRegPateint();
		p.setPhone(myForm.getRegPatientPhnoe());
		p.setAddress(myForm.getRegPatinetAddress());
		p.setDiseaseName(myForm.getRegPatientDisease());
		p.setWeight(Integer.parseInt(myForm.getRegPatientWeight()));
		if(myForm.getRegFileName().isEmpty()){
			p.setUpdateLabResult("");
		}else{
			p.setUpdateLabResult(myForm.getRegFilePath()+myForm.getRegFileName());
		}
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		p.setAdmittedDate(format.parse(myForm.getRegAdmittedDate()));
		p.setPassword(myForm.getRegPassword());
		p.setDischargedDate(null);
		myPatientDao.saveNewPatient(p);
		
	}


	public List<Patient> getAllPatient() {
		return myPatientDao.getAllPatient();
		// TODO Auto-generated method stub
		
	}


	public void setDischargedDate(int patientId) {
	
		Patient p= myPatientDao.setDischargedDate(patientId);
		p.setDischargedDate(new Date());
		myPatientDao.saveNewPatient(p);
		
	}


	public Patient getPatientById(String serachPatient) {
		
		return myPatientDao.getPatientById(serachPatient);
		
		
	}

	
}
