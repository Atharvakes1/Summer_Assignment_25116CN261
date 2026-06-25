import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
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

        for(int i=0;i<n1;i++) {
            System.out.print(a[i] + " ");
        }

        for(int i=0;i<n2;i++) {

            int flag = 0;

            for(int j=0;j<n1;j++) {

                if(b[i] == a[j]) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 0) {
                System.out.print(b[i] + " ");
            }
        }
    }
}