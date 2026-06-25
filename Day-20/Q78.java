import java.util.Scanner;

class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();

        boolean symmetric = true;

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(a[i][j] != a[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if(symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}
