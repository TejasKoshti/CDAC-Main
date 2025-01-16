// Write menu driven java program with below options
//  Calculate simple interest
//  Calculate compound interest

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        int p, r, t, choice;
        Scanner sc = new Scanner(System.in);

        // Get user input for principal, rate, and time
        System.out.print("Enter principal amount (P): ");
        p = sc.nextInt();
        System.out.print("Enter rate of interest (R): ");
        r = sc.nextInt();
        System.out.print("Enter time period in years (T): ");
        t = sc.nextInt();

        Interest obj = new Interest();

        do {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. Calculate Simple Interest");
            System.out.println("2. Calculate Compound Interest");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.simpleInterest(p, r, t);
                    break;
                case 2:
                    obj.compoundInterest(p, r, t);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println(); // Print a new line for better readability
        } while (choice != 3);

        sc.close();
    }

    void simpleInterest(int p, int r, int t) {
        double SI = (p * r * t) / 100.0;
        System.out.println("Simple Interest: " + SI);
    }

    void compoundInterest(int p, int r, int t) {
        double CI = p * Math.pow((1 + r / 100.0), t) - p;
        System.out.println("Compound Interest: " + CI);
    }
}
