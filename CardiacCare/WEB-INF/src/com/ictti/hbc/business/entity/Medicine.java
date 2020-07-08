package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseMedicine;



public class Medicine extends BaseMedicine {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Medicine () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Medicine (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Medicine (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Treatment treatment,
		java.lang.String medicineName,
		java.lang.String medicationTimes) {

		super (
			id,
			treatment,
			medicineName,
			medicationTimes);
	}

/*[CONSTRUCTOR MARKER END]*/


}