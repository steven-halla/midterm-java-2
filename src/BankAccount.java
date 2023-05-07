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

    public void deposit(Transaction transaction) {
        balance += transaction.getAmount();
        transactions.add(transaction);
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

    }


}
