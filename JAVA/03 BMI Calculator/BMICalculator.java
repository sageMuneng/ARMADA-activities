
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height (m): ");
        double height = scanner.nextDouble();

        double BMI = weight / (height * height);

        String BMI_category;

        if (BMI < 18.5) {
            BMI_category = "Underweight";
        } else if (BMI >= 18.5 && BMI < 24.9) {
            BMI_category = "Normal";
        } else if (BMI >= 25 && BMI < 29.9) {
            BMI_category = "Overweight";
        } else {
            BMI_category = "Obese";
        }

        System.out.println("=== BMI Report ===");
        System.out.println("Your BMI: "+BMI);
        System.out.println("Health Status: "+BMI_category);

        scanner.close();
    }
}
