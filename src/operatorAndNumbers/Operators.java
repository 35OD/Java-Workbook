package operatorAndNumbers;

import java.util.Scanner;

public class Operators {

    public void binaryToString() {
//        Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        int resultPrint = Integer.parseInt(Integer.toBinaryString(x));
        System.out.println(resultPrint);
        x = x << 1;
        double resultDouble = x;
        int resultBinary = Integer.parseInt(Integer.toBinaryString(x));
        System.out.println(resultBinary + "\n" + resultDouble);

    }
//
//    Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.

    public void binary2() {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        double resultDouble = x;
        System.out.println(Integer.toBinaryString(x) + "\n" + resultDouble);
    }


    public void number3() {
        int x = 7;
        int y = 17;
        int z;
        Integer.toBinaryString(x);
        Integer.toBinaryString(y);
        z = x & y;
        System.out.println("Binary result: " + Integer.toBinaryString(z));
        System.out.println("Decimal result: " + z);

//        Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y. As before, write a comment that indicates what you predict the values to be before printing them out
        z = x | y;
        System.out.println("Result: " + z);

    }
//    Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value. Print the value before and after the increment operator.

    public void number4() {
        int x = 5;
        System.out.println("X before: " + x);
        System.out.println("X post increment: " + x++);
        System.out.println("X after: " + x);
    }

    //    Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times. Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
    public void increment() {
        int x = 5;
        System.out.println("X before: " + x);
        System.out.println("X post increment: " + x++);
        System.out.println("X after: " + x);
        System.out.println("X pre increment: " + (x += 1));
        System.out.println("X after: " + (x + 1));
    }

    //    Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
    public void increment2() {
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println(sum);
    }
}
