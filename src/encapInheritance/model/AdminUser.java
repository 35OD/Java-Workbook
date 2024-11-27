package encapInheritance.model;

import java.util.ArrayList;

public class AdminUser extends User {

    private ArrayList<Book> libraryInventory;

    // constructor to init admin user
    public AdminUser(String username, String email) {
        super(username, email);
        this.libraryInventory = new ArrayList<>(); // init the inventory list
    }

    public void addBook(Book book) {
        libraryInventory.add(book);
        System.out.println(book.getTitle() + " added to the library inventory.");
    }

    public void removeBook(String title) {
        Book toRemove = null;
        for (Book book : libraryInventory) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                toRemove = book;
                break;
            }
        }
        if (toRemove != null) {
            libraryInventory.remove(toRemove);
            System.out.println(title + " has been removed from the inventory");
        } else {
            System.out.println(title + " is not found in the library inventory");
        }
    }
}
