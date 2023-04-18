package practices.practice71.exercise14;

import practices.practice71.exercise20.BookGenre;
import practices.practice71.exercise20.BookUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //book1
        Book book1 = new Book();
        book1.setTitle("Java SE");
        book1.setAuthor("Yaser");
        book1.setnOfPage(1200);
        book1.setBookGenre(BookGenre.tutorial);

        //book2
        Book book2 = new Book();
        book2.setTitle("The Old Man And Sea");
        book2.setAuthor("Hemingway");
        book2.setnOfPage(430);
        book2.setBookGenre(BookGenre.novel);

        //book3
        Book book3 = new Book();
        book3.setTitle("War And Peace");
        book3.setAuthor("Tolstoy");
        book3.setnOfPage(2300);
        book3.setBookGenre(BookGenre.history);

        //book5
        Book book4 = new Book();
        book4.setTitle("A Tale Of Two Cities");
        book4.setAuthor("Dickens");
        book4.setnOfPage(500);
        book4.setBookGenre(BookGenre.novel);

        //book5
        Book book5 = new Book();
        book5.setTitle("Rules");
        book5.setAuthor("Ebn e Sina");
        book5.setnOfPage(1030);
        book5.setBookGenre(BookGenre.tutorial);


        //Book's Array
        Book[] books = {book1, book2, book3, book4, book5};
        System.out.println(Arrays.toString(books));
        //exercise20
        System.out.println("************'''exercise20'''******************");
        BookUtils bookUtils = new BookUtils();
        System.out.println(Arrays.toString(bookUtils.searchBooks(BookGenre.tutorial, books)));
        System.out.println(Arrays.toString(bookUtils.searchBooks(BookGenre.history, books)));
        System.out.println(Arrays.toString(bookUtils.searchBooks(BookGenre.novel, books)));

    }
}
