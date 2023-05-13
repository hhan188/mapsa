package Practice12.one;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader= new BufferedReader(new FileReader("Book1.csv"))) {
            String line;
            Integer temp = 0 ;
            String[] str = new String[2] ;


            while ((line = reader.readLine()) != null) {
                str = line.split(",") ;
                temp+= Integer.parseInt(str[0]) ;
            }

            System.out.println("Sum ="+temp);




        }catch (IOException e){
            System.out.println("IOException e");

        }catch (Exception e){

        }

    }
}
