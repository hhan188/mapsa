package Practice8.MoreChallenging;

public class Patron {
    String name;
    int libraryId;
    Book[] booksCheckedOut;
    double finesOwed;

    public Patron(String name, int libraryId, Book[] booksCheckedOut, double finesOwned) {
        this.name = name;
        this.libraryId = libraryId;
        this.booksCheckedOut = booksCheckedOut;
        this.finesOwed = finesOwned;
    }
}

