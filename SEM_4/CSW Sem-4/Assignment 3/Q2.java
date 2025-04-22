class Book {
    private int bookId, price;
    private String bookName;

    public Book(int bookId, String bookName, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return Double.compare(price, other.price) == 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming", 25);
        Book book2 = new Book(2, "Python Programming", 30);

        System.out.println("Details of Book 1: \n" + book1);

        System.out.println("\nDetails of Book 2: \n" + book2);


        if (book1.equals(book2)) {
            System.out.println("\nBoth books have the same price.");
        } else if (book1.getPrice() > book2.getPrice()) {
            System.out.println("\nBook 1 is more expensive than Book 2.");
        } else {
            System.out.println("\nBook 2 is more expensive than Book 1.");
        }
    }
}
