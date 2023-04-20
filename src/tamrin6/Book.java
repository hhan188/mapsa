package tamrin6;
//Problem 13 Solution
public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    private void setPages(int pages) {
        if (pages <= 0)
            throw new IllegalArgumentException("Pages cannot be zero or negative!");
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String comparePages(Book anotherBook){
        if (pages == anotherBook.getPages())
            return "same number of pages";
        if (pages < anotherBook.getPages())
            return "fewer pages";
        return "more pages";
    }
}
