package com.CarServiceManagement.GoldenGearGarage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceTechnician {
	
	@Id
	private int technicianid;
	private String firstname;
	private String lastname;
	private String specialization;
	
	public int getTechnicianid() {
		return technicianid;
	}
	public void setTechnicianid(int technicianid) {
		this.technicianid = technicianid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	@Override
	public String toString() {
		return " [technicianid=" + technicianid + ", firstname=" + firstname + ", lastname=" + lastname + ", specialization=" + specialization +"]";
	}

}
