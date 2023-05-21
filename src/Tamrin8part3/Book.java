package Tamrin8part3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//Create a program that manages a library. The program should consist of at least four classes:
// Book, Library, Patron, and Main (which will contain the main method).
//
//The Book class should have the following instance variables: title (a String), author (a String), publicationYear (an int), isCheckedOut (a boolean), and dueDate (a String).
// It should also have a constructor that takes in values for each of these instance variables.

@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private boolean isCheckedOut;
    private String dueDate;
    public void toggleCheckout() {
        isCheckedOut = !isCheckedOut;
    }

    public boolean getCheckout() {
        return isCheckedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
