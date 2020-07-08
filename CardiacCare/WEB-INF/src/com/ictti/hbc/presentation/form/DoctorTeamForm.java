package com.ictti.hbc.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.hbc.business.entity.Doctor;

public class DoctorTeamForm extends ValidatorForm {
private List<Doctor> frmDoctorList;
private Doctor frmDoctorDetail;
public Doctor getFrmDoctorDetail() {
	return frmDoctorDetail;
}

public void setFrmDoctorDetail(Doctor frmDoctorDetail) {
	this.frmDoctorDetail = frmDoctorDetail;
}

public List<Doctor> getFrmDoctorList() {
	return frmDoctorList;
}

public void setFrmDoctorList(List<Doctor> frmDoctorList) {
	this.frmDoctorList = frmDoctorList;
}
}
