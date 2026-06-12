import java.util.Scanner;
class Q46
{
    public static int armstrong(int n)
    {
        int d=0,c=0;
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
            c++;
        }int sum=0;
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
            sum+=(int)Math.pow(d,c);
        }
        return sum;

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number :");
    int n=sc.nextInt();
    if(armstrong(n)==n){
        System.out.println(n+" is armstrong");
    }
    else{
        System.out.println(n+" is not armstrong");
    }
    sc.close();}
}
