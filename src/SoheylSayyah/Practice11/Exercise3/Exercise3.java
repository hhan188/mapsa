package SoheylSayyah.Practice11.Exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {
        String number;
        double counter = 0;
        double sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/MapsaHR/SecondPart/Practice11/Text"))){
            while ((number = reader.readLine()) != null){
                sum += Integer.parseInt(reader.readLine());
                counter++;
            }
        }
        catch (IOException | NumberFormatException e){
            double average = sum / counter;
            System.out.println("Average is : " + average);
            System.err.println("Error");
        }
    }
}
