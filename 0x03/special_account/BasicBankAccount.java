import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
        this.balance = 0.0;
    }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public double getAnnualInterestRate() { return annualInterestRate; }

    // Deposit
    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0) throw new InvalidOperationException("Deposit amount must be greater than 0");
        balance += value;
    }

    // Withdraw
    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0) throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        if (value > balance) throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        balance -= value;
    }

    // Monthly fee
    public double calculateMonthlyFee() {
        return Math.min(0.10 * balance, 10.0);
    }

    // Monthly interest
    public double calculateMonthlyInterest() {
        return balance > 0 ? (balance * (annualInterestRate / 100)) / 12 : 0.0;
    }

    // Apply monthly update
    public void applyMonthlyUpdate() {
        balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }

    // Protected helper to adjust balance in subclasses
    protected void adjustBalance(double amount) {
        balance += amount;
    }
}
