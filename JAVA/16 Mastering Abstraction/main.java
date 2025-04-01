abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    private double radius;

    // get the radius of the circle 
    Circle(double radius) {
        this.radius = radius;
    }

    // when the area is called it will calculate first the area of the circle then print the result
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // get the width and height of the rectangle 
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // when the area is called it will calculate first the area of the rectangle then print the result
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class main {
    public static void main(String[] args) {
        // here i set the radius of circle to 5
        Circle circle = new Circle(5);
        // then i called the area method to print the area if the circle
        circle.area();
        
        // here i set the length and width of the rectangle to 10 and 5
        Rectangle rectangle = new Rectangle(10, 5);
        // then i called the area method to print th area of the rectangle
        rectangle.area();
    }
}
