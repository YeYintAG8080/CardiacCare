package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the receptionist table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="receptionist"
 */

public abstract class BaseReceptionist  implements Serializable {

	public static String REF = "Receptionist";
	public static String PROP_EMAIL = "email";
	public static String PROP_PHONE = "phone";
	public static String PROP_ID = "id";
	public static String PROP_RECEPTIONIST_NAME = "receptionistName";
	public static String PROP_PASSWORD = "password";


	// constructors
	public BaseReceptionist () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseReceptionist (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseReceptionist (
		java.lang.Integer id,
		java.lang.String receptionistName,
		java.lang.String email,
		java.lang.String password,
		java.lang.String phone) {

		this.setId(id);
		this.setReceptionistName(receptionistName);
		this.setEmail(email);
		this.setPassword(password);
		this.setPhone(phone);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String email;
	private java.lang.String password;
	private java.lang.String phone;
	private java.lang.String receptionistName;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="RECEPTIONIST_ID"
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
	 * Return the value associated with the column: RECEPTIONIST_NAME
	 */
	public java.lang.String getReceptionistName () {
		return receptionistName;
	}

	/**
	 * Set the value related to the column: RECEPTIONIST_NAME
	 * @param receptionistName the RECEPTIONIST_NAME value
	 */
	public void setReceptionistName (java.lang.String receptionistName) {
		this.receptionistName = receptionistName;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.hbc.business.entity.Receptionist)) return false;
		else {
			com.ictti.hbc.business.entity.Receptionist receptionist = (com.ictti.hbc.business.entity.Receptionist) obj;
			if (null == this.getId() || null == receptionist.getId()) return false;
			else return (this.getId().equals(receptionist.getId()));
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