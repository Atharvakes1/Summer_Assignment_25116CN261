import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0; 
        
        System.out.println("--- Welcome to the ATM Simulation ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Choose an option (1-4): ");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Your current balance is: ₹" + balance);
                break;
                
            case 2:
                System.out.print("Enter deposit amount: ₹");
                double depositAmount = sc.nextDouble();
                balance = balance + depositAmount;
                System.out.println("Successfully deposited! New balance: ₹" + balance);
                break;
                
            case 3:
                System.out.print("Enter withdrawal amount: ₹");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount <= balance) {
                    balance = balance - withdrawAmount;
                    System.out.println("Please collect your cash.");
                    System.out.println("Remaining balance: ₹" + balance);
                } else {
                    System.out.println("Insolent Balance! Transaction failed.");
                }
                break;
                
            case 4:
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
                
            default:
                System.out.println("Invalid option selected!");
                break;
        }
        
        sc.close();
    }
}
