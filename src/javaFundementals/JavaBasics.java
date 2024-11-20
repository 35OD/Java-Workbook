package javaFundementals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaBasics {

    private String name;
    private int age;
    Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JavaBasics() {

    }

    public void useVariables() {
        int age = 21;
        double price = 5.25;
        char grade = 'A';
        boolean isMember = true;

        System.out.println("Age: " + age + "\n" + "Price: " + price + "\n" + "Grade: " + grade + "\n" + "Is Member: " + isMember);
    }

    public void useLiterals() {
        int num = 100;
        double pi = 3.14;
        char letter = 'B';
        String greeting = "Hello World";
        boolean isActive = false;

        System.out.println("Number: " + num + "\n" + "Pi: " + pi + "\n" + "letter: " + letter + "\n" + "is Active: " + isActive + "\n" + "Greeting: " + greeting);
    }

    public void useScanner() {
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();
        ;

        System.out.println("Hello, " + name + "!" + " You are " + age + " years old.");

        input.close();
    }
}