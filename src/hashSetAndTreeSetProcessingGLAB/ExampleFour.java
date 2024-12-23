package hashSetAndTreeSetProcessingGLAB;

import java.util.HashSet;

public class ExampleFour {
    public static void main(String[] args) {
// enhanced for() loop example

        // hashset declaration
        HashSet<String> hSet = new HashSet<>();

        // adding elements to the hashset
        hSet.add("Apple");
        hSet.add("Mango");
        hSet.add("Grapes");
        hSet.add("Orange");
        hSet.add("Fig");

        // addition of duplicate elements
        hSet.add("Apple");
        hSet.add("Mango");

        // addition of null values
        hSet.add(null);
        hSet.add(null);

        // using advanced for loop
        for (String str : hSet) {
            System.out.println("---> " + str);
        }
        // hashset does not maintain any order
    }
}
