package com.hospitalmanagement.dao;

import java.util.ArrayList;

import com.hospitalmanagement.model.Patient;

public class PatientDao {

	static ArrayList<Patient> patientArray = new ArrayList<Patient>();

	public void add(Patient patient) {
		patientArray.add(patient);
	}

	public ArrayList<Patient> read() {

		return patientArray;

	}

	public Patient search(int id) {
		Patient patient = new Patient();
		for (Patient item : patientArray) {
			if (item.getId() == id) {
				patient.setId(id);
				patient.setName(item.getName());
				patient.setDisease(item.getDisease());
				return patient;
			}
		}
		return null;
	}

	public void update(Patient patient) {

		for (Patient item : patientArray) {

			if (item.getId() == patient.getId()) {

				item.setName(patient.getName());
				item.setDisease(patient.getDisease());
				break;
			}
		}
	}

	public void deleteDao(int id) {

		for (Patient item : patientArray) {

			if (item.getId() == id) {
				patientArray.remove(item);
				break;
			}
		}
	}

}
