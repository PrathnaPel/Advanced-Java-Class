package com.sweg6409.Patient.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sweg6409.Patient.models.Patient;


public class PatientService {

	List<Patient> patientList = new ArrayList<>();
	
	//create
	public Patient createPatient(Patient pat){
		patientList.add(pat);
		return pat;
	}
	
	//read
	//Return list of patients
	public List<Patient> findAllPatients(){
		return patientList;
	}
	//Return list of patients base on selected illness
	public List<Patient> findAllPatientsByIllness(String illness){
		return patientList.stream().filter(p->p.getIllness().equalsIgnoreCase(illness)).collect(Collectors.toList());
	}
	//update
	public void updatePatient(Integer id, Patient p) {
		for (int i = 0; i < patientList.size(); i++) {
			if (patientList.get(i).getId().equals(id)) {
				patientList.set(i, p);
			}
		}
	}
	//delete
	public void deletePatient(Integer id) {
		patientList = patientList.stream().filter(p -> p.getId() != id).collect(Collectors.toList());
	}
}
