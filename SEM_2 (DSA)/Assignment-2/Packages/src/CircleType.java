package Packages.src;
public class CircleType extends PointType {
    double radius;
    public CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public void printCircle() {
        System.out.println("Center: (" + x + ", " + y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}
