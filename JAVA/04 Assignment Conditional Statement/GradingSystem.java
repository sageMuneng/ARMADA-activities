
import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
            System.out.println("Excellent!");
        } else if (score >= 75 && score <= 89) {
            System.out.println("Grade: B");
            System.out.println("Good job!");
        } else if (score >= 50 && score <= 74) {
            System.out.println("Grade: C");
            System.out.println("You can do better.");
        } else {
            System.out.println("Grade: D");
            System.out.println("Better luck next time.");
        }
    }
}
