package Prac8.Project3;

import java.util.HashMap;

public class Patron {
    private String name;
    private int libraryID;
    private HashMap<String, Book> booksCheckedout;
    private double finesOwed;

    public Patron(String name, int libraryID) {
        this.name = name;
        this.libraryID = libraryID;
        booksCheckedout = new HashMap<String, Book>();
        finesOwed = 0;
    }

    public HashMap<String, Book> getBooksCheckedout() {
        return booksCheckedout;
    }

    public void setBooksCheckedout(HashMap<String, Book> booksCheckedout) {
        this.booksCheckedout = booksCheckedout;
    }

    public double getFinesOwed() {
        return finesOwed;
    }

    public void setFinesOwed(double finesOwed) {
        this.finesOwed = finesOwed;
    }

    public void addBook(Book book) {
        booksCheckedout.put(book.getTitle(), book);
    }

    public void removeBook(Book book) {
        booksCheckedout.remove(book.getTitle());
    }

    public void chargeFine(double fine) {
        finesOwed += fine;
    }

    public String getName() {
        return name;
    }

    public int getLibraryID() {
        return libraryID;
    }
}
