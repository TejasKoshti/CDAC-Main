// Write a function for factorial and use the function for printing factorial series like 1 2 6 24 120………

import java.util.Scanner;	
public class Factorial{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		for(int i=num;i>0;i--){
			System.out.println(fact(i));
		}
	}
	static int a = 0;
	static int fact(int n)
	{
		
	    if(n==1)return 1;
		for(int i=n;i>0;i--)
		{
		   a =  i*fact(i-1);
		   return a;
		}
		return a;
		
	}
}