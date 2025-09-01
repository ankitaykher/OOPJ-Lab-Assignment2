import java.util.*;

class Book {
    private String title;
    private String author;
    private boolean issued;

    // static variable to track issued books
    static int totalIssuedBooks = 0;

    // Constructor
    public Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;

        // If issued = true, increase counter
        if (issued) {
            totalIssuedBooks++;
        }
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIssued(boolean issued) {
        // if we change from false → true, increase counter
        if (!this.issued && issued) {
            totalIssuedBooks++;
        }
        // if we change from true → false, decrease counter
        else if (this.issued && !issued) {
            totalIssuedBooks--;
        }
        this.issued = issued;
    }

    // Static method
    public static void showTotalIssued() {
        System.out.println("Total Issued Books: " + totalIssuedBooks);
    }
}

public class CounterBook {
    public static void main(String[] args) {
        // Create 3 books
        Book b1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", true);
        Book b2 = new Book("Godan", "Munshi Premchand", false);
        Book b3 = new Book("The Guide", "R. K. Narayan", true);

        // Print details
        System.out.println(b1.getTitle() + " by " + b1.getAuthor() + " | Issued: " + b1.isIssued());
        System.out.println(b2.getTitle() + " by " + b2.getAuthor() + " | Issued: " + b2.isIssued());
        System.out.println(b3.getTitle() + " by " + b3.getAuthor() + " | Issued: " + b3.isIssued());

        // Show total issued books
        Book.showTotalIssued();
    }
}
