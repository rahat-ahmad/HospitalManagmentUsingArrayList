package com.hospitalmanagement.service;

import java.util.ArrayList;

import com.hospitalmanagement.dao.PatientDao;
import com.hospitalmanagement.model.Patient;

public class PatientService {
	
	PatientDao patientDao = new PatientDao();
	
	public void addPatient(Patient patient) {
		patientDao.add(patient);
		
	}
	
	public ArrayList<Patient> readPatient() {
		return patientDao.read();
	}
	public Patient patientSearch(int id) {
		return patientDao.search(id);
	}
	
	public void updatePatient(Patient patient) {
		patientDao.update(patient);
		
	}
	
	public void DeletePatientService(int id) {
		patientDao.deleteDao(id);
		
	}

}
