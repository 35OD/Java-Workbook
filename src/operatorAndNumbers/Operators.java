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

//    Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.

    public void number3() {
        int x = 7;
        int y = 17;
        int z;
        Integer.toBinaryString(x);
        Integer.toBinaryString(y);


    }
}