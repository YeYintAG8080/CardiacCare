package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the medicine table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="medicine"
 */

public abstract class BaseMedicine  implements Serializable {

	public static String REF = "Medicine";
	public static String PROP_MEDICATION_TIMES = "medicationTimes";
	public static String PROP_MEDICINE_NAME = "medicineName";
	public static String PROP_TREATMENT = "treatment";
	public static String PROP_ID = "id";


	// constructors
	public BaseMedicine () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMedicine (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMedicine (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Treatment treatment,
		java.lang.String medicineName,
		java.lang.String medicationTimes) {

		this.setId(id);
		this.setTreatment(treatment);
		this.setMedicineName(medicineName);
		this.setMedicationTimes(medicationTimes);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String medicationTimes;
	private java.lang.String medicineName;

	// many to one
	private com.ictti.hbc.business.entity.Treatment treatment;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="MEDICINE_ID"
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
	 * Return the value associated with the column: MEDICATION_TIMES
	 */
	public java.lang.String getMedicationTimes () {
		return medicationTimes;
	}

	/**
	 * Set the value related to the column: MEDICATION_TIMES
	 * @param medicationTimes the MEDICATION_TIMES value
	 */
	public void setMedicationTimes (java.lang.String medicationTimes) {
		this.medicationTimes = medicationTimes;
	}



	/**
	 * Return the value associated with the column: MEDICINE_NAME
	 */
	public java.lang.String getMedicineName () {
		return medicineName;
	}

	/**
	 * Set the value related to the column: MEDICINE_NAME
	 * @param medicineName the MEDICINE_NAME value
	 */
	public void setMedicineName (java.lang.String medicineName) {
		this.medicineName = medicineName;
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
		if (!(obj instanceof com.ictti.hbc.business.entity.Medicine)) return false;
		else {
			com.ictti.hbc.business.entity.Medicine medicine = (com.ictti.hbc.business.entity.Medicine) obj;
			if (null == this.getId() || null == medicine.getId()) return false;
			else return (this.getId().equals(medicine.getId()));
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