//openclose principle
interface Shape {
    double area();
}

class Circle implements Shape {
    double radius = 5;

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length = 4, breadth = 5;

    public double area() {
        return length * breadth;
    }
}

public class openclose {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
