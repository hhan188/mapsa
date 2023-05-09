package Practice11.too;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("text2.txt");
            int number=0;
            while (true){
                System.out.println((char)number);

            }


        }catch (FileNotFoundException e){
            System.out.println(e);

        }

    }
}
