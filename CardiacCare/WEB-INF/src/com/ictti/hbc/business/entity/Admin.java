package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseAdmin;



public class Admin extends BaseAdmin {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Admin () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Admin (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Admin (
		java.lang.Integer id,
		java.lang.String adminName,
		java.lang.String email,
		java.lang.String password) {

		super (
			id,
			adminName,
			email,
			password);
	}

/*[CONSTRUCTOR MARKER END]*/


}