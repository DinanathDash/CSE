@FunctionalInterface
interface Shape {
    double area();

    default void printArea() {
        System.out.println("The area is: " + area());
    }
}

public class Q4 {
    public static void main(String[] args) {
        Shape circle = () -> {
            double radius = 5;
            return Math.PI * radius * radius;
        };

        Shape square = () -> {
            double side = 4;
            return side * side;
        };

        Shape rectangle = () -> {
            double width = 4;
            double height = 7;
            return width * height;
        };

        System.out.println("Circle:");
        circle.printArea();

        System.out.println("Square:");
        square.printArea();

        System.out.println("Rectangle:");
        rectangle.printArea();
    }
}
