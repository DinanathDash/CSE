class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);

        System.out.println("Initial Length: " + rectangle.getLength() + "\nInitial Width: " + rectangle.getWidth());

        rectangle.setLength(7.0);
        rectangle.setWidth(3.0);

        System.out.println("Updated Length: " + rectangle.getLength() + "\nUpdated Width: " + rectangle.getWidth());
        
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.calculatePerimeter());
    }
}
