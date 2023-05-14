package tamrin11.p12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {

        double avg = 0;
        try {
            avg = calcAvg("numbers.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("AVG is: " + avg);
    }

    public static double calcAvg(String filename) throws IOException, NumberFormatException {

        double number;
        int counter = 0;
        double sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             Scanner sc = new Scanner(reader)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                number = Double.parseDouble(line);
                sum += number;
                counter++;
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a number in the file");
        } catch (IOException e) {
            throw new IOException("IOException Occurred");
        }

        return sum / counter;
    }

}
