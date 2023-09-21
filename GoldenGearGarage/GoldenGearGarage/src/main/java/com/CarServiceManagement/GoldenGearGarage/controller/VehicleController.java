package com.CarServiceManagement.GoldenGearGarage.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CarServiceManagement.GoldenGearGarage.entity.Vehicle;
import com.CarServiceManagement.GoldenGearGarage.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService vehicleservice;
	
//1
	@GetMapping("VehicleId")
	public String getByVehicleId() {
		return vehicleservice.getByVehicleId();		
	}
	
//2
	@GetMapping("Make")
	public String getByMake() {
		return vehicleservice.getByMake();		
	}
	
//3
	@GetMapping("Model")
	public String getByModel() {
		return vehicleservice.getByModel();		
	}
	
//4
	@GetMapping("Year")
	public String getByYear() {
		return vehicleservice.getByYear();		
	}
	
//5
	@GetMapping("VIN")
	public String getByVin() {
		return vehicleservice.getByVin();		
	}
	
//6
	@GetMapping("OwnerId")
	public String getByOwnerId() {
		return vehicleservice.getByOwnerId();		
	}
	
//7
	@PostMapping("insertvehicle")
	public String insertVehicle(@RequestBody Vehicle vehicle) {
		return vehicleservice.insertVehicle(vehicle);
	}
	
//8
	@GetMapping("allvehicles")
	public List<Vehicle> getVehicleInfo() {
		return vehicleservice.getVehicleInfo();
	}
	
//9
	@PostMapping("UpdateVehicle")
	public String updateVehicleData(@RequestBody Vehicle vehicle) {
		return vehicleservice.updateCustomerData(vehicle);
	}
	
//10
	@PostMapping("DeleteVehicle")
	public String deleteVehicleData(@RequestBody Vehicle vehicle) {
		return vehicleservice.deleteVehicleData(vehicle);
	}
	
//11  change the method name dheepa 
	@GetMapping("MakeToyota")
	public List<Vehicle> getRecordByMakeToyota() {
		return vehicleservice.getRecordByMakeToyota();
	}
	
//12
	@GetMapping("ModelCamry")
	public List<Vehicle> getRecordByModelCamry() {
		return vehicleservice.getRecordByModelCamry();
	}
	
//13
	@GetMapping("Yeargt2022")
	public List<Vehicle> getVehicleByYeargt2022() {
		return vehicleservice.getVehicleByYeargt2022();
	}
	
//14
	@GetMapping("Yeargt2000")
	public List<Vehicle> getVehicleByYeargt2000() {
		return vehicleservice.getVehicleByYeargt2000();
	}
	
//15
	@GetMapping("VINcontainsH")
	public List<Vehicle> getVehicleByVinContainsH() {
		return vehicleservice.getVehicleByVinContainsH();
	}
	
//16
	@GetMapping("VINLike")
	public List<Vehicle> getVehicleByVinLike() {
		return vehicleservice.getVehicleByVinLike();
	}
	
//17
	@GetMapping("OwnerIdeq")
	public List<Vehicle> getVehicleByOwnerideq() {
		return vehicleservice.getVehicleByOwnerideq();
	}
	
//18
	@GetMapping("specificVehicle")
	public List<Vehicle> getSpecificRecord(Vehicle vehicle) {
		return vehicleservice.getSpecificRecord(vehicle);

	}
	
//19 
	@GetMapping("Yearlt2000")
	public List<Vehicle> getVehicleByYearlt2000() {
		return vehicleservice.getVehicleByYearlt2000();
	}
	
//20
	@GetMapping("Yeareq2000")
	public List<Vehicle> getVehicleByYeareq2000() {
		return vehicleservice.getVehicleByYeareq2000();
	}
	
//21
	@GetMapping("specificVehiclebyModel")
	public List<Vehicle> getSpecificVehicle(Vehicle vehicle) {
		return vehicleservice.getSpecificVehicle(vehicle);

	}
	
//22
	@GetMapping("specificVehiclebyYear")
	public List<Vehicle> getSpecificYear(Vehicle vehicle) {
		return vehicleservice.getSpecificYear(vehicle);

	}
	
//23
	@GetMapping("specificVehiclebyId")
	public List<Vehicle> getSpecificId(Vehicle vehicle) {
		return vehicleservice.getSpecificId(vehicle);

	}
	
//24
	@GetMapping("getbyCondition")
	public List<Vehicle> getByCondition(Vehicle vehicle) {
		return vehicleservice.getByCondition(vehicle);

	}
	
}
