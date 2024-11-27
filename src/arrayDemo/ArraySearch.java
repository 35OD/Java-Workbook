package arrayDemo;

import java.util.Arrays;

public class ArraySearch {

    public void useLinearSearch() {
        int[] numbers = {7, 8, 9, 8, 11, 12};
        int target = 8;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Number found: " + "at index " + i + ", " + numbers[i]);
            } else {
                System.out.println("Numbers not found: ");
            }
        }
    }

    public void useBinarySearch() {
        int[] numbers = {15, 25, 35, 45, 55};

        Arrays.sort(numbers); //ensure the array is sorted

        int target = 40;
        int result = myBinarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public int myBinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // to find the middle index

            if (array[mid] == target) {
                return mid; // returning the index if the target is immediately found
            } else if (array[mid] < target) {
                left = mid + 1; // search in the right half of the array
            } else {
                right = mid - 1; // search in the left half of the array
            }
        }
        return -1; // return -1 if the target is not found in the array
    }
}