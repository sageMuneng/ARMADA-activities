import java.util.Scanner;

public class SumOfNumbersGMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();
        int sum = 0;
        int index = 1;

        while(index <= n){
            sum += index;
            index++;
        }

        System.out.println("The sum of natural numbers from 1 to " + n +" is: " + sum);
        scanner.close();
    }
}
