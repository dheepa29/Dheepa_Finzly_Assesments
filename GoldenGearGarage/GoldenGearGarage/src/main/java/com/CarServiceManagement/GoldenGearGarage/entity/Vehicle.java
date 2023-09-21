package com.CarServiceManagement.GoldenGearGarage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	private int vehicleid;
	private String make;
	private String model;
	private int year;
	private String VIN;
	private int ownerid;
	
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	
	@Override
	public String toString() {
		return " [vehicleid=" + vehicleid + ", make=" + make + ", model=" + model + ", year=" + year +", VIN=" + VIN +", ownerid=" + ownerid+"]";
	}

}
