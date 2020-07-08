package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BasePatient;



public class Patient extends BasePatient {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Patient () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Patient (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Patient (
		java.lang.Integer id,
		java.lang.String registerId,
		java.lang.String patientName,
		java.util.Date dateOfBirth,
		java.lang.String address,
		java.lang.String phone,
		java.lang.String diseaseName,
		java.lang.String bloodGroup,
		java.lang.String gender,
		java.lang.Integer weight,
		java.util.Date admittedDate,
		java.lang.String email,
		java.lang.String password) {

		super (
			id,
			registerId,
			patientName,
			dateOfBirth,
			address,
			phone,
			diseaseName,
			bloodGroup,
			gender,
			weight,
			admittedDate,
			email,
			password);
	}

/*[CONSTRUCTOR MARKER END]*/


}