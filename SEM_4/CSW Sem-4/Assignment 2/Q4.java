class Laptop {
    private String model;
    private double price;
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Laptop Model: " + model + ", Price: $" + price;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setModel("Dell XPS 13");
        laptop.setPrice(200);

        System.out.println(laptop.toString());
    }
}
