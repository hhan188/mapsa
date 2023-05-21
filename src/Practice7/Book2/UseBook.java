package Practice7.Book2;

import java.util.Arrays;

public class UseBook {
    public static void main(String[] args) {
        Book[] books= new Book[5];
        books[0]=new Book("aads","History");
        books[1]=new Book("koroush","History");
        books[2]=new Book("wind","dream");
        books[3]=new Book("alfwe","sience");
        books[4]=new Book("ml","directory");
        
        UtilBook util=new UtilBook();
        System.out.println(Arrays.toString(util.sameBook(books, "History")));


    }



}
