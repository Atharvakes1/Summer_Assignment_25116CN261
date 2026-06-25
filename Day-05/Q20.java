import java.util.Scanner;
class Q20
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number whose prime factor you want to find");
    int n=sc.nextInt(); 
    int max=0;
    for(int i=2;i<=n;i++)
    {   
        if(n%i==0)
    {
        boolean isPrime = true;
        for(int j=2;j*j<=i;j++){
            if(i%j==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            max=i;
        }   
    }
}
    System.out.println("Prime factor is :"+max);
}
}