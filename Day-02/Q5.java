import java.util.Scanner;
class Q5
{
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number whose sum of digitd whom you want to find");
    int n=sc.nextInt();
    int d=0,sum=0;
    for(int i=n;i!=0;i=i/10)
    {
        d=i%10;
        sum=sum+d;
    }
    System.out.println("Sum of digits is "+sum);
   }
}