import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
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
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        }
    }

    @Override
    public String toString() {
        return "Account [Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + balance + "]";
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("List of all accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
public class bankmanagementsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        // Create sample accounts
        Account account1 = new Account("1001", "John Doe", 5000.0);
        Account account2 = new Account("1002", "Jane Doe", 10000.0);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);

        int choice;
        do {
            System.out.println("\nBank Management System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performDeposit(scanner, bank);
                    break;
                case 2:
                    performWithdraw(scanner, bank);
                    break;
                case 3:
                    bank.displayAllAccounts();
                    break;
                case 4:
                    System.out.println("Exiting the Bank Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private static void performDeposit(Scanner scanner, Bank bank) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter deposit amount: $");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void performWithdraw(Scanner scanner, Bank bank) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter withdrawal amount: $");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
}
