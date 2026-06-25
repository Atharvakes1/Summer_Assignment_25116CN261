import java.util.Scanner;
class Q6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose reverse you want to find");
        int n=sc.nextInt();
        int d=0;
        System.out.println("Reverse is ");
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
            System.out.print(d);
        }
    }
}
