import java.util.Scanner;

class AgeRestrictionException extends Exception {

    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class AgeVerificationGMA {

    static void checkAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Error: You must be at least 18 to register.");
        }
        System.out.println("Registration successful!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        try {
            checkAge(age);
        } catch (AgeRestrictionException e) {
            System.out.println(e.getMessage());
        }
    }
}
