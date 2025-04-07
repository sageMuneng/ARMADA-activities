import java.util.Scanner;

public class ScoreboardGMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // the user is asked to enter the number of students
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // then the user is asked to enter the number of subjects

        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // then we create a 2D array to store the scores of each student in each subject
        int[][] scores = new int[numStudents][numSubjects];

        // here we loop through the number of students and subjects to get the scores from the user
        // and store them in the 2D array
        for(int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ": ");
            for(int j = 0; j < numSubjects; j++) {
                System.out.println("Enter score " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // then we loop through the 2D array to calculate the total and average score for each student
        for(int i = 0; i < numStudents; i++) {
            double total = 0;
            double average = 0;
            for(int j = 0; j < numSubjects; j++) {
                total += scores[i][j];
                average = total / numSubjects;
            }
            // then we print the total and average score for each student
            System.out.println("Student " + (i + 1) + " - Total: " + total + ", Average: " + average);
        }
    }
}
