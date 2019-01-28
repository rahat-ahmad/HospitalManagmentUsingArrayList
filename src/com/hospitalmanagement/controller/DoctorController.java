package com.hospitalmanagement.controller;

import java.util.ArrayList;

import com.hospitalmanagement.model.Doctor;
import com.hospitalmanagement.service.DoctorService;

public class DoctorController {
	
	Doctor doctor = new Doctor();
	DoctorService doctorService = new DoctorService();
	
	static int doctorIndex = 1;
	
	public void add(String name, String speciality) {
		doctor.setId(doctorIndex);
		doctor.setName(name);
		doctor.setSpecialist(speciality);
		doctorIndex++;
		doctorService.addDoctor(doctor);
		
	}
	
	public ArrayList<Doctor> read() {
		return doctorService.readDoctor();
	}
	
	public Doctor search(int id) {
		return doctorService.doctorSearch(id);
		
	}
	
	public void update(Doctor doctor) {
		
		doctorService.updateDoctor(doctor);
	}
	
	public void deleteController(int id) {
		
		doctorService.deleteDoctorController(id);
	}
	
	
	
	
	

}
