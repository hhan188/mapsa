package Prac11.P10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readFileAndSum("fileNotFoundTest.txt");
        readFileAndSum("src/Prac11/P10/data.txt");
    }

    public static void readFileAndSum(String path) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            System.out.println("sum : " + sum);
        } catch (IOException | NumberFormatException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
