package com.hospitalmanagement.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.hospitalmanagement.model.Doctor;

public class HospitalManagement {
	
	static ArrayList<Doctor> doctorArray = new ArrayList<Doctor>();
	static {
		
		System.out.println("********Welcome to our hospital system management********");
		System.out.println("");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number;
		DoctorView doctorView = new DoctorView();
		PatientView patientView = new PatientView();
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.println("Select the option which service you want to get");
			System.out.println("");
			
			System.out.println("Press 1 to add a doctor on the system");
			System.out.println("Press 2 to add a patient on the system");
			System.out.println("Press 3 to see all the doctor of the system");
			System.out.println("Press 4 to see all the patient of the system");
			System.out.println("Press 5 to update a doctor info of the system");
			System.out.println("Press 6 to update a patient info of the system");
			System.out.println("Press 7 to delete a doctor info of the system");
			System.out.println("Press 8 to delete a patient info of the system");
			
			
			number = sc.nextLine();
			
			switch(number){  
		    //Case statements  
		    case "1": doctorView.doctorAdd();  
		    break;  
		    case "2": patientView.patientAdd();  
		    break;  
		    case "3": doctorView.allDoctorView();
		    break;
		    case "4": patientView.allPatientView();  
		    break;  
		    case "5": doctorView.doctorUpdate();  
		    break; 
		    case "6": patientView.patientUpdate();  
		    break;
		    case "7": doctorView.doctorDelete();  
		    break; 
		    case "8": patientView.patientDelete();  
		    break; 
		    //Default case statement  
		    default: 
		    }
			
		}
		
		
		

	}

}
