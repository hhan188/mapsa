package practices.practice11.exercise2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
