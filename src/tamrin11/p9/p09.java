package tamrin11.p9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p09 {
    public static void main(String[] args) {

        double sum = 0;
        try {
            sum = calcSum("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("SUM is: " + sum);
    }

    public static double calcSum(String filename) throws FileNotFoundException{

        double number;
        double sum = 0;

        try(Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                number = Double.parseDouble(line);
                sum += number;
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Not a number in the file, Sum until this error will be returned");
        }

        return sum;
    }
}
