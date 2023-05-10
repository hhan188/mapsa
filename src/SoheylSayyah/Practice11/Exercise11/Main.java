package SoheylSayyah.Practice11.Exercise11;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/MapsaHR/SecondPart/Practice11/Text"))){
            String string;
            while ((string = bufferedReader.readLine()) != null){
                string = bufferedReader.readLine();
                System.out.println(string);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
