import java.util.Scanner;

public class Q28 {
    public static int reverseNumber(int number, int reversedTotal) {
        if (number == 0) {
            return reversedTotal;
        }
        int lastDigit = number % 10;
        return reverseNumber(number / 10, (reversedTotal * 10) + lastDigit);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        if (sc.hasNextInt()) {
            int originalNumber = sc.nextInt();
            boolean isNegative = originalNumber < 0;
            int absoluteNumber = Math.abs(originalNumber);
            int reversedResult = reverseNumber(absoluteNumber, 0);
            if (isNegative) {
                reversedResult = -reversedResult;
            }

            System.out.println("The reversed number is: " + reversedResult);
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        sc.close();
    }
}
