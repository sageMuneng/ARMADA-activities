import java.util.Scanner;

public class ElectricityBillGMA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of units consumed:");
        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = 100 * 1.50 + (units - 100) * 2.50;
        } else {
            bill = 100 * 1.50 + 200 * 2.50 + (units - 300) * 3.50;
        }
        System.out.println("Total Bill: " + bill);
    }
}
