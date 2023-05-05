package Practice8.MoreChallenging;

public class Book {
    String title;
    String author;
    int publicationYear;
    boolean isCheckedOut;
    String dueDate;

    public Book(String title, String author, int publicationYear, boolean isCheckedOut, String dueDate) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isCheckedOut = isCheckedOut;
        this.dueDate = dueDate;
    }
}
