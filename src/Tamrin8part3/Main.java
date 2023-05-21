package Tamrin8part3;


import java.util.ArrayList;

//The Main class should contain the main method, which will create a Library object and add some books and patrons to it.
//The program should allow patrons to check out and return books, and should keep track of fines owed for overdue books.
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Sp", "sepideh", 1377, false, "1377/12/13");
        Book b2 = new Book("Sp1", "sepideh1", 1378, false, "1377/12/23");
        Book book3 = new Book("Sp2", "sepideh2",1375,false, "1377/12/13");
        Book book4 = new Book("Sp3", "sepideh3",1375,false, "1377/12/13");
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        Patron ali = new Patron("ali", 1);
        Patron saeed = new Patron("saeed", 2);
        ArrayList<Patron> patrons = new ArrayList<>();
        //Library library = new Library(books, patrons, "1333");

       // library.checkoutBook(ali, b1);


      //  library.checkoutBook(saeed, b2);


       // library.incrementCurrentDate(16);


        //library.returnBook(sajjad, book1);
    }
}
