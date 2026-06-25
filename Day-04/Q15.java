import java.util.Scanner;
class Q15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whom u want to find whether it is armstrong or not");
        int n=sc.nextInt();
        int d=0,c=0,sum=0;
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
            c++;
        }
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
        int power=(int) Math.pow(d,c);
        sum=sum+power;
        }
        if(sum==n)
        {
            System.out.println(n+" is an Armstrong number ");
        }
        else
        {
            System.out.println(n+" is not an Armstrong number");
        }
        }
    }
