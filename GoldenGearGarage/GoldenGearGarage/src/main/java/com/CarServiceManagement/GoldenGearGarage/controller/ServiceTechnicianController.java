package com.CarServiceManagement.GoldenGearGarage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CarServiceManagement.GoldenGearGarage.entity.ServiceTechnician;
import com.CarServiceManagement.GoldenGearGarage.entity.Vehicle;
import com.CarServiceManagement.GoldenGearGarage.service.ServiceTechnicianService;

@RestController
public class ServiceTechnicianController {
	
	@Autowired
	ServiceTechnicianService technicianservice;
	
//1
	@GetMapping("TechnicianId")
	public String getByTechnicianId() {
		return technicianservice.getByTechnicianId();		
	}
		
//2
	@GetMapping("Firstname")
	public String getByFirstname() {
		return technicianservice.getByFirstname();		
	}
		
//3
	@GetMapping("Lastname")
	public String getByLastname() {
		return technicianservice.getByLastname();		
	}
		
//4
	@GetMapping("Specialization")
	public String getBySpecialization() {
		return technicianservice.getBySpecialization();		
	}
	
//5
	@PostMapping("insertTechnician")
	public String insertVehicle(@RequestBody ServiceTechnician servicetechnician) {
		return technicianservice.insertTechnician(servicetechnician);
	}
		
//6
	@GetMapping("alltechnician")
	public List<ServiceTechnician> getVehicleInfo() {
		return technicianservice.getTechnicianInfo();
	}
	
//7
	@PostMapping("Updatetechnician")
	public String updateVehicleData(@RequestBody ServiceTechnician servicetechnician) {
		return technicianservice.updateTechnicianData(servicetechnician);
	}
		
//8
	@PostMapping("Deletetechnician")
	public String deleteVehicleData(@RequestBody ServiceTechnician servicetechnician) {
		return technicianservice.deleteTechnicianData(servicetechnician);
	}
	


}
