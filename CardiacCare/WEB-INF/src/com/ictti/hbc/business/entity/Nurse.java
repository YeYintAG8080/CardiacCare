package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseNurse;



public class Nurse extends BaseNurse {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Nurse () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Nurse (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Nurse (
		java.lang.Integer id,
		java.lang.String phone,
		java.lang.String email,
		java.lang.String password) {

		super (
			id,
			phone,
			email,
			password);
	}

/*[CONSTRUCTOR MARKER END]*/


}