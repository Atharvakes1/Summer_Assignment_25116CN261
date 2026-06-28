import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {
        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // System variables
        int totalTickets = 50; 
        int choice;

        System.out.println("=== Welcome to the Ticket Booking System ===");

        // Menu loop
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Book Tickets");
            System.out.println("2. Check Available Tickets");
            System.out.println("3. Cancel Booked Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Book Tickets
                    System.out.print("Enter number of tickets to book: ");
                    int ticketsToBook = sc.nextInt();

                    if (ticketsToBook <= 0) {
                        System.out.println("Invalid number of tickets!");
                    } else if (ticketsToBook <= totalTickets) {
                        totalTickets -= ticketsToBook; // Reduce available tickets
                        System.out.println("Successfully booked " + ticketsToBook + " ticket(s)!");
                    } else {
                        System.out.println("Sorry, only " + totalTickets + " ticket(s) are left.");
                    }
                    break;

                case 2:
                    // Check Available Tickets
                    System.out.println("Total available tickets left: " + totalTickets);
                    break;

                case 3:
                    // Cancel Booked Tickets
                    System.out.print("Enter number of tickets to cancel: ");
                    int ticketsToCancel = sc.nextInt();

                    if (ticketsToCancel <= 0) {
                        System.out.println("Invalid number of tickets!");
                    } else {
                        totalTickets += ticketsToCancel; // Add back to available tickets
                        System.out.println("Successfully cancelled " + ticketsToCancel + " ticket(s)!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}