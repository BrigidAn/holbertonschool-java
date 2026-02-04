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
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Deposit method
    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }
        balance += value;
    }

    // Withdraw method
    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }
        if (value > balance) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        }
        balance -= value;
    }

    // Monthly fee calculation
    public double calculateMonthlyFee() {
        double fee = 0.10 * balance;
        return Math.min(fee, 10.0);
    }

    // Monthly interest calculation
    public double calculateMonthlyInterest() {
        if (balance <= 0) {
            return 0.0;
        }
        return (balance * (annualInterestRate / 100)) / 12;
    }

    // Apply monthly update
    public void applyMonthlyUpdate() {
        balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }
}
