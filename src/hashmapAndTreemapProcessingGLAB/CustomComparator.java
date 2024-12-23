package hashmapAndTreemapProcessingGLAB;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String number1, String number2) {
        int value = number1.compareTo(number2);

        // elements are sorted in reverse order
        if (value > 0) {
            return -1; // flips positive to negative
        } else if (value < 0) {
            return 1; // flips negative to positive
        } else {
            return 0; // no change
        }
    }
}
