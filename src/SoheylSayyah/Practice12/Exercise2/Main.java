package SoheylSayyah.Practice12.Exercise2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/MapsaHR/SecondPart/Practice12/Exercise2/Text"));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (line.equalsIgnoreCase("ali")){
                    line = "New Name";
                }else {
                    line = bufferedReader.readLine();
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
