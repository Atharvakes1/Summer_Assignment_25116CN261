import java.util.Scanner;

class Q65 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];

        for(int i=0;i<n1;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements:");
        int n2 = sc.nextInt();
        int b[] = new int[n2];

        for(int i=0;i<n2;i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[n1+n2];

        int k = 0;

        for(int i=0;i<n1;i++) {
            c[k++] = a[i];
        }

        for(int i=0;i<n2;i++) {
            c[k++] = b[i];
        }

        for(int i=0;i<c.length;i++) {
            System.out.print(c[i] + " ");
        }
    }
}
