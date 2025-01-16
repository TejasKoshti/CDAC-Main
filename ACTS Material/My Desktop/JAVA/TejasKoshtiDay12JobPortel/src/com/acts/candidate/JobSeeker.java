package com.acts.candidate;

import java.time.LocalDate;

import com.acts.candidate.enums.Degree;

public class JobSeeker implements Comparable<JobSeeker>{

	private Integer registrationId;
	private String name; 
	private String email;
	private String password;
	private CandidateDetails details;
	
	public JobSeeker(Integer registrationId, String name, String email, String password, CandidateDetails details) {
		super();
		this.registrationId = registrationId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.details = details;
	}

	public Integer getRegistrationId() {
		return registrationId;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CandidateDetails getDetails() {
		return details;
	}
	
	

	public int compreTo(JobSeeker a) {
		return this.getEmail().compareTo(a.getEmail());
	}
	
	
	@Override
	public String toString() {
		return "JobSeeker [registrationId=" + registrationId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", details=" + details + "]";
	}
	
	

	
	
	
	
	
	
	
	
}
