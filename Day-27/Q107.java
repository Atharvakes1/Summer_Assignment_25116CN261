import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Salary Management System ===");
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter Base Salary: ");
        double baseSalary = sc.nextDouble();
        double allowance = baseSalary * 0.10; 
        double pfDeduction = baseSalary * 0.12; 
        double netSalary = baseSalary + allowance - pfDeduction;
        System.out.println("\n====================================");
        System.out.println("             SALARY SLIP            ");
        System.out.println("====================================");
        System.out.println("ID         : " + empId);
        System.out.println("Name       : " + name);
        System.out.println("------------------------------------");
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus (10%): +₹" + allowance);
        System.out.println("PF (12%)   : -₹" + pfDeduction);
        System.out.println("------------------------------------");
        System.out.println("NET PAYABLE: ₹" + netSalary);
        System.out.println("====================================");
        sc.close();
    }
}
