package com.ictti.hbc.dao;

import com.ictti.hbc.business.entity.Receptionist;

public interface ReceptionistDao {

	Receptionist getReceptionistByEmailandPassword(String email, String password);

}
