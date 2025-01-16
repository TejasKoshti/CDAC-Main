package com.cdac.acts.candidate_details;

import java.time.LocalDate;

import com.cdac.acts.candidate_details.degree_enums.Degree;

public class CandidateDetails {
	private LocalDate dob;
	private String aadharId;
	private String phoneNo;
	private LocalDate gradutionDate;
	private Degree degree;
	
	public CandidateDetails(LocalDate dob, String aadharId, String phoneNo, LocalDate gradutionDate, Degree degree) {
		super();
		this.dob = dob;
		this.aadharId = aadharId;
		this.phoneNo = phoneNo;
		this.gradutionDate = gradutionDate;
		this.degree = degree;
	}
	public LocalDate getDob() {
		return dob;
	}
	public String getAadharId() {
		return aadharId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public LocalDate getGradutionDate() {
		return gradutionDate;
	}
	public Degree getDegree() {
		return degree;
	}
	@Override
	public String toString() {
		return "CandidateDetails [dob=" + dob + ", aadharId=" + aadharId + ", phoneNo=" + phoneNo + ", gradutionDate="
				+ gradutionDate + ", degree=" + degree.getValue() + "]";
	}
	
}
