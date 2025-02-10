class Product {
    int pid;
    double price;
    static double tot_price;
    Product(int pid, double price) {
        this.pid = pid;
        this.price = price;
        tot_price += price;
    }
    void display() {
        System.out.println("Product ID: " + pid + ", Price: " + price);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Product p1 = new Product(1, 10.0);
        Product p2 = new Product(2, 20.0);
        Product p3 = new Product(3, 30.0);
        Product p4 = new Product(4, 40.0);
        Product p5 = new Product(5, 50.0);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        System.out.println("Total amount: " + Product.tot_price);
    } 
}
