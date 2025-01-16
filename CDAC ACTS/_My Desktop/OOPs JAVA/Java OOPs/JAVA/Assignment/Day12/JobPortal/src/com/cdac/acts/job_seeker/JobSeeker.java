package com.cdac.acts.job_seeker;

import java.util.List;

import com.cdac.acts.candidate_details.CandidateDetails;

public class JobSeeker implements Comparable<JobSeeker> {
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
	public String getPassword() {
		return password;
	}
	public CandidateDetails getDetails() {
		return details;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static JobSeeker find(List<JobSeeker> list, Integer id) {
		for (JobSeeker j : list) {
			if (id.equals(j.getRegistrationId())) {
				return j;
			}
		}
		return null;
	}
	
	@Override
	public int compareTo(JobSeeker a) {
		return this.getEmail().compareTo(a.getEmail());
	}
	
	@Override
	public String toString() {
		return "JobSeeker [registrationId=" + registrationId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", details=" + details.toString() + "]";
	}
}
