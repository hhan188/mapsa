package Prac11.P13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Prac11/P13/numbers.txt"))) {
            String line;
            int number = 0;
            while ((line = reader.readLine()) != null) {
                number = Integer.parseInt(line);
                sum += number;
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("sum : " + sum);
    }
}
