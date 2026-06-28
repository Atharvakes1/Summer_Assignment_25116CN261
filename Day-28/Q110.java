import java.util.Scanner;

// Class to represent a Bank Account
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize the account
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Transaction failed.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class updated to Q110
public class Q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create an account
        System.out.println("=== Welcome to the Bank Account System ===");
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter Initial Deposit Amount: ");
        double initialDeposit = sc.nextDouble();

        // Create the account object
        BankAccount account = new BankAccount(name, accNum, initialDeposit);
        System.out.println("\nAccount created successfully for " + account.accountHolder + "!");

        int choice;

        // Step 2: Menu loop
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.displayBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double witAmount = sc.nextDouble();
                    account.withdraw(witAmount);
                    break;

                case 4:
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}