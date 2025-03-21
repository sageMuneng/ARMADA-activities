import java.util.Scanner;

public class GuessingGameGMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input_number = 0;
        int random_number = (int) (Math.random() * 50) + 1;
        int attempts = 1;

        while (input_number != random_number){
            System.out.println("Guess a number between 1 and 50:");
            input_number = scanner.nextInt();

            if (input_number < random_number) {
               System.out.println("Too low! Try again."); 
            }else if (input_number > random_number) {
                System.out.println("Too high! Try again.");
            }
            attempts++;
        }

        System.out.println("Correct! You guessed it in "+ attempts+" attempts. ");
        scanner.close();
    }
}
