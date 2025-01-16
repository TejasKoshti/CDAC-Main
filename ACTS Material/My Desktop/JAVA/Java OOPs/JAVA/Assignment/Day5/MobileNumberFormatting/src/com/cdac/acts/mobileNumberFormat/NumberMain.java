package com.cdac.acts.mobileNumberFormat;

import java.util.Scanner;

public class NumberMain {
	
	public static void NumberFormat(StringBuilder s) {
		 StringBuilder sb = new StringBuilder("+91");
		if(s.length() == 10) {
			
			sb.append(s);
			sb.insert(3, "-");
			sb.insert(7, "-");
			sb.insert(11, "-");
		}
		
		System.out.println(sb);
		
	}

	public static void main(String[] args) {
		
		StringBuilder number = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 10 digit Number :");
        number.append(sc.next());
        
        
        
       StringBuilder str1 = new StringBuilder("+91-988-162-8598");
//        String str = "+91-988-162-8598";
//       if(number.length() < 10)
//       {
//    	   System.out.println("Eror");
//       }
//        else if (str.length() == number.length()) {
//		 System.out.println(number); 
//        }
//        else
//        {
//        	 NumberFormat(number);
//  		}
        
     if(number.length() < 10)      
    	 {
    		 System.out.println("Error");
    	 }
     else if (number.length() == str1.length()) {
    	 if(number.charAt(0) == '+' && number.charAt(2) == '1' && number.charAt(1) == '9' && number.charAt(3) == '-' && number.charAt(7) == '-' && number.charAt(11) == '-') {
    		 System.out.println(number);
    	 }else {
    		 System.out.println("invalid");
    	 }
     }
     else
      {
      	 NumberFormat(number);
		}
       
       
       
		sc.close();
	}

}
