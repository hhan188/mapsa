package Practice11.eleven;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        BufferedReader reader;
        try {
            reader=new BufferedReader(new FileReader("eleven.txt"));
            String line=reader.readLine();
            while (line !=null){
                System.out.println(line);
                line=reader.readLine();
            }reader.close();

        }catch (NumberFormatException | IOException e){
            System.out.println("NumberFormatException");
        }
    }
}
