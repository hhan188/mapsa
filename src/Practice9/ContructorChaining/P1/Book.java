package Practice9.ContructorChaining.P1;

public class Book {
    String title;
    String author;
    int yearPublished;
    int numPages;

    public Book(String title, String author, int yearPublished, int numPages) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numPages = numPages;
    }

    public Book(String title, String author) {
        this(title ,author,0,0);
    }

    public Book(String title, String author, int yearPublished) {
        this(title ,author,yearPublished,0);
    }

}
