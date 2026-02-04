import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        transactionCount++;
        deductTransactionFee();
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        transactionCount++;
        deductTransactionFee();
    }

    private void deductTransactionFee() {
        try {
            java.lang.reflect.Field balanceField = BasicBankAccount.class.getDeclaredField("balance");
            balanceField.setAccessible(true);
            double newBalance = getBalance() - 0.10;
            balanceField.set(this, newBalance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}
