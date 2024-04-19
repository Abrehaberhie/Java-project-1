package libraryProjectToBeSubmitted;

import java.util.Scanner;

public class LibraryWorkingPlace {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Librarian librarian = new Librarian();

        // Adding books to the library
        library.addBook(new Book("A Tele of Two cities", "charles Dickens"));
        library.addBook(new Book("The litle prince", "Antonine desaint"));
        library.addBook(new Book("and then there were none", "Agatha christ"));
        library.addBook(new Book("she: a history of adventure","H.Rider Haggerd"));
        library.addBook(new Book("Lolita","viadmir Nabokov"));
        library.addBook(new Book("Black beauty","Anna Sewell"));
        library.addBook(new Book("Anne of Green Gables","Lucy Maud"));
        
       User user = new User();
            
           while(true) {
            System.out.println("We are very happy to see you in our libary!");
            System.out.println("If you want to see the available books please 'A'");
            System.out.println("If you want to borrow a book please press     'B'");
            System.out.println("If you want to return the book please Press   'c'");
            System.out.println("If you want to our visitors please enter       'D'");
            System.out.println("if you want to see people who work in the library press   'E'");
            System.out.println("If you want to exit from our system please press 'F'");
            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

	            switch (choice) {
	                case 'A':
	                    library.displayBooks();
	                    break;
	                case 'B':
	                    System.out.print("Give me the tile of the book you want to borrow please.");
	                    scanner.nextLine(); // Consume newline
	                    String borrowTitle = scanner.nextLine();
	                    Book borrowBook = library.findBook(borrowTitle);
	                    if (borrowBook != null && borrowBook.isAvailable()) {
	                        System.out.println("You can borrowed the book: please return it on time " + borrowBook.getTitle());
	                        borrowBook.setAvailable(false);
	                    } else {
	                        System.out.println("The book is not available in the store please come back another time");
	                    }
	                    break;
	                case 'C':
	                    System.out.print("Enter the title of the book you want to return: ");
	                    scanner.nextLine(); // Consume newline
	                    String returnTitle = scanner.nextLine();
	                    Book returnBook = library.findBook(returnTitle);
	                    if (returnBook != null && !returnBook.isAvailable()) {
	                        System.out.println("Thank you for returning the book: " + returnBook.getTitle());
	                        returnBook.setAvailable(true);
	                    } else {
	                        System.out.println("Invalid book or book is already available.");
	                    }
	                    break;
	                case 'D':
	                	 //User user = new User();
	                	scanner.nextLine();
	                	System.out.println("here are list of our recent visitors");
	                	
	                     user.getListOfusers();
	                     
	                    break;
	                case 'E':
	                	scanner.nextLine();
	                	System.out.println("here are list of library imployee");
	                	librarian.getListOfLibraryemployee();
	                	break;
	                	
	                	
	                case 'F':
	                    System.out.println("You are leaving our library. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    

	}

}
