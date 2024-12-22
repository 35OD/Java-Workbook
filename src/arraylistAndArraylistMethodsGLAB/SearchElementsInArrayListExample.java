package arraylistAndArraylistMethodsGLAB;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // check is and arraylist contains a given element
        System.out.println("Does names array contain \"Bob\"?: " + names.contains("Bob"));

        // find the index of the first occurrence of an element in an arraylist
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

        // find the index of the last occurrence of an element in an arraylist
        System.out.println("lastIndexOf \"John\": " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\": " + names.lastIndexOf("Bill"));
    }
}
