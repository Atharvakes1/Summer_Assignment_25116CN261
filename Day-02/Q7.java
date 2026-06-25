import java.util.Scanner;
class Q7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose digit product you want");
        int n=sc.nextInt();
        int pro=1,d=0;
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
            pro=d*pro;
         }
System.out.println("Product of digits is: "+pro);

    }

    
}
