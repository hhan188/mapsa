package Practice12.too;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader reader= new BufferedReader(new FileReader("Practice12_2.csv"))) {
            String line= reader.readLine();
            String s=" ";
            while (line !=null){
                System.out.println(line);
                line=reader.readLine();

            }reader.close();


        }catch (IOException e){
            System.out.println("IOException e");

        }catch (Exception e){

        }

    }
}
