package com.ictti.hbc.dao;

import com.ictti.hbc.business.entity.Admin;

public interface AdminDao {

	public Admin getAdminByEmailAndPassword(String frmLoginEmail,
			String frmLoginPassword);

}
