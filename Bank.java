import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Account created successfully!");
    }

    public Customer findCustomer(int accountNumber) {
        for (Customer customer : customers) {
            if (customer.getAccount().getAccountNumber() == accountNumber) {
                return customer;
            }
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        Customer customer = findCustomer(accountNumber);

        if (customer != null) {
            customer.getAccount().deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Customer customer = findCustomer(accountNumber);

        if (customer != null) {
            customer.getAccount().withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void viewBalance(int accountNumber) {
        Customer customer = findCustomer(accountNumber);

        if (customer != null) {
            System.out.println("Current Balance: ₹" 
                    + customer.getAccount().getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void viewAccountDetails(int accountNumber) {
        Customer customer = findCustomer(accountNumber);

        if (customer != null) {
            customer.displayCustomerDetails();
        } else {
            System.out.println("Account not found.");
        }
    }
}