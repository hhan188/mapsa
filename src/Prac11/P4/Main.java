package Prac11.P4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readAndDumpFileData("src/Prac11/P3/numbers.txt");
    }

    public static void readAndDumpFileData(String path) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int sum = 0;
            int numCount = 0;
            while ((line = reader.readLine()) != null) {
                try{
                    sum += Integer.parseInt(line);
                    numCount++;
                } catch (NumberFormatException e) {
                    System.err.println("invalid number");
                }
            }
            System.out.println("avg : " + sum / numCount);
        } catch (IOException e) {
            System.out.println("file not found or cant read");
        }
    }
}
