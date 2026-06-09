import java.util.Scanner;
class Q47
{
    public static void fibonacci(int n)
    {
        int a=0,b=1,c=0;
        for(int i=0;i<=n;i++ )
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the nth term until which you want to print the fibonacci series :");
    int n=sc.nextInt();
    fibonacci(n);
    }
}
