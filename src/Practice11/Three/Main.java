package Practice11.Three;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("B.txt");

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

             int numberAverage=0;
            for (int i = 0; i < 3; i++) {

                System.out.println(bufferedReader.readLine());
            }
            for (int i = 0; i < 3; i++) {
                numberAverage=numberAverage+Integer.parseInt(bufferedReader.readLine());

            }


            fileReader.close();
            bufferedReader.close();
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");

        }catch (IOException i){
            System.out.println(" IOException");
        }

    }
}
