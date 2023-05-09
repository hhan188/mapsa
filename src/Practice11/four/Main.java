package Practice11.four;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("Ali.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int number;
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(bufferedReader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
