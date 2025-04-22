import java.util.Scanner;
public class Q15 {
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
    public static double calculateArea(double side) {
        return side * side;
    }
    public static double calculateArea(double radius, String shape) {
        if (shape.equals("circle")) {
            return Math.PI * radius * radius;
        } else if (shape.equals("rectangle")) {
            return 2 * radius;
        } else {
            throw new IllegalArgumentException("Invalid shape: " + shape);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double triangleArea = calculateArea(base, height);
        System.out.println("The area of the triangle is " + triangleArea);

        System.out.print("Enter the side length of the square: ");
        double side = sc.nextDouble();
        double squareArea = calculateArea(side);
        System.out.println("The area of the square is " + squareArea);

        System.out.print("Enter the radius of the shape: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the shape (circle or rectangle): ");
        String shape = sc.next();
        sc.close();
        double shapeArea = calculateArea(radius, shape);
        System.out.println("The area of the " + shape + " is " + shapeArea);
    }
}
