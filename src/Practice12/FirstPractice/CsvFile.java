package Practice12.FirstPractice;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvFile {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        String line;
        String[] number= new String[2];
        try (BufferedReader csv = new BufferedReader(new FileReader("C:\\Users\\Ehsan\\workspace\\NewMapsaTraining\\Csv"))) {
            while ((line=csv.readLine())!=null){
                number=line.split(",");
                sum+=Integer.parseInt(number[0]);
                counter++;
            }
            System.out.println("your avg is :"+sum/counter);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
