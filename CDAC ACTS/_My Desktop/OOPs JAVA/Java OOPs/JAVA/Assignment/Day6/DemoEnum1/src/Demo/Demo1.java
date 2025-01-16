package Demo;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
//	1.	DemoEnum demoEnum = null;
//		System.out.println(demoEnum);
		
//	2.	DemoEnum demoEnum = DemoEnum.FRIDAY;
//		System.out.println(demoEnum);
		
//	3.	Scanner sc = new Scanner(System.in);
//		System.out.println("");
//		String str = sc.nextLine();
//		
//		DemoEnum day = DemoEnum.valueOf(str);x
//		System.out.println(day);
//		sc.close();
		
		//*********************** Compare Enum ******************
//		DemoEnum day1 = DemoEnum.MONDAY;
		DemoEnum day2 = DemoEnum.FRIDAY;
		
//	0.1    if (day1 == day2) {
//			System.out.println("They are Equal");j
//		}else
//		{
//			System.out.println("They are not Equal");
//		}
//	0.2   if (day1.equals(day2)) {
//			System.out.println("They are Equal");
//		}else
//		{
//			System.out.println("They are not Equal");
//		}
		
		// *********** String and Enum Compare *****************
		
//		if ("FRIDAY".equals(day2)) {
//			System.out.println("They are Equal");  // Compile but not RUN
//		}
		
		if ("FRIDAY".equals(day2.toString())) {
			System.out.println("They are Equal");  // Compile  RUN
		}
		
		
		
		
		
	}

}
