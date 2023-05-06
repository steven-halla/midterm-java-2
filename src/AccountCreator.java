import java.util.Scanner;

public class AccountCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int accountID = 0;
        double balance = 0.0;

        while (firstName.equals("")) {
            System.out.print("Please input first name: ");
            firstName = scanner.nextLine();
            if (!firstName.matches("[a-zA-Z]+")) {
                System.out.println("Invalid input. Name can only contain letters. Please try again.");
                firstName = "";
            }
        }

        while (lastName.equals("")) {
            System.out.print("Please input last name: ");
            lastName = scanner.nextLine();
            if (!lastName.matches("[a-zA-Z]+")) {
                System.out.println("Invalid input. Name can only contain letters. Please try again.");
                lastName = "";
            }
        }

        while (true) {
            System.out.print("Please input account ID (4 digits): ");
            String accountIDStr = scanner.nextLine();
            if (accountIDStr.matches("\\d{4}")) {
                accountID = Integer.parseInt(accountIDStr);
                break;
            }
            System.out.println("Invalid input. Account ID must be 4 digits. Please try again.");
        }

        while (true) {
            System.out.print("Please input account balance: ");
            String balanceStr = scanner.nextLine();
            try {
                balance = Double.parseDouble(balanceStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Balance must be a number. Please try again.");
            }
        }

        String customerName = firstName + " " + lastName;
        BankAccount account = new BankAccount(customerName, accountID, balance);
        System.out.println("\nSavings Account created successfully!");
        System.out.println("Name: " + customerName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
