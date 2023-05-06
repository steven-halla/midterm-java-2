public class SavingsAccount extends BankAccount {
    public static void main(String[] args) {

    }

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String customerName, int accountID, double balance) {
        super(customerName, accountID, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            super.withdraw(amount);
        } else {
            System.out.println("Transaction declined. Savings account cannot be overdrawn.");
        }
    }
}
