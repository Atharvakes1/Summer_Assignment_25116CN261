import java.util.Scanner;
class Q44
{
    public static double factorial(int n)
    {
        double fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter numbers whose factorial you want to find :");
            int n=sc.nextInt();
            System.out.println("Factorial is : "+factorial(n));
        }
    }
}