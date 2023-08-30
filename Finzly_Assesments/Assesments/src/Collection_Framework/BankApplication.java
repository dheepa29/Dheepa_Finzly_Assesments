import java.util.*;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Account Holder: " + accountHolder +
                ", Balance: " + balance;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\nBank Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter Account Holder Name: ");
                    String accountHolder = scanner.nextLine();
                    accounts.add(new BankAccount(accountNumber, accountHolder, 0));
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == depositAccountNumber) {
                            account.deposit(depositAmount);
                            System.out.println("Amount deposited successfully.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == withdrawAccountNumber) {
                            account.withdraw(withdrawAmount);
                            System.out.println("Amount withdrawn successfully.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int checkBalanceAccountNumber = scanner.nextInt();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == checkBalanceAccountNumber) {
                            System.out.println("Balance: " + account.getBalance());
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("List of Accounts:");
                    for (BankAccount account : accounts) {
                        System.out.println(account);
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
