import java.util.Scanner;

class Q98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.print("Common Characters: ");

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if(s2.indexOf(ch) != -1)
                System.out.print(ch + " ");
        }
    }
}