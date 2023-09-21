package com.CarServiceManagement.GoldenGearGarage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarServiceManagement.GoldenGearGarage.dao.ServiceTechnicianDao;
import com.CarServiceManagement.GoldenGearGarage.entity.ServiceTechnician;

@Service
public class ServiceTechnicianService {
	
	@Autowired
	ServiceTechnicianDao techniciandao;

	public String getByTechnicianId() {
		return techniciandao.getByTechnicianId();
	}

	public String getByFirstname() {
		return techniciandao.getByFirstname();
	}

	public String getByLastname() {
		return techniciandao.getByLastname();
	}

	public String getBySpecialization() {
		return techniciandao.getBySpecialization();
	}

	public String insertTechnician(ServiceTechnician servicetechnician) {
		// TODO Auto-generated method stub
		return techniciandao.insertTechnician(servicetechnician);
	}

	public List<ServiceTechnician> getTechnicianInfo() {
		// TODO Auto-generated method stub
		return techniciandao.getTechnicianInfo();
	}

	public String updateTechnicianData(ServiceTechnician servicetechnician) {
		// TODO Auto-generated method stub
		return techniciandao.updateTechnicianData(servicetechnician);
	}

	public String deleteTechnicianData(ServiceTechnician servicetechnician) {
		// TODO Auto-generated method stub
		return techniciandao.deleteTechnicianData(servicetechnician);
	}

}
