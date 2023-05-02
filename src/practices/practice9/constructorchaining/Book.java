package practices.practice9.constructorchaining;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int numPages;

    public Book(String title, String author) {
        this(title, author, 0, 0);
    }

    public Book(String title, String author, int yearPublished) {
        this(title, author, yearPublished, 0);
    }

    public Book(String title, String author, int yearPublished, int numPages) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public Book setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
        return this;
    }

    public int getNumPages() {
        return numPages;
    }

    public Book setNumPages(int numPages) {
        this.numPages = numPages;
        return this;
    }
}
