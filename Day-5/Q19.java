import java.util.Scanner;
class Q19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whose factors you want to find");
        int n=sc.nextInt(); 
        System.out.println("Factors are");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
