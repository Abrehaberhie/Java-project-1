package libraryProjectToBeSubmitted;

import java.util.ArrayList;

public class Library {
	
	 private ArrayList<Book> books;

	    public Library() {
	        this.books = new ArrayList<>();
	    }

	
	
	
	 public void addBook(Book book) {
	        books.add(book);
	    }

	    public void displayBooks() {
	        for (Book book : books) {
	            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
	                    ", Available: " + (book.isAvailable() ? "Yes" : "No"));
	        }
	    }

	    public Book findBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;
	    }

}
