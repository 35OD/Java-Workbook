package encapInheritance.model;

import java.util.ArrayList;
import java.util.Calendar;

//  the libraryUser is a user, one user
public class LibraryUser extends User {

    private ArrayList<Book> borrowedBooks; // declared arraylist

    // constructor to init the library user
    public LibraryUser(String userName, String email) {
        // must be the first line in the constructor or it will not work
        super(userName, email);  // call to the parent class constructor
        this.borrowedBooks = new ArrayList<>(); // initialize the borrowed books list
    }

    // method to borrow a book
//    public void borrowBook(Book book) {
//        if (book.borrowBook()) {
//            borrowedBooks().add(book); // add the book to the borrowed books list
//            System.out.println("You borrowed: " + book.getTitle());
//        } else {
//            System.out.println("Sorry " + book.getTitle() + " is not available");
//        }
//    }   turned off for now, will continue later


    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook(); // update the book's availability
            System.out.println("Your returned: " + book.getTitle());
        } else {
            System.out.println("This book is not in your borrowed list");
        }
    }

    @Override  //overriding the displayDetails method
    public void displayDetails() {
        super.displayDetails(); // Invoking the parent class method
        System.out.println("Borrowed Books: ");
        for (Book book : borrowedBooks) {  // loop through the borrowed books list that the user has borrowed
            System.out.println("-" + book.getTitle()); // print each book title
        }
    }

}
