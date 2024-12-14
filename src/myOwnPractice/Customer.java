package myOwnPractice;

import java.util.Scanner;

public class Customer {
    String[] customers = new String[5];

    public void inputCustomerData() {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        for (int i = 0; i <= customers.length; i++) {
            while (true) {
                System.out.println("Enter your first name: ");
                firstName = sc.nextLine().trim();
                if (!firstName.isEmpty()) {

                    break;
                }
                System.out.println("Cannot have empty input, please write a name.");
            }
            while (true) {
                System.out.println("Enter your last name: ");
                lastName = sc.next().trim();
                if (!lastName.isEmpty()) {

                    break;
                }
                System.out.println("Cannot have empty input, please write a name.");

            }
            customers[i] = firstName + " " + lastName;

        }
        sc.close();
    }

    public void displayCustomerData() {
        for (String cust : customers) {
            System.out.println(cust);
        }
    }
}

//

//
//
//            System.out.println("Enter your first name: ");
//            firstName = sc.nextLine().trim();
//            if (firstName.isEmpty()) {
//                System.out.println("Cannot have empty input, please write a name.");
//                return;
//            }
//
//            System.out.println("Enter your last name: ");
//            lastName = sc.next().trim();
//            if (lastName.isEmpty()) {
//                System.out.println("Cannot have empty input, please write a name.");
//                return;
//            }
//
//            sc.nextLine();
//            customers[i] = firstName + " " + lastName;
//
//        }

//        sc.close();





