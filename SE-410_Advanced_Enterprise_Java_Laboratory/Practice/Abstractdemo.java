package Practice;
abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circlee extends Shape {
    private double radius;

    public Circlee(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
public class Abstractdemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 8);
        System.out.println("Area of Triangle: " + triangle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Circlee circle = new Circlee(3);
        System.out.println("Area of Circle: " + circle.area());
    }
}
