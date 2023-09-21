package com.CarServiceManagement.GoldenGearGarage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CarServiceManagement.GoldenGearGarage.entity.Customer;
import com.CarServiceManagement.GoldenGearGarage.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
//1
	@GetMapping("CustomerId")
	public String getById() {
		return customerservice.getById();		
	}
	
//2
	@GetMapping("FirstName")
	public String getByFname() {
		return customerservice.getByFname();		
	}
	
//3
	@GetMapping("LastName")
	public String getByLname() {
		return customerservice.getByLname();		
	}
	
//4
	@GetMapping("PhoneNumber")
	public String getByPhoneNum() {
		return customerservice.getByPhoneNum();		
	}
	
//5
	@GetMapping("Email")
	public String getByEmail() {
		return customerservice.getByEmail();		
	}
	
//6
	@PostMapping("insertcustomer")
	public String insertCustomer(@RequestBody Customer customer) {
		return customerservice.insertCustomer(customer);
	}

//7
	@GetMapping("allcustomers")
	public List<Customer> getCustomerInfo() {
		return customerservice.getCustomerInfo();
	}

//8
	@PostMapping("UpdateCustomer")
	public String updateCustomerData(@RequestBody Customer customer) {
		return customerservice.updateCustomerData(customer);
	}
	
//9
	@PostMapping("DeleteCustomer")
	public String deleteCustomerData(@RequestBody Customer customer) {
		return customerservice.deleteCustomerData(customer);
	}
	
//10
	@GetMapping("fnamestartswithJ")
	public List<Customer> getRecordByFnameStartsWithJ() {
		return customerservice.getRecordByFnameStartsWithJ();
	}
	
//11
	@GetMapping("fnameendswithY")
	public List<Customer> getRecordByFnameEndsWithy() {
		return customerservice.getRecordByFnameEndsWithy();
	}
	
//12
	@GetMapping("lnamestartswithD")
	public List<Customer> getRecordByLnameStartsWithd() {
		return customerservice.getRecordByLnameStartsWithd();
	}
	
//13
	@GetMapping("lnameendswithV")
	public List<Customer> getRecordByFnameEndsWithv() {
		return customerservice.getRecordByFnameEndsWithv();
	}
	
//14
	@GetMapping("specificcustomer")
	public List<Customer> getSpecificRecord(Customer customer) {
		return customerservice.getSpecificRecord(customer);
	}
	
//15
	@GetMapping("conditional")
	public List<Customer> getCustomerByCondi(Customer customer) {
		return customerservice.getCustomerByCondi(customer);
	}
	
	
}
