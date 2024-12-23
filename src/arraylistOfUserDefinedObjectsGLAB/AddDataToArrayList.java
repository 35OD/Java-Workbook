package arraylistOfUserDefinedObjectsGLAB;

import java.util.ArrayList;

public class AddDataToArrayList {
    public ArrayList<Book> bookdetails() {
        ArrayList<Book> list = new ArrayList<>();
        // passing data using the constructors
        Book b1 = new Book(1, "Death Note", "John", "Cartoon");
        Book b2 = new Book(2, "Stranger Things", "Brothers", "Suspense");
        Book b3 = new Book(3, "Spider Man", "Alex", "Kids");
        Book b4 = new Book(4, "GentleMen", "Max", "Action");

        // passing data using the setters
        Book b5 = new Book();
        b5.setNumber(5);
        b5.setName("Java FUllstack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");

        // adding books objects to arraylist
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        return list;
    }
}
