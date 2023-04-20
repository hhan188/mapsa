package SoheylSayyah.Practice7.Exercise14;

public class UsingBook {
    public static void main(String[] args) {
        Book[] books = new Book[7];
        books[0] = new Book("Gone With The Wind","Margaret Mitchell",1037);
        books[1] = new Book("Gone With The Wind","Margaret Mitchell",1037);
        books[2] = new Book("Gone With The Wind","Margaret Mitchell",1037);
        books[3] = new Book("Gone With The Wind","Margaret Mitchell",1037);
        books[4] = new Book("Gone With The Wind","Margaret Mitchell",1037);
        books[5] = new Book("Gone With The Wind","Margaret Mitchell",1037);
        books[6] = new Book("Gone With The Wind","Margaret Mitchell",1037);
        for (int i = 0; i < 7; i++) {
            System.out.println(books[i].getTitle());
            System.out.println(books[i].getAuthor());
        }
    }
}
