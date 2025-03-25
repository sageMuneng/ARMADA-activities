import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class SMS {
    public void showMenu() {
        
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student Grade");
        System.out.println("4. Exit\n\n");
    }
    private Scanner scanner = new Scanner(System.in);
    private List<String> student_names = new ArrayList<String>();
    private List<Integer> student_ids = new ArrayList<Integer>();
    private List<Double> student_grades = new ArrayList<Double>();

    public void addStudent() {
        System.out.println("Add Student");

        System.out.println("Enter student name:");
        String addName = scanner.nextLine();
        
        System.out.println("Enter student ID:");
        int addId = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        
        System.out.println("Enter student grade:");
        double addGrade = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline
        
        student_names.add(addName);
        student_ids.add(addId);
        student_grades.add(addGrade);

        System.out.println("Student added successfully!\n");
    }

    public void viewAllStudents() {
        for (int i = 0; i < this.student_names.size(); i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + this.student_names.get(i));
            System.out.println("ID: " + this.student_ids.get(i));
            System.out.println("Grade: " + this.student_grades.get(i));
            System.out.println();
        }
    }

    public void updateStudentGrade(int get_id, double grade) {
        for (int i = 0; i < this.student_ids.size(); i++) {
            if (this.student_ids.get(i) == get_id) {
                System.out.println("Enter new grade: ");
                this.student_grades.set(i, grade);
                System.out.println("Grade updated successfully!\n");
                break;
            }else{
                System.out.println("Student not found\n");
                break;
            }
        }
    }
}

public class StudentManagementSystemGMA extends SMS{

    public static void main(String[] args) {
        StudentManagementSystemGMA sms = new StudentManagementSystemGMA();
        Scanner choice_scanner = new Scanner(System.in); // Create Scanner outside the loop
        int choice = 0;
        System.out.println("=======Welcome to the Student Management System=======\n");
        
        while (choice != 4) {
            sms.showMenu();

            System.out.println("Enter your choice: ");
            choice = choice_scanner.nextInt();

            switch (choice) {
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    System.out.println("\n\n--- Student Records --- \n");
                    sms.viewAllStudents();
                    System.out.println("\n----------------------- ");
                    break;
                case 3:
                    System.out.println("Update Student Grade");
                    // Add logic for updating student grade here
                    int setID;
                    double setGrade;
                    System.out.println("Enter student ID to update:");
                    setID = choice_scanner.nextInt();
                    System.out.println("Enter new grade: ");
                    setGrade = choice_scanner.nextDouble();

                    sms.updateStudentGrade(setID, setGrade);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        choice_scanner.close(); // Close Scanner only once at the end
    }
}
