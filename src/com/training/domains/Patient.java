package com.training.domains;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("inPat")
public class Patient {

	@Value("Akshay Kumar")
	private String patientName;
	@Value("46")
	private int patientAge;
	
	
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientAge=" + patientAge + "]";
	}


	public Patient(String patientName, int patientAge) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public int getPatientAge() {
		return patientAge;
	}


	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
