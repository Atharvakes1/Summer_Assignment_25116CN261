import java.util.Scanner;

class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];

        for (int j = 1; j < n; j++) {
            if (a[j] > max) {
                max = a[j];
            }
            if (a[j] < min) {
                min = a[j];
            }
        }

        System.out.println("Maximum array element: " + max);
        System.out.println("Minimum array element: " + min);
    }
}
