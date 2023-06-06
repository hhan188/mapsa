package Practice11.tamrine12;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File file = new File("/Users/mersedeh/IdeaProjects/untitled5/src/Practice11/tamrine12/numbers.txt");
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text ;
            int counter=0;
            int sum=0;

            while ((text = reader.readLine()) != null) {
                Scanner scanner =new Scanner(text);
                int number=scanner.nextInt();
                sum+=number;
                counter+=1;

            }
            System.out.println(sum/counter);
        } catch ( IOException e) {
            System.out.println("your exception was "+e.getMessage());
        }
    }
}
