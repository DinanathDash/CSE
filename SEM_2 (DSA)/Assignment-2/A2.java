import Packages.src.Book;
public class A2 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Book 1", "1st", 100);
        books[1] = new Book("Book 2", "2nd", 200);
        books[2] = new Book("Book 3", "3rd", 300);
        books[3] = new Book("Book 4", "4th", 400);
        books[4] = new Book("Book 5", "5th", 500);
        Book maxPriceBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].BPrice > maxPriceBook.BPrice) {
                maxPriceBook = books[i];
            }
        }
        System.out.println("Book with maximum price: ");
        maxPriceBook.display();
    }
}
