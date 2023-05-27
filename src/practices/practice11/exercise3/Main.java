package practices.practice11.exercise3;

//Write a program that reads data from a file using a FileInputStream.
// Handle the FileNotFoundException that might be thrown if the file does not exist.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() + " Caught Exception");
        }


    }
}
