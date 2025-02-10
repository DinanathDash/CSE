package Packages.src;
public class RestaurantMeal {
    String name;
    double price;
    public RestaurantMeal(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void display() {
        System.out.println("Food Item: " + name);
        System.out.println("Price: " + price);
    }
}
