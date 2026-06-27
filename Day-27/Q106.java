import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Enter Employee Details ===");
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();
        System.out.println("\n--- Employee Record Saved ---");
        System.out.println("Name        : " + name);
        System.out.println("Employee ID : " + empId);
        System.out.println("Salary      : ₹" + salary);

        // Close the scanner
        sc.close();
    }
}
