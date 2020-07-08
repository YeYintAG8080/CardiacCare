package com.ictti.hbc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.ictti.hbc.business.entity.InjectionDose;

public class InjectionDaoImpl extends HibernateDaoSupport implements
		InjectionDao {

	@Override
	public List<InjectionDose> getInjectionListByTreatmentId(int treatment_id) {
		String hql="from InjectionDose i where i.treatment.id=?";
		List<InjectionDose> l=getHibernateTemplate().find(hql,treatment_id);
		return l.isEmpty() || l==null? null:l;
	}

	@Override
	public InjectionDose getInjectionDoseByInjectionId(int injection_id) {
		String hql="from InjectionDose i where i.id=?";
		List<InjectionDose> l=getHibernateTemplate().find(hql,injection_id);
		return l.isEmpty() || l==null? null:l.get(0);
	}

	@Override
	public void CompleteTask(InjectionDose injection) {
			getHibernateTemplate().saveOrUpdate(injection);
	}

	@Override
	public void saveNewInjectionDose(InjectionDose injection) {
		getHibernateTemplate().saveOrUpdate(injection);
	}

 

}
