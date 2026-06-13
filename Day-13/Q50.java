import java.util.Scanner;
class Q50
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter numbers");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        double avg=sum/n;
        System.out.println("Sum of array is : "+sum);
        System.out.println("Average is: "+avg);
    }
}