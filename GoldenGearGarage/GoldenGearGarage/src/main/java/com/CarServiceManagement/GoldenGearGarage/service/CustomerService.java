package com.CarServiceManagement.GoldenGearGarage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarServiceManagement.GoldenGearGarage.dao.CustomerDao;
import com.CarServiceManagement.GoldenGearGarage.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao customerdao;

	public String getById() {
		return customerdao.getById();
		
	}

	public String getByFname() {
		return customerdao.getByFname();
		
	}

	public String getByLname() {
		return customerdao.getByLname();
	}

	public String getByPhoneNum() {
		return customerdao.getByPhoneNum();
	}

	public String getByEmail() {
		return customerdao.getByEmail();
	}

	public String insertCustomer(Customer customer) {
		return customerdao.insertCustomer(customer);
	}

	public List<Customer> getCustomerInfo() {
		return customerdao.getCustomerInfo();
	}

	public String updateCustomerData(Customer customer) {
		return customerdao.updateCustomerData(customer);
	}

	public String deleteCustomerData(Customer customer) {
		return customerdao.deleteCustomerData(customer);
	}

	public List<Customer> getRecordByFnameStartsWithJ() {
		return customerdao.getRecordByFnameStartsWithJ();
	}

	public List<Customer> getRecordByFnameEndsWithy() {
		return customerdao.getRecordByFnameEndsWithy();
	}

	public List<Customer> getRecordByLnameStartsWithd() {
		return customerdao.getRecordByLnameStartsWithd();
	}

	public List<Customer> getRecordByFnameEndsWithv() {
		return customerdao.getRecordByFnameEndsWithv();
	}

	public List<Customer> getSpecificRecord(Customer customer) {
		List<Customer> list = customerdao.getSpecificRecord();
		List<Customer> al = new ArrayList<>();
		for (Customer customer1 : list) {
			String firstname = customer1.getFirstname();
			Customer c = new Customer();
			c.setFirstname(firstname);

			al.add(c);
		}
		return al;
		
	}

	public List<Customer> getCustomerByCondi(Customer customer) {
		List<Customer> list = customerdao.getCustomerByCondi();
		List<Customer> al = new ArrayList<>();
		for (Customer customer1 : list) {
			if (customer1.getFirstname() != "John") {
				al.add(customer1);
			}
		}
		return al;
	}

}
