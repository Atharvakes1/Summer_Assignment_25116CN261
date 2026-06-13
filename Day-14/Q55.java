import java.util.Scanner;
class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }int temp=0;
        for(int j=0;j<n-1;j++)
        { 
            if(a[j]<a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        System.out.println("second largest element is: "+a[n-3]);
        
    }
}
