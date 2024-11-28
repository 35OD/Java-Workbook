package arrayPA;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

    // Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
    public void question1() {
        int[] array = {1, 2, 3};
        for (int arr : array) {
            System.out.print(arr + " ");
        }

    }

    // Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
    public void question2() {
        int[] array = {13, 5, 7, 8, 9, 68, 2};
        int middleArray = array.length / 2;
        System.out.println(array[middleArray]);
    }

    //  Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    public void question3() {
        String[] colours = {"red", "green", "blue", "yellow"};
        System.out.println(Arrays.toString(colours).length());

        String[] coloursClone = colours.clone();

        for (String colour : coloursClone) {
            System.out.print(colour + " ");
        }


    }

    //  Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
    public void question4() {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("First index: " + numbers[0]);
        System.out.println("Last index: " + numbers[numbers.length - 1]);
//
//        System.out.println(numbers[numbers.length]);
//        numbers[5] = 6;

    }

    //  Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
    public void question5() {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

    // Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
    public void question6() {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i * 2;
//            System.out.println(num[i] = i * 2);
        }
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

    // Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
    public void question7() {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            if (i != 2) {
                num[i] = i;
            }
        }
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

    // Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
    public void question8() {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("First index: " + numbers[0]);
        System.out.println("Middle index: " + numbers[numbers.length - 3]);

        numbers[0] = numbers[2];
        System.out.println("New first index: " + numbers[0]);
    }

    // Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    //The biggest number is 13
    public void question9() {
        int[] num = {4, 2, 9, 13, 1, 0};
        Arrays.sort(num);
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println("\nThe smallest number is: " + num[0]);
        System.out.println("The biggest number is: " + num[5]);
    }

    // Create an array that includes an integer, 3 strings, and 1 double. Print the array.
    public void question10() {
        Object[] array = {1, "Hello", "Hi", "Hey", 3.14};

        for (Object arr : array) {
            System.out.print(arr + " ");
        }
    }

    //  Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.
    public void question11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favourite things do you have?");
        int amount = sc.nextInt();
        sc.nextLine();
        String[] faveItems = new String[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter your favourite thing: #" + (i + 1) + ": ");
            faveItems[i] = sc.nextLine();
        }
        System.out.println("Your favorite things are:");
        for (String item : faveItems) {
            System.out.print(item + " ");
        }
    }
}
