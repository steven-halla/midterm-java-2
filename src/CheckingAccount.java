class CheckingAccount extends BankAccount {
    final double OVERDRAFT_LIMIT  = 200.00;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String customerName, int accountID, double balance) {
        super(customerName, accountID, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= - OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        } else {
            System.out.println("Transaction declined. Overdraft limit exceeded.");
        }
    }
}
//overdraft of 200