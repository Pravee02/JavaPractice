package javabasics;

interface Shape {
    double PI = 3.14159;    // constant
    double area();          // abstract method
    double perimeter();     // abstract method

    default void display() {         // default method
        System.out.println("I am a shape");
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class Interface {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Circle area: " + s1.area());          // 153.93
        System.out.println("Circle perimeter: " + s1.perimeter()); // 43.98

        System.out.println("Rectangle area: " + s2.area());          // 24.0
        System.out.println("Rectangle perimeter: " + s2.perimeter()); // 20.0

        s1.display();    // I am a shape (default method)
        s2.display();    // I am a shape (default method)


    }
}
