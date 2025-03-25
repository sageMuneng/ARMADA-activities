
import java.util.Scanner;

class Student {

    String student_name;
    int[] grades = new int[3];

    public void saveStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void saveGrades(int index, int grades) {
        this.grades[index] = grades;
    }

    public void displayInfo() {
        System.out.println("Student: " + student_name);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }

    public double computeAverage(){
        double total_grades = 0;
        double average_grade = 0;
        double highest_grade = 0;
        double lowest_grade = this.grades[0];
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

        return average_grade;
    }

    public void classifyGrade(double average_grade){
        if (average_grade >= 90) {
            System.out.println("Performance: Excellent");
        } else if (average_grade >= 80) {
            System.out.println("Performance: Good");
        } else if (average_grade >= 70) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Needs Improvement");
        }
    }    
}

public class StudentGradeManager extends Student {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String studentName = scanner.nextLine();

        Student student1 = new Student();
        student1.student_name = studentName;

        for (int i = 0; i < student1.grades.length; i++) {
            System.out.println("Enter grade for subject " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            student1.saveGrades(i, grade);
        }

        student1.displayInfo();
        System.out.println("Average: " + student1.computeAverage());
        student1.classifyGrade(student1.computeAverage());
    }
}
