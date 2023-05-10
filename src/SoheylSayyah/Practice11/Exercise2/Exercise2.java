package SoheylSayyah.Practice11.Exercise2;

import java.io.FileInputStream;
import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) {
        String line;
        try ( FileInputStream fileInputStream = new FileInputStream("Text")){
           while ((line = String.valueOf(fileInputStream.read())) != null){
               System.out.println(line);
           }
        } catch (IOException e) {
            System.err.println("File Not Found");
        }
    }
}
