package com.CarServiceManagement.GoldenGearGarage.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CarServiceManagement.GoldenGearGarage.entity.Vehicle;


@Repository
public class VehicleDao {
	
	@Autowired
	SessionFactory factory;

	public String getByVehicleId() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return "getvehicleid";
	}

	public String getByMake() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return "getmake";
	}

	public String getByModel() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return "getmodel";
	}

	public String getByYear() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return "getyear";
	}

	public String getByVin() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return "getVIN";
	}

	public String getByOwnerId() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return "getOwnerId";
	}

	public String insertVehicle(Vehicle vehicle) {
		Session session = factory.openSession();
		session.save(vehicle);
		session.beginTransaction().commit();
		return "Vehicle Inserted into table";
	}

	public List<Vehicle> getVehicleInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return criteria.list();
	}

	public String updateCustomerData(Vehicle vehicle) {
		Session session = factory.openSession();
		session.update(vehicle);
		session.beginTransaction().commit();
		return "Vehicle Table updated";
	}

	public String deleteVehicleData(Vehicle vehicle) {
		Session session = factory.openSession();
		session.delete(vehicle);
		session.beginTransaction().commit();
		return "Vehicle deleted from the table";
	}

	public List<Vehicle> getRecordByMakeToyota() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.like("make", "Toyota"));
		return criteria.list();
	}

	public List<Vehicle> getRecordByModelCamry() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.like("model", "Camry"));
		return criteria.list();
	}

	public List<Vehicle> getVehicleByYeargt2022() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.gt("year", 2022));
		return criteria.list();
	}

	public List<Vehicle> getVehicleByYeargt2000() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.gt("year", 2000));
		return criteria.list();
	}

	public List<Vehicle> getVehicleByVinContainsH() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.like("VIN", "%H%"));
		return criteria.list();
	}

	public List<Vehicle> getVehicleByVinLike() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.like("VIN", "1HGCM%"));
		return criteria.list();
	}

	public List<Vehicle> getVehicleByOwnerideq() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.eq("ownerid", 3));
		return criteria.list();	}

	public List<Vehicle> getSpecificRecord() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return criteria.list();
	}

	public List<Vehicle> getVehicleByYearlt2000() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.gt("year", 2000));
		return criteria.list();
	}

	public List<Vehicle> getVehicleByYeareq2000() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.eq("year", 2000));
		return criteria.list();
	}

	public List<Vehicle> getSpecificVehicle() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return criteria.list();
	}

	public List<Vehicle> getSpecificYear() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return criteria.list();
	}

	public List<Vehicle> getSpecificId() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		return criteria.list();
	}

	public List<Vehicle> getByCondition() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.eq("year", 2022));
		return criteria.list();
	}

		

}
