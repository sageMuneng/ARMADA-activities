import java.util.InputMismatchException;
import java.util.Scanner;

public class calculatorGMA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();
            
            int division = firstNumber / secondNumber;

            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter numbers only.");
        }
    }
}
