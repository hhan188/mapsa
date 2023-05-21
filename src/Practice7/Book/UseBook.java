package Practice7.Book;

import Practice7.Book.Book;

public class UseBook {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books [0] = new Book("hezaro yek shab","x",1000);
        books [1] = new Book("khaje tajdar","y",2000);
        books [2] = new Book("shahname", "ferdosi",3000);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthor());
            System.out.println(books[i].getTitle());
        }
    }
}
