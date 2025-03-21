import java.util.Scanner;

public class ManualNumberConverter{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal_number = scanner.nextInt();

        // Convert to binary
        String binary = "";
        int num = decimal_number;
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        // Convert to octal
        String octal = "";
        num = decimal_number;
        while (num > 0) {
            octal = (num % 8) + octal;
            num /= 8;
        }

        // Convert to hexadecimal
        String hex = "";
        num = decimal_number;
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            hex = hexChars[num % 16] + hex;
            num /= 16;
        }

        System.out.println("=== Number System Conversions === ");
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);

    }
}