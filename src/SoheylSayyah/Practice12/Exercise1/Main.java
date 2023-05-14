package SoheylSayyah.Practice12.Exercise1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){
        int sum = 0;
        int counter = 0;
        String line;
        String[] number = new String[2];
        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/MapsaHR/SecondPart/Practice12/Exercise1/Test.csv"))){
            while ((line = reader.readLine()) != null){
                number = line.split(",");
                sum += Integer.parseInt(number[0]);
                counter++;
            }
            System.out.println("The Average of Your Input Numbers is : " + (double) sum / counter);
        }catch (Exception e){
            System.err.println("File Not Found");
        }
    }
}
