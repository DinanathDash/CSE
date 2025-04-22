package Packages.src;
public class Book {
    String BName, BEdition;
    public double BPrice;
    public Book(String BName, String BEdition, double BPrice) {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }
    public void display() {
        System.out.println("Book Name: " + BName);
        System.out.println("Book Edition: " + BEdition);
        System.out.println("Book Price: " + BPrice);
    }
}
