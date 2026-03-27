import java.util.*;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    // Constructor
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    // Add transaction
    public void addTransaction(double amount) {
        transactions.add(amount);
    }
}
