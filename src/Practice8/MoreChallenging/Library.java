package Practice8.MoreChallenging;

public class Library {
    Book[] books;
    Patron[] patrons;
    String currentDate;

    public Library(Book[] books, Patron[] patrons) {
        this.books = books;
        this.patrons = patrons;
    }

    public Book checkOutBook(Patron patron, Book book){
        return book;
    }
}
