package SoheylSayyah.Practice11.Exercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Input :");
        String number = scanner.nextLine();
        try (FileOutputStream file = new FileOutputStream(new File(""))){
            file.write(number.getBytes());

        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            System.err.println("Invalid Input");
        }
    }
}
