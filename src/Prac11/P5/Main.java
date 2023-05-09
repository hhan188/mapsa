package Prac11.P5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        writeToFile("src/Prac11/P5/data.txt");
    }

    public static void writeToFile(String filePath) {
        try(FileOutputStream fos = new FileOutputStream(filePath)) {
            System.out.println("enter data to insert");
            Scanner sc = new Scanner(System.in);
            String data = sc.next();
            byte[] dataByte = data.getBytes();
            fos.write(dataByte);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
