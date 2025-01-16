package Demo;

import java.util.Scanner;

public class MappingMain{

	public static void main(String[] args) {
		Mapping mapping = Mapping.HR;
		System.out.println(mapping.getValue());
		
		          // OR
		
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the short code (SE, HR, PE):");
        String str = scanner.nextLine().toUpperCase(); // Convert to uppercase to match enum

        try {
            Mapping userMapping = Mapping.valueOf(str); // Retrieve enum constant
            System.out.println("You entered: " + userMapping.getValue());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid code entered: " + str);
        }

		scanner.close();

	}

}
