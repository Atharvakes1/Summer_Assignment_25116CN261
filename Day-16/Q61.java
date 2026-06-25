
import java.util.Scanner;
class Q61 {
    public static void main(String args[]) {
        System.out.println("Enter number of elements");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n-1];

        for(int i=0;i<n-1;i++) {
            arr[i] = sc.nextInt();
        }

        int total = n * (n + 1) / 2;

        int sum = 0;

        for(int i=0;i<n-1;i++) {
            sum += arr[i];
        }

        System.out.println("Missing Number = " + (total - sum));
    }
}