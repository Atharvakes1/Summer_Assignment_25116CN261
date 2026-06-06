 import java.util.Scanner;
 class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number");
        String binaryString=sc.next();
        int decimalValue = Integer.parseInt(binaryString, 2);
        
        System.out.println("Decimal equivalent: " + decimalValue); 
    }
}
