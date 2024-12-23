package hashSetAndTreeSetProcessingGLAB;

import java.util.HashSet;

public class ExampleThree {
    public static void main(String[] args) {
        // difference of sets example

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // difference between hashset1 and hashset2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference: " + primeNumbers);
    }
}
