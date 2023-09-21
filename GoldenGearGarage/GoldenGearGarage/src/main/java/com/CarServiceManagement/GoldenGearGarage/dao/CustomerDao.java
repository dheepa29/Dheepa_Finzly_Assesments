package com.CarServiceManagement.GoldenGearGarage.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CarServiceManagement.GoldenGearGarage.entity.Customer;


@Repository
public class CustomerDao {

	@Autowired
	SessionFactory factory;
	
	public String getById() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return "getid";		
	}

	public String getByFname() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return "getfname";		
	}

	public String getByLname() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return "getlname";
	}

	public String getByPhoneNum() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return "getphonenum";
	}

	public String getByEmail() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return "getemail";
	}

	public String insertCustomer(Customer customer) {
		Session session = factory.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		return "Customer Inserted into table";
	}

	public List<Customer> getCustomerInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	public String updateCustomerData(Customer customer) {
		Session session = factory.openSession();
		session.update(customer);
		session.beginTransaction().commit();
		return "Customer Table updated";
	}

	public String deleteCustomerData(Customer customer) {
		Session session = factory.openSession();
		session.delete(customer);
		session.beginTransaction().commit();
		return "Customer deleted from the table";
	}

	public List<Customer> getRecordByFnameStartsWithJ() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("firstname", "J%"));
		return criteria.list();
	}

	public List<Customer> getRecordByFnameEndsWithy() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("firstname", "%y"));
		return criteria.list();
	}

	public List<Customer> getRecordByLnameStartsWithd() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("lastname", "D%"));
		return criteria.list();
	}

	public List<Customer> getRecordByFnameEndsWithv() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("lastname", "%v"));
		return criteria.list();
	}

	public List<Customer> getSpecificRecord() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	public List<Customer> getCustomerByCondi() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("firstname", "John"));
		return criteria.list();
	}
	
	

}
