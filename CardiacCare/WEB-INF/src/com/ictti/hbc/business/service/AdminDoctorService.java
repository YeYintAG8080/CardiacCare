package com.ictti.hbc.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.struts.upload.FormFile;

import com.ictti.hbc.business.entity.Doctor;
import com.ictti.hbc.dao.AdminDao;
import com.ictti.hbc.dao.AdminDoctorDao;
import com.ictti.hbc.presentation.form.AdminForm;

public class AdminDoctorService {

	public AdminDoctorDao myAdminDoctorDao;
	public AdminDao myAdminDao;

	

	public AdminDao getMyAdminDao() {
		return myAdminDao;
	}

	public void setMyAdminDao(AdminDao myAdminDao) {
		this.myAdminDao = myAdminDao;
	}

	public AdminDoctorDao getMyAdminDoctorDao() {
		return myAdminDoctorDao;
	}

	public void setMyAdminDoctorDao(AdminDoctorDao myAdminDoctorDao) {
		this.myAdminDoctorDao = myAdminDoctorDao;
	}

	public String getPassword(int n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJ" + "0123456789"
				+ "klmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}
	
	public void saveDoctorInfo(AdminForm myForm) throws ParseException{
		Doctor myDoctor = new Doctor();
		//myDoctor.setAddress(myForm.getRegDoctorAddress());
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		myDoctor.setDateOfBirth(format.parse(myForm.getRegDoctorDOB()));
		myDoctor.setDoctorName(myForm.getRegDoctorName());
		myDoctor.setEmail(myForm.getRegDoctorEmail());
		myDoctor.setId(null);
		myDoctor.setPassword(myForm.getRegDoctorPassword());
		myDoctor.setProfileFill("0");
    	myDoctor.setDegree("");
	    myDoctor.setBiography("");
	    myDoctor.setExperience("");
		myDoctor.setDoctorImage("");
		myDoctor.setPhone("");
		myDoctor.setAddress("");
		myDoctor.setSpecialization(myForm.getRegDoctorSpecialize());
		
		//myDoctor.setPhone(myForm.getRegDoctorPhone());
		myAdminDoctorDao.saveNewDoctor(myDoctor);
	}
	
	/*public void saveUpdateDoctorInfo(AdminForm myForm){
		Doctor d = myForm.getRegDoctor();
		d.setAddress(myForm.getRegDoctorAddress());
		d.setDegree(myForm.getRegDoctorDegree());
    	d.setBiography(myForm.getRegDoctorBio());
		d.setExperience(myForm.getRegDoctorExperience());
		d.setPassword(myForm.getRegDoctorPassword());
	    d.setSpecialization(myForm.getRegDoctorSpecialize());
	    d.setPhone(myForm.getRegDoctorPhone());
	    d.setProfileFill(myForm.getRegprofileFill());
	    myAdminDoctorDao.saveNewDoctor(d);
	}*/

	/*public void firstLoadRegistration(AdminForm myForm) {
		myForm.setRegDoctorName("");
		myForm.setRegDoctorDOB("");
		myForm.setRegDoctorDegree("");
		myForm.setRegDoctorExperience("");
		myForm.setRegDoctorShift("");
		myForm.setRegDoctorSpecialize("");
		myForm.setRegFormControl(null);

	}*/

	/*public void checkDoctorName(AdminForm myForm) {
		Doctor myDoctor = myAdminDoctorDao.getDoctorByName(myForm.getRegDoctorName());
		if (myDoctor != null) {
			myForm.setRegDoctorNameError(null);
			myForm.setRegFormControl(null);
		}
	}*/

	public void saveNewDoctor(AdminForm myForm) {
		Doctor myDoctor = new Doctor();
		myDoctor.setDoctorName(myForm.getRegDoctorName());

	}
	
	/*public void retrivePhoto(AdminForm myForm){
		Doctor myDoctor = myAdminDoctorDao.getDoctorByName(String.valueOf(myForm.getRegDoctorName()));
		myForm.setRegDoctor(myDoctor);
	}*/

}
