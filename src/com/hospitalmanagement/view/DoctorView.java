package com.hospitalmanagement.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.hospitalmanagement.controller.DoctorController;
import com.hospitalmanagement.controller.PatientController;
import com.hospitalmanagement.model.Doctor;
import com.hospitalmanagement.model.Patient;

public class DoctorView {
	
	
	
	public void doctorAdd() {
		Scanner sc = new Scanner(System.in);
		String name;
		String speciality;
		System.out.println("");
		System.out.println("Please enter the doctor name -----");
		name = sc.nextLine();
		System.out.println("");
		System.out.println("Please enter the speciality of that doctor -----");
		
		speciality = sc.nextLine();
		DoctorController doctorController = new DoctorController();
		doctorController.add(name, speciality);
		
		System.out.println("");
		
	}
	
	public void allDoctorView() {
		
		System.out.println("");
		System.out.println("The list of the doctors are -----");
		System.out.println("");
		DoctorController doctorController = new DoctorController();
		ArrayList<Doctor> doctorList = new ArrayList<>();
		doctorList = doctorController.read();
		
		for(Doctor item : doctorList) {
			
			System.out.println("");
			System.out.println("ID- "+ item.getId()+" Name- "+item.getName()+" Speciality- "+item.getSpecialist());
			System.out.println("");
		}
		System.out.println("");
		
		
	}
	
	public void doctorUpdate() {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int id;
		String name;
		String specialist;
		
		System.out.println("");
		System.out.println("What is the id of that doctor which you want to edit -----");
		System.out.println("");
		id = sc.nextInt();
		DoctorController doctorController = new DoctorController();
		Doctor doctor = new Doctor(); 
		doctor = doctorController.search(id);
		if (doctor == null) {
			System.out.println("Doctor not found with this id--------");
			System.out.println("");
		}
		else {
			System.out.println("Edit the name of the doctor--------");
			System.out.println("");
			name = sc1.nextLine();
			System.out.println("Edit the speciality of the doctor--------");
			System.out.println("");
			specialist = sc1.nextLine();
			doctor.setName(name);
			doctor.setSpecialist(specialist);
			doctorController.update(doctor);
			
		}
		
		
	}
	
	public void doctorDelete() {
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.println("");
		System.out.println("What is the id of that doctor which you want to delete -----");
		System.out.println("");
		id = sc.nextInt();
		DoctorController doctorController = new DoctorController();
		Doctor doctor = new Doctor();
		doctor = doctorController.search(id);
		if (doctor == null) {
			System.out.println("Doctor not found with this id-------");
			System.out.println("");

		}else {
			doctorController.deleteController(id);
		}
		

	}

}
