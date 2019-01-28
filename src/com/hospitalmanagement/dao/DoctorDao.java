package com.hospitalmanagement.dao;

import java.util.ArrayList;

import com.hospitalmanagement.model.Doctor;

public class DoctorDao {

	static ArrayList<Doctor> doctorArray = new ArrayList<Doctor>();

	public void add(Doctor doctor) {
		doctorArray.add(doctor);
	}

	public ArrayList<Doctor> read() {
		return doctorArray;

	}

	public Doctor search(int id) {
		Doctor doctor = new Doctor();
		for (Doctor item : doctorArray) {
			if (item.getId() == id) {
				doctor.setId(id);
				doctor.setName(item.getName());
				doctor.setSpecialist(item.getSpecialist());
				return doctor;
			}
		}
		return null;
		
	}

	public void update(Doctor doctor) {

		for (Doctor item : doctorArray) {

			if (item.getId() == doctor.getId()) {

				item.setName(doctor.getName());
				item.setSpecialist(doctor.getSpecialist());
				break;
			}
		}
	}

	public void delete(int id) {

		for (Doctor item : doctorArray) {
			if (item.getId() == id) {
				doctorArray.remove(item);
				break;
			}
		}
	}

}
