package hashSetAndTreeSetProcessingGLAB;

import java.util.TreeSet;

public class TreesetExampleCom {
    public static void main(String[] args) {

        // create a treeset with user defined comparators
        TreeSet<String> cities = new TreeSet<>(new Cities_Comparator());

        // add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("New York");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        // print the contents of the treeset
        System.out.println("Treeset: " + cities);
    }
}
