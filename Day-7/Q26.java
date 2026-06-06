import java.util.Scanner;
class Q26{
    public static long calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci position (non-negative integer): ");
        if (sc.hasNextInt()) {
            int position = sc.nextInt();
            if (position < 0) {
                System.out.println("Error: Position cannot be negative.");
            } else {
                long result = calculateFibonacci(position);
                System.out.println("The Fibonacci number at position " + position + " is: " + result);
            }
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        sc.close();
    }
}

