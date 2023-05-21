package Practice11.Fourth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fourth {
    public static void main(String[] args) {
        String number;
        double counter=0;
        double sum=0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ehsan\\workspace\\NewMapsaTraining\\0"))){
            while ((number= bufferedReader.readLine())!=null){
                sum+=Integer.parseInt(bufferedReader.readLine());
                counter++;
            }
        }
        catch (IOException | NumberFormatException e) {
        double avg=sum/counter;
            System.out.println("Avg is :"+avg);
            System.err.println("Error");
        }
    }
}
