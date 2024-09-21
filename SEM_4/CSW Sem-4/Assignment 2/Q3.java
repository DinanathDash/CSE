public class Q3 {
    private double x, y;
    
    public Q3(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Q3(Q3 other) {
        this.x = other.getX();
        this.y = other.getY();
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public static void main(String[] args) {
        Q3 p1 = new Q3(3.5, 4.2);
        
        Q3 p2 = new Q3(p1);
        
        p1.setX(5.0);
        
        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
