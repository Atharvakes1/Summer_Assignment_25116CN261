import java.util.Scanner;

public class Q27 {
    public static int calculateDigitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + calculateDigitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter an integer: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int absoluteNumber = Math.abs(number);
            int result = calculateDigitSum(absoluteNumber);
            System.out.println("The sum of the digits of " + number + " is: " + result);
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        sc.close();
    }
}

