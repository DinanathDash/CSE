import Packages.src.Distance;
public class A3 {
    public static void main(String[] args) {
        Distance d1 = new Distance(3, 50);
        Distance d2 = new Distance(2, 75);
        System.out.print("Distance 1: ");
        d1.display();
        System.out.print("Distance 2: ");
        d2.display();
        Distance d3 = Distance.sum(d1, d2);
        System.out.print("Sum of distances: ");
        d3.display();
    }
}
