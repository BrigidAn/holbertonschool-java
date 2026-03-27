import java.util.*;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    // Find branch
    public Branch findBranch(String branchName) {
        for (Branch b : branches) {
            if (b.getName().equals(branchName)) {
                return b;
            }
        }
        return null;
    }

    // Add branch
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        }

        branches.add(new Branch(branchName));
        return true;
    }

    // Add customer
    public boolean addCustomer(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.newCustomer(customerName, amount);
        }

        return false;
    }

    // Add customer transaction
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    // List customers
    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        ArrayList<Customer> customers = branch.getCustomers();

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Client: " + customer.getName() + " [" + (i + 1) + "]");

            if (printTransactions) {
                ArrayList<Double> transactions = customer.getTransactions();

                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("  [" + (j + 1) + "] value " + transactions.get(j));
                }
            }
        }

        return true;
    }
}
