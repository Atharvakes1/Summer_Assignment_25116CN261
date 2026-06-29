import java.util.Scanner;

class name118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Setup initial library catalog
        int maxBooks = 50;
        String[] bookTitles = new String[maxBooks];
        boolean[] isBorrowed = new boolean[maxBooks]; // false means Available, true means Borrowed
        
        // Seed the library with a few starting books
        bookTitles[0] = "Java Programming";
        bookTitles[1] = "Data Structures";
        bookTitles[2] = "Core Physics";
        int bookCount = 3; 
        
        while (true) {
            // Display Menu
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. View All Books");
            System.out.println("2. Add New Book");
            System.out.println("3. Issue/Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear the buffer newline
            
            if (choice == 1) {
                // View All Books
                System.out.println("\n--- Library Catalogue ---");
                for (int i = 0; i < bookCount; i++) {
                    String status = isBorrowed[i] ? "Borrowed" : "Available";
                    System.out.println((i + 1) + ". " + bookTitles[i] + " [" + status + "]");
                }
                
            } else if (choice == 2) {
                // Add New Book
                if (bookCount < maxBooks) {
                    System.out.print("Enter Book Title to add: ");
                    String newBook = sc.nextLine();
                    
                    bookTitles[bookCount] = newBook;
                    isBorrowed[bookCount] = false; // New books are available by default
                    bookCount++;
                    System.out.println("Book added successfully!");
                } else {
                    System.out.println("Library shelf space is full!");
                }
                
            } else if (choice == 3) {
                // Issue/Borrow a Book
                System.out.print("Enter Book Number to borrow: ");
                int bookNum = sc.nextInt();
                int index = bookNum - 1; // Convert to 0-based index
                
                if (index >= 0 && index < bookCount) {
                    if (!isBorrowed[index]) {
                        isBorrowed[index] = true;
                        System.out.println("Success! You have borrowed: " + bookTitles[index]);
                    } else {
                        System.out.println("Sorry, this book is already borrowed.");
                    }
                } else {
                    System.out.println("Invalid Book Number!");
                }
                
            } else if (choice == 4) {
                // Return a Book
                System.out.print("Enter Book Number to return: ");
                int bookNum = sc.nextInt();
                int index = bookNum - 1;
                
                if (index >= 0 && index < bookCount) {
                    if (isBorrowed[index]) {
                        isBorrowed[index] = false;
                        System.out.println("Success! You returned: " + bookTitles[index]);
                    } else {
                        System.out.println("This book was not borrowed.");
                    }
                } else {
                    System.out.println("Invalid Book Number!");
                }
                
            } else if (choice == 5) {
                // Exit
                System.out.println("Exiting System. Happy Reading!");
                break;
                
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        
        sc.close();
    }
}