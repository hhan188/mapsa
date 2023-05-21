package Tamrin8part3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Calendar;

//The Library class should have the following instance variables:
// books (an array of Book objects), patrons (an array of Patron objects),
// and currentDate (a String). It should also have a constructor that takes in values for the array of books and patrons.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private String currentDate;
    private Calendar calendar;


  /*  public long checkDueDate(Book book) {
        long daysFromDue = 0;
        try {
            Date now = sdf.parse(currentDate);
            Date dueDate = sdf.parse(book.getDueDate());
            daysFromDue = (now.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return daysFromDue;
    }

    public void incrementCurrentDate(int amount) {
        try {
            calendar.setTime(sdf.parse(currentDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        calendar.add(Calendar.DATE, amount);
        currentDate = sdf.format(calendar.getTime());
    }*/

    public void incrementCurrentDate() {
        calendar.add(Calendar.DATE, 1);
       // currentDate = sdf.format(calendar.getTime());
    }

    //checkOutBook(Patron patron, Book book): Allows a patron to check out a book.
// This method should first check if the book is available (i.e., not already checked out) and
// if the patron has not already checked out the maximum number of books. If both of these conditions are true,
// the book should be checked out and added to the patron's list of checked-out books.
// The book's due date should be set to the current date plus two weeks.
    public void checkoutBook(Patron ali, Book b1) {
        if (b1.getCheckout()) {
            return;
        }
        if (ali.getBooksCheckedOut().size() == 3) {
            System.out.println("patron cannot checkout more books");
            return;
        }
        ali.addBook(b1);

    }

    //returnBook(Patron patron, Book book): Allows a patron to return a book.
    // This method should first check if the book is checked out by the patron,
    // and if it is, should update the book's status to "not checked out" and remove
    // it from the patron's list of checked-out books.
    // If the book is returned after its due date,
    // the patron should be charged a fine of $0.50 per day overdue.
    /*public Book returnBook(Patron patron, Book book) {


    }*/

}
