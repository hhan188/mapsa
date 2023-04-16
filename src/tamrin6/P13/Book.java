package tamrin6.P13;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String comparePages(Book otherBook) {
        if (this.pages > otherBook.getPages()) {
            return "The book " + this.title + " has more pages than " + otherBook.getTitle() + ".";
        } else if (this.pages < otherBook.getPages()) {
            return "The book " + this.title + " has fewer pages than " + otherBook.getTitle() + ".";
        } else {
            return "The book " + this.title + " has the same number of pages as " + otherBook.getTitle() + ".";
        }
    }
}

