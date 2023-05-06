import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BankAccount {
    private int accountID = 0;
    private String customerName = "";
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount() {
        dateCreated = new Date();
    }

    public BankAccount(String customerName, int accountID, double balance) {
        this.customerName = customerName;
        this.accountID = accountID;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        return balance * monthlyInterestRate;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

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
                System.out.print("Please input your first name: ");
                scanner.nextLine();
                String firstName = "";
                while (true) {
                    firstName = scanner.nextLine();
                    if (firstName.matches("^[a-zA-Z]*$")) {
                        break;
                    }
                    System.out.print("Invalid input. First name can only contain letters. Please try again: ");
                }

                System.out.print("Please input your last name: ");
                String lastName = "";
                while (true) {
                    lastName = scanner.nextLine();
                    if (lastName.matches("^[a-zA-Z]*$")) {
                        break;
                    }
                    System.out.print("Invalid input. Last name can only contain letters. Please try again: ");
                }

                String customerName = firstName + " " + lastName;

                System.out.print("Enter your account ID: ");
                int accountID = scanner.nextInt();

                System.out.print("Enter your balance: ");
                double balance = scanner.nextDouble();

                account = new BankAccount(customerName, accountID, balance);

                System.out.println("\nSavings Account created successfully!");
                System.out.println("Name: " + customerName);
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
