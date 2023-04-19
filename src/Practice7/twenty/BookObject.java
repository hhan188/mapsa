package Practice7.twenty;

public class BookObject {
    public static void main(String[] args) {
        Book[] books = {new Book("mystery"), new Book("mystery"), new Book("mystery"), new Book("romance"), new Book("mystery")};
        for (int i = 0; i < 5; i++) {
            if (books[i].category.equals("mystery")) {
                System.out.println("books[" + i + "] category : " + books[i].category);
            }
        }

    }
}