import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote yet.");
            System.out.println("You can vote after " + yearsLeft + " year(s).");
        }
        
        sc.close();
    }
}
