package com.sweg6409.Patient.models;

public class Patient {
	
	String name;
	Integer id;
	String gender;
	String illness;
	
	public Patient(String name, Integer id, String gender, String illness) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.illness = illness;
	}
	
	public Patient() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}

	@Override
	public String toString() {
		return "Patient [getId()=" + getId() + ", getGender()=" + getGender() + ", getIllness()=" + getIllness() + "]";
	}

}
