abstract class LibraryResource {
    private String title, author;
    
    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;
    
    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }
    
    public int getPageCount() {
        return pageCount;
    }
    
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPage Count: " + pageCount);
    }
}

class Magazine extends LibraryResource {
    private String issueDate;
    
    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }
    
    public String getIssueDate() {
        return issueDate;
    }
    
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nIssue Date: " + issueDate);
    }
}

class DVD extends LibraryResource {
    private int duration;
    
    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nDuration: " + duration + " minutes");
    }
}

public class Q6 {
    public static void main(String[] args) {
        LibraryResource book = new Book("Java Programming", "John Doe", 500);
        LibraryResource magazine = new Magazine("National Geographic", "Various", "January 2024");
        LibraryResource dvd = new DVD("Inception", "Christopher Nolan", 148);
        
        System.out.println("Book Details:");
        book.displayDetails();
        
        System.out.println("\nMagazine Details:");
        magazine.displayDetails();

        System.out.println("\nDVD Details:");
        dvd.displayDetails();
    }
}
