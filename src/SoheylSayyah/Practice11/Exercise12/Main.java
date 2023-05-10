package SoheylSayyah.Practice11.Exercise12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers = 0;
        int i = 0;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/com/MapsaHR/SecondPart/Practice11/Text")))){
            while (scanner.hasNextInt()){
                numbers += scanner.nextInt();
                i++;
            }
            System.out.println((double) numbers / i);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
