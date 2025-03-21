import java.util.Scanner;

public class StudentGradesAnalyzer{
    public static void main(String[] args){
        // initialize scanner
        Scanner scanner = new Scanner(System.in);

        // ask the user to enter the number of students
        System.out.println("Enter the number of students: ");
        int num_students = scanner.nextInt();
        
        // create an array to store the grades of the students
        double[] student_grades = new double[num_students];

        // enter the students grades with for loops and store them in the students_grades array
        for (int i = 0; i < num_students; i++) {
            System.out.println("Enter the grade for student " + (i+1) + ": ");
            student_grades[i] = scanner.nextDouble();
        }

        // compute the total grades, average grade, highest grade, and lowest grade
        double total_grades = 0;
        double average_grade = 0;
        double highest_grade = 0;
        double lowest_grade = student_grades[0];
        
        // using for each loop to iterate through the student_grades array then computes the total grades, average grade, highest grade, and lowest grade
        for (double d : student_grades) {
            total_grades += d;
            average_grade = total_grades / num_students;
            if (d > highest_grade) {
                highest_grade = d;
            }
            if (d < lowest_grade) {
                lowest_grade = d;
            }
            
        }
        
        // displays the values of total grades, average grade, highest grade, and lowest grade
        System.out.println("=== Grade Analysis ===");
        System.out.println("Total Grades: " + total_grades);
        System.out.println("Average Grade: " + average_grade);
        System.out.println("Highest Grade: " + highest_grade);
        System.out.println("Lowest Grade: " + lowest_grade);
        

        scanner.close();
    }
}