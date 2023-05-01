package Prac8.Project3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;
    private HashMap<String, Patron> patrons;
    private String currentDate;
    private SimpleDateFormat sdf;
    private Calendar calendar;

    public Library() {
        books = new HashMap<String, Book>();
        patrons = new HashMap<String, Patron>();
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        calendar = Calendar.getInstance();
        currentDate = "20/04/2023";
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void addPatron(Patron patron) {
        patrons.put(patron.getName(), patron);
    }

    public void checkoutBook(Patron patron, Book book) {
        if (book.getCheckout()) {
            System.out.println("Book is already checkdout");
            return;
        }

        if (patron.getBooksCheckedout().size() == 3) {
            System.out.println("patron cannot checkout more books");
            return;
        }

        patron.addBook(book);

        try {
            calendar.setTime(sdf.parse(currentDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        calendar.add(Calendar.DATE, 14);
        String dueTime = sdf.format(calendar.getTime());
        book.setDueDate(dueTime);
        book.toggleCheckout();
    }

    public void returnBook(Patron patron, Book book) {
        if (
                !patron
                .getBooksCheckedout()
                .containsKey(book.getTitle())
        ) {
            System.out.println("book is not checkedout by this patron");
            return;
        }

        book.toggleCheckout();
        patron.removeBook(book);

        long daysFromDueDate = checkDueDate(book);
        if (daysFromDueDate > 0) {
            double fine = daysFromDueDate * 0.5;
            patron.chargeFine(fine);
        }

    }

    public long checkDueDate(Book book) {
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
    }

    public void incrementCurrentDate() {
        calendar.add(Calendar.DATE, 1);
        currentDate = sdf.format(calendar.getTime());
    }
}
