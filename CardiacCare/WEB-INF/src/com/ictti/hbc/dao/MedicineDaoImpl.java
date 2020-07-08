package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.InjectionDose;
import com.ictti.hbc.business.entity.Medicine;

public class MedicineDaoImpl extends HibernateDaoSupport implements MedicineDao {

	@Override
	public List<Medicine> getMedicineListByTreatmentId(int treatment_id) {
		String hql="from Medicine m where m.treatment.id=?";
		List<Medicine> l=getHibernateTemplate().find(hql,treatment_id);
		return l.isEmpty() || l==null? null:l;
	}

	@Override
	public void saveNewMedicine(Medicine medicine) {
		getHibernateTemplate().saveOrUpdate(medicine);
		
	}

}
