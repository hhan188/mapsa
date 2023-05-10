package Practice11.twelve;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream("twelve.txt")))) {
            while (scanner.hasNextInt()){
                sum += scanner.nextInt();
                counter++;
            }
            System.out.println((double) sum / counter);
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        }
    }
}