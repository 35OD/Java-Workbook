package javaOperators;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Operators {
    public void useArtithmeticOperators() {
        int x = 10;
        int y = 5;

        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));
    }

    public void useLogicalOperator() {
        int age = 17;
        boolean hasMembership = true;

        System.out.println("Can access club: " + (age >= 18 && hasMembership));
        System.out.println("Can join trail: " + (age >= 18 || hasMembership));
        System.out.println("No membership: " + !hasMembership);
    }

    public void useTypeCasting() {
        //implicit type casting
        int intVal = 45;
        double doubleVal = intVal; //automatic conversion from int to double
        System.out.println("Implicit casting from int to double: " + doubleVal);

        double price = 29.99;
        int roundedPrice = (int) price;
        System.out.println("Explicit casting from double to int: " + roundedPrice);
    }

    public void useAssignmentOperators() {
        int x = 10;
        x += 5; // equivalent to x = x + 5
        System.out.println("Final value of x: " + x);
        x -= 2; // equivalent to x = x - 2
        System.out.println("Final value of x: " + x);
        x *= 3; // equivalent to x = x * 3
        System.out.println("Final value of x: " + x);
        x /= 2; // equivalent to x = x / 2
        System.out.println("Final value of x: " + x);
        x %= 3; // equivalent to x = x % 4

        System.out.println("Final value of x: " + x); //expected output: 1

    }

    public void useUnaryOperators() {
        int a = 10;

        int b = ++a;
        int c = a--;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c " + c);

        System.out.println("a: " + a);
        int i;
        for (i = 0; i < 10; i += 3) {
            System.out.println("i: " + i);
        }
    }
    //& AND: sets each bit to 1 if both bits are 1
    // | OR: sets each bit to 1 if one of two bits is 1
    // ^ XOR: sets each bit to 1 if only one of two bits is 1
    //bit shift operators shift the bits of a number to the left or right
    // << left shift: shifts the bits of the number to the left by the specified number of bits, filling the vacated bits with zeros
    // >> right shift: shifts the bits of the number to the right by the specified number of bits, filling the vacated bits with zeros

    public void useBitwise() {
        int x = 6; //binary: 0000 0110
        int y = 3; //binary: 0000 0011

        int andResult = x & y; //AND: 0000 0010 (2 in decimal)
        int orResult = x | y; //OR: 0000 0111 (7 in decimal)
        int xorResult = x ^ y; //XOR: 0000 0101 (5 in decimal)
        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);
        System.out.println("XOR result: " + xorResult);
    }

    public void useBitwiseForCryptography() {
        int data = 42;
        int key = 7;
        int encoded = data ^ key; //encrypt: xor with key
        int decoded = encoded ^ key; //decrypt: xor with same key

        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);

    }

    public void useTernary() {
        int age = 18;
        String eligibility = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Eligibility: " + eligibility);


        //can type if else statement like this or like the top example
        age = 15;
        if (age >= 18) {
            eligibility = "Adult";
            System.out.println("Eligibility: " + eligibility);
        } else {
            eligibility = "Minor";
            System.out.println("Eligibility: " + eligibility);
        }
    }

    public void useOrderPrecedence() {
        int result = 10 + 2 / 5;
        System.out.println("Result: " + result);

        int resultWithParenthesis = (10 + 2) * 5;
        System.out.println("Result with parenthesis: " + resultWithParenthesis);
    }

    public void useModulus() {
        int number = 7;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }


    public void findStringSize() {
        System.out.println("===============================================");
        // scenario 1
        String str = "Hello Java";
        System.out.println("s1:");
        System.out.println(str.length());
        System.out.println(str.isEmpty());

        // scenario 2 task a
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("s2ta:");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //task b
        String fruit1 = "Apple";
        String fruit2 = "Banana";
        System.out.println("tb:");
        System.out.println(fruit1.compareTo(fruit2));

        //task c
        String subject = "Programming";
        System.out.println("tc:");
        System.out.println(subject.startsWith("Pro") && subject.endsWith("ing"));

        //scenario 3 task a
        String word = "Character";
        System.out.println("s3ta:");
        System.out.println(word.indexOf('a'));

        //task b
        String word2 = "Character";
        System.out.println("tb:");
        System.out.println(word.lastIndexOf('a'));

        //task c
        String word3 = "LearningJava";
        System.out.println("tc:");
        System.out.println(word3.contains("Java"));

        String test = " ";
        System.out.println("isempty:");
        System.out.println(test.isEmpty());

        String word1 = "Developers";
        System.out.println("contains:");
        System.out.println(word1.contains("Dev") && word1.startsWith("De"));

    }
}
