import java.util.Scanner;

class Q68 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];

        for(int i=0;i<n1;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements");
        int n2 = sc.nextInt();
        int b[] = new int[n2];

        for(int i=0;i<n2;i++) {
            b[i] = sc.nextInt();
        }

        for(int i=0;i<n1;i++) {

            int count = 0;

            for(int j=0;j<n2;j++) {

                if(a[i] == b[j]) {
                    count++;
                }
            }

            if(count > 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}