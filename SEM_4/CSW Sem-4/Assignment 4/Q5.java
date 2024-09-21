import java.util.HashMap;

class Book {
    int id, quantity;
    String name, author;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
}
class Library {
    HashMap<Integer, Book> books = new HashMap<>();

    public void addBook(int key, Book book) {
        books.put(key, book);
    }

    public boolean checkBookByName(String bookName) {
        for (Book book : books.values()) {
            if (book.name.equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public void removeBookByKey(int key) {
        books.remove(key);
    }

    public void displayBooks() {
        for (Integer key : books.keySet()) {
            Book book = books.get(key);
            System.out.println("Key: " + key + ", Book: " + book.name + " by " + book.author + ", Quantity: " + book.quantity);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "B1","A1",5);
        Book book2 = new Book(2, "B2", "A2", 3);

        library.addBook(1, book1);
        library.addBook(2, book2);

        System.out.println("Books in the Library:");
        library.displayBooks();

        String searchBookName = "B1";
        if (library.checkBookByName(searchBookName)) {
            System.out.println(searchBookName + " is present in the library.");
        } else {
            System.out.println(searchBookName + " is not present in the library.");
        }

        int removeKey = 2;
        library.removeBookByKey(removeKey);
        
        System.out.println("\nAfter removing a book:");
        library.displayBooks();
    }
}