import java.util.Scanner;
class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number you want to search: ");
        int x=sc.nextInt(),k=0;
        for(int j=0;j<n;j++)
        {
           if(a[j]==x)
           {
               k=1;
           }
        }
        if(k==1)
        {
            System.out.println(x+" is present in array");
        }
        else{
            System.out.println(x+" is not present in array");
        }
    }
}