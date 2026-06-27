
import java.util.Scanner;

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Marksheet Generation System ===");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.println("\nEnter Marks obtained (out of 100):");
        System.out.print("Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Science: ");
        int science = sc.nextInt();

        System.out.print("English: ");
        int english = sc.nextInt();
        int totalMarks = math + science + english;
        double percentage = (totalMarks / 300.0) * 100;
        String result;
        String grade;

        if (math < 33 || science < 33 || english < 33) {
            result = "FAIL (Failed in one or more subjects)";
            grade = "F";
        } else {
            result = "PASS";
            // Calculate Grade based on percentage
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 75) {
                grade = "A";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "D";
            }
        }
        System.out.println("\n========================================");
        System.out.println("               MARKSHEET                ");
        System.out.println("========================================");
        System.out.println("Roll No: " + rollNo + "    | Name: " + name);
        System.out.println("----------------------------------------");
        System.out.println("Subject          Max Marks   Obtained   ");
        System.out.println("----------------------------------------");
        System.out.println("Mathematics      100         " + math);
        System.out.println("Science          100         " + science);
        System.out.println("English          100         " + english);
        System.out.println("----------------------------------------");
        System.out.println("TOTAL MARKS: " + totalMarks + " / 300");
        System.out.printf("PERCENTAGE : %.2f%%\n", percentage);
        System.out.println("GRADE      : " + grade);
        System.out.println("RESULT     : " + result);
        System.out.println("========================================");
        sc.close();
    }
}