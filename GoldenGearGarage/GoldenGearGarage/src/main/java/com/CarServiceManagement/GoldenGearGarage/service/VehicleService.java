package com.CarServiceManagement.GoldenGearGarage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarServiceManagement.GoldenGearGarage.dao.VehicleDao;
import com.CarServiceManagement.GoldenGearGarage.entity.Vehicle;
//import com.finzly.carservice.entity.Car;

@Service
public class VehicleService {

	@Autowired
	VehicleDao vehicledao;
	
	public String getByVehicleId() {
		return vehicledao.getByVehicleId();
	}

	public String getByMake() {
		return vehicledao.getByMake();
	}

	public String getByModel() {
		return vehicledao.getByModel();
	}

	public String getByYear() {
		return vehicledao.getByYear();
	}

	public String getByVin() {
		return vehicledao.getByVin();
	}

	public String getByOwnerId() {
		return vehicledao.getByOwnerId();
	}

	public String insertVehicle(Vehicle vehicle) {
		return vehicledao.insertVehicle(vehicle);
	}

	public List<Vehicle> getVehicleInfo() {
		return vehicledao.getVehicleInfo();
	}

	public String updateCustomerData(Vehicle vehicle) {
		return vehicledao.updateCustomerData(vehicle);
	}

	public String deleteVehicleData(Vehicle vehicle) {
		return vehicledao.deleteVehicleData(vehicle);
	}

	public List<Vehicle> getRecordByMakeToyota() {
		return vehicledao.getRecordByMakeToyota();
	}

	public List<Vehicle> getRecordByModelCamry() {
		return vehicledao.getRecordByModelCamry();
	}

	public List<Vehicle> getVehicleByYeargt2022() {
		return vehicledao.getVehicleByYeargt2022();
	}

	public List<Vehicle> getVehicleByYeargt2000() {
		return vehicledao.getVehicleByYeargt2000();
	}

	public List<Vehicle> getVehicleByVinContainsH() {
		return vehicledao.getVehicleByVinContainsH();
	}

	public List<Vehicle> getVehicleByVinLike() {
		return vehicledao.getVehicleByVinLike();
	}

	public List<Vehicle> getVehicleByOwnerideq() {
		return vehicledao.getVehicleByOwnerideq();
	}

	public List<Vehicle> getSpecificRecord(Vehicle vehicle) {
		List<Vehicle> list = vehicledao.getSpecificRecord();
		List<Vehicle> al = new ArrayList<>();
		for (Vehicle vehicle1 : list) {
			String make = vehicle1.getMake();
			Vehicle c = new Vehicle();
			c.setMake(make);

			al.add(c);
		}
		return al;
	}

	public List<Vehicle> getVehicleByYearlt2000() {
		return vehicledao.getVehicleByYearlt2000();
	}

	public List<Vehicle> getVehicleByYeareq2000() {
		return vehicledao.getVehicleByYeareq2000();
	}

	public List<Vehicle> getSpecificVehicle(Vehicle vehicle) {
		List<Vehicle> list = vehicledao.getSpecificVehicle();
		List<Vehicle> a2 = new ArrayList<>();
		for (Vehicle vehicle1 : list) {
			String model = vehicle1.getModel();
			Vehicle c = new Vehicle();
			c.setModel(model);

			a2.add(c);
		}
		return a2;
	}

	public List<Vehicle> getSpecificYear(Vehicle vehicle) {
		List<Vehicle> list = vehicledao.getSpecificYear();
		List<Vehicle> a2 = new ArrayList<>();
		for (Vehicle vehicle1 : list) {
			int year = vehicle1.getYear();
			Vehicle c = new Vehicle();
			c.setYear(year);

			a2.add(c);
		}
		return a2;
	}

	public List<Vehicle> getSpecificId(Vehicle vehicle) {
		List<Vehicle> list = vehicledao.getSpecificId();
		List<Vehicle> a2 = new ArrayList<>();
		for (Vehicle vehicle1 : list) {
			int vehicleid = vehicle1.getVehicleid();
			Vehicle c = new Vehicle();
			c.setVehicleid(vehicleid);

			a2.add(c);
		}
		return a2;
	}

	public List<Vehicle> getByCondition(Vehicle vehicle) {
		List<Vehicle> list = vehicledao.getByCondition();
		List<Vehicle> al = new ArrayList<>();
		for (Vehicle vehicle1 : list) {
			if (vehicle1.getVehicleid() != 2) {
				al.add(vehicle1);
			}
		}
		return al;
	}

		

}
