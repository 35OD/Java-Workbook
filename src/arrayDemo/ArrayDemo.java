package arrayDemo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
    public void useToString() {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Array Elements: " + Arrays.toString(numbers));
    }

    public void useFill() {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 7);
        System.out.println("Array Elements: " + Arrays.toString(numbers));
    }

    public void useSort() {
        int[] numbers = {25, 5, 15, 10, 20};
        Arrays.sort(numbers);
        System.out.println("Array Elements: " + Arrays.toString(numbers));
    }

    public void useForLoop() {
        int[] source = {5, 10, 15};
        int[] destination = new int[source.length];
        System.out.println("New Destination Array: ");
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
            System.out.println(destination[i]);

        }
    }

    public void useClone() {
        int[] source = {2, 4, 6};
        int[] destination = source.clone();
        System.out.println(Arrays.toString(destination));
    }

    public void useArrayCopy() {
        int[] source = {2, 4, 8};
        int[] destination = new int[3];
        System.arraycopy(source, 0, destination, 0, source.length);
        System.out.println(Arrays.toString(destination));
    }

    public void useCopyOf() {
        int[] source = {6, 7, 8};
        int[] destination = Arrays.copyOf(source, source.length);
        System.out.println(Arrays.toString(destination));
    }

    public void useAssignmentStatement() {
        int[] source = {5, 10, 15};
        int[] destination = source; // points to same array
        System.out.println(Arrays.toString(destination));
    }

    public void populareArray() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers: ");

        // input elements into the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public void useRandom() {
        Random random = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void useSumArrayElements() {
        int[] numbers = {5, 10, 15};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

}
