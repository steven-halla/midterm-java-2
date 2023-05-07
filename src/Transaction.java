import java.util.Date;

public class Transaction {
    private Date transactionDate;
    private char depositTransaction = 'D';
    private char withdrawalTransaction = 'W';
    private char transactionType;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char transactionType, double amount, double balance, String description) {
        this.transactionDate = new Date();
        setTransactionType(transactionType);
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public void setTransactionType(char transactionType) {
        if (transactionType == depositTransaction || transactionType == withdrawalTransaction) {
            this.transactionType = transactionType;
        } else {
            throw new IllegalArgumentException("Invalid transaction type. Must be 'D' for deposit or 'W' for withdrawal.");
        }
    }

    public double getAmount() {
        return amount;
    }


    // Getters and setters (if needed)
}


