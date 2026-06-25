import java.util.Scanner;
class Q4
{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number to count the digits");
            int n=sc.nextInt();
            int d=0,c=0;
            for(int i=n;i!=0;i=i/10)
            {
                d=i%10;
                c++;
            }
            System.out.println("No of digits is: "+c);
        }
    
}
