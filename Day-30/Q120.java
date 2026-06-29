import java.util.Scanner;

class name120 {
    // Global variables (static arrays) so all functions can easily access them
    static int maxItems = 50;
    static String[] itemCodes = new String[maxItems];
    static String[] itemNames = new String[maxItems];
    static int[] itemStocks = new int[maxItems];
    static int itemCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Seed the inventory with a couple of starter items
        itemCodes[0] = "I001"; itemNames[0] = "Mouse";    itemStocks[0] = 15;
        itemCodes[1] = "I002"; itemNames[1] = "Keyboard"; itemStocks[1] = 8;
        itemCount = 2;

        while (true) {
            // Display system menu
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. View Inventory Stock");
            System.out.println("2. Add New Item");
            System.out.println("3. Update Stock Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear the scanner buffer newline
            
            if (choice == 1) {
                displayInventory();
            } else if (choice == 2) {
                addItem(sc);
            } else if (choice == 3) {
                updateStock(sc);
            } else if (choice == 4) {
                System.out.println("Exiting Inventory System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please select 1-4.");
            }
        }
        sc.close();
    }

    // Function 1: Display all items in stock
    public static void displayInventory() {
        if (itemCount == 0) {
            System.out.println("Inventory is currently empty.");
            return;
        }
        System.out.println("\n--- Current Inventory Status ---");
        System.out.printf("%-10s %-20s %-10s\n", "Code", "Item Name", "Stock");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%-10s %-20s %-10d\n", itemCodes[i], itemNames[i], itemStocks[i]);
        }
    }

    // Function 2: Add a completely new item to the system
    public static void addItem(Scanner sc) {
        if (itemCount >= maxItems) {
            System.out.println("Warehouse storage is full! Cannot add more items.");
            return;
        }

        System.out.print("Enter Unique Item Code (e.g., I003): ");
        String code = sc.nextLine();

        // Check if code already exists to prevent duplicates
        for (int i = 0; i < itemCount; i++) {
            if (itemCodes[i].equalsIgnoreCase(code)) {
                System.out.println("Error: An item with this code already exists!");
                return;
            }
        }

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Stock Quantity: ");
        int stock = sc.nextInt();

        // Save data to parallel arrays
        itemCodes[itemCount] = code;
        itemNames[itemCount] = name;
        itemStocks[itemCount] = stock;
        itemCount++;

        System.out.println("Item added to inventory successfully!");
    }

    // Function 3: Add/Subtract stock levels for an existing item
    public static void updateStock(Scanner sc) {
        if (itemCount == 0) {
            System.out.println("No items available to update.");
            return;
        }

        System.out.print("Enter Item Code to update stock: ");
        String code = sc.nextLine();
        int foundIndex = -1;

        // Search for the item index
        for (int i = 0; i < itemCount; i++) {
            if (itemCodes[i].equalsIgnoreCase(code)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Item code not found.");
        } else {
            System.out.println("Current stock for " + itemNames[foundIndex] + " is: " + itemStocks[foundIndex]);
            System.out.print("Enter new stock quantity level: ");
            int newStock = sc.nextInt();
            
            if (newStock >= 0) {
                itemStocks[foundIndex] = newStock;
                System.out.println("Stock updated successfully!");
            } else {
                System.out.println("Error: Stock cannot be negative!");
            }
        }
    }
}