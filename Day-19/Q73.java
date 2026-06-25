import java.util.Scanner;
class Q73{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row number and column number:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];

        System.out.println("Enter First Matrix:");

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result:");

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}