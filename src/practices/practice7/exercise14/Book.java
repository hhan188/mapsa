package practices.practice7.exercise14;

import practices.practice7.exercise20.BookGenre;

public class Book {
    private String title;
    private String author;
    private int nOfPage;
    private BookGenre bookGenre;

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

    public int getnOfPage() {
        return nOfPage;
    }

    public void setnOfPage(int nOfPage) {
        this.nOfPage = nOfPage;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookGenre=" + bookGenre +
                '}';
    }
}
