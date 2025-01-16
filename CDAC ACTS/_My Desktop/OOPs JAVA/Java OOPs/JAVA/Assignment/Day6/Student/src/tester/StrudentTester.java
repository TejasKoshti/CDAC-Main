package tester;


import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.Address;
import com.cdac.acts.Student;
import com.cdac.acts.enums.TitleEnum;
import com.cdac.acts.utils.DateUtils;

public class StrudentTester {

	public static Address getAddressFromUser(Scanner sc) {
		sc.nextLine();
		System.out.println("Please enter line1");
		String line1 = sc.nextLine();
		System.out.println("Please enter line2");
		String line2 = sc.nextLine();
		System.out.println("Please enter landmark");
		String landmark = sc.nextLine();
		System.out.println("Please enter pin");
		String pin = sc.nextLine();
		Address address = new Address(line1, line2, landmark, pin);
		return address;
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Please enter student name");
		String name = sc.nextLine();
		System.out.println("Please enter date of Birth in dd/MM/yyyy format");
		String strDate = sc.nextLine();
		Date bod = DateUtils.getDate(strDate);
		System.out.println("Please enter title from(PG_DAC,PG_DESD,PG_VLSI)");
		String strTitle = sc.nextLine();
		TitleEnum titleEnum = TitleEnum.valueOf(strTitle);
		System.out.println("Please enter Student Marks");
		double marks = sc.nextDouble();
		Address perAddress = StrudentTester.getAddressFromUser(sc);
		//Default ctor
		
		Student s1 = new Student(0, strTitle, marks, bod, titleEnum, perAddress);
		s1.setName(name);
		s1.setBd(bod);
		s1.setPermAddress(perAddress);
		s1.setourse(titleEnum);
		s1.setMarks(marks);
		System.out.println(s1);
		
		//Parameterized ctor
		Student s2 = new Student(name, marks, bod, titleEnum, perAddress);
		System.out.println(s2);
		
		sc.close();
	}

}
