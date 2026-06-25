import java.util.Scanner;
class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array in reverse is: ");
        for(int j=n-1;j>=0;j--)
        {
           System.out.println(j+"th:"+a[j]);
        }
    }
}

