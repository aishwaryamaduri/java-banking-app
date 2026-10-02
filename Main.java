import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== JAVA BANKING APP =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Balance");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();

                    System.out.print("Enter initial deposit: ");
                    double initialDeposit = scanner.nextDouble();

                    System.out.println("Select account type:");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    System.out.print("Enter choice: ");

                    int accountType = scanner.nextInt();

                    Account account;

                    if (accountType == 1) {
                        account = new SavingsAccount(
                                accountNumber, initialDeposit);
                    } else {
                        account = new CurrentAccount(
                                accountNumber, initialDeposit);
                    }

                    Customer customer = new Customer(
                            name, phone, account);

                    bank.addCustomer(customer);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int depositAccount = scanner.nextInt();

                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();

                    bank.deposit(depositAccount, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawAccount = scanner.nextInt();

                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();

                    bank.withdraw(withdrawAccount, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int balanceAccount = scanner.nextInt();

                    bank.viewBalance(balanceAccount);
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    int detailsAccount = scanner.nextInt();

                    bank.viewAccountDetails(detailsAccount);
                    break;

                case 6:
                    System.out.println("Thank you for using Java Banking App!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}