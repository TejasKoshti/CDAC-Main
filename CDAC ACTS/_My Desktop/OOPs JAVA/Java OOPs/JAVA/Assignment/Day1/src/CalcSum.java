/*
Get 4-digit number from user, write a function to calculate sum of digits
of the 4-digit number: Using loop and Using recursion
*/
import java.util.Scanner;
public class CalcSum{
    
	
    public static void main(String []args){
	   
	   int n;
	   Scanner sc=new Scanner(System.in);
	   n=sc.nextInt();
	   fun(n);
       
	
	}
	
	static void fun(int n){
	    int sum=0;
	    while(n>0){
		  int x = n%10;
		  
		  sum = x+sum;
		  n=n/10;
		
		}
		System.out.println(sum);
	
	}
}