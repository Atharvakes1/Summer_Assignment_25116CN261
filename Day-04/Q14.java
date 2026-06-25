import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int result = 0;
        
        if (n <= 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            int a = 0;
            int b = 1;
            
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }
        
        System.out.println("The " + n + "-th Fibonacci term is: " + result);
        sc.close();
    }
}
