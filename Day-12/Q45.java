import java.util.Scanner;
class Q45
{
    public static boolean palindrome(int n)
    {
        int d=0,rev=0;
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
            rev=(rev*10)+d;
        }
        if(rev==n)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number to find whether it is palindrome or not : ");
         int n=sc.nextInt();
         if(palindrome(n)==true)
         {
            System.out.println(n+" is palindrome");
         }
         else
        {
            System.out.println(n+" is not palindrome");
         }
    }
}
