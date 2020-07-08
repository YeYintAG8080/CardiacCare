package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the feedback table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="feedback"
 */

public abstract class BaseFeedback  implements Serializable {

	public static String REF = "Feedback";
	public static String PROP_FEEDBACK = "feedback";
	public static String PROP_FEEDBACK_DATE = "feedbackDate";
	public static String PROP_FEEDBACK_TIMESTAMP = "feedbackTimestamp";
	public static String PROP_PATIENT = "patient";
	public static String PROP_ID = "id";


	// constructors
	public BaseFeedback () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseFeedback (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseFeedback (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Patient patient,
		java.lang.String feedback,
		java.util.Date feedbackDate,
		java.util.Date feedbackTimestamp) {

		this.setId(id);
		this.setPatient(patient);
		this.setFeedback(feedback);
		this.setFeedbackDate(feedbackDate);
		this.setFeedbackTimestamp(feedbackTimestamp);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String feedback;
	private java.util.Date feedbackDate;
	private java.util.Date feedbackTimestamp;

	// many to one
	private com.ictti.hbc.business.entity.Patient patient;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="FEEDBACK_ID"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: FEEDBACK
	 */
	public java.lang.String getFeedback () {
		return feedback;
	}

	/**
	 * Set the value related to the column: FEEDBACK
	 * @param feedback the FEEDBACK value
	 */
	public void setFeedback (java.lang.String feedback) {
		this.feedback = feedback;
	}



	/**
	 * Return the value associated with the column: FEEDBACK_DATE
	 */
	public java.util.Date getFeedbackDate () {
		return feedbackDate;
	}

	/**
	 * Set the value related to the column: FEEDBACK_DATE
	 * @param feedbackDate the FEEDBACK_DATE value
	 */
	public void setFeedbackDate (java.util.Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}



	/**
	 * Return the value associated with the column: FEEDBACK_TIMESTAMP
	 */
	public java.util.Date getFeedbackTimestamp () {
		return feedbackTimestamp;
	}

	/**
	 * Set the value related to the column: FEEDBACK_TIMESTAMP
	 * @param feedbackTimestamp the FEEDBACK_TIMESTAMP value
	 */
	public void setFeedbackTimestamp (java.util.Date feedbackTimestamp) {
		this.feedbackTimestamp = feedbackTimestamp;
	}



	/**
	 * Return the value associated with the column: PATIENT_ID
	 */
	public com.ictti.hbc.business.entity.Patient getPatient () {
		return patient;
	}

	/**
	 * Set the value related to the column: PATIENT_ID
	 * @param patient the PATIENT_ID value
	 */
	public void setPatient (com.ictti.hbc.business.entity.Patient patient) {
		this.patient = patient;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.hbc.business.entity.Feedback)) return false;
		else {
			com.ictti.hbc.business.entity.Feedback feedback = (com.ictti.hbc.business.entity.Feedback) obj;
			if (null == this.getId() || null == feedback.getId()) return false;
			else return (this.getId().equals(feedback.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}