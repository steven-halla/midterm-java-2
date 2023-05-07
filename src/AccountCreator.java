import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AccountCreator {
    private static final int ACCOUNT_ID_LENGTH = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\nBank Account System\n");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter your first name: ");
                scanner.nextLine();
                String firstName = "";
                while (true) {
                    firstName = scanner.nextLine();
                    if (firstName.matches("^[a-zA-Z]*$")) {
                        break;
                    }
                    System.out.print("Invalid input. First name can only contain letters. Please try again: ");
                }

                System.out.print("Enter your last name: ");
                String lastName = "";
                while (true) {
                    lastName = scanner.nextLine();
                    if (lastName.matches("^[a-zA-Z]*$")) {
                        break;
                    }
                    System.out.print("Invalid input. Last name can only contain letters. Please try again: ");
                }

                System.out.print("Enter your account ID (must be 4 digits long): ");
                int accountID = 0;
                while (true) {
                    String input = scanner.next();
                    if (input.matches("\\d{" + ACCOUNT_ID_LENGTH + "}")) {
                        accountID = Integer.parseInt(input);
                        break;
                    }
                    System.out.print("Invalid input. Account ID must be " + ACCOUNT_ID_LENGTH + " digits long. Please try again: ");
                }

                System.out.print("Enter your balance: ");
                double balance = scanner.nextDouble();

                account = new BankAccount(firstName + " " + lastName, accountID, balance);

                System.out.println("\nSavings Account created successfully!");
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Account ID: " + accountID);
                System.out.println("Balance: $" + balance);
                System.out.println("Date Created: " + account.getDateCreated());
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
