package com.ictti.hbc.dao;

import java.util.List;

import com.ictti.hbc.business.entity.InjectionDose;

public interface InjectionDao {
	public List<InjectionDose> getInjectionListByTreatmentId(int treatment_id);
	public InjectionDose getInjectionDoseByInjectionId(int injection_id);
	public void CompleteTask(InjectionDose injection);
	public void saveNewInjectionDose(InjectionDose injection);
}
