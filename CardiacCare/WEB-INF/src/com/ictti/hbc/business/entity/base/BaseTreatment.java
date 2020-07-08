package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the treatment table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="treatment"
 */

public abstract class BaseTreatment  implements Serializable {

	public static String REF = "Treatment";
	public static String PROP_SUGGESTION = "suggestion";
	public static String PROP_DAILY_RECORD = "dailyRecord";
	public static String PROP_DOCTOR = "doctor";
	public static String PROP_ID = "id";
	public static String PROP_TREATMENT_DATE = "treatmentDate";


	// constructors
	public BaseTreatment () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTreatment (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTreatment (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.DailyRecord dailyRecord,
		com.ictti.hbc.business.entity.Doctor doctor,
		java.util.Date treatmentDate) {

		this.setId(id);
		this.setDailyRecord(dailyRecord);
		this.setDoctor(doctor);
		this.setTreatmentDate(treatmentDate);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String suggestion;
	private java.util.Date treatmentDate;

	// many to one
	private com.ictti.hbc.business.entity.DailyRecord dailyRecord;
	private com.ictti.hbc.business.entity.Doctor doctor;

	// collections
	private java.util.Set<com.ictti.hbc.business.entity.InjectionDose> injectionDoses;
	private java.util.Set<com.ictti.hbc.business.entity.Medicine> medicines;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="TREATMENT_ID"
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
	 * Return the value associated with the column: SUGGESTION
	 */
	public java.lang.String getSuggestion () {
		return suggestion;
	}

	/**
	 * Set the value related to the column: SUGGESTION
	 * @param suggestion the SUGGESTION value
	 */
	public void setSuggestion (java.lang.String suggestion) {
		this.suggestion = suggestion;
	}



	/**
	 * Return the value associated with the column: TREATMENT_DATE
	 */
	public java.util.Date getTreatmentDate () {
		return treatmentDate;
	}

	/**
	 * Set the value related to the column: TREATMENT_DATE
	 * @param treatmentDate the TREATMENT_DATE value
	 */
	public void setTreatmentDate (java.util.Date treatmentDate) {
		this.treatmentDate = treatmentDate;
	}



	/**
	 * Return the value associated with the column: DAILY_RECORD_ID
	 */
	public com.ictti.hbc.business.entity.DailyRecord getDailyRecord () {
		return dailyRecord;
	}

	/**
	 * Set the value related to the column: DAILY_RECORD_ID
	 * @param dailyRecord the DAILY_RECORD_ID value
	 */
	public void setDailyRecord (com.ictti.hbc.business.entity.DailyRecord dailyRecord) {
		this.dailyRecord = dailyRecord;
	}



	/**
	 * Return the value associated with the column: DOCTOR_ID
	 */
	public com.ictti.hbc.business.entity.Doctor getDoctor () {
		return doctor;
	}

	/**
	 * Set the value related to the column: DOCTOR_ID
	 * @param doctor the DOCTOR_ID value
	 */
	public void setDoctor (com.ictti.hbc.business.entity.Doctor doctor) {
		this.doctor = doctor;
	}



	/**
	 * Return the value associated with the column: injectionDoses
	 */
	public java.util.Set<com.ictti.hbc.business.entity.InjectionDose> getInjectionDoses () {
		return injectionDoses;
	}

	/**
	 * Set the value related to the column: injectionDoses
	 * @param injectionDoses the injectionDoses value
	 */
	public void setInjectionDoses (java.util.Set<com.ictti.hbc.business.entity.InjectionDose> injectionDoses) {
		this.injectionDoses = injectionDoses;
	}

	public void addToinjectionDoses (com.ictti.hbc.business.entity.InjectionDose injectionDose) {
		if (null == getInjectionDoses()) setInjectionDoses(new java.util.TreeSet<com.ictti.hbc.business.entity.InjectionDose>());
		getInjectionDoses().add(injectionDose);
	}



	/**
	 * Return the value associated with the column: medicines
	 */
	public java.util.Set<com.ictti.hbc.business.entity.Medicine> getMedicines () {
		return medicines;
	}

	/**
	 * Set the value related to the column: medicines
	 * @param medicines the medicines value
	 */
	public void setMedicines (java.util.Set<com.ictti.hbc.business.entity.Medicine> medicines) {
		this.medicines = medicines;
	}

	public void addTomedicines (com.ictti.hbc.business.entity.Medicine medicine) {
		if (null == getMedicines()) setMedicines(new java.util.TreeSet<com.ictti.hbc.business.entity.Medicine>());
		getMedicines().add(medicine);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.hbc.business.entity.Treatment)) return false;
		else {
			com.ictti.hbc.business.entity.Treatment treatment = (com.ictti.hbc.business.entity.Treatment) obj;
			if (null == this.getId() || null == treatment.getId()) return false;
			else return (this.getId().equals(treatment.getId()));
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