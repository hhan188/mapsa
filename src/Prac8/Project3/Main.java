package Prac8.Project3;

public class Main {
    public static void main(String[] args) {
        //Create books
        Book book1 = new Book("one", "oneAuth", 2000);
        Book book2 = new Book("two", "oneAuth", 2001);
        Book book3 = new Book("three", "twoAuth", 2000);
        Book book4 = new Book("four", "threeAuth", 2022);

        //Create library
        Library library = new Library();

        //Create patrons
        Patron sajjad = new Patron("sajjad", 1);
        Patron abbas = new Patron("abbas", 2);

        //Add books and patrons to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.addPatron(sajjad);
        library.addPatron(abbas);

        //Check out books
        library.checkoutBook(sajjad, book1);

        //Test if we can checkout a book that already checkedout
        library.checkoutBook(abbas, book1);
        
        //Increment days by 16
        library.incrementCurrentDate(16);

        //return book and add fine to sajjad
        library.returnBook(sajjad, book1);
        System.out.println("sajjad fine : " + sajjad.getFinesOwed());
    }
}
