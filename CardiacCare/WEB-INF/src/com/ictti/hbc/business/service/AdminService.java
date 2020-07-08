package com.ictti.hbc.business.service;

import java.util.List;

import com.ictti.hbc.business.entity.Admin;
import com.ictti.hbc.business.entity.Feedback;
import com.ictti.hbc.dao.AdminDao;

public class AdminService {

	private AdminDao myAdminDao;
	
	public AdminDao getMyAdminDao() {
		return myAdminDao;
	}

	public void setMyAdminDao(AdminDao myAdminDao) {
		this.myAdminDao = myAdminDao;
	}

	public Admin getAdminByEmailAndPassword(String frmLoginEmail,
			String frmLoginPassword) {
		return myAdminDao.getAdminByEmailAndPassword(frmLoginEmail, frmLoginPassword);
	}

}
