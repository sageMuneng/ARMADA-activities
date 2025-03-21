
import java.util.Scanner;

public class PasswordCheckerGMA {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String password = "java123";

            String enter_password;

            do {
                System.out.println("Enter your password: ");
                enter_password = scanner.nextLine();
                if (!enter_password.equals(password)) {
                    System.out.println("Incorrect password! Try again.");
                }
            } while (!enter_password.equals(password));
            System.out.println("Access granted!");
            scanner.close();
        }
    }
}
