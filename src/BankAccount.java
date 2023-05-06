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