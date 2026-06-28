import java.util.Scanner;

// Class to represent a Book
class Q109 {
    int id;
    String title;
    boolean isAvailable;

    // Constructor
    public Q109(int id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true; // New books are available by default
    }
}

// Main Library Management System Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array to store up to 100 books
        Q109[] library = new Q109[100];
        int bookCount = 0; 
        int choice;

        System.out.println("=== Welcome to the Library Management System ===");

        // Infinite loop for the menu until the user exits
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            switch (choice) {
                case 1:
                    // Add a Book
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    library[bookCount] = new Q109(id, title);
                    bookCount++;
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Display All Books
                    if (bookCount == 0) {
                        System.out.println("No books available in the library.");
                    } else {
                        System.out.println("\n--- Library Books ---");
                        for (int i = 0; i < bookCount; i++) {
                            String status = library[i].isAvailable ? "Available" : "Borrowed";
                            System.out.println("ID: " + library[i].id + " | Title: " + library[i].title + " | Status: " + status);
                        }
                    }
                    break;

                case 3:
                    // Borrow a Book
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    boolean foundBorrow = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (library[i].id == borrowId) {
                            foundBorrow = true;
                            if (library[i].isAvailable) {
                                library[i].isAvailable = false;
                                System.out.println("You have successfully borrowed: " + library[i].title);
                            } else {
                                System.out.println("Sorry, this book is already borrowed.");
                            }
                            break;
                        }
                    }
                    if (!foundBorrow) {
                        System.out.println("Book ID not found.");
                    }
                    break;

                case 4:
                    // Return a Book
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    boolean foundReturn = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (library[i].id == returnId) {
                            foundReturn = true;
                            if (!library[i].isAvailable) {
                                library[i].isAvailable = true;
                                System.out.println("You have successfully returned: " + library[i].title);
                            } else {
                                System.out.println("This book was not borrowed.");
                            }
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Book ID not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}