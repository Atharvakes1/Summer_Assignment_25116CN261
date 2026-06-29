import java.util.Scanner;

class name119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define maximum array limit
        int maxEmployees = 100;
        String[] empIds = new String[maxEmployees];
        String[] empNames = new String[maxEmployees];
        String[] empDepartments = new String[maxEmployees];
        
        // Counter for current active records
        int empCount = 0;
        
        while (true) {
            // Display Menu
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear the buffer newline
            
            if (choice == 1) {
                // Add Employee Record
                if (empCount < maxEmployees) {
                    System.out.print("Enter Employee ID: ");
                    String id = sc.nextLine();
                    
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    
                    // Store details in parallel arrays
                    empIds[empCount] = id;
                    empNames[empCount] = name;
                    empDepartments[empCount] = dept;
                    
                    empCount++;
                    System.out.println("Employee record added successfully!");
                } else {
                    System.out.println("Database full! Cannot add more employees.");
                }
                
            } else if (choice == 2) {
                // Display All Employee Records
                if (empCount == 0) {
                    System.out.println("No employee records found.");
                } else {
                    System.out.println("\n--- All Employee Records ---");
                    for (int i = 0; i < empCount; i++) {
                        System.out.println("ID: " + empIds[i] + " | Name: " + empNames[i] + " | Dept: " + empDepartments[i]);
                    }
                }
                
            } else if (choice == 3) {
                // Search Employee by ID
                if (empCount == 0) {
                    System.out.println("No records available to search.");
                } else {
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = sc.nextLine();
                    boolean found = false;
                    
                    for (int i = 0; i < empCount; i++) {
                        // Using equalsIgnoreCase to make string comparison flexible
                        if (empIds[i].equalsIgnoreCase(searchId)) {
                            System.out.println("\n--- Employee Found ---");
                            System.out.println("ID: " + empIds[i]);
                            System.out.println("Name: " + empNames[i]);
                            System.out.println("Department: " + empDepartments[i]);
                            found = true;
                            break; // Exit the loop early since ID is unique
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Employee with ID " + searchId + " not found.");
                    }
                }
                
            } else if (choice == 4) {
                // Exit Program
                System.out.println("Exiting System. Goodbye!");
                break;
                
            } else {
                System.out.println("Invalid choice! Please select between 1 and 4.");
            }
        }
        
        sc.close();
    }
}