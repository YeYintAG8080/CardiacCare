package com.ictti.hbc.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.hbc.business.entity.Nurse;
import com.ictti.hbc.business.entity.Patient;

public class PatientDaoImpl extends HibernateDaoSupport implements PatientDao {

	@Override
	public List<Patient> getPatientList() {
		String hql="from Patient p where p.dischargedDate=null";
		List<Patient> l=getHibernateTemplate().find(hql);
		return l.isEmpty() || l==null? null:l;
	}

	@Override
	public Patient getPatientInfoDetailById(int patient_id) {
		String hql="from Patient p where p.id=?";
		List<Patient> l=getHibernateTemplate().find(hql,patient_id);
		return l.isEmpty() || l==null? null:l.get(0);
	}

	@Override
	public List<Patient> getPatientListByRegisterId(String register_id) {
		// TODO Auto-generated method stub
		String hql="from Patient p where p.registerId=? and p.dischargedDate=null";
		List<Patient> l=getHibernateTemplate().find(hql,register_id.trim());
		return l.isEmpty() || l==null? null:l;
	}//Search By Nurse

	@Override
	public Patient getPatientByRegisterId(String register_id) {
		String hql="from Patient p where p.registerId=?";
		List<Patient> l=getHibernateTemplate().find(hql,register_id.trim());
		return l.isEmpty() || l==null? null:l.get(0);
	}//Search By Doctor

	@Override
	public Patient getPatientByEmailAndPassword(String email, String password) {
		String hql="from Patient p where p.email=? and p.password=?";
		Object[] param={email,password};
		List<Patient> l=getHibernateTemplate().find(hql,param);
		
		return l.isEmpty() || l==null ? null:l.get(0);
	}

	@Override
	public void saveNewPatient(Patient patient) {
		getHibernateTemplate().saveOrUpdate(patient);	
	}

	@Override
	public int getListSize() {
		String hql="from Patient";
		List l=getHibernateTemplate().find(hql);
		return l.size();
	}

	@Override
	public Patient getPatient(String regPatientName, String regPatientDOB,
			String regPatientEmail) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date = format.parse(regPatientDOB);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String hql="from Patient i where i.patientName=? and i.dateOfBirth=? and i.email=?";
		Object[] param={regPatientName,date,regPatientEmail};
		List l= getHibernateTemplate().find(hql,param);
		return (Patient) (l.isEmpty() || l == null ? null : l.get(0));
	}

	@Override
	public List<Patient> getAllPatient() {
		String hql="from Patient";
		List<Patient> l=getHibernateTemplate().find(hql);
		return l.isEmpty()||l==null?null:l;
	}

	@Override
	public Patient setDischargedDate(int id) {
		String hql="from Patient i where i.id=?";
		List l=getHibernateTemplate().find(hql,id);
		return (Patient) (l.isEmpty() || l==null?null:l.get(0));
	}

	@Override
	public Patient getPatientById(String serachPatient) {
		String hql="from Patient i where i.registerId=?";
		List l=getHibernateTemplate().find(hql,serachPatient);
		return (Patient) (l.isEmpty() || l==null?null:l.get(0));
	}

	@Override
	public void updatePatientProfile(Patient patient) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(patient);
	}

}
