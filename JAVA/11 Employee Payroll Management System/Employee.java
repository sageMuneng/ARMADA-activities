
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    String name;
    int employeeID;
    double salary;
    String department;

    public Employee(String name, int employeeID, double salary, String department) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    // display the information of this employee
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
        System.out.println();
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
        System.out.println("Salary updated successfully! New Salary: $" + salary + '\n');
    }

    // Getter for employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //here i tried to create a list of employees and then add them to the list
        List<Employee> employees = new ArrayList<>();
        int choice = 0;

        System.out.println("=======Welcome to the Employee Payroll Management System=======\n");

        while (choice != 5) {
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Employee ---");

                    System.out.print("Enter employee name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();

                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();

                    // Create and add employee to the list
                    employees.add(new Employee(name, id, salary, department));
                    System.out.println("Employee added successfully!\n");
                    break;

                case 2:
                    System.out.println("\n--- Employee Records ---");
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee emp : employees) {
                            emp.displayInfo();
                        }
                    }
                    System.out.println("-----------------------\n");
                    break;

                case 3:
                    System.out.print("\nEnter employee ID to calculate annual salary: ");
                    int empId = scanner.nextInt();
                    boolean id_found = false;

                    for (Employee emp : employees) {
                        if (emp.getEmployeeID() == empId) {
                            System.out.println("Annual Salary of " + emp.name +": $" + emp.calculateAnnualSalary());
                            id_found = true;
                            break;
                        }
                    }
                    if (!id_found){
                        System.out.println("Employee not found.\n\n");
                    }
                    break;

                case 4:
                    System.out.print("\nEnter employee ID for salary raise: ");
                    int raiseId = scanner.nextInt();
                    System.out.print("Enter raise percentage: ");
                    double percentage = scanner.nextDouble();
                    boolean id_found_raise = false;
                    
                    for (Employee emp : employees) {
                        if (emp.getEmployeeID() == raiseId) {
                            emp.raiseSalary(percentage);
                            id_found_raise = true;
                            break;
                        }
                    }
                    if (!id_found_raise){
                        System.out.println("Employee not found.\n\n");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
