package com.example.demo;

public class BMICalculator {
	private Patient patient[];

	public Patient[] getPatient() {
		return patient;
	}

	public void setPatient(Patient[] patient) {
		this.patient = patient;
	}
	double calculateBMI(double patientWeight, double patientHeight) {
		double bmi;
		bmi=(patientWeight/(patientHeight*patientHeight))*703;
		if(bmi>25.0) {
			System.out.println(bmi);
		}
		else {
			System.out.println("Normal");
		}
		return 0;
	}

	public BMICalculator() {
		super();
		//System.out.println("inside bmic");
	}



}
