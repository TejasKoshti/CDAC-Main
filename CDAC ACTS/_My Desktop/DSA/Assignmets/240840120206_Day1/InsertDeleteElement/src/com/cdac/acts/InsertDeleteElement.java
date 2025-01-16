package com.cdac.acts;

import java.util.Scanner;

public class InsertDeleteElement {

	public static void print(double[] arr, int n) {
		for (int i = 0; i < n; ++i) {
			System.out.println(arr[i]);
			System.out.println("");
		}
	}

	public static double[] resizeArray(double[] arr, int newSize) {
		double[] newArray = new double[newSize];

		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
	}
	
	public static double[] insert (double[] newArray, int newSize, int pos, double value)
	{
		for (int i = newArray.length; i<pos; i--)
		{
			newArray[i] = newArray[i-1]; 
		}
		newArray[pos] = value;
		return newArray;
	}
	
	public static double[] delete (double[] newArray, int pos)
	{
		for (int i = pos; i<newArray.length-1; i++)
		{
			newArray[i] = newArray[i+1];
		}
		return newArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[3];
		arr[0] = 1.0;
		arr[1] = 2.0;
		arr[2] = 3.0;

		int n = arr.length;

		System.out.println("Array elements before any operation");
		print(arr, n);

		System.out.println("What is the new size of array?");
		int newSize = sc.nextInt();
		sc.nextLine();

		double[] newArray = resizeArray(arr, newSize);
		
		System.out.println("Array elements after resize.");
		print(newArray, newSize);
		
		newArray = insert(newArray, newSize, 1, 0.5);
		System.out.println("Array elements after insertion.");
		print(newArray, newSize);
		
		newArray = delete (newArray, 2);
		System.out.println("Array elements after deletion.");
		print(newArray, newArray.length);
		
		
	}

}
