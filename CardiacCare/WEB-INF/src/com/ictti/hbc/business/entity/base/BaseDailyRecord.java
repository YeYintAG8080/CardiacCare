package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the daily_record table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="daily_record"
 */

public abstract class BaseDailyRecord  implements Serializable {

	public static String REF = "DailyRecord";
	public static String PROP_ATTEMPT_DATE = "attemptDate";
	public static String PROP_BLOOD_PRESSURE = "bloodPressure";
	public static String PROP_ELECTROCARDIGRAPHY = "electrocardigraphy";
	public static String PROP_ECHOCARDIOGRAPHY = "echocardiography";
	public static String PROP_BODY_TEMPERATURE = "bodyTemperature";
	public static String PROP_BLOOD_TEST = "bloodTest";
	public static String PROP_PULSE_RATE = "pulseRate";
	public static String PROP_PATIENT = "patient";
	public static String PROP_DIABETES = "diabetes";
	public static String PROP_ID = "id";
	public static String PROP_SPO2_LEVEL = "spo2Level";


	// constructors
	public BaseDailyRecord () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDailyRecord (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseDailyRecord (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Patient patient,
		java.util.Date attemptDate,
		java.lang.String bloodPressure,
		java.lang.String bodyTemperature,
		java.lang.String spo2Level,
		java.lang.String diabetes,
		java.lang.String pulseRate) {

		this.setId(id);
		this.setPatient(patient);
		this.setAttemptDate(attemptDate);
		this.setBloodPressure(bloodPressure);
		this.setBodyTemperature(bodyTemperature);
		this.setSpo2Level(spo2Level);
		this.setDiabetes(diabetes);
		this.setPulseRate(pulseRate);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date attemptDate;
	private java.lang.String bloodPressure;
	private java.lang.String bloodTest;
	private java.lang.String bodyTemperature;
	private java.lang.String diabetes;
	private java.lang.String echocardiography;
	private java.lang.String electrocardigraphy;
	private java.lang.String pulseRate;
	private java.lang.String spo2Level;

	// many to one
	private com.ictti.hbc.business.entity.Patient patient;

	// collections
	private java.util.Set<com.ictti.hbc.business.entity.Treatment> treatments;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="DAILY_RECORD_ID"
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
	 * Return the value associated with the column: ATTEMPT_DATE
	 */
	public java.util.Date getAttemptDate () {
		return attemptDate;
	}

	/**
	 * Set the value related to the column: ATTEMPT_DATE
	 * @param attemptDate the ATTEMPT_DATE value
	 */
	public void setAttemptDate (java.util.Date attemptDate) {
		this.attemptDate = attemptDate;
	}



	/**
	 * Return the value associated with the column: BLOOD_PRESSURE
	 */
	public java.lang.String getBloodPressure () {
		return bloodPressure;
	}

	/**
	 * Set the value related to the column: BLOOD_PRESSURE
	 * @param bloodPressure the BLOOD_PRESSURE value
	 */
	public void setBloodPressure (java.lang.String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}



	/**
	 * Return the value associated with the column: BLOOD_TEST
	 */
	public java.lang.String getBloodTest () {
		return bloodTest;
	}

	/**
	 * Set the value related to the column: BLOOD_TEST
	 * @param bloodTest the BLOOD_TEST value
	 */
	public void setBloodTest (java.lang.String bloodTest) {
		this.bloodTest = bloodTest;
	}



	/**
	 * Return the value associated with the column: BODY_TEMPERATURE
	 */
	public java.lang.String getBodyTemperature () {
		return bodyTemperature;
	}

	/**
	 * Set the value related to the column: BODY_TEMPERATURE
	 * @param bodyTemperature the BODY_TEMPERATURE value
	 */
	public void setBodyTemperature (java.lang.String bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}



	/**
	 * Return the value associated with the column: DIABETES
	 */
	public java.lang.String getDiabetes () {
		return diabetes;
	}

	/**
	 * Set the value related to the column: DIABETES
	 * @param diabetes the DIABETES value
	 */
	public void setDiabetes (java.lang.String diabetes) {
		this.diabetes = diabetes;
	}



	/**
	 * Return the value associated with the column: ECHOCARDIOGRAPHY
	 */
	public java.lang.String getEchocardiography () {
		return echocardiography;
	}

	/**
	 * Set the value related to the column: ECHOCARDIOGRAPHY
	 * @param echocardiography the ECHOCARDIOGRAPHY value
	 */
	public void setEchocardiography (java.lang.String echocardiography) {
		this.echocardiography = echocardiography;
	}



	/**
	 * Return the value associated with the column: ELECTROCARDIGRAPHY
	 */
	public java.lang.String getElectrocardigraphy () {
		return electrocardigraphy;
	}

	/**
	 * Set the value related to the column: ELECTROCARDIGRAPHY
	 * @param electrocardigraphy the ELECTROCARDIGRAPHY value
	 */
	public void setElectrocardigraphy (java.lang.String electrocardigraphy) {
		this.electrocardigraphy = electrocardigraphy;
	}



	/**
	 * Return the value associated with the column: PULSE_RATE
	 */
	public java.lang.String getPulseRate () {
		return pulseRate;
	}

	/**
	 * Set the value related to the column: PULSE_RATE
	 * @param pulseRate the PULSE_RATE value
	 */
	public void setPulseRate (java.lang.String pulseRate) {
		this.pulseRate = pulseRate;
	}



	/**
	 * Return the value associated with the column: SPO2_LEVEL
	 */
	public java.lang.String getSpo2Level () {
		return spo2Level;
	}

	/**
	 * Set the value related to the column: SPO2_LEVEL
	 * @param spo2Level the SPO2_LEVEL value
	 */
	public void setSpo2Level (java.lang.String spo2Level) {
		this.spo2Level = spo2Level;
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



	/**
	 * Return the value associated with the column: treatments
	 */
	public java.util.Set<com.ictti.hbc.business.entity.Treatment> getTreatments () {
		return treatments;
	}

	/**
	 * Set the value related to the column: treatments
	 * @param treatments the treatments value
	 */
	public void setTreatments (java.util.Set<com.ictti.hbc.business.entity.Treatment> treatments) {
		this.treatments = treatments;
	}

	public void addTotreatments (com.ictti.hbc.business.entity.Treatment treatment) {
		if (null == getTreatments()) setTreatments(new java.util.TreeSet<com.ictti.hbc.business.entity.Treatment>());
		getTreatments().add(treatment);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.hbc.business.entity.DailyRecord)) return false;
		else {
			com.ictti.hbc.business.entity.DailyRecord dailyRecord = (com.ictti.hbc.business.entity.DailyRecord) obj;
			if (null == this.getId() || null == dailyRecord.getId()) return false;
			else return (this.getId().equals(dailyRecord.getId()));
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