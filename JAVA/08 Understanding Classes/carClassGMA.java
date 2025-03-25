
class Car {
    String brand = "Toyota";
    int year = 2020;

    // Constructor
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);

    }
}

public class carClassGMA extends Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayInfo();
    }
}
