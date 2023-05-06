class SavingAccount extends BankAccount {

    public SavingAccount() {
        super();
    }

    public SavingAccount(String customerName, int accountID, double balance) {
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

// no over draft