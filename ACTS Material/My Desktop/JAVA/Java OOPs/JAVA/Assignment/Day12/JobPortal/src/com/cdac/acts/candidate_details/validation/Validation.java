package com.cdac.acts.candidate_details.validation;

import java.time.LocalDate;
import java.util.List;

import com.cdac.acts.job_seeker.JobSeeker;

public class Validation {
	
	private Validation() {};
	
	public static LocalDate validDob(String d) {
		LocalDate date = LocalDate.parse(d);
		LocalDate today = LocalDate.now();
		LocalDate required = today.minusYears(18);
		
		if (date.isBefore(required)) {
			return date;
		}
		return null;
	}
	
	public static LocalDate validGraduationDate(String d) {
		LocalDate date = LocalDate.parse(d);
		LocalDate today = LocalDate.now();
		
		if (date.isBefore(today)) {
			return date;
		}
		return null;
	}
	
	// import to jobseeker
	public static boolean validRegistrationId(List<JobSeeker> list, Integer id) {
		for (JobSeeker js : list) {
			if (js.getRegistrationId().equals(id)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validPhoneNo(String no) {
		if (no.length() < 10) {
			return false;
		}
		
		for (char c : no.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

}
