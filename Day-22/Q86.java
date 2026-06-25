import java.util.Scanner;

class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine().trim();

        if(str.length() == 0) {
            System.out.println("Words = 0");
            return;
        }

        int count = 1;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                count++;
        }

        System.out.println("Words = " + count);
    }
}
