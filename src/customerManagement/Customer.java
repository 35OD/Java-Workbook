package customerManagement;

import java.util.Scanner;

public class Customer {
    String[] customers = new String[5];

    public void inputCustomerData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= customers.length; i++) {
            String firstName, lastName;
            while (true) {
                System.out.println("Enter customer's first name: " + (i) + ": ");
                firstName = sc.nextLine().trim();
                if (!firstName.isEmpty()) {
                    break;
                }
                System.out.println("First name cannot be empty, please try again.");
            }
            while (true) {
                System.out.println("Enter customer's last name: " + (i) + ": ");
                lastName = sc.nextLine().trim();
                if (!lastName.isEmpty()) {
                    break;
                }
                System.out.println("Last name cannot be empty, please try again.");
            }
            customers[i - 1] = firstName + " " + lastName;

        }

    }

    public void displayCustomerData() {
        System.out.println("\nCustomer List:");
        for (String customer : customers) {
            System.out.println(customer);

        }
    }


}
