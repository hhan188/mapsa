package tamrin7.p14;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new Book("Java, How to program", "Deitel & Deitel", 1853);
        books[1] = new Book("C#, How to program", "Deitel & Deitel", 1763);
        books[2] = new Book("Man and His Symbols ", "Carl Gustav Jung", 755);

        printBooksArray(books);
    }

    private static void printBooksArray(Book[] books) {
        System.out.println("Books titles and authors");
        for (Book b :
                books) {
            System.out.println(b.getTitle() + " > " + b.getAuthor());
        }
    }
}
