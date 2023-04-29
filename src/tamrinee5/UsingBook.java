package tamrinee5;

import java.util.Arrays;

public class UsingBook {

        public static void main(String[] args) {
            Book[] book = new Book[5];
            book[0] = new Book("mocking bird", "ll", 434, "mystry");
            book[1] = new Book("old man and the sea", "ernest hamingoy", 244, "romance");
            book[2] = new Book("crime and punishment", "dastavoskoy", 865, "drama");
            book[3] = new Book("harry potter", "rolling", 543, "mystry");
            book[4] = new Book("Narnia", "adeghie", 533, "romance");

            System.out.println(book[0].getTitle() + " : " + book[0].getAuthor());
            System.out.println(book[1].getTitle() + " : " + book[1].getAuthor());
            System.out.println(book[2].getTitle() + " : " + book[2].getAuthor());
            System.out.println(book[3].getTitle() + " : " + book[3].getAuthor());
            System.out.println(book[4].getTitle() + " : " + book[4].getAuthor());


            sameCategories(book,"mystry");
        }

        public static void sameCategories(Book[] book, String category) {

            String[] newArr = new String[book.length];
            int counter = 0;
            for (int i = 0; i < book.length; i++) {
                if (book[i].getCategory().equals(category)) {
                    newArr[counter] = book[i].getTitle();
                    counter++;
                }
            }

            System.out.println(Arrays.toString(newArr));
        }


    }

