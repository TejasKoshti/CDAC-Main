/*
Get 4-digit number from user, write a function to calculate sum of digits
of the 4-digit number: Using loop and Using recursion
*/
import java.util.Scanner;
public class RecSum{
    
	
    public static void main(String []args){
	   
	   
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int a = fun(n);
       System.out.println(a);
	
	}
	static int s = 0;
	static int fun(int n){
	    
	    if(n==0) return 0;
		int x = n%10;
		s = x + fun(n/10);
		return s;
	
	}
}