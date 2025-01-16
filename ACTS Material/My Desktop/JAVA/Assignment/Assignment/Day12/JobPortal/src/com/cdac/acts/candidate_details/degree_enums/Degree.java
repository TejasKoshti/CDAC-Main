package com.cdac.acts.candidate_details.degree_enums;

public enum Degree {
	BTECH("Bachelor of Technology"),
	BCOM("Bachelor of Commerce"),
	BSC("Bachelor of Science"),
	MBA("Master of Business Administration"),
	BBA("Bachelor of Business Administration");
	
	private String msg;
	
	private Degree(String msg) {
		this.msg = msg;
	}
	
	public String getValue() {
		return msg;
	}
}
