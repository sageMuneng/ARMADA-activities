//interface Shape
interface Shape {
    double area();
}

// here i created a circle class that implements the shape interface
class Circle implements Shape {
    // i declared a private variable radius
    private double radius;

    // then i created a constructor that takes the radius as an argument
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        // here it calculates the area of the circle using the formula below
        return Math.PI * radius * radius;
    }
}

// here i created a rectangle class that implements the shape interface
class Rectangle implements Shape {
    // i declared two private variables length and width
    private double length;
    private double width;

    // then i created a constructor that takes the length and width as arguments
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // here it calculates the area of the rectangle using the formula below
    public double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // here i created instances of Circle and Rectangle classes and assigned the radies and the lengh and with
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // here i printed the area of the circle and rectangle using the area methods
        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Area of the rectangle: " + rectangle.area());
    }
}
