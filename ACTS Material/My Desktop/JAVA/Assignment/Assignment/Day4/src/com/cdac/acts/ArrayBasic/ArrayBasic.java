package com.cdac.acts.ArrayBasic;

public class ArrayBasic {
	
	// Printing String Array
	public static void PrintArray(String[] strArr) 
	{
		for(int i = 0; i < strArr.length ; i++)
		{ 
			System.out.println("String Array :"+strArr[i]);
		}
	}
	// Printing Integer Array
	public static void PrintArray(int[] arr) 
	{
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.println("Integer Array :" +arr[i]);
		}
	}

	//Main Method
	public static void main(String[] args) {
		
		//  String Array Declaration
		int arr[] = {10,20,30,40};
		PrintArray(arr);
		
		//  String Array Declaration
		String str[] = {"Raj", "Tejas", "Saurabh"};
		PrintArray(str);
	}

}