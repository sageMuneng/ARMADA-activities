
import java.util.Scanner;

public class LargestNumberFinderGMA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input_number = 0;
        int largest_number = 0;

        while (input_number >= 0) {
            System.out.println("Enter a number (-1 to stop): ");
            input_number = scanner.nextInt();
            if (input_number > largest_number) {
                largest_number = input_number;
            }
        }
        System.out.println("The largest number is: " + largest_number);
        scanner.close();
    }
}
