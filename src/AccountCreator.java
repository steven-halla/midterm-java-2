import java.util.Scanner;

public class AccountCreator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Account Creator!");
            System.out.println("Please choose an option:");
            System.out.println("1: Create a savings account");
            System.out.println("2: Create a checking account");
            System.out.println("3: Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createSavingsAccount(scanner);
                    break;
                case 2:
                    createCheckingAccount(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createSavingsAccount(Scanner scanner) {
        createAccount(scanner, true);
    }

    private static void createCheckingAccount(Scanner scanner) {
        createAccount(scanner, false);
    }

    private static void createAccount(Scanner scanner, boolean isSavingsAccount) {
        String firstName = "";
        String lastName = "";

        while (firstName.isEmpty()) {
            System.out.print("Please enter your first name: ");
            firstName = scanner.nextLine();

            if (!firstName.matches("^[a-zA-Z]+$")) {
                System.out.println("Invalid input. First name can only contain letters.");
                firstName = "";
            }
        }

        while (lastName.isEmpty()) {
            System.out.print("Please enter your last name: ");
            lastName = scanner.nextLine();

            if (!lastName.matches("^[a-zA-Z]+$")) {
                System.out.println("Invalid input. Last name can only contain letters.");
                lastName = "";
            }
        }

        int accountID = 0;
        while (accountID == 0) {
            System.out.print("Please enter your account ID (4 digits): ");
            String accountIDStr = scanner.nextLine();
            if (accountIDStr.matches("\\d{4}")) {
                accountID = Integer.parseInt(accountIDStr);
            } else {
                System.out.println("Invalid input. Account ID must be 4 digits.");
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

        String customerName = firstName + " " + lastName;
        BankAccount account;
        if (isSavingsAccount) {
            account = new SavingsAccount(customerName, accountID, balance);
            System.out.println("\nSavings Account created successfully!");
        } else {
            account = new CheckingAccount(customerName, accountID, balance);
            System.out.println("\nChecking Account created successfully!");
        }

        System.out.println("Name: " + customerName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
