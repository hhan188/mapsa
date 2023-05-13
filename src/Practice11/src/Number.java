import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        double num = 0;
        double sum = 0;
        try {
            Scanner sc = new Scanner(new File("NumberList.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                num = Double.parseDouble(line);
                sum += num;
                System.out.println(sum);
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
