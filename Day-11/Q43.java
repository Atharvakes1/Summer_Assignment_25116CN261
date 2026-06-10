import java.util.Scanner;
class Q43
{
    public static int prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number to find whether it is prime or not ");
    int n=sc.nextInt();
    if(prime(n)==2){
    System.out.println(n+ " is prime");
    }
    else{
    System.out.println(n+" is not prime");
    }
    }
}
