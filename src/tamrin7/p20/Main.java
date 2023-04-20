package tamrin7.p20;

public class Main {
    public static void main(String[] args) {

        Book[] myBooks = {new Book("Java, How to Program", "Computer Programming Language"),
                        new Book("Gone Girl", "Mystery"),
                        new Book("Seven Days in June", "Romance"),
                        new Book("C#, Step by Step", "Computer Programming Language"),
                        new Book("The Big Sleep", "Mystery"),
                        new Book("Outlander", "Romance"),
                        new Book("In The Woods", "Mystery"),
                        new Book("Macbeth", "Drama"),
                        new Book("I Will Find You", "Murder"),
                        new Book("Eleanor & Park", "Romance"),
        };

        System.out.println("Computer Programming Language List:");
        Book[] list1 = bookSelector(myBooks,"Computer Programming Language");
        for (Book book : list1) {
            System.out.println(book);
        }
        System.out.println("Romance List:");
        Book[] list2 = bookSelector(myBooks,"Romance");
        for (Book book : list2) {
            System.out.println(book);
        }
        System.out.println("Mystery List:");
        Book[] list3 = bookSelector(myBooks,"Mystery");
        for (Book book : list3) {
            System.out.println(book);
        }

    }

    private static Book[] bookSelector(Book[] myBooks, String category) {

        int count = 0;

        for (int i = 0; i < myBooks.length; i++) {
            if (myBooks[i].getCategory().equals(category)) {
                count++;
            }
        }

        Book[] result = new Book[count];
        count = 0;

        for (int i = 0; i < myBooks.length; i++) {
            if (myBooks[i].getCategory().equals(category)) {
                result[count] = new Book();
                result[count].setCategory(category);
                result[count].setTitle(myBooks[i].getTitle());
                count++;
            }
        }
        return result;

    }

}
