package SoheylSayyah.Practice11.Exercise9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String string;
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/MapsaHR/SecondPart/Practice11/Text"))){
            while ((string = reader.readLine()) != null){
                sum += Integer.parseInt(string);
            }
        } catch (NumberFormatException | FileNotFoundException e) {
            System.out.println(sum);
            System.err.println("Error");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
