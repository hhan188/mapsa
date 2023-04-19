package Practice7.fourteen;

import Practice7.thirteen.Person;

public class BookObjects {
    public static void main(String[] args) {
        Book[] books = new Book[7];
        for (int i = 0 ;i<7;i++) {
            books[i] = new Book();

            books[i].setTitle("kkkkkk");
            books[i].setNumberOfPages(18);
            books[i].setAuthor("Mohmmad");

            System.out.println(books[i].getTitle());
            System.out.println(books[i].getNumberOfPages());
            System.out.println(books[i].getAuthor());
        }
    }
}
