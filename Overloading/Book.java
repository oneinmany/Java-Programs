package Overload;

public class Book {
    String title;
    String author;
    int publicationYear;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.publicationYear = 0;
        this.price = 0.0;
    }

    // Parameterized constructor with all fields
    public Book(String title, String author, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    // Overloaded constructor with title and author only
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = 0;  // Default value
        this.price = 0.0;          // Default value
    }

    // Overloaded constructor with title only
    public Book(String title) {
        this.title = title;
        this.author = "Unknown Author"; // Default value
        this.publicationYear = 0;       // Default value
        this.price = 0.0;               // Default value
    }
}
