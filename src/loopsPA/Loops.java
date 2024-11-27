package loopsPA;

import java.util.Scanner;

public class Loops {

    // Write a program that uses nested for loops to print a multiplication table.
    public void question1() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("\t" + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    // Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
    //Examples:
    //Enter 2 and 4. The gcd is 2.
    //Enter 16 and 24.  The gcd is 8.
    //How do you find the gcd?
    //Name the two input integers n1 and n2.
    //You know number 1 is a common divisor, but it may not be the gcd.
    //Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
    public void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int n1 = sc.nextInt();
        System.out.println("Insert second number: ");
        int n2 = sc.nextInt();
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }

        }
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);

    }

    // Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
    //In how many years will the tuition be doubled?
    // 0
    //$10,000
    //1
    //tuition = 1.07 * tuition
    //…
    //tuition = 1.07 * tuition
    //…
    //tuition = 1.07 * tuition
    //…
    //…
    //?
    //$20,000 or more
    public void question3() {
        int tuition = 10000;
        double percentile = 0.07;
        int year = 0;
        while (tuition < 20000) {
            tuition = (int) (tuition * (1 + percentile));
            year++;
        }
        System.out.println("The tuition will be doubled in " + year + " years");

    }
}
