import java.util.Scanner;
class Q10 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number until which you want the prime number ");
        int n=sc.nextInt();
        int k=0;
        System.out.println("Prime numbers are : ");
        for(int i=1;i<=n;i++)
        { int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            { k=1;
                System.out.println(i);
            }
        }
        
        if(k==0)
        {
            System.out.println("no prime number");
        }
        }

    }
 

