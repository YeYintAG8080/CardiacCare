package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseDailyRecord;



public class DailyRecord extends BaseDailyRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public DailyRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public DailyRecord (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public DailyRecord (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Patient patient,
		java.util.Date attemptDate,
		java.lang.String bloodPressure,
		java.lang.String bodyTemperature,
		java.lang.String spo2Level,
		java.lang.String diabetes,
		java.lang.String pulseRate) {

		super (
			id,
			patient,
			attemptDate,
			bloodPressure,
			bodyTemperature,
			spo2Level,
			diabetes,
			pulseRate);
	}

/*[CONSTRUCTOR MARKER END]*/


}