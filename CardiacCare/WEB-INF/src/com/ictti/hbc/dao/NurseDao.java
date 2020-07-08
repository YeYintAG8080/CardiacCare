package com.ictti.hbc.dao;

import com.ictti.hbc.business.entity.Nurse;

public interface NurseDao {
	public Nurse getNurseByEmailAndPassword(String email,String password);
}
