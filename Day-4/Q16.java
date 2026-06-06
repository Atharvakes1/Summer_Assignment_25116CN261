import java.util.Scanner;
class Q16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number until which you want to find number is armstrong ");
        int n=sc.nextInt();
        int d=0,k=0;
        for(int j=0;j<=n;j++)
        {int c=0,sum=0;
        for(int o=j;o!=0;o=o/10)
        {
            d=o%10;
            c++;
        }
        for(int i=j;i!=0;i=i/10)
        {
            d=i%10;
        int power=(int) Math.pow(d,c);
        sum=sum+power;
        }
        if(sum==j)
        {   k=1;
            System.out.println(j+" is an Armstrong number ");
        }
        }
        if(k==0)
        {
            System.out.println("No Armstrong number found");
        }
        }
    }
 
    
