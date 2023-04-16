package tamrin6.P13;

public class UsingBook {
        public static void main(String[] args) {
            Book book1 = new Book("The Thirty-Nine Steps ", "John Buchan", 138);
            Book book2 = new Book("A Clockwork Orange", " Anthony Burgess", 160);

            System.out.println(book1.comparePages(book2));
        }
    }

