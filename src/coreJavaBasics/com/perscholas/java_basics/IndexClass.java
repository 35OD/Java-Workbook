package coreJavaBasics.com.perscholas.java_basics;

import java.text.DecimalFormat;

public class IndexClass {
    public void summation() {
        int a = 5;
        int b = 5;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public void doubleSum() {
        double a = 5.5;
        double b = 5.5;
        double sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public void mixedSum() {
        int a = 5;
        double b = 5.5;
        double sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public void mixedDivision() {
        int a = 5;
        double b = 7.5;
        double sum = a / b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        //changes needed is to turn the bigger number into a double for it to hold the decimal, a decimal cannot be in an int
    }

    public void mixedDivision2() {
        double a = 5.5;
        double b = 9.4;
        double sum = a / b;
        System.out.println("The division of " + a + " and " + b + " is " + sum);
        int roundedSum = (int) sum;
        System.out.println("The rounded answer of " + sum + " is " + roundedSum);
    }

    public void casting() {
        int x = 2;
        int y = 20;
        int q = y / x;
        System.out.println(q);
        double newy = (double) y;
        newy = q;
        System.out.println(newy);
    }

    public void constants() {
        final double PI = 3.14;
        double calculation = PI * 5 * 5;
        System.out.println(calculation);
    }

    public void cafeProducts() {
        double coffee = 2.75 * 3;
        double tea = 4.12 * 4;
        double espresso = 3.35 * 2;
        double subTotal = coffee + tea + espresso;
        final double SALES_TAX = 1.07;
        double totalSale = subTotal * SALES_TAX;
        String formattedTotal = String.format("%.2f", totalSale);
        System.out.println("Order: " + "\nCoffee: $" + coffee + "\nTea: $" + tea + "\nEspresso: $" + espresso + "\nSubtotal: $" + subTotal + "\nTotal Sale: $" + formattedTotal);


    }
}


