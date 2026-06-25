import java.util.Scanner;
class Q8 
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number whom you want to find whether it is palindrome or not");
       int n =sc.nextInt();
       int rev=0,d=0;
       for(int i=n;i!=0;i=i/10)
       {
         d=i%10;
         rev=(rev*10)+d;
       }
       if(rev==n)
        {
            System.out.println(n+" Is Palindrome");
        }
                   else
        {
            System.out.println(n+" Is not Palindrome");
        }
    }
}
