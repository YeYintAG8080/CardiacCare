package com.ictti.hbc.business.entity;

import com.ictti.hbc.business.entity.base.BaseFeedback;



public class Feedback extends BaseFeedback {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Feedback () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Feedback (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Feedback (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Patient patient,
		java.lang.String feedback,
		java.util.Date feedbackDate,
		java.util.Date feedbackTimestamp) {

		super (
			id,
			patient,
			feedback,
			feedbackDate,
			feedbackTimestamp);
	}

/*[CONSTRUCTOR MARKER END]*/


}