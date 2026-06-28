import java.util.Scanner;

public class Q113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Welcome to the Simple Calculator ===");

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            // Exit immediately if option 5 is selected
            if (choice == 5) {
                System.out.println("Thank you for using the Calculator. Goodbye!");
                break;
            }

            // Check for invalid choice before taking numbers
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select a valid option.");
                continue;
            }

            // Input numbers for calculation
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Perform calculations based on choice
            switch (choice) {
                case 1:
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case 4:
                    // Guard condition against division by zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
