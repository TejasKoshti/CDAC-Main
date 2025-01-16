// Write menu driven java program for performing Add, Subtract,Multiplication and division of numbers.
import java.util.Scanner;

public class ArithOperation
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter The Number 1 :");
		int num2 = sc.nextInt();
		int choice;
		
		do
		{
			
			System.out.println("1. Add:");
			System.out.println("2. Sub:");
			System.out.println("3. Mul:");
			System.out.println("4. Div:");
			System.out.println("Enter your Choice :");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:{
					add(num1, num2);
					break;
				}
				case 2:{
					sub(num1, num2);
					break;
				}
				case 3:{
					mul(num1, num2);
					break;
				}
				case 4:{
					div(num1, num2);
					break;
				}
				default:
				{
					break;
				}
			}
			
		}while(choice != 5);
		
	}

	static void add(int num1, int num2)
	{
		int sum = num1 + num2;
		System.out.println("The Addition is "+sum);
	}
	
	static void sub(int num1, int num2)
	{
		int sum = num1 - num2;
		System.out.println("The Sub is "+sum);
	}
	
		static void mul(int num1, int num2)
	{
		int sum = num1 * num2;
		System.out.println("The Mul is "+sum);
	}
	
		static void div(int num1, int num2)
	{
		int sum = num1 / num2;
		System.out.println("The Div is "+sum);
	}

}