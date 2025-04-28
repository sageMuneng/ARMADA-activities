
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

    String studentID;
    String name;
    List<Subject> subjects;
    boolean isArchived;

    public Student(String name, String studentID) {
        this.name = name.toLowerCase();
        this.studentID = studentID;
        this.subjects = new ArrayList<>();
        this.isArchived = false;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getStudentName() {
        return this.name;
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

    @Override
    public void archive() {
        if (!isArchived) {
            isArchived = true;
            System.out.println("Archiving student: " + name.toUpperCase() + " (GPA: " + String.format("%.2f", calculateGPA()) + ")");
        } else {
            System.out.println("Student " + name.toUpperCase() + " is already archived.");
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
        System.out.println("\n--- Transcript for " + student.name.toUpperCase() + " ---");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("\nSubjects:");
        if (student.subjects.isEmpty()) {
            System.out.println("No subjects found for this student.");
            return;
        } else {
            double totalGrade = 0.0;
            int totalSubjects = student.subjects.size();
            System.out.printf("%-10s | %-30s | %-5s\n", "CODE", "DESCRIPTION", "GRADE");
            System.out.println("-------------------------------------------");
            for (Subject subject : student.subjects) {
                totalGrade += subject.getGrade();
                System.out.printf("%-10s | %-30s | %-5.1f\n", subject.getCode(), subject.getDescription(), subject.getGrade());
            }
            double gpa = totalGrade / totalSubjects;
            System.out.printf("\nGPA: %.2f\n", gpa);
        }
    }
}

public class SRMS {
    private static List<Student> listOfStudents= new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void main_menu() {

        System.out.println("\n--- Student Records Management ---");
        System.out.println("1. Add/Update Student");
        System.out.println("2. Add Subject to Student");
        System.out.println("3. Display Transcript");
        System.out.println("4. Sort Students (by Name)");
        System.out.println("5. Sort Students (by GPA)");
        System.out.println("6. Archive Students (GPA >= 3.5)");
        System.out.println("7. Save and Exit");
    }

    private static void AddUdateStudent() {
        System.out.println("\n--- Add/Update Student ---");
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        for (Student student : listOfStudents) {
            if (student.getStudentID().equals(studentID)) {
                System.out.println("Student already exists. Updating details.");
                student.name = name;
                return;
            }
        }
        
        listOfStudents.add(new Student(name, studentID));
        System.out.println("\nStudent added successfully.\n");
    }

    private static void addSubjectToStudent() {
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();
        boolean studentFound = false;

        for(Student list_studentIDs : listOfStudents) {
            if (list_studentIDs.getStudentID().equals(studentID)) {
                studentFound = true;
                System.out.println("\nStudent found: (" + list_studentIDs.name.toUpperCase() + ")");
                String add_more = "y";
                while (add_more.equalsIgnoreCase("y")) {
                    
                    System.out.println("Enter Subject Code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter Subject Description: ");
                    String description = scanner.nextLine();    

                    boolean validGrade = false;    
                    while(!validGrade){
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

                    System.out.println("Do you want to more add a subject? (y/n): ");
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
        for(Student student : listOfStudents) {
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
    
                for (Subject subject : listOfStudents.get(j).subjects) {
                    gpa1 += subject.getGrade();
                }
                gpa1 = gpa1 / listOfStudents.get(j).subjects.size();
    
                for (Subject subject : listOfStudents.get(j + 1).subjects) {
                    gpa2 += subject.getGrade();
                }
                gpa2 = gpa2 / listOfStudents.get(j + 1).subjects.size();
    
                if (gpa1 < gpa2) {
                    Student temp = listOfStudents.get(j);
                    listOfStudents.set(j, listOfStudents.get(j + 1));
                    listOfStudents.set(j + 1, temp);
                }
            }
        }

        for(Student student : listOfStudents) {
            System.out.println(student.getStudentName());
        }

    }

    private static void archiveStudents() {
        System.out.println("\n\nArchiving students with GPA >= 3.5.");
        for (Student student : listOfStudents) {
            double totalGrade = 0.0;
            int totalSubjects = student.subjects.size();
            if (totalSubjects > 0) {
                for (Subject subject : student.subjects) {
                    totalGrade += subject.getGrade();
                }
                double gpa = totalGrade / totalSubjects;
                if (gpa >= 3.5) {
                    student.archive();
                }
            }
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

                    Student student = new Student(studentName, studentID);


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
        }catch (NoSuchFileException e) {
            System.out.println("File not found");
        } 
        catch (SecurityException e) {
            System.out.println("Permission denied. Try again later");
        }
        catch (IOException e) {
            System.out.println("An error occurred, try again later ");
        }
    }

    private static void saveToFile() {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("records.txt"));
            for (Student student : listOfStudents) {
                String string_subjects = ""; 
                for (int i = 0; i < student.subjects.size(); i++) {
                    Subject subject = student.subjects.get(i);
                    string_subjects += subject.getCode() + "," + subject.getDescription() + "," + subject.getGrade();
                    if (i < student.subjects.size() - 1) {
                        string_subjects += "~";
                    }
                }
                writer.write(student.getStudentID() + "," + student.getStudentName() + "|" + string_subjects+ "\n");
            }
            writer.close();
            System.out.println("Data saved successfully to file.");
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } 
        catch (SecurityException e) {
            System.out.println("Permission denied. Try again later");
        }
        catch (IOException e) {
            System.out.println("An error occurred, try again later ");
        }
    }
    public static void main(String[] args) {
        loadFromFile();
        String choice = "";
        System.out.println("\nWelcome to the Student Records Management System");

        while (choice != "7") {
            main_menu();
            System.out.println("\nEnter your choice: ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    AddUdateStudent();
                    break;
                case "2":
                    addSubjectToStudent();
                    break;
                case "3":
                    displayTranscript();
                    break;
                case "4":
                    sortByName();
                    break;
                case "5":
                    sortByGPA();
                    break;
                case "6":
                    archiveStudents();
                    break;
                case "7":
                    choice = "7";
                    saveToFile();
                    break;
                default:
                    System.out.println("****Invalid input. Please enter a number between 1 and 7.****");
            }

        }

        scanner.close();
    }
}
