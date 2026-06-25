import java.util.Scanner;
class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }int nz=0;
        for(int j=0;j<n;j++)
        {
            if(a[j]!=0)
            {
                a[nz]=a[j];
                nz++;
            }
        }
        for(;nz<n;nz++)
        {
           a[nz]=0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i+"="+a[i]);
        }
    }
}