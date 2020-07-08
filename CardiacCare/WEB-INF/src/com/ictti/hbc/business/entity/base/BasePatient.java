package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the patient table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="patient"
 */

public abstract class BasePatient  implements Serializable {

	public static String REF = "Patient";
	public static String PROP_DATE_OF_BIRTH = "dateOfBirth";
	public static String PROP_REGISTER_ID = "registerId";
	public static String PROP_BLOOD_GROUP = "bloodGroup";
	public static String PROP_EMAIL = "email";
	public static String PROP_ADDRESS = "address";
	public static String PROP_DISEASE_NAME = "diseaseName";
	public static String PROP_PATIENT_NAME = "patientName";
	public static String PROP_GENDER = "gender";
	public static String PROP_WEIGHT = "weight";
	public static String PROP_ADMITTED_DATE = "admittedDate";
	public static String PROP_UPDATE_LAB_RESULT = "updateLabResult";
	public static String PROP_PHONE = "phone";
	public static String PROP_ID = "id";
	public static String PROP_DISCHARGED_DATE = "dischargedDate";
	public static String PROP_PASSWORD = "password";


	// constructors
	public BasePatient () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePatient (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePatient (
		java.lang.Integer id,
		java.lang.String registerId,
		java.lang.String patientName,
		java.util.Date dateOfBirth,
		java.lang.String address,
		java.lang.String phone,
		java.lang.String diseaseName,
		java.lang.String bloodGroup,
		java.lang.String gender,
		java.lang.Integer weight,
		java.util.Date admittedDate,
		java.lang.String email,
		java.lang.String password) {

		this.setId(id);
		this.setRegisterId(registerId);
		this.setPatientName(patientName);
		this.setDateOfBirth(dateOfBirth);
		this.setAddress(address);
		this.setPhone(phone);
		this.setDiseaseName(diseaseName);
		this.setBloodGroup(bloodGroup);
		this.setGender(gender);
		this.setWeight(weight);
		this.setAdmittedDate(admittedDate);
		this.setEmail(email);
		this.setPassword(password);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String address;
	private java.util.Date admittedDate;
	private java.lang.String bloodGroup;
	private java.util.Date dateOfBirth;
	private java.util.Date dischargedDate;
	private java.lang.String diseaseName;
	private java.lang.String email;
	private java.lang.String gender;
	private java.lang.String password;
	private java.lang.String patientName;
	private java.lang.String phone;
	private java.lang.String registerId;
	private java.lang.String updateLabResult;
	private java.lang.Integer weight;

	// collections
	private java.util.Set<com.ictti.hbc.business.entity.DailyRecord> dailyRecords;
	private java.util.Set<com.ictti.hbc.business.entity.Feedback> feedbacks;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="PATIENT_ID"
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
	 * Return the value associated with the column: ADDRESS
	 */
	public java.lang.String getAddress () {
		return address;
	}

	/**
	 * Set the value related to the column: ADDRESS
	 * @param address the ADDRESS value
	 */
	public void setAddress (java.lang.String address) {
		this.address = address;
	}



	/**
	 * Return the value associated with the column: ADMITTED_DATE
	 */
	public java.util.Date getAdmittedDate () {
		return admittedDate;
	}

	/**
	 * Set the value related to the column: ADMITTED_DATE
	 * @param admittedDate the ADMITTED_DATE value
	 */
	public void setAdmittedDate (java.util.Date admittedDate) {
		this.admittedDate = admittedDate;
	}



	/**
	 * Return the value associated with the column: BLOOD_GROUP
	 */
	public java.lang.String getBloodGroup () {
		return bloodGroup;
	}

	/**
	 * Set the value related to the column: BLOOD_GROUP
	 * @param bloodGroup the BLOOD_GROUP value
	 */
	public void setBloodGroup (java.lang.String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}



	/**
	 * Return the value associated with the column: DATE_OF_BIRTH
	 */
	public java.util.Date getDateOfBirth () {
		return dateOfBirth;
	}

	/**
	 * Set the value related to the column: DATE_OF_BIRTH
	 * @param dateOfBirth the DATE_OF_BIRTH value
	 */
	public void setDateOfBirth (java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	/**
	 * Return the value associated with the column: DISCHARGED_DATE
	 */
	public java.util.Date getDischargedDate () {
		return dischargedDate;
	}

	/**
	 * Set the value related to the column: DISCHARGED_DATE
	 * @param dischargedDate the DISCHARGED_DATE value
	 */
	public void setDischargedDate (java.util.Date dischargedDate) {
		this.dischargedDate = dischargedDate;
	}



	/**
	 * Return the value associated with the column: DISEASE_NAME
	 */
	public java.lang.String getDiseaseName () {
		return diseaseName;
	}

	/**
	 * Set the value related to the column: DISEASE_NAME
	 * @param diseaseName the DISEASE_NAME value
	 */
	public void setDiseaseName (java.lang.String diseaseName) {
		this.diseaseName = diseaseName;
	}



	/**
	 * Return the value associated with the column: EMAIL
	 */
	public java.lang.String getEmail () {
		return email;
	}

	/**
	 * Set the value related to the column: EMAIL
	 * @param email the EMAIL value
	 */
	public void setEmail (java.lang.String email) {
		this.email = email;
	}



	/**
	 * Return the value associated with the column: GENDER
	 */
	public java.lang.String getGender () {
		return gender;
	}

	/**
	 * Set the value related to the column: GENDER
	 * @param gender the GENDER value
	 */
	public void setGender (java.lang.String gender) {
		this.gender = gender;
	}



	/**
	 * Return the value associated with the column: PASSWORD
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: PASSWORD
	 * @param password the PASSWORD value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: PATIENT_NAME
	 */
	public java.lang.String getPatientName () {
		return patientName;
	}

	/**
	 * Set the value related to the column: PATIENT_NAME
	 * @param patientName the PATIENT_NAME value
	 */
	public void setPatientName (java.lang.String patientName) {
		this.patientName = patientName;
	}



	/**
	 * Return the value associated with the column: PHONE
	 */
	public java.lang.String getPhone () {
		return phone;
	}

	/**
	 * Set the value related to the column: PHONE
	 * @param phone the PHONE value
	 */
	public void setPhone (java.lang.String phone) {
		this.phone = phone;
	}



	/**
	 * Return the value associated with the column: REGISTER_ID
	 */
	public java.lang.String getRegisterId () {
		return registerId;
	}

	/**
	 * Set the value related to the column: REGISTER_ID
	 * @param registerId the REGISTER_ID value
	 */
	public void setRegisterId (java.lang.String registerId) {
		this.registerId = registerId;
	}



	/**
	 * Return the value associated with the column: UPDATE_LAB_RESULT
	 */
	public java.lang.String getUpdateLabResult () {
		return updateLabResult;
	}

	/**
	 * Set the value related to the column: UPDATE_LAB_RESULT
	 * @param updateLabResult the UPDATE_LAB_RESULT value
	 */
	public void setUpdateLabResult (java.lang.String updateLabResult) {
		this.updateLabResult = updateLabResult;
	}



	/**
	 * Return the value associated with the column: WEIGHT
	 */
	public java.lang.Integer getWeight () {
		return weight;
	}

	/**
	 * Set the value related to the column: WEIGHT
	 * @param weight the WEIGHT value
	 */
	public void setWeight (java.lang.Integer weight) {
		this.weight = weight;
	}



	/**
	 * Return the value associated with the column: dailyRecords
	 */
	public java.util.Set<com.ictti.hbc.business.entity.DailyRecord> getDailyRecords () {
		return dailyRecords;
	}

	/**
	 * Set the value related to the column: dailyRecords
	 * @param dailyRecords the dailyRecords value
	 */
	public void setDailyRecords (java.util.Set<com.ictti.hbc.business.entity.DailyRecord> dailyRecords) {
		this.dailyRecords = dailyRecords;
	}

	public void addTodailyRecords (com.ictti.hbc.business.entity.DailyRecord dailyRecord) {
		if (null == getDailyRecords()) setDailyRecords(new java.util.TreeSet<com.ictti.hbc.business.entity.DailyRecord>());
		getDailyRecords().add(dailyRecord);
	}



	/**
	 * Return the value associated with the column: feedbacks
	 */
	public java.util.Set<com.ictti.hbc.business.entity.Feedback> getFeedbacks () {
		return feedbacks;
	}

	/**
	 * Set the value related to the column: feedbacks
	 * @param feedbacks the feedbacks value
	 */
	public void setFeedbacks (java.util.Set<com.ictti.hbc.business.entity.Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public void addTofeedbacks (com.ictti.hbc.business.entity.Feedback feedback) {
		if (null == getFeedbacks()) setFeedbacks(new java.util.TreeSet<com.ictti.hbc.business.entity.Feedback>());
		getFeedbacks().add(feedback);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.hbc.business.entity.Patient)) return false;
		else {
			com.ictti.hbc.business.entity.Patient patient = (com.ictti.hbc.business.entity.Patient) obj;
			if (null == this.getId() || null == patient.getId()) return false;
			else return (this.getId().equals(patient.getId()));
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