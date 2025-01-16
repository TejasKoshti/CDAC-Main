package com.cdac.acts.job_seeker.Main;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.candidate_details.CandidateDetails;
import com.cdac.acts.candidate_details.degree_enums.Degree;
import com.cdac.acts.candidate_details.validation.Validation;
import com.cdac.acts.job_seeker.JobSeeker;
import com.cdac.acts.job_seeker.data_utils.DataUtils;
import com.cdac.acts.job_seeker.exception.date.DateNotValidException;
import com.cdac.acts.job_seeker.exception.number.NumberNotValidException;
import com.cdac.acts.job_seeker.exception.user.UserAlreadyExistException;

public class Main {

	private static CandidateDetails getDetailsUserIp() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter date of birth");
		String dob = sc.nextLine();
		LocalDate date = Validation.validDob(dob);

		System.out.println("enter aadharId");
		String aadharId = sc.nextLine();

		System.out.println("enter phone no");
		String phoneNo = sc.nextLine();
		boolean validPhoneno = Validation.validPhoneNo(phoneNo);

		System.out.println("enter gradution date");
		String gdate = sc.nextLine();
		LocalDate gradutionDate = Validation.validGraduationDate(dob);

		System.out.println("enter degree");
		String str = sc.nextLine();
		Degree degree = Degree.valueOf(str);
		return new CandidateDetails(date, aadharId, phoneNo, gradutionDate, degree);
	}

	public static void main(String[] args)
			throws DateNotValidException, NumberNotValidException, UserAlreadyExistException {

		List<JobSeeker> list = DataUtils.getData();

		while (true) {
			System.out.println("**************Menu**************");
			System.out.println("1. JobSeeker registration");
			// Get old and new email from user
			System.out.println("2. Update email");
			System.out.println("3. Display all job seeker by theie degree type");
			System.out.println("4. Sort JobSeeker details as per email");
			System.out.println("5. Sort JobSeeker details as per dob");
			System.out.println("6. Sort customer details as per graduationDate");
			System.out.println("7. Display");
			System.out.println("0. Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("enter registrationId");
				Integer registrationId = sc.nextInt();
				boolean validReg = Validation.validRegistrationId(list, registrationId);
				boolean validRegId = Validation.validRegistrationId(list, 123);
				if (!validRegId) {
					throw new UserAlreadyExistException("already exist");
				}
				sc.nextLine();

				System.out.println("enter name");
				String name = sc.nextLine();

				System.out.println("enter email");
				String email = sc.nextLine();

				System.out.println("enter password");
				String password = sc.nextLine();

				CandidateDetails details = Main.getDetailsUserIp();
				if (validReg) {
					list.add(new JobSeeker(registrationId, name, email, password, details));
				}
				System.err.println("added...");
			}
				break;

			case 2: {
				System.out.println("Enter ID");
				Integer id = sc.nextInt();
				sc.nextLine();

				JobSeeker j = JobSeeker.find(list, id);

				System.out.println("Enter new email:");
				String str = sc.nextLine();

				j.setEmail(str);

				System.err.println("email updated.....");
			}
				break;

			case 3: {
				System.out.println("Enter Degree");
				String d = sc.nextLine();
				Degree d1 = Degree.valueOf(d.toUpperCase());

				for (JobSeeker j : list) {
					if (j.getDetails().getDegree().equals(d1)) {
						System.err.println(j);
					}
				}
			}
				break;

			case 4: {
				Collections.sort(list);
			}
				break;

			case 5: {
				Collections.sort(list, new Comparator<JobSeeker>() {

					@Override
					public int compare(JobSeeker o1, JobSeeker o2) {
						return o1.getDetails().getDob().compareTo(o2.getDetails().getDob());
					}
				});
			}
				break;

			case 6: {
				Collections.sort(list, new Comparator<JobSeeker>() {

					@Override
					public int compare(JobSeeker o1, JobSeeker o2) {
						return o1.getDetails().getGradutionDate().compareTo(o2.getDetails().getGradutionDate());
					}
				});
			}
				break;

			case 7: {
				list.forEach(System.err::println);
			}
				break;

			case 0: {
				sc.close();
				System.exit(0);
			}
			}
		}
	}
}
