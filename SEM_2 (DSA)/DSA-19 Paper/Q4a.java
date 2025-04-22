abstract class Shape {
    abstract void area();
}
class Square extends Shape {
    int side;
    Square(int side) {
        this.side = side;
    }
    void area() {
        System.out.println("Area of square: " + (side * side));
    }
}
class Triangle extends Shape {
    int base;
    int height;
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    void area() {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }
}
class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    void area() {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}
public class Q4a {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.area();
        Triangle triangle = new Triangle(5, 10);
        triangle.area();
        Circle circle = new Circle(5);
        circle.area();
    }
}