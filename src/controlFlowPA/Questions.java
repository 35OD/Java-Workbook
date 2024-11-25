package controlFlowPA;

import java.util.Scanner;

public class Questions {
    // Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if statement to print out “Less than 10” if x is less than 10. Change x to equal 15, and notice the result (console should not display anything).
    public void question1() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
    }

    //Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
    public void question2() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    //Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
    public void question3() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
    }

    //Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
    public void question4() {
        int x = 5;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else if (x >= 10 && x <= 20) {
            System.out.println("In range");
        }
    }

    //Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: <60
//Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.
    public void question5() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score < 0 || score > 100) {
            System.out.println("Out of range.");
        } else {
            System.out.println("F");
        }
    }

    //Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.
    public void question6() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
    }

    //Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
    //The U.S. federal personal income tax is calculated based on the filing status and taxable income.
    //There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
    //The tax rates for 2009 are shown below.
    public void question7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your filing status? Pick from the following: Single, Married Jointly, MarriedSeparately, Head of Household");
        String filingStatus = sc.nextLine().replace(" ", "_");
        System.out.println("Insert income: ");
        int income = sc.nextInt();

        enum FilingStatus {
            SINGLE,
            MARRIED_JOINT,
            MARRIED_SEPARATELY,
            HEAD_OF_HOUSEHOLD
        }

        FilingStatus status = FilingStatus.valueOf(filingStatus.toUpperCase());


        switch (status) {
            case SINGLE:
                if (income >= 0 && income <= 8350) {
                    System.out.println("Your tax is 10%");
                } else if (income >= 8351 && income <= 33950) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 33951 && income <= 82250) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 82251 && income <= 171550) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 171551 && income <= 372950) {
                    System.out.println("Your tax is 20%");
                } else {
                    System.out.println("Your tax is 35%");
                }
                break;
            case MARRIED_JOINT:
                if (income >= 0 && income <= 16700) {
                    System.out.println("Your tax is 10%");
                } else if (income >= 16701 && income <= 67900) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 67901 && income <= 137050) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 137051 && income <= 208850) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 208851 && income <= 372950) {
                    System.out.println("Your tax is 20%");
                } else {
                    System.out.println("Your tax is 35%");
                }
                break;
            case MARRIED_SEPARATELY:
                if (income >= 0 && income <= 8350) {
                    System.out.println("Your tax is 10%");
                } else if (income >= 8351 && income <= 33950) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 33951 && income <= 68525) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 68526 && income <= 104425) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 104426 && income <= 186475) {
                    System.out.println("Your tax is 20%");
                } else {
                    System.out.println("Your tax is 35%");
                }
                break;
            case HEAD_OF_HOUSEHOLD:
                if (income >= 0 && income <= 11950) {
                    System.out.println("Your tax is 10%");
                } else if (income >= 11951 && income <= 45500) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 45501 && income <= 117450) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 117451 && income <= 190200) {
                    System.out.println("Your tax is 20%");
                } else if (income >= 190201 && income <= 372950) {
                    System.out.println("Your tax is 20%");
                } else {
                    System.out.println("Your tax is 35%");
                }
                break;
            default:
                System.out.println("Invalid filing status");
                break;
        }
    }
}
