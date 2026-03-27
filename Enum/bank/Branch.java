import java.util.*;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    // Add new customer
    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            return false;
        }

        customers.add(new Customer(customerName, initialTransaction));
        return true;
    }

    // Add transaction
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            customer.addTransaction(amount);
            return true;
        }

        return false;
    }

    // Find customer
    public Customer findCustomer(String customerName) {
        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                return c;
            }
        }
        return null;
    }
}
