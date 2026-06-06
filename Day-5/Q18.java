import java.util.Scanner;
class Q18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find whether strong or not");
        int n=sc.nextInt();
        int fact=1;
        int d=0;
        int sum=0;
        for(int i=n;i!=0;i=i/10)
        {fact=1;
            d=i%10;
        for(int j=1;j<=d;j++)
            {
                fact=fact*j;
            }
                sum=sum+fact;
        }
        if(sum==n)
        {
            System.out.println(n+" is a strong number");
        }
        else
        {
            System.out.println(n+" is not a strong number");
        }
    }
}
