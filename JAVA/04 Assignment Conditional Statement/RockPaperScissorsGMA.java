
import java.util.Scanner;

public class RockPaperScissorsGMA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (R, P, S): ");

        String user_choice = scanner.nextLine().toUpperCase();

        String[] choices = {"R", "P", "S"};
        String computer_choice = choices[(int) (Math.random() * 3)];
        System.out.println("Computer choice: " + computer_choice);

        switch (user_choice) {
            case "R":
                switch (computer_choice) {
                    case "R":
                        System.out.println("It's a tie!");
                        break;
                    case "P":
                        System.out.println("Computer wins!");
                        break;
                    case "S":
                        System.out.println("You win!");
                        break;
                }
                break;
            case "P":
                switch (computer_choice) {
                    case "R":
                        System.out.println("Computer wins!");
                        break;
                    case "P":
                        System.out.println("It's a tie!");
                        break;
                    case "S":
                        System.out.println("You win!");
                        break;
                }
                break;
            case "S":
                switch (computer_choice) {
                    case "R":
                    System.out.println("Computer wins!");
                    break;
                    case "P":
                    System.out.println("You win!");
                    break;
                    case "S":
                    System.out.println("It's a tie!");
                        break;
                }
                break;
            default:
                System.out.println("Enter a valid choice!");
                break;    
        }

        scanner.close();
    }
}
