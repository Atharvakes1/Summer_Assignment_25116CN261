import java.util.Scanner;
class Q25 {
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else {
                long result = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is: " + result);
            }
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        sc.close();
    }
}