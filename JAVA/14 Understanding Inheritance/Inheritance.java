class Person{
    String name;
    int age;

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    String grade;
    void displayInfo(){
        super.displayInfo();
        System.out.println("Grade: "+grade);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.age = 20;
        s.grade = "A";
        s.displayInfo();
    }
}
