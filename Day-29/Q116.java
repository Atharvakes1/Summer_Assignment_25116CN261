import java.util.Scanner;

// Class to represent an Item/Product in the inventory
class Product {
    int id;
    String name;
    double price;
    int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

// Main class updated to Q112
public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array to store up to 50 inventory products
        Product[] inventory = new Product[50];
        int productCount = 0;
        int choice;

        System.out.println("=== Welcome to the Inventory Management System ===");

        // Menu loop
        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add New Product");
            System.out.println("2. Display Current Inventory Stock");
            System.out.println("3. Update Product Quantity (Restock/Sale)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add New Product
                    if (productCount < inventory.length) {
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // Consume leftover newline character
                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Product Price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter Initial Quantity: ");
                        int quantity = sc.nextInt();

                        // Add to array
                        inventory[productCount] = new Product(id, name, price, quantity);
                        productCount++;
                        System.out.println("Product added to inventory successfully!");
                    } else {
                        System.out.println("Inventory capacity full!");
                    }
                    break;

                case 2:
                    // Display Inventory Stock
                    if (productCount == 0) {
                        System.out.println("No products in the inventory stock.");
                    } else {
                        System.out.println("\n--- Current Inventory Stock ---");
                        for (int i = 0; i < productCount; i++) {
                            System.out.println("ID: " + inventory[i].id + 
                                               " | Name: " + inventory[i].name + 
                                               " | Price: $" + inventory[i].price + 
                                               " | Stock Qty: " + inventory[i].quantity);
                        }
                    }
                    break;

                case 3:
                    // Update Product Quantity
                    if (productCount == 0) {
                        System.out.println("No products available to update.");
                        break;
                    }
                    System.out.print("Enter Product ID to update: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < productCount; i++) {
                        if (inventory[i].id == searchId) {
                            found = true;
                            System.out.println("Product Found: " + inventory[i].name + " (Current Stock: " + inventory[i].quantity + ")");
                            System.out.print("Enter quantity change (positive to add stock, negative to subtract/sell): ");
                            int quantityChange = sc.nextInt();

                            // Validation guard to avoid negative stock values
                            if (inventory[i].quantity + quantityChange < 0) {
                                System.out.println("Error: Insufficient stock! Cannot reduce past 0.");
                            } else {
                                inventory[i].quantity += quantityChange;
                                System.out.println("Stock updated successfully! New Quantity: " + inventory[i].quantity);
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Inventory Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}
