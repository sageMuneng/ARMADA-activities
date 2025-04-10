import java.util.Scanner;

class SafeArrayAccessGMA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index (0-4): ");
        int index = scanner.nextInt();

        int[] arr = {19, 25, 34, 24,10};
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a number between 0 and 4.");
        }
    }
}