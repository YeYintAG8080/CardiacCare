package com.ictti.hbc.business.service;

import java.util.List;

import com.ictti.hbc.business.entity.Medicine;
import com.ictti.hbc.dao.MedicineDao;

public class MedicineService {
	private MedicineDao myMedicineDao;

	public void setMyMedicineDao(MedicineDao myMedicineDao) {
		this.myMedicineDao = myMedicineDao;
	}
	public List<Medicine> getMedicineListByTreatmentId(int treatment_id) {
		return myMedicineDao.getMedicineListByTreatmentId(treatment_id);	
	}
	public void saveMedicine(Medicine medicine){
		myMedicineDao.saveNewMedicine(medicine);
	}
}
