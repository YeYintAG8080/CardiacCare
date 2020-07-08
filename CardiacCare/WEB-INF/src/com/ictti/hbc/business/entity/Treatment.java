package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseTreatment;



public class Treatment extends BaseTreatment {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Treatment () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Treatment (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Treatment (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.DailyRecord dailyRecord,
		com.ictti.hbc.business.entity.Doctor doctor,
		java.util.Date treatmentDate) {

		super (
			id,
			dailyRecord,
			doctor,
			treatmentDate);
	}

/*[CONSTRUCTOR MARKER END]*/


}