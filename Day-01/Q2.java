import java.util.Scanner;
class Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whose multiplication table you want to find");
        int n=sc.nextInt();
        System.out.println("Multiplication table for "+n+":");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(n*i));

        }

    }
}
