package tamrin11.p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculateAvg {

    public static void main(String[] args) {

        double avg = 0;
        try {
            avg = calcAvg("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("AVG is: " + avg);
    }

    public static double calcAvg(String filename) throws FileNotFoundException{

        double number;
        int counter = 0;
        double sum = 0;
        try(Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                number = Double.parseDouble(line);
                sum += number;
                counter++;
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a number in the file");
        }

        return sum/counter;
    }

}
