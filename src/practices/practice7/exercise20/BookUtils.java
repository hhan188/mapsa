package practices.practice7.exercise20;

import practices.practice7.exercise14.Book;

public class BookUtils {
    public Book[] searchBooks(BookGenre genre, Book[] books) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookGenre().equals(genre)) {
                length++;
            }
        }
        Book[] genres = new Book[length];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookGenre().equals(genre)) {
                genres[index++] = books[i];
            }
        }
        return genres;
    }


}
