package Prac8.Project3;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isCheckedout;
    private String dueDate;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void toggleCheckout() {
        isCheckedout = !isCheckedout;
    }

    public boolean getCheckout() {
        return isCheckedout;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
