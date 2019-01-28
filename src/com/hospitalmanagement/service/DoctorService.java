package com.hospitalmanagement.service;

import java.util.ArrayList;

import com.hospitalmanagement.dao.DoctorDao;
import com.hospitalmanagement.model.Doctor;

public class DoctorService {
	
	DoctorDao doctorDao = new DoctorDao();
	
	public void addDoctor(Doctor doctor) {
		doctorDao.add(doctor);
	}
	
	public ArrayList<Doctor> readDoctor() {
		return doctorDao.read();
	}
	
	public Doctor doctorSearch(int id) {
		return doctorDao.search(id);
	}
	
	public void updateDoctor(Doctor doctor) {
		doctorDao.update(doctor);
		
	}
	
	public void deleteDoctorController(int id) {
		doctorDao.delete(id);
		
	}
	

}
