package arrayPA;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

    // Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
    public void question1() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Insert 3 numbers: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insert number " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        System.out.println("The 3 numbers are: ");
        for (int arr : array) {
            System.out.println(arr);
        }
    }

    // Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
    public void question2() {
        int[] array = {13, 5, 7, 68, 2};
        int middleArray = array.length / 2;
        System.out.println(array[middleArray]);
    }

    //  Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    public void question3() {
        String[] colours = {"red", "green", "blue", "yellow"};
        System.out.println(Arrays.toString(colours).length());

        String[] coloursClone = colours.clone();
        System.out.println(Arrays.toString(coloursClone));

    }

    //  Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
    public void question4() {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers);

    }

}
