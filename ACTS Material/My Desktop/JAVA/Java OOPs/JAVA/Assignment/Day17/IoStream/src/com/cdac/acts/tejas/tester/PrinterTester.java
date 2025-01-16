package com.cdac.acts.tejas.tester;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.tejas.Printer;
import com.cdac.acts.tejas.PrinterType;
import com.cdac.acts.tejas.util.IOUtils;
import com.cdac.acts.tejas.util.DataUtils;


public class PrinterTester {

	public static void main(String[] args) throws IOException {
		List<Printer> printerList = new ArrayList<>();
		
		
		
		Scanner sc =new Scanner(System.in);
		int choice = 0;
		do {
			
			System.out.println("********Menu*************");
			System.out.println("1.Add Printer");
			System.out.println("2.Update Printer Price");
			System.out.println("3.Print all Printers");
			System.out.println("4.Display printers sorted by Prices (user comparing method of Comparator)");
			System.out.println("5.Filter by printerType ( use filter method of Stram API)");
			System.out.println("6.Remove a book");
			System.out.println("7. Show printer by PrinterType ( use goupingBy of Stream)");
			System.out.println("0.Save in file and Exit");
			choice= sc.nextInt();
			
			switch(choice) {
			
				case 1:{
					   System.out.println("Enter Serial No:");
					    Integer serialNo = sc.nextInt();

					    System.out.println("Enter Model No:");
					    Integer modelNo = sc.nextInt();

					    System.out.println("Enter Price:");
					    Double price = sc.nextDouble();

					    System.out.println("Enter Printer Type (LASER, INKJET, DOTMATRIX):");
					    String typeInput = sc.next();
					    PrinterType printerType;
					    
					    try {
					        printerType = PrinterType.valueOf(typeInput.toUpperCase());
					    } catch (IllegalArgumentException e) {
					        System.out.println("Invalid Printer Type. Defaulting to INKJET.");
					        printerType = PrinterType.INKJET; // Default value
					    }

					    System.out.println("Enter Manufacturing Date (yyyy-MM-dd):");
					    String dateString = sc.next();
					    LocalDate manufacturingDate = null;
					    
					    try {
					        manufacturingDate = LocalDate.parse(dateString);
					    } catch (DateTimeParseException e) {
					        System.out.println("Invalid date format. Defaulting to today.");
					        manufacturingDate = LocalDate.now(); // Default to current date
					    }

					    Printer printer = new Printer(serialNo, modelNo, price, manufacturingDate, printerType);
					    printerList.add(printer);
					    System.out.println("Printer added: " + printer);
				
				}break;
				
				case 2:{
					 System.out.println("Enter Serial No to update:");
					    Integer serialNo = sc.nextInt();
					    Printer printer = null;
					    if (printer.getSerialNo() != null) {
					        System.out.println("Current Price: " + printer.getPrice());
					        System.out.println("Enter new price:");
					        Double newPrice = sc.nextDouble();
					        printer.setPrice(newPrice);
					        System.out.println("Price updated!");
					    } else {
					        System.out.println("Printer not found!");
					    }
				}break;
				
				case 3:{
				//	printerList.forEach(System.out::println);
					System.out.println(printerList);
				}break;
				
				case 4:{
					printerList.stream().sorted(Comparator.comparing(Printer::getPrice))
					.forEach(System.out::println);
				}break;
				
				case 5:{
					
				}break;
				
				case 6:{
					
				}break;
				
				case 7:{
					
				}break;
				
				case 0:{
					try(Scanner s = new Scanner(System.in)){
					       System.out.println("enter file name");
					       String fileName = s.nextLine();
					       
					        printerList = DataUtils.getPrinterList();
					       
					       IOUtils.storePrinter(printerList, fileName);
					       System.out.println("printer stored");
						}
				}break;
			}
					
		}while(choice != 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//	       
//	       HashMap<Integer,Printer> map = IOUtils.readPrinter(fileName);
//	       System.out.println(map);
//	       System.out.println("read");
//	    //   map.forEach((t, u) -> System.out.println());
//		}catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		 
	}

}
/*
 * private static void updatePrinterPrice(Scanner scanner) {
    System.out.println("Enter Serial No to update:");
    Integer serialNo = scanner.nextInt();
    Printer printer = printerMap.get(serialNo);
    if (printer != null) {
        System.out.println("Current Price: " + printer.getPrice());
        System.out.println("Enter new price:");
        Double newPrice = scanner.nextDouble();
        printer.setPrice(newPrice);
        System.out.println("Price updated!");
    } else {
        System.out.println("Printer not found!");
    }
}

private static void printAllPrinters() {
    printerMap.values().forEach(System.out::println);
}

private static void displayPrintersSortedByPrice() {
    printerMap.values().stream()
        .sorted(Comparator.comparing(Printer::getPrice))
        .forEach(System.out::println);
}

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrinterTester {
    private static final String FILE_NAME = "printers.dat"; // Define your file name
    private static Map<Integer, Printer> printerMap = new HashMap<>();

    public static void main(String[] args) {
        loadPrinters();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("********Menu*************");
            System.out.println("1. Add Printer");
            System.out.println("2. Update Printer Price");
            System.out.println("3. Print all Printers");
            System.out.println("4. Display printers sorted by Prices");
            System.out.println("5. Filter by printerType");
            System.out.println("6. Remove a Printer");
            System.out.println("7. Show printers by PrinterType");
            System.out.println("0. Save in file and Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPrinter(scanner);
                    break;
                case 2:
                    updatePrinterPrice(scanner);
                    break;
                case 3:
                    printAllPrinters();
                    break;
                case 4:
                    displayPrintersSortedByPrice();
                    break;
                case 5:
                    filterByPrinterType(scanner);
                    break;
                case 6:
                    removePrinter(scanner);
                    break;
                case 7:
                    showPrintersByType(scanner);
                    break;
                case 0:
                    savePrinters();
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void loadPrinters() {
        try {
            List<Printer> printers = IOUtils.readPrinters(FILE_NAME);
            for (Printer printer : printers) {
                printerMap.put(printer.getSerialNo(), printer);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found, starting fresh.");
        }
    }

    private static void savePrinters() {
        try {
            IOUtils.storePrinters(new ArrayList<>(printerMap.values()), FILE_NAME);
            System.out.println("Printers saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addPrinter(Scanner scanner) {
        System.out.println("Enter Serial No:");
        Integer serialNo = scanner.nextInt();
        System.out.println("Enter Model No:");
        Integer modelNo = scanner.nextInt();
        System.out.println("Enter Price:");
        Double price = scanner.nextDouble();
        System.out.println("Enter Printer Type (LASER, INKJET, DOTMATRIX):");
        String typeInput = scanner.next().toUpperCase();
        PrinterType printerType;
        try {
            printerType = PrinterType.valueOf(typeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Printer Type. Defaulting to INKJET.");
            printerType = PrinterType.INKJET;
        }
        System.out.println("Enter Manufacturing Date (yyyy-MM-dd):");
        String dateString = scanner.next();
        LocalDate manufacturingDate = LocalDate.parse(dateString);

        Printer printer = new Printer(serialNo, modelNo, price, printerType, manufacturingDate);
        printerMap.put(serialNo, printer);
        System.out.println("Printer added: " + printer);
    }

    // Implement other methods similarly (updatePrinterPrice, printAllPrinters, etc.)
}

*/
