package hashSetAndTreeSetProcessingGLAB;

import java.util.HashSet;

public class ExampleOne {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
// inserts elements to hashset using addAll()

        // using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();

        // using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);


    }
}
