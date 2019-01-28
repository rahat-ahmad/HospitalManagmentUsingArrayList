package com.hospitalmanagement.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.hospitalmanagement.controller.DoctorController;
import com.hospitalmanagement.controller.PatientController;
import com.hospitalmanagement.model.Doctor;
import com.hospitalmanagement.model.Patient;

public class PatientView {

	Scanner sc = new Scanner(System.in);
	String name;
	String disease;

	public void patientAdd() {
		System.out.println("");
		System.out.println("Please enter the patient name -----");
		name = sc.nextLine();
		System.out.println("");
		System.out.println("Please enter the disease of that patient -----");

		disease = sc.nextLine();

		PatientController patientController = new PatientController();
		patientController.add(name, disease);

		System.out.println("");

	}

	public void allPatientView() {

		ArrayList<Patient> patientList = new ArrayList<>();

		System.out.println("");
		System.out.println("The list of the patient are -----");
		System.out.println("");
		PatientController patientController = new PatientController();
		patientList = patientController.read();

		for (Patient item : patientList) {

			System.out.println("");
			System.out.println("ID- " + item.getId() + " Name- " + item.getName() + " Disease- " + item.getDisease());
			System.out.println("");
		}
		System.out.println("");

	}

	public void patientUpdate() {

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int id;
		String name;
		String disease;

		System.out.println("");
		System.out.println("What is the id of that patient which you want to edit -----");
		System.out.println("");
		id = sc.nextInt();
		PatientController patientController = new PatientController();
		Patient patient = new Patient();
		patient = patientController.search(id);
		if (patient == null) {
			System.out.println("Patient not found with this id-------");
			System.out.println("");

		} else {
			System.out.println("Edit the name of the patient--------");
			System.out.println("");
			name = sc1.nextLine();
			System.out.println("Edit the disease of the patient--------");
			System.out.println("");
			disease = sc1.nextLine();
			patient.setName(name);
			patient.setDisease(disease);
			patientController.update(patient);

		}

	}

	public void patientDelete() {
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.println("");
		System.out.println("What is the id of that patient which you want to delete -----");
		System.out.println("");
		id = sc.nextInt();
		PatientController patientController = new PatientController();
		Patient patient = new Patient();
		patient = patientController.search(id);
		if (patient == null) {
			System.out.println("Patient not found with this id-------");
			System.out.println("");

		}else {
			patientController.deleteController(id);
		}
		

	}

}
