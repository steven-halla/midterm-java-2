import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AccountCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Account Creator!");

        String firstName = "";
        String lastName = "";

        while (firstName.isEmpty() || lastName.isEmpty()) {
            if (firstName.isEmpty()) {
                System.out.print("Please enter your first name: ");
                firstName = scanner.nextLine();

                if (!firstName.matches("^[a-zA-Z]+$")) {
                    System.out.println("Invalid input. First name can only contain letters.");
                    firstName = "";
                }
            } else {
                System.out.print("Please enter your last name: ");
                lastName = scanner.nextLine();

                if (!lastName.matches("^[a-zA-Z]+$")) {
                    System.out.println("Invalid input. Last name can only contain letters.");
                    lastName = "";
                }
            }
        }

        String name = firstName + " " + lastName;

        int accountID = 0;
        while (accountID == 0) {
            System.out.print("Please enter your account ID: ");
            try {
                accountID = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Account ID can only contain numbers.");
                scanner.nextLine();
            }
        }

        double balance = 0;
        while (balance == 0) {
            System.out.print("Please enter your balance: ");
            try {
                balance = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Balance can only contain numbers.");
                scanner.nextLine();
            }
        }

        BankAccount account = new BankAccount(name, accountID, balance);

        System.out.println("\nAccount created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
