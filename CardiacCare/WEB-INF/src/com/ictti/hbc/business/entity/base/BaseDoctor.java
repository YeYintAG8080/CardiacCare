package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the doctor table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="doctor"
 */

public abstract class BaseDoctor  implements Serializable {

	public static String REF = "Doctor";
	public static String PROP_DOCTOR_NAME = "doctorName";
	public static String PROP_DATE_OF_BIRTH = "dateOfBirth";
	public static String PROP_EMAIL = "email";
	public static String PROP_ADDRESS = "address";
	public static String PROP_DEGREE = "degree";
	public static String PROP_SPECIALIZATION = "specialization";
	public static String PROP_EXPERIENCE = "experience";
	public static String PROP_PHONE = "phone";
	public static String PROP_DOCTOR_IMAGE = "doctorImage";
	public static String PROP_PROFILE_FILL = "profileFill";
	public static String PROP_BIOGRAPHY = "biography";
	public static String PROP_ID = "id";
	public static String PROP_PASSWORD = "password";


	// constructors
	public BaseDoctor () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDoctor (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseDoctor (
		java.lang.Integer id,
		java.lang.String doctorName,
		java.util.Date dateOfBirth,
		java.lang.String specialization,
		java.lang.String phone,
		java.lang.String experience,
		java.lang.String address,
		java.lang.String email,
		java.lang.String password,
		java.lang.String degree,
		java.lang.String doctorImage,
		java.lang.String biography,
		java.lang.String profileFill) {

		this.setId(id);
		this.setDoctorName(doctorName);
		this.setDateOfBirth(dateOfBirth);
		this.setSpecialization(specialization);
		this.setPhone(phone);
		this.setExperience(experience);
		this.setAddress(address);
		this.setEmail(email);
		this.setPassword(password);
		this.setDegree(degree);
		this.setDoctorImage(doctorImage);
		this.setBiography(biography);
		this.setProfileFill(profileFill);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String address;
	private java.lang.String biography;
	private java.util.Date dateOfBirth;
	private java.lang.String degree;
	private java.lang.String doctorImage;
	private java.lang.String doctorName;
	private java.lang.String email;
	private java.lang.String experience;
	private java.lang.String password;
	private java.lang.String phone;
	private java.lang.String profileFill;
	private java.lang.String specialization;

	// collections
	private java.util.Set<com.ictti.hbc.business.entity.Treatment> treatments;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="DOCTOR_ID"
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
	 * Return the value associated with the column: BIOGRAPHY
	 */
	public java.lang.String getBiography () {
		return biography;
	}

	/**
	 * Set the value related to the column: BIOGRAPHY
	 * @param biography the BIOGRAPHY value
	 */
	public void setBiography (java.lang.String biography) {
		this.biography = biography;
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
	 * Return the value associated with the column: DEGREE
	 */
	public java.lang.String getDegree () {
		return degree;
	}

	/**
	 * Set the value related to the column: DEGREE
	 * @param degree the DEGREE value
	 */
	public void setDegree (java.lang.String degree) {
		this.degree = degree;
	}



	/**
	 * Return the value associated with the column: DOCTOR_IMAGE
	 */
	public java.lang.String getDoctorImage () {
		return doctorImage;
	}

	/**
	 * Set the value related to the column: DOCTOR_IMAGE
	 * @param doctorImage the DOCTOR_IMAGE value
	 */
	public void setDoctorImage (java.lang.String doctorImage) {
		this.doctorImage = doctorImage;
	}



	/**
	 * Return the value associated with the column: DOCTOR_NAME
	 */
	public java.lang.String getDoctorName () {
		return doctorName;
	}

	/**
	 * Set the value related to the column: DOCTOR_NAME
	 * @param doctorName the DOCTOR_NAME value
	 */
	public void setDoctorName (java.lang.String doctorName) {
		this.doctorName = doctorName;
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
	 * Return the value associated with the column: EXPERIENCE
	 */
	public java.lang.String getExperience () {
		return experience;
	}

	/**
	 * Set the value related to the column: EXPERIENCE
	 * @param experience the EXPERIENCE value
	 */
	public void setExperience (java.lang.String experience) {
		this.experience = experience;
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
	 * Return the value associated with the column: PROFILE_FILL
	 */
	public java.lang.String getProfileFill () {
		return profileFill;
	}

	/**
	 * Set the value related to the column: PROFILE_FILL
	 * @param profileFill the PROFILE_FILL value
	 */
	public void setProfileFill (java.lang.String profileFill) {
		this.profileFill = profileFill;
	}



	/**
	 * Return the value associated with the column: SPECIALIZATION
	 */
	public java.lang.String getSpecialization () {
		return specialization;
	}

	/**
	 * Set the value related to the column: SPECIALIZATION
	 * @param specialization the SPECIALIZATION value
	 */
	public void setSpecialization (java.lang.String specialization) {
		this.specialization = specialization;
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
		if (!(obj instanceof com.ictti.hbc.business.entity.Doctor)) return false;
		else {
			com.ictti.hbc.business.entity.Doctor doctor = (com.ictti.hbc.business.entity.Doctor) obj;
			if (null == this.getId() || null == doctor.getId()) return false;
			else return (this.getId().equals(doctor.getId()));
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