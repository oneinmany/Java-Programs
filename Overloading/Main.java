package Overload;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Book with title and author
        Book obj1 = new Book("Love Without Limits", "Shakespeare");
        
        // Printing the title of the book
        System.out.println(obj1.title);
        System.out.println(obj1.author);
        System.out.println(obj1.publicationYear);
    }
}
