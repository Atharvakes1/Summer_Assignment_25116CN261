import java.util.Scanner;
class Q41
{
    public static double sum(double a,double b)
    {
        double s=a+b;
        return s;
    }
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter numbers whose sum you want to find :");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            System.out.println("Sum is : "+sum(a,b));
        }
    }
}