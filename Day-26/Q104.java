import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("--- Welcome to the Quick Quiz ---");
        System.out.println("Answer the following question by typing the option number (1-4):\n");
        System.out.println("Q1. Which country won the inaugural ICC Men's T20 World Cup in 2007?");
        System.out.println("1. Pakistan");
        System.out.println("2. Australia");
        System.out.println("3. India");
        System.out.println("4. South Africa");
        System.out.print("Your answer: ");
        
        int answer1 = sc.nextInt();
        if (answer1 == 3) {
            System.out.println("Correct! 🎉\n");
            score++;
        } else {
            System.out.println("Wrong answer. The correct choice was 3 (India).\n");
        }
        System.out.println("--- Quiz Finished ---");
        System.out.println("Your final score is: " + score + "/1");
        
        sc.close();
    }
}