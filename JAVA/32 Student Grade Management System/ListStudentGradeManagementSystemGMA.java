
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class ListStudentGradeManagementSystemGMA {

    String name;
    double grade;

    public ListStudentGradeManagementSystemGMA(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        LinkedList<ListStudentGradeManagementSystemGMA> student_list = new LinkedList<>();

        while (choice != 5) {
            try {
                System.out.println("=======Welcome to the Student Grade Management System=======\n");
                System.out.println("1. Add Student");
                System.out.println("2. Display Students");
                System.out.println("3. Update Grade");
                System.out.println("4. Remove Student");
                System.out.println("5. Exit\n");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        String enterName;
                        double enterGrade;
                        System.out.print("Enter Student Name: ");
                        enterName = scanner.nextLine();

                        System.out.print("Enter Student Grade: ");
                        enterGrade = scanner.nextDouble();
                        scanner.nextLine();

                        student_list.add(new ListStudentGradeManagementSystemGMA(enterName, enterGrade));

                        System.out.println("Student added!\n");
                        break;
                    case 2:
                        if (student_list.isEmpty()) {
                            System.out.println("No students found.\n");
                        } else {
                            System.out.println("Student List:");
                            for (ListStudentGradeManagementSystemGMA student : student_list) {
                                student.displayInfo();
                                System.out.println();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter student name: ");
                        String updateName = scanner.nextLine();
                        boolean studentFound = false;
                        for (ListStudentGradeManagementSystemGMA student : student_list) {
                            if (updateName.equals(student.name)) {
                                System.out.println("Enter new grade: ");
                                double newGrade = scanner.nextDouble();
                                student.grade = newGrade;
                                System.out.println("Grade updated!\n");
                                studentFound = true;
                                break;
                            }
                        }
                        if (!studentFound) {
                            System.out.println("Student not found.\n");
                        }
                        break;
                    case 4:
                        System.out.println("Enter student name to remove: ");
                        String removeName = scanner.nextLine();
                        boolean removed = false;
                        for (ListStudentGradeManagementSystemGMA student : student_list) {
                            if (removeName.equals(student.name)) {
                                student_list.remove(student);
                                System.out.println("Student removed!\n");
                                removed = true;
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Student not found.\n");
                        }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next();
            }
        }
        scanner.close();
        System.out.println("Exiting...");
    }
}
