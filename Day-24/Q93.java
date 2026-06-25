import java.util.Scanner;

class Q93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() == s2.length() && (s1 + s1).contains(s2))
            System.out.println("String Rotation");
        else
            System.out.println("Not String Rotation");
    }
}
