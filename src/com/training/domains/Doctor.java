package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ent")
public class Doctor {

	@Value("Rajesh Khanna")
	private String docName;

	@Value("9978726222")
	private long phoneNumber;

	@Autowired
	@Qualifier("inPat")
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", phoneNumber=" + phoneNumber + ", patient=" + patient + "]";
	}

	public Doctor(String docName, long phoneNumber, Patient patient) {
		super();
		this.docName = docName;
		this.phoneNumber = phoneNumber;
		this.patient = patient;
	}

	public Doctor() {
		super();
	}

	@PostConstruct
	public void init() {
System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-init=-=-=-=-=-=-=-=-=-=-=-");
	}

	@PreDestroy
	public void destroy() {
System.out.println("=-=-=-=-=-=-=-=-=-=-destroy=-=-=-=-=-=-=-=-=-=-=-");
	}

}
