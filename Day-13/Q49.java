import java.util.Scanner;
class Q49
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           System.out.println(i+"th element is : "+a[i]);
        }    
    }
}
