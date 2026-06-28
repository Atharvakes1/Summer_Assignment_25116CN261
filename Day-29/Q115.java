import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to the String Operations System ===");
        System.out.print("Enter your main string: ");
        String str = sc.nextLine();

        int choice;

        // Menu loop
        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Find Length of the String");
            System.out.println("2. Convert to Upper and Lower Case");
            System.out.println("3. Reverse the String");
            System.out.println("4. Check if Palindrome");
            System.out.println("5. Enter a new String");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            switch (choice) {
                case 1:
                    // Find Length
                    System.out.println("Length of the string is: " + str.length());
                    break;

                case 2:
                    // Case Conversion
                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 3:
                    // Reverse the String using a simple loop
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reversed += str.charAt(i);
                    }
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 4:
                    // Check for Palindrome
                    String revForPalindrome = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        revForPalindrome += str.charAt(i);
                    }
                    // Ignores uppercase/lowercase differences while checking
                    if (str.equalsIgnoreCase(revForPalindrome)) {
                        System.out.println("\"" + str + "\" is a Palindrome!");
                    } else {
                        System.out.println("\"" + str + "\" is NOT a Palindrome.");
                    }
                    break;

                case 5:
                    // Swap the main string mid-execution
                    System.out.print("Enter your new main string: ");
                    str = sc.nextLine();
                    System.out.println("String updated successfully!");
                    break;

                case 6:
                    System.out.println("Thank you for using the String Operations program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 6);

        sc.close();
    }
}
