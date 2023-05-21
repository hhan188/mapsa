package Practice11.ninth;

import java.io.*;

public class Ninth {
    public static void main(String[] args) {
            String number ;
            int sum = 0 ;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ehsan\\workspace\\NewMapsaTraining\\0"))) {
            while ((number=bufferedReader.readLine())!=null){
                sum+=Integer.parseInt(bufferedReader.readLine());
            }
        }catch (FileNotFoundException | NumberFormatException e){
            System.err.println("er");
            System.err.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
