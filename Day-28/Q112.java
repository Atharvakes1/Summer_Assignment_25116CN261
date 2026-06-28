import java.util.Scanner;

// Class to represent a single Contact
class Contact {
    String name;
    String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

// Main class updated to Q112
public class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array to hold up to 50 contacts
        Contact[] contactList = new Contact[50];
        int contactCount = 0;
        int choice;

        System.out.println("=== Welcome to the Contact Management System ===");

        // Menu loop
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            switch (choice) {
                case 1:
                    // Add Contact
                    if (contactCount < contactList.length) {
                        System.out.print("Enter Contact Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Phone Number: ");
                        String phone = sc.nextLine();

                        // Save contact into our array
                        contactList[contactCount] = new Contact(name, phone);
                        contactCount++;
                        System.out.println("Contact saved successfully!");
                    } else {
                        System.out.println("Contact list full!");
                    }
                    break;

                case 2:
                    // Display All Contacts
                    if (contactCount == 0) {
                        System.out.println("No contacts saved yet.");
                    } else {
                        System.out.println("\n--- Saved Contacts ---");
                        for (int i = 0; i < contactCount; i++) {
                            System.out.println("Name: " + contactList[i].name + " | Phone: " + contactList[i].phoneNumber);
                        }
                    }
                    break;

                case 3:
                    // Search Contact
                    if (contactCount == 0) {
                        System.out.println("No contacts to search.");
                    } else {
                        System.out.print("Enter Name to search: ");
                        String searchName = sc.nextLine();
                        boolean found = false;

                        for (int i = 0; i < contactCount; i++) {
                            // case-insensitive comparison
                            if (contactList[i].name.equalsIgnoreCase(searchName)) {
                                System.out.println("Contact Found -> Name: " + contactList[i].name + " | Phone: " + contactList[i].phoneNumber);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Contact not found.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Contact Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}
