import java.util.Scanner;
class Q11
{
    public static int findGCD(int a, int b) {
    if (b == 0)
        return a;
    return findGCD(b, a % b);
}

public static void main() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbners whose GCD you want to find");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("GCD of "+num1+" "+num2+" is "+findGCD(num1, num2));
}
    
}
