import java.util.Scanner;

class name117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define the maximum number of students the system can hold
        int maxStudents = 50;
        String[] studentNames = new String[maxStudents];
        int[] studentMarks = new int[maxStudents];
        
        // Track the current number of added students
        int studentCount = 0;
        
        while (true) {
            // Display Menu
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character
            
            if (choice == 1) {
                // Add Student Record
                if (studentCount < maxStudents) {
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Student Marks: ");
                    int marks = sc.nextInt();
                    
                    // Store in arrays
                    studentNames[studentCount] = name;
                    studentMarks[studentCount] = marks;
                    
                    studentCount++; // Increment count for the next student
                    System.out.println("Record added successfully!");
                } else {
                    System.out.println("System full! Cannot add more students.");
                }
                
            } else if (choice == 2) {
                // Display All Records
                if (studentCount == 0) {
                    System.out.println("No student records found.");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println("Roll No: " + (i + 1) + " | Name: " + studentNames[i] + " | Marks: " + studentMarks[i]);
                    }
                }
                
            } else if (choice == 3) {
                // Exit Program
                System.out.println("Exiting system. Goodbye!");
                break;
                
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        
        sc.close();
    }
}