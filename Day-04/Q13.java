import java.util.Scanner;
class Q13 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number until which you want the fibonacci series");
        int n=sc.nextInt();
        int c,a=0,b=1;
        System.out.println("Fibonacci series is: ");
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
sc.close();
    }
    
}
