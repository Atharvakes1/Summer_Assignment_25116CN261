import java.util.Scanner;

public class Q24 {

    public static double myPow(double x, int n) {
        long exponent = n;

        if (exponent < 0) {
            x = 1 / x;
            exponent = -exponent;
        }

        double result = 1.0;
        double currentProduct = x;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            exponent /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        double answer = myPow(x, n);
        System.out.println("Result: " + answer);

        sc.close();
    }
}
