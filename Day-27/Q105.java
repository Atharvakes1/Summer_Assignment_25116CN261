import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("=== Enter Student Details ===");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("\n--- Student Record Saved ---");
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("CGPA   : " + cgpa);
        sc.close();
    }
}