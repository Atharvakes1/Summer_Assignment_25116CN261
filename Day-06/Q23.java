import java.util.Scanner;
class Q23
{
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count = Integer.bitCount(number); 
        System.out.println("The number of set bits in " + number + " is: " + count);
    }
}

