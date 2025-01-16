package com.cdac.acts.job_seeker.data_utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cdac.acts.candidate_details.CandidateDetails;
import com.cdac.acts.candidate_details.degree_enums.Degree;
import com.cdac.acts.candidate_details.validation.Validation;
import com.cdac.acts.job_seeker.JobSeeker;
import com.cdac.acts.job_seeker.exception.date.DateNotValidException;
import com.cdac.acts.job_seeker.exception.number.NumberNotValidException;
import com.cdac.acts.job_seeker.exception.user.UserAlreadyExistException;

public class DataUtils {
	private DataUtils() {}
	
	private static CandidateDetails getDetails() throws DateNotValidException, NumberNotValidException {
		String dob = "1990-12-12";
		LocalDate date = Validation.validDob(dob);

		String aadharId = "2133124";

		String phoneNo = "1234567980";
		boolean validPhoneno = Validation.validPhoneNo(phoneNo);
		if (!validPhoneno) {
			throw new NumberNotValidException("Phone Number is not Valid");
		}

		String gdate = "2020-12-12";
		LocalDate gradutionDate = Validation.validGraduationDate(gdate);
		if (gradutionDate.equals(date)) {
			throw new DateNotValidException("Date of Birth and Graduation date can't be same.");
		}
		String str = "BTECH";
		Degree degree = Degree.valueOf(str);
			return new CandidateDetails(date, aadharId, phoneNo, gradutionDate, degree);
	}
	
	public static List<JobSeeker> getData() throws DateNotValidException, NumberNotValidException{
		List<JobSeeker> list = new ArrayList<JobSeeker>();
		
		Integer id = 123;
		
		list.add(new JobSeeker(1, "Sarah Connor", "sarah.connor@example.com", "sarah", DataUtils.getDetails()));
		list.add(new JobSeeker(2, "Chris Pratt", "chris.pratt@example.com", "chris", DataUtils.getDetails()));
		list.add(new JobSeeker(3, "Natalie Portman", "natalie.portman@example.com", "natalie", DataUtils.getDetails()));
		list.add(new JobSeeker(4, "Leonardo DiCaprio", "leonardo.d@example.com", "leonardo", DataUtils.getDetails()));
		list.add(new JobSeeker(5, "Emma Stone", "emma.stone@example.com", "emma", DataUtils.getDetails()));
		list.add(new JobSeeker(6, "Michael Smith", "michael.smith@example.com", "michael", DataUtils.getDetails()));

		return list;
	}
}
