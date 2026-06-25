import java.util.Scanner;
class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number to convert into binary ");
        int n=sc.nextInt();
        String builtInResult = Integer.toBinaryString(n);
        System.out.println("Built-in: " + builtInResult);
        System.out.print("Manual:   ");
        manualConvert(n);
    }

    public static void manualConvert(int num) {
        if (num== 0) {
            System.out.println(0);
            return;
        }

        int[] binary = new int[40];
        int index = 0;
        
        while (num > 0) {
            binary[index++] = num % 2;
            num= num/ 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
}
