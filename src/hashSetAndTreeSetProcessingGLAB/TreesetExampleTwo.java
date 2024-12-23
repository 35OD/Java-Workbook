package hashSetAndTreeSetProcessingGLAB;

import java.util.TreeSet;

public class TreesetExampleTwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

//        // using the remove() method
//        boolean value1 = numbers.remove(5);
//        System.out.println("Is 5 removed?: " + value1);
//
//        // using the removeAll() method
//        boolean value2 = numbers.removeAll(numbers);
//        System.out.println("Are all elements removed?: " + value2);


        // using the first() method
        int first = numbers.first();
        System.out.println("First number: " + first);

        // using the last() method
        int last = numbers.last();
        System.out.println("Last number: " + last);
    }
}