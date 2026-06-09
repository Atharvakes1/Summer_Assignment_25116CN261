import java.util.Scanner;
class Q42
{
    public static double max(double a,double b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args) {
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers whose maximum you want to find: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Maximum is : "+max(a,b));
    }
    }
}
