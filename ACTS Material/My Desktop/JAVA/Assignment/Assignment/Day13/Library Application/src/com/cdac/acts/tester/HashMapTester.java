package com.cdac.acts.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cdac.acts.BookDetails;
import com.cdac.acts.BookType;
import com.cdac.acts.exceptions.BookNotFoundException;

public class HashMapTester {

    public static void main(String[] args) {
        
        // Creating a map to store book details
        Map<String, BookDetails> map = new HashMap<>();
        
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        
        do {
            // Displaying menu options
            System.out.println("**************MENU***************");
            System.out.println("1 Add book");
            System.out.println("2 Display All books");
            System.out.println("3 Allot book to student (quantity -1). Find by book title");
            System.out.println("4 Take book return (quantity +1) Find by book title");
            System.out.println("5 Remove book");
            System.out.println("6 Exit");
            
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                {
                    System.out.println("Enter The Book Title");
                    String title = sc.next();
                    System.out.println("Enter The Book Price");
                    Double price = sc.nextDouble();
                    System.out.println("Enter The Book Author Name");
                    String authorName = sc.next();
                    System.out.println("Enter The Book Quantity");
                    Integer quantity = sc.nextInt();
                    
                    System.out.println("Enter the Published Date (yyyy-MM-dd):");
                    LocalDate publishedDate = null;
                    while (publishedDate == null) {
                        String dateInput = sc.next();
                        try {
                            publishedDate = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format:");
                        }
                    }
                    
                    System.out.println("Enter The GEM: \n\r"
                            + " 0.ROMANCE : ROM, \r\n"
                            + "    1.MYSTERY : MY,\r\n"
                            + "    2.THRILLER: TH, \r\n"
                            + "    3.FICTION : FI,\r\n"
                            + "    4.FANTASY : FA");
                    String genStr = sc.next().toUpperCase();
                    sc.nextLine();
                    
                    // Book type selection with Exception Handling
                    BookType bt = null;
                    try {
                        bt = BookType.valueOf(genStr);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Your Book Type is Saved ");
                    }
                    
                    // Constructor calling
                    BookDetails bd = new BookDetails(title, price, authorName, quantity, bt, publishedDate);
                    map.put(bd.getTitle(), bd);
                    System.out.println("Book Added Successfully ❤️");
                }
                break;
            case 2:
                {
                    // Displaying all books
                    System.out.println("Display All Books");
                    System.out.println(map);    
                }
                break;
            case 3:
                {
                    System.out.println("Enter the book title to allot:");
                    String title = sc.next();
                    try {
                        BookDetails b = map.get(title);
                        if (b == null) {
                            throw new BookNotFoundException("Book Not Found...!");
                        }
                        if (b.getQuantity() > 0) {
                            b.setQuantity(b.getQuantity() - 1);
                            System.out.println("Book allotted successfully. Remaining quantity: " + b.getQuantity());
                        } else {
                            System.out.println("No copies available.");
                        }
                    } catch (BookNotFoundException be) {
                        System.out.println(be.getMessage());
                    }
                }
                break;
            case 4:
                {
                    System.out.println("Enter the book title to return:");
                    String title = sc.next();
                    try {
                        BookDetails b = map.get(title);
                        if (b == null) {
                            throw new BookNotFoundException("Book Not Found...!");
                        }
                        b.setQuantity(b.getQuantity() + 1);
                        System.out.println("Book returned successfully. New quantity: " + b.getQuantity());
                    } catch (BookNotFoundException be) {
                        System.out.println(be.getMessage());
                    }
                }
                break;
            case 5:
            {
                System.out.println("Enter the book name you want to remove:");
                String title = sc.next();
                BookDetails b = map.remove(title);
                if (b != null) {
                    System.out.println("Book removed successfully"); 
                } else {
                    System.out.println("Book not found.");
                }
            }
            break;
            case 6:
                System.out.println("Thank you for Visiting 🙏"); 
                break;

            default:
                break;
            }    
        } while (choice != 6);
        sc.close();
    }
}
