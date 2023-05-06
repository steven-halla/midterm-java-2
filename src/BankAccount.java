// Steven Halla
// Midterm
// Java 2

import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private int accountID = 0;
    private String customerName = "";
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

//    private ArrayList ;
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

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
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





//    Design a class named BankAccount that contains:
//
//        A private int data field named accountID for the account (default 0).

//A private data field CustomerName of the String type to store the name of the customer, .
//A private double data field named balance for the account (default 0).
//A private double data field named annualInterestRate that stores the current interest rate (default 0).


//A private Date data field named dateCreated that stores the date when the account was created.

//A private data field named transactions of type ArrayList that stores the
// transaction for the accounts. Each transaction is an instance of the Transaction class.

//A no-arg constructor that creates a default account.

//A constructor that creates an account with the specified CustomerName,
// accountID and initial balance.

//The accessor and mutator methods for accountID, balance, and annualInterestRate.