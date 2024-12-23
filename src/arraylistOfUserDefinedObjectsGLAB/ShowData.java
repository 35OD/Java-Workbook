package arraylistOfUserDefinedObjectsGLAB;

import java.util.ArrayList;

public class ShowData {
    public static void main(String[] args) {
        // instantiation to class addDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookdetails();
        for (Book showValue : myBookList) {
            // invoking getter method for getting data
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " " + showValue.getAuthor());
        }
    }
}
