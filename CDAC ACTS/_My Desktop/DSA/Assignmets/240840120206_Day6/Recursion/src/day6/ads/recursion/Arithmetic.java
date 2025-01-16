/*
 * 1. Write recursive algorithm to find quotient after dividing two numbers.
   Using above definition, implement following function to return quotient after dividing two numbers (a / b).
   int quotient(int a, int b);
   Follow up: Modify implementation/Implement wrapper function to handle both positive and negative numbers.
*/   
/*   2. Write recursive algorithm to find remainder after dividing two numbers.
   Using above definition, implement following function to return remainder after dividing two numbers (a % b).
	int remainder(int a, int b);
   Follow up: Modify implementation/Implement wrapper function to handle both positive and negative numbers.
*/
/*
 	3. Implement following funtion to "optimally" multiple two numbers, recursively. Handle both negative and positive numbers.
	int multiply(int a, int b);
   */

package day6.ads.recursion;

public class Arithmetic {
	
	int x ,y;
	int temp;
	int count = 0;
	
	private  int multiply(int a, int b) {
		
		if(a==0 || b==0) return 0;
		if(a==1) return b;
		if(b==1) return a;
		
		if(b>0) {
			temp = a + multiply(a, b-1);
		}
		
		return temp;
	}
	private  int quotient(int a,int b) {
		 this.x =a;
		 this.y =b;
		 if(x>0) {
		 if(y>x ||x==0) return 0;
		 if(y==1) return x;
//		 if(x==0) return 0;
		 while(x>=y) {
			  temp = quotient(x-y,y);
			 count++;
		 }
		 }
		
		return count;
	}
	
	private  int remainder(int x,int y) {

		 
		 if(y>x || x==0) return x;
		 if(y==1) return 0;

		 if(x>0) {
			  temp = remainder(x-y,y);
		 }
		 
		
		return temp;
	}
	
	public void placeHolder(int a,int b) {
		
		 
		if(a<0 && b<0) {
			a = -1*a;
			b = -1*b;
		}
		if(a<0) {
			a = -1*a;
		}
		if(b<0) {
			b = -1*b;
		}
		
		int mlt = multiply( a, b);
		System.out.println("Multiplication is: "+mlt);
		
		int res = remainder(a, b);
		System.out.println("Remainder is: "+res);
		
		int quo = quotient(a,b);
		System.out.println("Quotient is: "+quo);
	}

}
