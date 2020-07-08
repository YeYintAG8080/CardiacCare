package com.ictti.hbc.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the admin table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="admin"
 */

public abstract class BaseAdmin  implements Serializable {

	public static String REF = "Admin";
	public static String PROP_EMAIL = "email";
	public static String PROP_ADMIN_NAME = "adminName";
	public static String PROP_ID = "id";
	public static String PROP_PASSWORD = "password";


	// constructors
	public BaseAdmin () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAdmin (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAdmin (
		java.lang.Integer id,
		java.lang.String adminName,
		java.lang.String email,
		java.lang.String password) {

		this.setId(id);
		this.setAdminName(adminName);
		this.setEmail(email);
		this.setPassword(password);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String adminName;
	private java.lang.String email;
	private java.lang.String password;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="ADMIN_ID"
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
	 * Return the value associated with the column: ADMIN_NAME
	 */
	public java.lang.String getAdminName () {
		return adminName;
	}

	/**
	 * Set the value related to the column: ADMIN_NAME
	 * @param adminName the ADMIN_NAME value
	 */
	public void setAdminName (java.lang.String adminName) {
		this.adminName = adminName;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.hbc.business.entity.Admin)) return false;
		else {
			com.ictti.hbc.business.entity.Admin admin = (com.ictti.hbc.business.entity.Admin) obj;
			if (null == this.getId() || null == admin.getId()) return false;
			else return (this.getId().equals(admin.getId()));
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