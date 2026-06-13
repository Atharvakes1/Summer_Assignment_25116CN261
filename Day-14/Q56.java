import java.util.Scanner;
class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }int c=0;
        System.out.println("Duplicates are:");
    for(int j=0;j<n-1;j++)
    {for(int i=j+1;i<n-1;i++)
        {
            if(a[j]==a[i])
            {System.out.println(a[j]);
                c++;
            }
    }
    }
}
}
