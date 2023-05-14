package tamrin11.p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadDataFromFile {

    public static void main(String[] args) {

        try {
            FileReader();
        } catch (FileNotFoundException e) {
            System.err.println("The Exception 'FileNotFoundException' Occurred");
        }

    }

    public static void FileReader() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("text.txt");

    }
}
