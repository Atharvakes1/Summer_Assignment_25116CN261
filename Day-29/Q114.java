import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create the array with a fixed maximum capacity
        System.out.println("=== Welcome to the Array Operations System ===");
        System.out.print("Enter the initial number of elements in the array: ");
        int currentSize = sc.nextInt();

        // We give the array extra room (capacity 100) to allow inserting new elements
        int[] arr = new int[100]; 

        System.out.println("Enter " + currentSize + " elements:");
        for (int i = 0; i < currentSize; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        // Step 2: Menu loop
        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Display Array (Traverse)");
            System.out.println("2. Insert an Element");
            System.out.println("3. Delete an Element by Index");
            System.out.println("4. Search for an Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Display/Traverse Array
                    if (currentSize == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Current Array: ");
                        for (int i = 0; i < currentSize; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Insert an Element
                    if (currentSize >= arr.length) {
                        System.out.println("Array capacity is full! Cannot insert.");
                        break;
                    }
                    System.out.print("Enter the element to insert: ");
                    int elementToInsert = sc.nextInt();
                    System.out.print("Enter the index position (0 to " + currentSize + "): ");
                    int insertIndex = sc.nextInt();

                    if (insertIndex < 0 || insertIndex > currentSize) {
                        System.out.println("Invalid index position!");
                    } else {
                        // Shift elements to the right to make room
                        for (int i = currentSize; i > insertIndex; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[insertIndex] = elementToInsert;
                        currentSize++; // Update active size
                        System.out.println("Element inserted successfully!");
                    }
                    break;

                case 3:
                    // Delete an Element
                    if (currentSize == 0) {
                        System.out.println("Array is already empty!");
                        break;
                    }
                    System.out.print("Enter the index to delete (0 to " + (currentSize - 1) + "): ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex < 0 || deleteIndex >= currentSize) {
                        System.out.println("Invalid index position!");
                    } else {
                        // Shift elements to the left to cover up the deleted space
                        for (int i = deleteIndex; i < currentSize - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        currentSize--; // Reduce active size
                        System.out.println("Element deleted successfully!");
                    }
                    break;

                case 4:
                    // Search for an Element (Linear Search)
                    System.out.print("Enter element to search for: ");
                    int target = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < currentSize; i++) {
                        if (arr[i] == target) {
                            System.out.println("Element found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found in the array.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Array Operations program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}