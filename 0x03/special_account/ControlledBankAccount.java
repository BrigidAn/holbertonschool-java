public class ControlledBankAccount extends BasicBankAccount {
    private double minimumBalance;
    private double penaltyAmount;

    public ControlledBankAccount(String accountNumber, double annualInterestRate,
                                 double minimumBalance, double penaltyAmount) {
        super(accountNumber, annualInterestRate);
        this.minimumBalance = minimumBalance;
        this.penaltyAmount = penaltyAmount;
    }

    @Override
    public void applyMonthlyUpdate() {
        // Apply standard monthly fee and interest
        super.applyMonthlyUpdate();
        // Apply penalty if balance is below minimum
        if (getBalance() < minimumBalance) {
            try {
                // Directly modify the balance
                java.lang.reflect.Field balanceField = BasicBankAccount.class.getDeclaredField("balance");
                balanceField.setAccessible(true);
                double newBalance = getBalance() - penaltyAmount;
                balanceField.set(this, newBalance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
