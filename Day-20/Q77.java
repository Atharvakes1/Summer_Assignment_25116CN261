import java.util.Scanner;

class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number and column number: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];

        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                A[i][j] = sc.nextInt();

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];

        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                B[i][j] = sc.nextInt();

        if(c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] C = new int[r1][c2];

        for(int i=0;i<r1;i++) {
            for(int j=0;j<c2;j++) {
                for(int k=0;k<c1;k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c2;j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
