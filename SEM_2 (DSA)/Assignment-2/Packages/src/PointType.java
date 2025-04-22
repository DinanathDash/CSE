package Packages.src;
public class PointType {
    double x;
    double y;
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void printPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
