package com.cdac.acts;

public class Pattern3 {

	public static void main(String[] args) {
	
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<2*i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


//*******
//*** ***
//**   **
//*     *