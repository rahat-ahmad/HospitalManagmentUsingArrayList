package com.hospitalmanagement.controller;

import java.util.ArrayList;

import com.hospitalmanagement.model.Patient;
import com.hospitalmanagement.service.PatientService;

public class PatientController {
	Patient patient = new Patient();
	PatientService patientService = new PatientService();
	static int patientIndex = 1;
	
	public void add(String name, String disease) {
		patient.setId(patientIndex);
		patient.setName(name);
		patient.setDisease(disease);
		patientIndex++;
		patientService.addPatient(patient);
		
	}
	public ArrayList<Patient> read() {
		return patientService.readPatient();
	}
	
	public Patient search(int id) {
		return patientService.patientSearch(id);
		
	}
	
	public void update(Patient patient) {
		
		patientService.updatePatient(patient);
	}
	
	public void deleteController(int id) {
		
		patientService.DeletePatientService(id);
	}

}
