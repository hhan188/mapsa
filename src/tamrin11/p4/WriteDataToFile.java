package tamrin11.p4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataToFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your data to write to file:");
        String userData = sc.nextLine();
        FileWriter(userData);

    }

    public static void FileWriter(String inputData) {

        FileOutputStream fos = null;

        byte[] txtByteArray = new byte[inputData.length()];
        for (int i = 0; i < inputData.length(); i++) {
            txtByteArray[i] = (byte) inputData.charAt(i);
        }

        try {
            fos = new FileOutputStream("OutputData.txt");
            fos.write(txtByteArray);
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        }
    }
}
