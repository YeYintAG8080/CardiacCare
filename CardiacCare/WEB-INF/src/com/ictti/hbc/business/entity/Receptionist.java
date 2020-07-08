package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseReceptionist;



public class Receptionist extends BaseReceptionist {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Receptionist () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Receptionist (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Receptionist (
		java.lang.Integer id,
		java.lang.String receptionistName,
		java.lang.String email,
		java.lang.String password,
		java.lang.String phone) {

		super (
			id,
			receptionistName,
			email,
			password,
			phone);
	}

/*[CONSTRUCTOR MARKER END]*/


}