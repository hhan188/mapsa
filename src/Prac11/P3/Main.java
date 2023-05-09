package Prac11.P3;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readFile("notFoundTest.txt");
        readFile("src/Prac11/P3/file.txt");
    }

    public static void readFile(String path) {
        try(FileInputStream fileInputStream = new FileInputStream(path)) {
            int input = 0;
            while ((input = fileInputStream.read()) != -1) {
                System.out.print((char) input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
