package hashmapAndTreemapProcessingGLAB;

import java.util.TreeMap;

public class ExampleTreeMapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        // using the firstkey() method
        String firstKey = numbers.firstKey();
        System.out.println("First key: " + firstKey);

        // using the lastkey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last key: " + lastKey);

        // using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());

        // using the lastentry() method
        System.out.println("Last entry: " + numbers.lastEntry());
    }
}
