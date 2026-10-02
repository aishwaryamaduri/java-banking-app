public class Customer {

    private String name;
    private String phoneNumber;
    private Account account;

    public Customer(String name, String phoneNumber, Account account) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: ₹" + account.getBalance());
    }
}