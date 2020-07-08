package com.ictti.hbc.business.entity;
 


import com.ictti.hbc.business.entity.base.BaseInjectionDose;



public class InjectionDose extends BaseInjectionDose {
	private static final long serialVersionUID = 1L;
	 
	
	 
	/*[CONSTRUCTOR MARKER BEGIN]*/
	public InjectionDose () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public InjectionDose (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public InjectionDose (
		java.lang.Integer id,
		com.ictti.hbc.business.entity.Treatment treatment,
		java.lang.String injectionDoseName,
		java.lang.String injectionLevel,
		java.util.Date injectionStartTime,
		java.lang.String complete) {

		super (
			id,
			treatment,
			injectionDoseName,
			injectionLevel,
			injectionStartTime,
			complete);
	}

/*[CONSTRUCTOR MARKER END]*/
 
}