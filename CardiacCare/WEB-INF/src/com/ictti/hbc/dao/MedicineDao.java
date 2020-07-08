package com.ictti.hbc.dao;

import java.util.List;

import com.ictti.hbc.business.entity.Medicine;

public interface MedicineDao {
	public List<Medicine> getMedicineListByTreatmentId(int treatment_id);
	public void saveNewMedicine(Medicine medicine);
}
