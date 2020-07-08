package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseDoctor;



public class Doctor extends BaseDoctor {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Doctor () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Doctor (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Doctor (
		java.lang.Integer id,
		java.lang.String doctorName,
		java.util.Date dateOfBirth,
		java.lang.String specialization,
		java.lang.String phone,
		java.lang.String experience,
		java.lang.String address,
		java.lang.String email,
		java.lang.String password,
		java.lang.String degree,
		java.lang.String doctorImage,
		java.lang.String biography,
		java.lang.String profileFill) {

		super (
			id,
			doctorName,
			dateOfBirth,
			specialization,
			phone,
			experience,
			address,
			email,
			password,
			degree,
			doctorImage,
			biography,
			profileFill);
	}

/*[CONSTRUCTOR MARKER END]*/


}