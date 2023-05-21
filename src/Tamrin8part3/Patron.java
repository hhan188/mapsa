package Tamrin8part3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

//The Patron class should have the following instance variables:
// name (a String), libraryId (an int), booksCheckedOut (an array of Book objects),
// and finesOwed (a double). It should also have a constructor that takes in values for each of these instance variables.

//checkOutBook(Patron patron, Book book): Allows a patron to check out a book.
// This method should first check if the book is available (i.e., not already checked out) and
// if the patron has not already checked out the maximum number of books.
// If both of these conditions are true, the book should be checked out and added to the patron's list of checked-out books.
// The book's due date should be set to the current date plus two weeks.
@Data
@AllArgsConstructor
public class Patron {
    private String name;
    private int libraryId;
    private ArrayList<Book> booksCheckedOut;
    private double finesOwed;

    public void addBook(Book book) {
        booksCheckedOut.add( book);
    }

    public void removeBook(Book book) {
        booksCheckedOut.remove(book);
    }

    public Patron(String ali, int libraryId) {
        this.name=ali;
        this.libraryId=libraryId;
    }
}
