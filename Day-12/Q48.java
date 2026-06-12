import java.util.Scanner;
class Q48
{
    public static int perfect(int n)
    {int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number: ");
            int n=sc.nextInt();
            if(perfect(n)==n){
            System.out.println(n+" Is perfect");}
            else{
                System.out.println(n+" Is not perfect");
            }
        }
    }
}
