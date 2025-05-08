
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

interface Archivable {

    void archive();
}

class Student implements Archivable {

    private String studentID;
    private String name;
    private List<Subject> subjects;
    private boolean isArchived; // if this student is archived di na need idisplay sa archive

    public Student(String name, String studentID, boolean archived) {
        this.name = name;
        this.studentID = studentID;
        this.subjects = new ArrayList<>();
        this.isArchived = archived;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public List<Subject> getStudentSubjects() {
        return this.subjects;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getStudentName() {
        return this.name;
    }

    public void setStudentName(String updated_name) {
        this.name = updated_name;
    }

    public double calculateGPA() {
        if (subjects.isEmpty()) {
            return 0.0;
        }
        double totalGrade = 0.0;
        for (Subject subject : subjects) {
            totalGrade += subject.getGrade();
        }
        return totalGrade / subjects.size();
    }

    public boolean getIsArchived() {
        return this.isArchived;
    }

    @Override
    public void archive() {
        if (!this.isArchived) {
            this.isArchived = true;
            System.out.println("Archiving student: " + name.toUpperCase() + " (GPA: " + String.format("%.2f", calculateGPA()) + ")");
        }
    }
}

class Subject {

    private String code;
    private String description;
    private double grade;

    public Subject(String code, String description, double grade) {
        this.code = code;
        this.description = description;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getGrade() {
        return grade;
    }
}

class Transcript {

    public static void displayTranscript(Student student) {
        System.out.println("\n--- Transcript for " + student.getStudentName().toUpperCase() + " ---");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("\nSubjects:");
        if (student.getStudentSubjects().isEmpty()) {
            System.out.println("No subjects found for this student.");
            return;
        } else {
            double totalGrade = 0.0;
            int totalSubjects = student.getStudentSubjects().size();
            System.out.printf("%-10s | %-30s | %-5s\n", "CODE", "DESCRIPTION", "GRADE");
            System.out.println("-------------------------------------------");
            for (Subject subject : student.getStudentSubjects()) {
                totalGrade += subject.getGrade();
                System.out.printf("%-10s | %-30s | %-5.1f\n", subject.getCode(), subject.getDescription(), subject.getGrade());
            }
            double gpa = totalGrade / totalSubjects;
            System.out.printf("\nGPA: %.2f\n", gpa);
        }
    }
}

public class SRMS {

    private static List<Student> listOfStudents = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void main_menu() {

        System.out.println("\n--- Student Records Management ---");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Add Subject to Student");
        System.out.println("4. Display Transcript");
        System.out.println("5. Sort Students (by Name)");
        System.out.println("6. Sort Students (by GPA)");
        System.out.println("7. Archive Students (GPA >= 3.5)");
        System.out.println("8. Save and Exit");
    }

    // fix this class 
    private static void AddStudent() {
        System.out.println("\n--- Add Student ---");
        // System.out.println();
        System.out.println("Total Students: " + listOfStudents.size());

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        String studentID = "1";
        if (listOfStudents.size() == 0) {
            studentID = "0001";
        } else if (listOfStudents.size() > 0 && listOfStudents.size() < 10) {
            studentID = "000" + (listOfStudents.size() + 1);
        } else if (listOfStudents.size() > 9 && listOfStudents.size() < 100) {
            studentID = "00" + (listOfStudents.size() + 1);
        } else if (listOfStudents.size() >= 100 && listOfStudents.size() < 1000) {
            studentID = "0" + (listOfStudents.size() + 1);
        } else {
            studentID = String.valueOf(listOfStudents.size() + 1);
        }

        listOfStudents.add(new Student(name, studentID, false));
        System.out.println("\n-------------------------------------------");
        System.out.println("Student added successfully!.");
        System.out.println("-------------------------------------------");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + name);
        System.out.println("-------------------------------------------\n");
    }

    private static void UpdateStudent() {
        System.out.println("\n--- Update Student ---");
        // System.out.println();
        System.out.printf("%-10s | %-30s\n", "STUDENT ID", "NAME");
        System.out.println("-------------------------------------------");
        for (Student student : listOfStudents) {
            System.out.printf("%-10s | %-30s\n", student.getStudentID(), student.getStudentName());
        }
        System.out.println("-------------------------------------------\n");

        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();
        boolean studentFound = false;

        for (Student student : listOfStudents) {
            if (student.getStudentID().equals(studentID)) {
                System.out.println("Update Student Name: ");
                String name = scanner.nextLine();

                student.setStudentName(name);
                studentFound = true;
                System.out.println("\nStudent updated successfully.\n");
                return;
            }
        }
        if (!studentFound) {
            System.out.println("\nStudent not found.\n");
        }
    }

    private static void addSubjectToStudent() {
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();
        boolean studentFound = false;

        for (Student list_studentIDs : listOfStudents) {
            if (list_studentIDs.getStudentID().equals(studentID)) {
                studentFound = true;
                System.out.println("\nStudent found: (" + list_studentIDs.getStudentName().toUpperCase() + ")");
                String add_more = "y";

                while (add_more.equalsIgnoreCase("y")) {

                    System.out.println("Enter Subject Code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter Subject Description: ");
                    String description = scanner.nextLine();

                    boolean validGrade = false;

                    while (!validGrade) {
                        try {
                            System.out.println("Enter Subject Grade (0.0 - 4.0): ");
                            double grade = scanner.nextDouble();

                            if (grade >= 0.0 && grade <= 4.0) {
                                // Add the subject to the student 
                                list_studentIDs.addSubject(new Subject(code, description, grade));
                                validGrade = true;
                            } else {
                                System.out.println("Invalid grade. Please enter a valid grade (0.0 - 4.0): ");
                            }
                            scanner.nextLine();
                        } catch (InputMismatchException e) {

                            System.out.println("Invalid input. Please enter a numerical value for the grade.");
                            scanner.nextLine();
                        }
                    }
                    System.out.println("\nSubject added successfully.\n\n");

                    System.out.println("Do you want to add more subject? (y/n): ");
                    add_more = scanner.nextLine();
                    if (add_more.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
        }

        if (!studentFound) {
            System.out.println("Student not found. Please add the student first.");
        }
    }

    private static void displayTranscript() {
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();
        boolean studentFound = false;

        for (Student student : listOfStudents) {
            if (student.getStudentID().equals(studentID)) {
                Transcript.displayTranscript(student);
                studentFound = true;
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student not found.");
        }
    }

    private static void sortByName() {
        listOfStudents.sort((s1, s2) -> s1.getStudentName().compareToIgnoreCase(s2.getStudentName()));
        System.out.println("\n\nStudents sorted by name.");
        for (Student student : listOfStudents) {
            System.out.println(student.getStudentName());
        }
    }

    private static void sortByGPA() {
        System.out.println("\n\nStudents sorted by GPA.");
        // bubble sort algorithm
        for (int i = 0; i < listOfStudents.size() - 1; i++) {
            for (int j = 0; j < listOfStudents.size() - i - 1; j++) {
                double gpa1 = 0.0;
                double gpa2 = 0.0;

                for (Subject subject : listOfStudents.get(j).getStudentSubjects()) {
                    gpa1 += subject.getGrade();
                }
                gpa1 = gpa1 / listOfStudents.get(j).getStudentSubjects().size();

                for (Subject subject : listOfStudents.get(j + 1).getStudentSubjects()) {
                    gpa2 += subject.getGrade();
                }
                gpa2 = gpa2 / listOfStudents.get(j + 1).getStudentSubjects().size();

                if (gpa1 < gpa2) {
                    Student temp = listOfStudents.get(j);
                    listOfStudents.set(j, listOfStudents.get(j + 1));
                    listOfStudents.set(j + 1, temp);
                }
            }
        }

        for (Student student : listOfStudents) {
            System.out.println(student.getStudentName());
        }

    }

    private static void archiveStudents() {
        System.out.println("\nArchive students with GPA >= 3.5");
        boolean studentFound = false;
        for (Student student : listOfStudents) {
            double totalGrade = 0.0;
            int totalSubjects = student.getStudentSubjects().size();
            if (totalSubjects > 0 && !student.getIsArchived()) {
                for (Subject subject : student.getStudentSubjects()) {
                    totalGrade += subject.getGrade();
                }
                double gpa = totalGrade / totalSubjects;
                if (gpa >= 3.5) {
                    student.archive();
                }
                studentFound = true;
            }
        }

        if (studentFound) {
            System.out.println("\nNo students found with GPA >= 3.5");
        } else {
            System.out.println("\nArchiving completed.");
        }
    }

    private static void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("records.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                String[] studentData = data[0].split(",");

                String studentID = studentData[0];
                String studentName = studentData[1];
                boolean isStudentArchived = studentData[2].equals("true");

                Student student = new Student(studentName, studentID,isStudentArchived);

                if (data.length > 1 && data[1].length() > 1 && !data[1].isEmpty()) {
                    String[] subjectsData = data[1].split("~");
                    for (String subjectData : subjectsData) {
                        String[] subjectDetails = subjectData.split(",");

                        String code = subjectDetails[0];
                        String description = subjectDetails[1];
                        double grade = Double.parseDouble(subjectDetails[2]);
                        student.addSubject(new Subject(code, description, grade));
                    }
                }

                listOfStudents.add(student);
            }
            System.out.println("Data loaded successfully from file.");
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (SecurityException e) {
            System.out.println("Permission denied. Try again later");
        } catch (IOException e) {
            System.out.println("An error occurred, try again later ");
        }
    }

    private static void saveToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("records.txt"));
            for (Student student : listOfStudents) {
                String string_subjects = "";
                for (int i = 0; i < student.getStudentSubjects().size(); i++) {
                    Subject subject = student.getStudentSubjects().get(i);
                    string_subjects += subject.getCode() + "," + subject.getDescription() + "," + subject.getGrade();
                    if (i < student.getStudentSubjects().size() - 1) {
                        string_subjects += "~";
                    }
                }
                writer.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getIsArchived() + "|" + string_subjects + "\n");
            }
            writer.close();
            System.out.println("Data saved successfully to file.");
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (SecurityException e) {
            System.out.println("Permission denied. Try again later");
        } catch (IOException e) {
            System.out.println("An error occurred, try again later " + e);
        }
    }

    public static void main(String[] args) {
        loadFromFile();
        String choice = "";
        System.out.println("\nWelcome to the Student Records Management System");

        while (choice != "8") {
            main_menu();
            System.out.println("\nEnter your choice: ");

            choice = scanner.nextLine();

            // separate option for add and update
            switch (choice) {
                case "1":
                    // if adding print all student count
                    AddStudent();
                    break;
                case "2":
                    UpdateStudent();
                    break;
                case "3":
                    addSubjectToStudent();
                    break;
                case "4":
                    displayTranscript();
                    break;
                case "5":
                    sortByName();
                    break;
                case "6":
                    sortByGPA();
                    break;
                case "7":
                    archiveStudents();
                    break;
                case "8":
                    choice = "8";
                    saveToFile();
                    break;

                default:
                    System.out.println("****Invalid input. Please enter a number between 1 and 8.****");
            }

        }

        scanner.close();
    }
}
