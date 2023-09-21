package com.CarServiceManagement.GoldenGearGarage.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CarServiceManagement.GoldenGearGarage.entity.ServiceTechnician;


@Repository
public class ServiceTechnicianDao {
	
	@Autowired
	SessionFactory factory;

	public String getByTechnicianId() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ServiceTechnician.class);
		return "id";
	}

	public String getByFirstname() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ServiceTechnician.class);
		return "Firstname";
	}

	public String getByLastname() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ServiceTechnician.class);
		return "Lastname";
	}

	public String getBySpecialization() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ServiceTechnician.class);
		return "Specialization";
	}

	public String insertTechnician(ServiceTechnician servicetechnician) {
		Session session = factory.openSession();
		session.save(servicetechnician);
		session.beginTransaction().commit();
		return "Technician Inserted in to table";
	}

	public List<ServiceTechnician> getTechnicianInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ServiceTechnician.class);
		return criteria.list();
	}

	public String updateTechnicianData(ServiceTechnician servicetechnician) {
		Session session = factory.openSession();
		session.update(servicetechnician);
		session.beginTransaction().commit();
		return "Technician Table updated";
	}

	public String deleteTechnicianData(ServiceTechnician servicetechnician) {
		Session session = factory.openSession();
		session.delete(servicetechnician);
		session.beginTransaction().commit();
		return "Something deleted from the table";
	}

}
