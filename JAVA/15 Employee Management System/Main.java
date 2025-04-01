class Person{
    String name;
    int age;

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}

class Employee extends Person{
    String jobTitle;

    @Override
    void introduce() {
        super.introduce();
        System.out.println("Job Title: " + jobTitle);
    }
}

class Manager extends Employee{
    String department;

    @Override
    void introduce() {
        super.introduce();
        System.out.println("Department: " + department);
    }
}

class Executive extends Manager{
    String companyCar;

    @Override
    void introduce() {
        super.introduce();
        System.out.println("Company Car: " + companyCar);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        person.age = 30;
        System.out.println("Introducing Person:");
        person.introduce();
        
        Employee employee = new Employee();
        employee.name = "Bob";
        employee.age = 35;
        employee.jobTitle = "Software Engineer";
        System.out.println("\nIntroducing Employee:");
        employee.introduce();
        
        Manager manager = new Manager();
        manager.name = "Charlie";
        manager.age = 40;
        manager.jobTitle = "Project Manager";
        manager.department = "IT";
        System.out.println("\nIntroducing Manager:");
        manager.introduce();
        
        Executive executive = new Executive();
        executive.name = "Dave";
        executive.age = 45;
        executive.jobTitle = "Senior Executive";
        executive.department = "Finance";
        executive.companyCar = "BMW X5";
        System.out.println("\nIntroducing Executive:");
        executive.introduce();Mastering Abstraction
    }
}
