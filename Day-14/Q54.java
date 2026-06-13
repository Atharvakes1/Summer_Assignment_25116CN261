import java.util.Scanner;
class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose frequency you want find:");
        int x=sc.nextInt(),frequency=0;
        for(int j=0;j<n;j++)
        {
            if(a[j]==x)
            {
              frequency++;
            }
        }
        System.out.println("Frequency of the element "+x+" is "+frequency);
    }
}