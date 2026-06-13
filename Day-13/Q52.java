import java.util.Scanner;

class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("No of even terms are: "+even);
        System.out.println("No of odd terms are: "+odd);
    }
}
