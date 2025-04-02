import java.util.Scanner;

public class StudentGradesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        // Prompt the user to enter the number of students and read the input
        int numberOfStudents = scanner.nextInt();
        
        // i created an array of integers to store the grades of the students
        int[] grades = new int[numberOfStudents];

        // a for loop to iterate through the number of students and prompt the user to enter each student's grade
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // a used double for total, average, highest, and lowest grades
        double total_grades = 0;
        double average_grade = 0;
        double highest_grade = 0;
        double lowest_grade = grades[0];

        // i used foreach loop to iterate through the grades array and calculate the total, average, highest, and lowest grades
        for (double d : grades) {
            total_grades += d;
            average_grade = total_grades / grades.length;
            if (d > highest_grade) {
                highest_grade = d;
            }
            if (d < lowest_grade) {
                lowest_grade = d;
            }
            
        }

        System.out.println("Highest Grade: " + highest_grade);
        System.out.println("Lowest Grade: " + lowest_grade);
        System.out.println("Average: " + average_grade);
    }    
}
