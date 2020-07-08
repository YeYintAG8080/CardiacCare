package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the injection_dose table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="injection_dose"
 */

public abstract class BaseInjectionDose  implements Serializable {

	public static String REF = "InjectionDose";
	public static String PROP_TREATMENT = "treatment";
	public static String PROP_INJECTION_START_TIME = "injectionStartTime";
	public static String PROP_COMPLETE = "complete";
	public static String PROP_INJECTION_DOSE_NAME = "injectionDoseName";
	public static String PROP_ID = "id";
	public static String PROP_INJECTION_LEVEL = "injectionLevel";


	// constructors
	public BaseInjectionDose () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInjectionDose (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseInjectionDose (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Treatment treatment,
		java.lang.String injectionDoseName,
		java.lang.String injectionLevel,
		java.util.Date injectionStartTime,
		java.lang.String complete) {

		this.setId(id);
		this.setTreatment(treatment);
		this.setInjectionDoseName(injectionDoseName);
		this.setInjectionLevel(injectionLevel);
		this.setInjectionStartTime(injectionStartTime);
		this.setComplete(complete);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String complete;
	private java.lang.String injectionDoseName;
	private java.lang.String injectionLevel;
	private java.util.Date injectionStartTime;

	// many to one
	private com.ictti.hbc.business.entity.Treatment treatment;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="INJECTION_DOSE_ID"
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
	 * Return the value associated with the column: COMPLETE
	 */
	public java.lang.String getComplete () {
		return complete;
	}

	/**
	 * Set the value related to the column: COMPLETE
	 * @param complete the COMPLETE value
	 */
	public void setComplete (java.lang.String complete) {
		this.complete = complete;
	}



	/**
	 * Return the value associated with the column: INJECTION_DOSE_NAME
	 */
	public java.lang.String getInjectionDoseName () {
		return injectionDoseName;
	}

	/**
	 * Set the value related to the column: INJECTION_DOSE_NAME
	 * @param injectionDoseName the INJECTION_DOSE_NAME value
	 */
	public void setInjectionDoseName (java.lang.String injectionDoseName) {
		this.injectionDoseName = injectionDoseName;
	}



	/**
	 * Return the value associated with the column: INJECTION_LEVEL
	 */
	public java.lang.String getInjectionLevel () {
		return injectionLevel;
	}

	/**
	 * Set the value related to the column: INJECTION_LEVEL
	 * @param injectionLevel the INJECTION_LEVEL value
	 */
	public void setInjectionLevel (java.lang.String injectionLevel) {
		this.injectionLevel = injectionLevel;
	}



	/**
	 * Return the value associated with the column: INJECTION_START_TIME
	 */
	public java.util.Date getInjectionStartTime () {
		return injectionStartTime;
	}

	/**
	 * Set the value related to the column: INJECTION_START_TIME
	 * @param injectionStartTime the INJECTION_START_TIME value
	 */
	public void setInjectionStartTime (java.util.Date injectionStartTime) {
		this.injectionStartTime = injectionStartTime;
	}



	/**
	 * Return the value associated with the column: TREATMENT_ID
	 */
	public com.ictti.hbc.business.entity.Treatment getTreatment () {
		return treatment;
	}

	/**
	 * Set the value related to the column: TREATMENT_ID
	 * @param treatment the TREATMENT_ID value
	 */
	public void setTreatment (com.ictti.hbc.business.entity.Treatment treatment) {
		this.treatment = treatment;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.hbc.business.entity.InjectionDose)) return false;
		else {
			com.ictti.hbc.business.entity.InjectionDose injectionDose = (com.ictti.hbc.business.entity.InjectionDose) obj;
			if (null == this.getId() || null == injectionDose.getId()) return false;
			else return (this.getId().equals(injectionDose.getId()));
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